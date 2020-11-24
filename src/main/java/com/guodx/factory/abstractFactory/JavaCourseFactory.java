package com.guodx.factory.abstractFactory;

import com.guodx.factory.common.INote;
import com.guodx.factory.common.IVideo;
import com.guodx.factory.common.JavaNote;
import com.guodx.factory.common.JavaVideo;

/**
 * @Author: guodx
 * @Date: 2020/11/24 9:40 下午
 * @Description:
 * @Version: 1.0
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
