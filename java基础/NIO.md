## 定义

NIO（new io， Non bloking io), 1.4引入，可以替代传统io，NIO是面向缓冲区的、基于通道的IO操作，比传统io更加高效。

## NIO与IO的对比

|IO|NIO|
|---|---|
|面向流（Stream oriented）|面向缓冲区（Buffer Oriented|
|阻塞IO（blocking io）|非阻塞IO（non blocking io）|
|无|选择器（Selectors）|


## NIO的核心

1. 通道（channel）：表示打开到IO设备的链接，负责传输
2. 缓冲区（buffer）：容纳数据的地方，负责数据的存取

## 缓冲区

负责数据的存取

根据不同数据类型提供了不同类型的Buffer

- ByteBuffer
- CharBuffer
- ShortBuffer
- IntBuffer
- LongBuffer
- FloatBuffer
- DoubleBuffer


通过allocate()获取一个缓冲区

核心方法：

- put(): 向缓冲区存数据

- get(): 从缓冲区取数据
- flip(): 切换到读取数据的模式
- rewind()：position回到起始位置，可以重复读
- clear()： 清空缓冲区，但是数据仍然存在，limit，position回到最初状态
- hasRemaining()：判断是否还有数据
-  remaining()：剩余几个数据

四个核心属性：

- capacity： 容量，表示缓冲区中最大能存储数据的容量，不可改变
- limit：缓冲区可以操作数据的位置+1， 也就是小于pos这个值的数据可以操作
- position: 表示缓冲区正在操作数据的位置
- mark: 标记position的位置，通过reset()可以回到mark的位置

直接缓冲区与非直接缓冲区：

- 非直接缓冲区：通过allocate()分配的缓冲区，将缓冲区建立在jvm的内存中
- 直接缓冲区：通过allocateDirect()分配的缓冲区，将缓冲区建立在物理内存中，zero copy
- 可以通过isDirect()判断是否是直接缓冲区



## 通道（channel）

表示io源和目标之间的链接，本身不能访问数据，只能与Buffer交互


一、 主要实现类：

1. FileChannel: 本地
2. SocketChannel：tcp
3. ServerSocketChannel：tcp
4. DatagramChannel：udp

二、获取通道：

1. 通过支持通道的类的getChannel方法

本地io：

- FileInputStream
- FileOutputStream
- RandomAccessFile

网络io：

- Socket
- ServerSocket
- DatagramSocket

2. 使用各个通道的静态方法open()获取，>=1.7

3. 使用Files的newByteChannel()获取，>=1.7

三、通道之间数据的传输：

1. transferTo
2. transferFrom

四、分散(Scatter)与聚集(Gather)

1. 分散读取（Scattering Reads）: 将通道中的数据分散到多个缓冲区
2. 聚集写入（gathering Writes): 将多个缓冲区中的数据聚集到通道中

五：字符集：Charset

编码：

解码：


## NIO的非阻塞网络通信

使用NIO完成网络通信的核心：

1. Channel
2. Buffer
3. Selector:是SelectableChannel的多路复用器，用于监控SelectableChannel的IO状况


```java
public class TestNonBlockingNIO {
    @Test
    public void client() throws IOException {
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 1234));
        socketChannel.configureBlocking(false);
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put(new Date().toString().getBytes());
        buffer.flip();

        socketChannel.write(buffer);
    }

    @Test
    public void server() throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(1234));

        // 获得选择器
        Selector selector = Selector.open();

        // 将通道注册到选择器, 指定监听事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        // 轮询获取选择器上已经准备就绪的事件
        while (selector.select() > 0) {
            // 获取当前选择器中所有注册的选择键（已经就绪的事件）
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            while (iterator.hasNext()) {
                // 获取就绪的事件
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {  // 接受就绪
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {  // 读就绪事件
                    // 获取读就绪的通道
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();

                    // 读
                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    int len = 0;
                    while ((len = socketChannel.read(buffer)) > 0 - 1) {
                        buffer.flip();
                        System.out.println(new String(buffer.array(), 0, len));
                        buffer.clear();
                    }
                }
                // 取消选择键
                iterator.remove();
            }
        }

    }
}
```