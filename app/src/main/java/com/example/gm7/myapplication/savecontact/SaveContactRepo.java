package com.example.gm7.myapplication.savecontact;

import android.content.Context;
import android.widget.Toast;

import com.example.gm7.myapplication.MyApplication;
import com.example.gm7.myapplication.data.Contact;
import com.example.gm7.myapplication.data.ContactDataSource;
import com.example.gm7.myapplication.data.DatabaseHandler;

/**
 * Created by islam on 2/15/2018.
 */

public class SaveContactRepo implements ContactDataSource.SaveContact{

    private static SaveContactRepo INSTANCE = null;

    public static SaveContactRepo getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SaveContactRepo();
        }
        return INSTANCE;
    }

    @Override
    public void saveContact(Contact contact, Context context, SaveContactCallBack saveContactCallBack) {

        DatabaseHandler databaseHandler=new DatabaseHandler(context);
        databaseHandler.addContact(contact);
    }
}
