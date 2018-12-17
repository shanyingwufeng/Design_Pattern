package com.sywf.build_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/13 16:23
 * Description: 建造者
 */
public class Director {

    public Appearance construct(IBuildAppearance mode) {
        mode.buildMenu();
        mode.buildPlayLists();
        mode.buildMainWindows();
        mode.buildControlBar();
        return mode.createAppearance();
    }
}
