package com.example.gm7.myapplication.model.source.show;

import android.content.Context;

import com.example.gm7.myapplication.model.data.Contact;

import java.util.List;

/**
 * Created by GM7 on 2018-02-15.
 */

public interface ShowTaskContract {
    interface View {
        void showTasks(List<Contact> contactList);
        void showSuccess(String success);
        void showFailed(String failed);
    }

    interface Presenter {
        void getContact(Context context);
    }
}
