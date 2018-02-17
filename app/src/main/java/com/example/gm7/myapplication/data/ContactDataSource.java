package com.example.gm7.myapplication.data;

import android.content.Context;

import java.util.List;

/**
 * @author islam
 */

public interface ContactDataSource{
    interface SaveContact{
        interface SaveContactCallBack{
            void onContactSaved(String s);
            void onContactSaveFailed(String s);
        }
        void saveContact(Contact contact , Context context , SaveContactCallBack saveContactCallBack);
    }
    List<Contact> getContacts(Context context);
}
