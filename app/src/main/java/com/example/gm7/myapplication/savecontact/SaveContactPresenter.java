package com.example.gm7.myapplication.savecontact;

import android.content.Context;

import com.example.gm7.myapplication.data.Contact;
import com.example.gm7.myapplication.data.ContactDataSource;

/**
 * Created by islam on 2/15/2018.
 */

public class SaveContactPresenter implements ISaveContactPresenter {

    final private SaveContactRepo saveContactRepo ;

    public SaveContactPresenter(SaveContactRepo saveContactRepo) {
        this.saveContactRepo = saveContactRepo;
    }

    @Override
    public void saveContact(Contact contact , Context context) {
        saveContactRepo.saveContact(contact, context, new ContactDataSource.SaveContact.SaveContactCallBack() {
            @Override
            public void onContactSaved(String s) {

            }

            @Override
            public void onContactSaveFailed(String s) {

            }
        });
    }
}