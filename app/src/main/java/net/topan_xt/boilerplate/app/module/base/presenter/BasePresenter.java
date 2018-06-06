package net.topan_xt.boilerplate.app.module.base.presenter;

import android.support.annotation.CallSuper;

import net.topan_xt.boilerplate.app.module.base.view.BaseView;
import net.topan_xt.boilerplate.repository.api.ClientAPI;
import net.topan_xt.boilerplate.repository.api.ServiceAPI;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public abstract class BasePresenter<V extends BaseView> {
    public final String     TAG         = getClass().getSimpleName();
    public       ServiceAPI mServiceApi = ClientAPI.getClient().create(ServiceAPI.class);
    private V mView;

    @CallSuper
    public void setView(V mView) {
        this.mView = mView;
    }
    protected V getView() {
        return mView;
    }

}
