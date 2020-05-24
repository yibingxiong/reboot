package com.xiong.dp.command;

/**
 * 具体命令类
 */
public class ConcreteCommand1 extends Command {

    Recevier recevier;

    public ConcreteCommand1(Recevier recevier) {
        this.recevier = recevier;
    }

    public ConcreteCommand1() {
        this(new ConcreteRecevier1());
    }

    public void execute() {
        recevier.doSomething();
    }
}
