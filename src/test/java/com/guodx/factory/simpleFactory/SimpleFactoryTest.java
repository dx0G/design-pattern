package com.guodx.factory.simpleFactory;

import com.guodx.factory.common.ICourse;
import com.guodx.factory.common.JavaCourse;

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