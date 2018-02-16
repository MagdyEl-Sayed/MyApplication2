package com.example.gm7.myapplication.model.source.save;

import android.content.Context;

import com.example.gm7.myapplication.model.data.Contact;

/**
 * Created by GM7 on 2018-02-15.
 */

public interface SaveTasksDataSource {

    void saveContacts(Context context, Contact contact, SaveContactsCallBack saveContactsCallBack);

    interface SaveContactsCallBack {
        void onContactSaved(Contact contact);

        void onContactFailed(String errorMessage);
    }
}
