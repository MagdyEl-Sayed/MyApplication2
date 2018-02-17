package com.example.gm7.myapplication.showcontacts;

import android.content.Context;

/**
 * Created by islam on 2/17/2018.
 */

public class ShowContactsPresenter implements IShowContactsPresenter {

    final private IShowContactsView iShowContactsView;
    final private ShowContactsRepo showContactsRepo;

    public ShowContactsPresenter(IShowContactsView iShowContactsView, ShowContactsRepo showContactsRepo) {
        this.iShowContactsView = iShowContactsView;
        this.showContactsRepo = showContactsRepo;
    }

    @Override
    public void start() {
    }

    @Override
    public void getContacts(Context context){
        iShowContactsView.showContacts(showContactsRepo.getContacts(context));
    }
}
