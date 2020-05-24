package com.xiong.dp;

import com.xiong.dp.mediator.ConcreteColleagure1;
import com.xiong.dp.mediator.ConcreteColleagure2;
import com.xiong.dp.mediator.ConcreteMediator;
import com.xiong.dp.mediator.Mediator;
import org.junit.Test;

/**
 * 测试类
 */
public class MediatorTest {
    @Test
    public void test() {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagure2 concreteColleagure2 = new ConcreteColleagure2(mediator);
        ConcreteColleagure1 concreteColleagure1 = new ConcreteColleagure1(mediator);
        mediator.setConcreteColleagure1(concreteColleagure1);
        mediator.setConcreteColleagure2(concreteColleagure2);
        concreteColleagure1.depMethod1();
        concreteColleagure2.depMethod1();
    }
}
