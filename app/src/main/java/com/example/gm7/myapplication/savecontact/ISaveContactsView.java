package com.example.gm7.myapplication.savecontact;

import com.example.gm7.myapplication.BaseView;

/**
 * Created by islam on 2/15/2018.
 */

public interface ISaveContactsView extends BaseView {
    void showSaveSuccess(String s);
    void showSaveFailed(String s);
    void navigateToContacts();
}
