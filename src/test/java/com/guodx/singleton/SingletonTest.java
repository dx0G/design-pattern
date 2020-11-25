package com.guodx.singleton;

/**
 * @Author: guodx
 * @Date: 2020/11/24 10:32 下午
 * @Description:
 * @Version: 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {

        Runnable target = () -> {
            ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
//            EnumSingleton instance = EnumSingleton.getInstance();
//            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
//            LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        };
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(target);
            t.start();
        }

        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
        System.out.println(Thread.currentThread().getName() + ":" + instance2);

    }
}
