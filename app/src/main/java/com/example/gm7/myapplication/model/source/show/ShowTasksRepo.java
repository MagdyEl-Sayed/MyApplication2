package com.example.gm7.myapplication.model.source.show;

import android.content.Context;
import android.widget.Toast;

import com.example.gm7.myapplication.model.data.Contact;
import com.example.gm7.myapplication.model.data.DatabaseHandler;

import java.util.List;

/**
 * Created by GM7 on 2018-02-15.
 */

public class ShowTasksRepo implements ShowTasksDataSource {

    ShowTasksLocalRepo showTasksLocalRepo;

    public ShowTasksRepo() {
        showTasksLocalRepo = ShowTasksLocalRepo.newInstance();
    }

    @Override
    public void getContacts(Context context, ShowContactsCallBack showContactsCallBack) {

showTasksLocalRepo.getContacts(context,showContactsCallBack);
    }

}
