package com.sywf.build_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/13 16:15
 * Description: 构建视频播放软件外观
 */
public interface IBuildAppearance {

    void buildMenu();
    void buildPlayLists();
    void buildMainWindows();
    void buildControlBar();
    Appearance createAppearance();
}
