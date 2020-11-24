package com.guodx.factory.abstractFactory;

import com.guodx.factory.common.INote;
import com.guodx.factory.common.IVideo;
import com.guodx.factory.common.PythonNote;
import com.guodx.factory.common.PythonVideo;

/**
 * @Author: guodx
 * @Date: 2020/11/24 9:41 下午
 * @Description:
 * @Version: 1.0
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
