package com.example.gm7.myapplication.presenter;

import android.content.Context;

import com.example.gm7.myapplication.model.source.save.SaveTaskContract;
import com.example.gm7.myapplication.model.source.save.SaveTasksDataSource;
import com.example.gm7.myapplication.model.data.Contact;

/**
 * Created by GM7 on 2018-02-15.
 */

public class SavePresenter implements SaveTaskContract.Presenter {
    SaveTaskContract.View view;
    SaveTasksDataSource saveTasksDataSource;

    public SavePresenter(SaveTaskContract.View view, SaveTasksDataSource saveTasksDataSource) {
        this.view = view;
        this.saveTasksDataSource = saveTasksDataSource;
    }

    @Override
    public void saveContact(Context context, Contact contact) {
        saveTasksDataSource.saveContacts(context, contact, new SaveTasksDataSource.SaveContactsCallBack() {
            @Override
            public void onContactSaved(Contact contact) {
                view.saveSuccess("Contact is Saved");
            }

            @Override
            public void onContactFailed(String errorMessage) {
                view.saveFailed("Contact isn't Saved");

            }
        });
    }
}
