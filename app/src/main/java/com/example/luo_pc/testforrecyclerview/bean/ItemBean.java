package com.example.luo_pc.testforrecyclerview.bean;

/**
 * Created by luo-pc on 2016/5/30.
 */
public class ItemBean {
    private int img;
    private String desc;
    private String url;

    public ItemBean(int img,String desc){
        this.img = img;
        this.desc = desc;
    }

    public ItemBean(String url,String desc){
        this.url = url;
        this.desc = desc;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
