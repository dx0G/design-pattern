package com.guodx.factory.factoryMethod;

import com.guodx.factory.common.ICourse;
import com.guodx.factory.common.PythonCourse;

/**
 * @Author: guodx
 * @Date: 2020/11/24 9:26 下午
 * @Description:
 * @Version: 1.0
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
