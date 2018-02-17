package com.example.gm7.myapplication.savecontact;

import android.content.Context;

import com.example.gm7.myapplication.data.Contact;

/**
 * Created by islam on 2/15/2018.
 */

public interface ISaveContactPresenter {
    void saveContact(Contact contact , Context context);
}
