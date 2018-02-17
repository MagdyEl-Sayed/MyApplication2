package com.example.gm7.myapplication.savecontact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.gm7.myapplication.R;
import com.example.gm7.myapplication.ShowActivity;
import com.example.gm7.myapplication.data.Contact;
import com.example.gm7.myapplication.data.DatabaseHandler;
import com.example.gm7.myapplication.showcontacts.ShowContactsActivity;

import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ISaveContactsView{

    @BindView(R.id.userName)
    EditText userName;
    @BindView(R.id.userPhone)
    EditText userPhone;
    @BindView(R.id.save)
    Button save;
    @BindView(R.id.show)
    Button show;
    DatabaseHandler databaseHandler;
    List<Contact> contacts=new ArrayList<>();
    Contact contact;
    SaveContactPresenter saveContactPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        saveContactPresenter = new SaveContactPresenter(new SaveContactRepo());

    }

    @OnClick({R.id.save, R.id.show})
    public void onViewClicked(View view) {
        contact = new Contact(userName.getText().toString() , userPhone.getText().toString());
        switch (view.getId()) {
            case R.id.save:
                saveContactPresenter.saveContact(contact , this);
                break;
            case R.id.show:
                navigateToContacts();
                break;
        }
    }

    @Override
    public void setPresenter(Object presenter) {

    }

    @Override
    public void showSaveSuccess(String s) {

    }

    @Override
    public void showSaveFailed(String s) {

    }

    @Override
    public void navigateToContacts() {
        startActivity(new Intent(this, ShowContactsActivity.class));
    }
}
