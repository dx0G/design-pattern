package com.guodx.singleton;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        // 防止放射攻击
        if (InstanceHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return InstanceHolder.LAZY;
    }

    private static class InstanceHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
