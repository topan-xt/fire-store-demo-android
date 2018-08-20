package net.topan_xt.firestoredemo.app.module.base.view;

import android.app.Activity;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public interface BaseView {
    void initToolbar(String title, int setDisplayShowHomeEnabled);

    void showProgressDialog(String message);

    void dismissProgressDialog();

    void showToast(String message);

    void showAlertDialog(String message);

    Activity getContext();
}
