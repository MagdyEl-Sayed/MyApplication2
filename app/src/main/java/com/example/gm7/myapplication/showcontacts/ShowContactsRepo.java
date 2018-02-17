package com.example.gm7.myapplication.showcontacts;

import android.content.Context;

import com.example.gm7.myapplication.data.Contact;
import com.example.gm7.myapplication.data.ContactDataSource;
import com.example.gm7.myapplication.data.DatabaseHandler;
import com.example.gm7.myapplication.savecontact.SaveContactRepo;

import java.util.List;

/**
 * Created by islam on 2/17/2018.
 */

public class ShowContactsRepo implements ContactDataSource {

    private static ShowContactsRepo INSTANCE = null;

    public static ShowContactsRepo getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ShowContactsRepo();
        }
        return INSTANCE;
    }
    @Override
    public List<Contact> getContacts(Context context) {
        DatabaseHandler databaseHandler = new DatabaseHandler(context);
        return databaseHandler.getAllContacts();
    }
}
