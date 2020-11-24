package com.guodx.factory.abstractFactory;


public class AbstractFactoryTest {

    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();
        pythonCourseFactory.createNote().edit();
        pythonCourseFactory.createVideo().record();
    }
}