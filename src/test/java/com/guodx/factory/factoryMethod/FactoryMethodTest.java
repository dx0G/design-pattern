package com.guodx.factory.factoryMethod;

/**
 * @Author: guodx
 * @Date: 2020/11/24 9:27 下午
 * @Description:
 * @Version: 1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.create().record();

        ICourseFactory courseFactory2 = new PythonCourseFactory();
        courseFactory2.create().record();
    }
}
