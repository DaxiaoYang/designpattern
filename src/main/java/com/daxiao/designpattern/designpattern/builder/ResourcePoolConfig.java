package com.daxiao.designpattern.designpattern.builder;

import org.springframework.util.StringUtils;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/11
 */
public class ResourcePoolConfig {

    public static void main(String[] args) {
        ResourcePoolConfig daxiao = ResourcePoolConfig.builder()
                .setMaxIdle(8)
                .setMinIdle(7)
                .setMaxTotal(10)
                .setName("daxiao")
                .build();
    }

    private String name;

    private int maxTotal;

    private int maxIdle;

    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private static final int DEFAULT_MAX_TOTAL = 8;

        private static final int DEFAULT_MAX_IDLE = 8;

        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;

        private int maxTotal;

        private int maxIdle;

        private int minIdle;

        public Builder setName(String name) {
            if (StringUtils.isEmpty(name)) {
                throw new IllegalArgumentException();
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException();
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle <= 0) {
                throw new IllegalArgumentException();
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle <= 0) {
                throw new IllegalArgumentException();
            }
            this.minIdle = minIdle;
            return this;
        }

        public ResourcePoolConfig build() {
            // 必填项的校验 和 构造参数之间约束的校验
            if (maxIdle > maxTotal || minIdle > maxTotal || minIdle > maxIdle) {
                throw new RuntimeException();
            }
            return new ResourcePoolConfig(this);
        }
    }
}
