package com.example.natchaya006.psupin;

/**
 * Created by STD on 10/11/2560.
 */

public class PinObject {
    int iconU;
    String name;
    String time;
    String title;
    String desc;

    public PinObject(int iconU, String name, String time, String title, String desc) {
        this.iconU = iconU;
        this.name = name;
        this.time = time;
        this.title = title;
        this.desc = desc;
    }

    public int getIcon() {
        return iconU;
    }

    public void setIcon(int icon) {
        this.iconU = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
