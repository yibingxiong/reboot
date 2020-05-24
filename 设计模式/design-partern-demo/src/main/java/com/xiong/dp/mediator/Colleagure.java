package com.xiong.dp.mediator;

    /**
     * 同事抽象类
     */
    public abstract class Colleagure {
        protected Mediator mediator;

        public Colleagure(Mediator mediator) {
            this.mediator = mediator;
        }
    }
