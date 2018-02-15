package com.example.gm7.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gm7.myapplication.presenter.SavePresenter;
import com.example.gm7.myapplication.R;
import com.example.gm7.myapplication.model.source.TaskContract;
import com.example.gm7.myapplication.model.source.TasksRepo;
import com.example.gm7.myapplication.model.data.Contact;
import com.example.gm7.myapplication.model.data.DatabaseHandler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements TaskContract.View {
    TasksRepo tasksRepo;
    TaskContract.Presenter presenter;
    DatabaseHandler databaseHandler;
    List<Contact> contacts = new ArrayList<>();
    Contact contact;
    @BindView(R.id.userName)
    EditText userName;
    @BindView(R.id.userPhone)
    EditText userPhone;
    @BindView(R.id.save)
    Button save;
    @BindView(R.id.show)
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tasksRepo = new TasksRepo();
        presenter = new SavePresenter(this, tasksRepo);
    }


    @OnClick({R.id.save, R.id.show})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.save:
                contact = new Contact(userName.getText().toString(), userPhone.getText().toString());
                presenter.saveContact(this, contact);
                break;
            case R.id.show:
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("user", "");
                startActivity(intent);
                break;
        }
    }

    @Override
    public void navigationContacts() {

    }

    @Override
    public void saveSuccess(String success) {
        Toast.makeText(getApplicationContext(), "Task is Saved", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void saveFailed(String failed) {
        Toast.makeText(getApplicationContext(), "Task is Failed", Toast.LENGTH_SHORT).show();
    }

}
