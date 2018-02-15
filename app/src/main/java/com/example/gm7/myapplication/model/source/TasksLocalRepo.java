package com.example.gm7.myapplication.model.source;

import android.content.Context;
import android.widget.Toast;

import com.example.gm7.myapplication.model.data.Contact;
import com.example.gm7.myapplication.model.data.DatabaseHandler;

/**
 * Created by GM7 on 2018-02-15.
 */

public class TasksLocalRepo implements TasksDataSource {

    private static TasksLocalRepo instance;

    public static TasksLocalRepo newInstance() {
        instance = new TasksLocalRepo();
        return instance;
    }


    @Override
    public void saveContacts(Context context, Contact contact, SaveContactsCallBack saveContactsCallBack) {
        if (contact != null){

            DatabaseHandler databaseHandler=new DatabaseHandler(context);
            databaseHandler.addContact(contact);
            Toast.makeText(context, databaseHandler.getContactsCount()+"", Toast.LENGTH_SHORT).show();
            saveContactsCallBack.onContactSaved(contact);
        }

        else {
            saveContactsCallBack.onContactFailed("Not Storage");
        }
    }
}
