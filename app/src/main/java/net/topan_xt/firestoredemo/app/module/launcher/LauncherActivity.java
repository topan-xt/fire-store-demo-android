package net.topan_xt.boilerplate.app.module.launcher;

import android.os.Bundle;

import net.topan_xt.boilerplate.R;
import net.topan_xt.boilerplate.app.module.base.activity.BaseActivity;

public class LauncherActivity extends BaseActivity implements LauncherView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar("Home",0);
    }
}
