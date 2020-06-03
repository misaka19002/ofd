package io.onee.ofd.project.box;

import io.onee.ofd.other.Rectangle;
import io.onee.ofd.other.SimpleContent;

import java.util.List;

/**
 * Created by admin on 2020/6/3 14:39:46.
 */
public abstract class Box extends Rectangle {
    protected Rectangle parent;
    protected List<SimpleContent> contentList;
}
