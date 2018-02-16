package com.example.gm7.myapplication.model.source.save;

import android.content.Context;

import com.example.gm7.myapplication.model.data.Contact;

/**
 * Created by GM7 on 2018-02-15.
 */

public class SaveTasksRepo implements SaveTasksDataSource {

    SaveTasksLocalRepo localRepo;


    public SaveTasksRepo() {
        localRepo = SaveTasksLocalRepo.newInstance();
    }

    @Override
    public void saveContacts(Context context, Contact contact, SaveContactsCallBack saveContactsCallBack) {
        localRepo.saveContacts(context,contact, saveContactsCallBack);

    }
}
