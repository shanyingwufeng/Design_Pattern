package com.sywf.build_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/13 16:18
 * Description: 精简模式外观
 */
public class ReducedMode implements IBuildAppearance {

    private Appearance appearance;

    public ReducedMode() {
        appearance = new Appearance();
    }

    @Override
    public void buildMenu() {
        appearance.setMenu("不显示菜单");
    }

    @Override
    public void buildPlayLists() {
        appearance.setPlayLists("不显示播放列表");
    }

    @Override
    public void buildMainWindows() {
        appearance.setMainWindows("显示主窗口");
    }

    @Override
    public void buildControlBar() {
        appearance.setControlBar("显示控制条");
    }

    @Override
    public Appearance createAppearance() {
        return appearance;
    }
}
