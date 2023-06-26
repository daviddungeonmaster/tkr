package com.tkr.tkrtpushop.ViewHolder;

public class Category {

    int cat_id;
    String title;

    public Category(int cat_id, String title) {
        this.cat_id = cat_id;
        this.title = title;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
