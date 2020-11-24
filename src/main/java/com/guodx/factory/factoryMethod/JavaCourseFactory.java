package com.guodx.factory.factoryMethod;

import com.guodx.factory.common.ICourse;
import com.guodx.factory.common.JavaCourse;

/**
 * @Author: guodx
 * @Date: 2020/11/24 9:25 下午
 * @Description:
 * @Version: 1.0
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
