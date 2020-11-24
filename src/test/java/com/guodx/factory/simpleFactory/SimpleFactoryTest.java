package com.guodx.factory.simpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
//        CourseFactory courseFactory = new CourseFactory();
//        ICourse java = courseFactory.create("java");
//        java.record();
//        ICourse python = courseFactory.create("python");
//        python.record();

        CourseFactory courseFactory = new CourseFactory();
        ICourse java = courseFactory.create(JavaCourse.class);
        java.record();
    }

}