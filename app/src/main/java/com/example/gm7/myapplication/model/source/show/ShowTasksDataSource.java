package com.example.gm7.myapplication.model.source.show;

import android.content.Context;

import com.example.gm7.myapplication.model.data.Contact;

import java.util.List;

/**
 * Created by GM7 on 2018-02-15.
 */

public interface ShowTasksDataSource {

    void getContacts(Context context,ShowContactsCallBack showContactsCallBack);

    interface ShowContactsCallBack {
        void onContactLoaded(List<Contact> contactList);

        void onContactFailed(String errorMessage);
    }
}
