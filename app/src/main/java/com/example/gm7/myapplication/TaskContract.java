package com.example.gm7.myapplication;

/**
 * Created by GM7 on 2018-02-15.
 */

public interface TaskContract {
    interface View{
        void navigatContacts();
        void saveSuccess(String s);
        void saveFailed(String s);
    }
    interface Presenter{
        void saveContact(Contact contact);
    }
}
