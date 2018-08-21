package net.topan_xt.firestoredemo.app.module.home;

import android.util.Log;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import net.topan_xt.firestoredemo.app.module.base.presenter.BasePresenter;
import net.topan_xt.firestoredemo.model.ContentModel;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public class HomePresenter extends BasePresenter<HomeView> {
    FirebaseFirestore db;

    void submitContent(String title, String content){
        ContentModel model = new ContentModel(title, content);

        db = FirebaseFirestore.getInstance();
        db.collection("contents")
                .add(model)
                .addOnSuccessListener((DocumentReference documentReference) -> {
                    getView().onSuccess("Success");
                })
                .addOnFailureListener((Exception e) -> {
                    getView().onFailed("Error : "+e.getMessage());
                });
    }
}
