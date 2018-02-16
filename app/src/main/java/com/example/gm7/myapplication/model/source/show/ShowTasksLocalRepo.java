package com.example.gm7.myapplication.model.source.show;

import android.content.Context;
import android.widget.Toast;

import com.example.gm7.myapplication.model.data.Contact;
import com.example.gm7.myapplication.model.data.DatabaseHandler;

import java.util.List;

/**
 * Created by GM7 on 2018-02-16.
 */

public class ShowTasksLocalRepo implements ShowTasksDataSource{
    private static ShowTasksLocalRepo instance;

    public static ShowTasksLocalRepo newInstance() {
        instance = new ShowTasksLocalRepo();
        return instance;
    }



    @Override
    public void getContacts(Context context, ShowTasksDataSource.ShowContactsCallBack showContactsCallBack) {


        DatabaseHandler databaseHandler=new DatabaseHandler(context);
        Toast.makeText(context, databaseHandler.getContactsCount()+"", Toast.LENGTH_SHORT).show();
        showContactsCallBack.onContactLoaded(databaseHandler.getAllContacts());


    }
}
