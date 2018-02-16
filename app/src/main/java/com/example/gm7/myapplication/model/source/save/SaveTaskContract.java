package com.example.gm7.myapplication.model.source.save;

import android.content.Context;

import com.example.gm7.myapplication.model.data.Contact;

/**
 * Created by GM7 on 2018-02-15.
 */

public interface SaveTaskContract {
    interface View {
        void navigationContacts();

        void saveSuccess(String success);

        void saveFailed(String failed);
    }

    interface Presenter {
        void saveContact(Context context,Contact contact);
    }
}
