package com.example.gm7.myapplication.presenter;

import android.content.Context;

import com.example.gm7.myapplication.model.source.TaskContract;
import com.example.gm7.myapplication.model.source.TasksDataSource;
import com.example.gm7.myapplication.model.data.Contact;

/**
 * Created by GM7 on 2018-02-15.
 */

public class SavePresenter implements TaskContract.Presenter {
    TaskContract.View view;
    TasksDataSource tasksDataSource;

    public SavePresenter(TaskContract.View view, TasksDataSource tasksDataSource) {
        this.view = view;
        this.tasksDataSource = tasksDataSource;
    }

    @Override
    public void saveContact(Context context, Contact contact) {
        tasksDataSource.saveContacts(context, contact, new TasksDataSource.SaveContactsCallBack() {
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
