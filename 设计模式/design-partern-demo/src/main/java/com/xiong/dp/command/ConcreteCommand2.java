package com.xiong.dp.command;

/**
 * 具体命令类
 */
public class ConcreteCommand2 extends Command {

    Recevier recevier;

    public ConcreteCommand2(Recevier recevier) {
        this.recevier = recevier;
    }

    public ConcreteCommand2() {
        this(new ConcreteRecevier2());
    }

    public void execute() {
        recevier.doSomething();
    }
}
