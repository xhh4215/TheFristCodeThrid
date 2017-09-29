package com.example.xiaoheihei;

/**
 * Created by xhh on 2017/9/29.
 */

public class DataBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    private String name;
    private int imageid;
    public DataBean(String name, int imageid) {
        this.name = name;
        this.imageid = imageid;
    }


}
