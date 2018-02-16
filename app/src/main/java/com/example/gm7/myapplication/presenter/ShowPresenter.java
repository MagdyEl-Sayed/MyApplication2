package com.example.gm7.myapplication.presenter;

import android.content.Context;

import com.example.gm7.myapplication.model.data.Contact;
import com.example.gm7.myapplication.model.source.save.SaveTasksDataSource;
import com.example.gm7.myapplication.model.source.show.ShowTaskContract;
import com.example.gm7.myapplication.model.source.show.ShowTasksDataSource;

import java.util.List;

/**
 * Created by GM7 on 2018-02-15.
 */

public class ShowPresenter implements ShowTaskContract.Presenter {
    ShowTaskContract.View view;
    ShowTasksDataSource showTasksDataSource;

    public ShowPresenter(ShowTaskContract.View view, ShowTasksDataSource showTasksDataSource) {
        this.view = view;
        this.showTasksDataSource = showTasksDataSource;
    }


    @Override
    public void getContact(Context context) {
        showTasksDataSource.getContacts(context, new ShowTasksDataSource.ShowContactsCallBack() {

            @Override
            public void onContactLoaded(List<Contact> contactList) {
                view.showSuccess("Contact is Saved");
                view.showTasks(contactList);
            }

            @Override
                    public void onContactFailed(String errorMessage) {
                        view.showFailed("Contact isn't Saved");

                    }
                });
    }
}
