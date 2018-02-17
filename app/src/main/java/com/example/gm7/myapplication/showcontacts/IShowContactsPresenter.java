package com.example.gm7.myapplication.showcontacts;

import android.content.Context;

import com.example.gm7.myapplication.BasePresenter;
import com.example.gm7.myapplication.data.Contact;

/**
 * Created by islam on 2/17/2018.
 */

public interface IShowContactsPresenter extends BasePresenter {

    void getContacts(Context context);
}
