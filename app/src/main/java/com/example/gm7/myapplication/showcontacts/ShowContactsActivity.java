package com.example.gm7.myapplication.showcontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.gm7.myapplication.R;
import com.example.gm7.myapplication.data.Contact;
import com.example.gm7.myapplication.data.DatabaseHandler;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowContactsActivity extends AppCompatActivity implements IShowContactsView {

    @BindView(R.id.rv_contacts)
    RecyclerView recyclerView;
    ContactsAdapter contactsAdapter;

    ShowContactsPresenter showContactsPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contacts);
        ButterKnife.bind(this);

        showContactsPresenter = new ShowContactsPresenter(this , new ShowContactsRepo());
        showContactsPresenter.getContacts(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void showContacts(List<Contact> contactList) {
        contactsAdapter = new ContactsAdapter(contactList);
        recyclerView.setAdapter(contactsAdapter);
    }
}
