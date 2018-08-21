package net.topan_xt.firestoredemo.model;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Aug 21, 2018.                    *
 *************************************************/

public class ContentModel {
    String mTitle, mContent;

    public ContentModel(String mTitle, String mContent) {
        this.mTitle = mTitle;
        this.mContent = mContent;
    }


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    @Override
    public String toString() {
        return "ContentModel{" +
                ", mTitle='" + mTitle + '\'' +
                ", mContent='" + mContent + '\'' +
                '}';
    }
}
