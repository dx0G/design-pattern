package com.guodx.singleton;

/**
 * @Author: guodx
 * @Date: 2020/11/24 10:08 下午
 * @Description:
 * @Version: 1.0
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
