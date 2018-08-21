package net.topan_xt.firestoredemo.app.module.home;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import net.topan_xt.firestoredemo.R;
import net.topan_xt.firestoredemo.app.module.base.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity implements HomeView {

    @BindView(R.id.m_edittext_title)
    EditText mEditTextTitle;
    @BindView(R.id.m_edittext_content)
    EditText mEditTextContent;

    HomePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar("Home",0);
        ButterKnife.bind(this);

        mPresenter = new HomePresenter();
        mPresenter.setView(this);
    }

    @OnClick(R.id.m_button_submit)
    void onSubmitClick(){
        String title = mEditTextTitle.getText().toString();
        String content = mEditTextContent.getText().toString();
        mPresenter.submitContent(title, content);
    }

}
