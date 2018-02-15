package com.example.gm7.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.userName)
    EditText userName;
    @InjectView(R.id.userPhone)
    EditText userPhone;
    @InjectView(R.id.save)
    Button save;
    @InjectView(R.id.show)
    Button show;
    DatabaseHandler databaseHandler;
    List<Contact> contacts=new ArrayList<>();
    Contact contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.save, R.id.show})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.save:
                contact=new Contact(userName.getText().toString(),userPhone.getText().toString());
                databaseHandler=new DatabaseHandler(this);
                databaseHandler.addContact(contact);
                break;
            case R.id.show:
                Intent intent=new Intent(MainActivity.this,ShowActivity.class);
                intent.putExtra("user","");
                startActivity(intent);
                break;
        }
    }
}
