package net.topan_xt.boilerplate.app.module.base.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import net.topan_xt.boilerplate.app.module.base.view.BaseView;
import net.topan_xt.boilerplate.shared.Constant;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public abstract class BaseFragment extends Fragment implements BaseView {
    private ProgressDialog mProgressDialog;
    public final String TAG = getClass().getSimpleName();

    @Override
    public void initToolbar(String title, int setDisplayShowHomeEnabled) {

    }

    @Override
    public void showProgressDialog(String message) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(getActivity());
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setMessage(Constant.BasicMessage.WAIT);
        }
        mProgressDialog.show();
    }

    @Override
    public void dismissProgressDialog() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(getActivity(), ""+message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAlertDialog(String message) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setMessage(message);
        alertDialog.setPositiveButton("OK", (dialog, which) -> {
        });
        final AlertDialog dialog = alertDialog.create();
        dialog.show();
    }

    @Override
    public Activity getContext() {
        return getActivity();
    }
}
