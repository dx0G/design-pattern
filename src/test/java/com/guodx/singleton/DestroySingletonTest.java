package com.guodx.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: guodx
 * @Date: 2020/11/24 11:09 下午
 * @Description:
 * @Version: 1.0
 */
public class DestroySingletonTest {
    public static void main(String[] args) {
        Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
        try {
            // 反射破坏单例
//            Constructor<LazyInnerClassSingleton> constructor = clazz.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            LazyInnerClassSingleton instance = constructor.newInstance();
//            LazyInnerClassSingleton instance2 = constructor.newInstance();
//
//            System.out.println(instance == instance2);

            // 序列化破坏单例
            SerializableSingleton s1 = null;
            SerializableSingleton s2 = SerializableSingleton.getInstance();
            FileOutputStream fos = null;
            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
