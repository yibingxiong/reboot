## jest


![工具比较](https://pcgo-1255634607.cos.ap-shanghai.myqcloud.com/picgo/2020-12-19/使用jest做单元测试/20201219212025.png)

(图片来自极客时间)

### 使用ts-jest


依赖包

```
"jest": "^26.6.3",
"ts-jest": "^26.4.4",
```

脚本配置


```
"test": "jest"
```

配置文件生成

```bash
npx ts-jest config:init
```

jest测试带有import的es6模块报错问题解决

配置transform,使用babel做转换

```js
// jest.conig.js

module.exports = {
  preset: 'ts-jest',
  testEnvironment: "node",
  transform: {"\\.[jt]sx?$": "babel-jest"}
};
```

测试用例

```js
import {add} from '../src/math';

test('add: 1+1=2', () => {
    expect(add(1,1)).toBe(2)
})
```

### 使用babel-jest

