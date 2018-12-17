package com.sywf.build_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/13 16:08
 * Description: 复杂产品类-视频播放软件外观
 */
public class Appearance {

    // 菜单
    private String menu;

    // 播放列表
    private String playLists;

    // 主窗口
    private String mainWindows;

    // 控制条
    private String controlBar;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayLists() {
        return playLists;
    }

    public void setPlayLists(String playLists) {
        this.playLists = playLists;
    }

    public String getMainWindows() {
        return mainWindows;
    }

    public void setMainWindows(String mainWindows) {
        this.mainWindows = mainWindows;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }


    @Override
    public String toString() {
        return "Appearance{" +
                "menu='" + menu + '\'' +
                ", playLists='" + playLists + '\'' +
                ", mainWindows='" + mainWindows + '\'' +
                ", controlBar='" + controlBar + '\'' +
                '}';
    }
}
