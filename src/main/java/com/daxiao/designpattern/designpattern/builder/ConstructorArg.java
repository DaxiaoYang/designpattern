package com.daxiao.designpattern.designpattern.builder;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/11
 */
public class ConstructorArg {

    public static void main(String[] args) {
        ConstructorArg.builder()
                .setArg("1")
                .setRef(false)
                .setType(String.class)
                .build();
    }

    private boolean isRef;

    private Class type;

    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private boolean isRef;

        private Class type;

        private Object arg;

        public Builder setRef(boolean ref) {
            isRef = ref;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }

        /**
         * 在构造对象这里 放置校验参数之间约束关系的逻辑
         */
        public ConstructorArg build() {
            if (isRef && !(arg instanceof String)) {
                throw new IllegalArgumentException();
            }
            if (!isRef && (type == null || arg == null)) {
                throw new IllegalArgumentException();
            }
            return new ConstructorArg(this);
        }
    }
}
