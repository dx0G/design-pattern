package com.guodx.factory.abstractFactory;

import com.guodx.factory.common.INote;
import com.guodx.factory.common.IVideo;

public interface CourseFactory {
    INote createNote();

    IVideo createVideo();
}