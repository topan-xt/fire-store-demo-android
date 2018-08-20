package net.topan_xt.firestoredemo.app.module.base.presenter;

import android.support.annotation.CallSuper;

import net.topan_xt.firestoredemo.app.module.base.view.BaseView;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public abstract class BasePresenter<V extends BaseView> {
    public final String TAG = getClass().getSimpleName();
    private V mView;

    protected V getView() {
        return mView;
    }

    @CallSuper
    public void setView(V mView) {
        this.mView = mView;
    }

}
