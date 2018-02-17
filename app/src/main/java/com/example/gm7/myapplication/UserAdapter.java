package com.example.gm7.myapplication;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gm7.myapplication.data.Contact;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    List<Contact> userList;

    public UserAdapter(List<Contact> userList) {
        this.userList = userList;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        UserHolder holder = new UserHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {

        Contact user = userList.get(position);
        holder.userName.setText(user.getUserName());
        holder.userPhone.setText(user.getUserPhone());


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserHolder extends RecyclerView.ViewHolder {
        TextView userName, userPhone;


        public UserHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.userName);
            userPhone = itemView.findViewById(R.id.userPhone);

        }
    }

}



