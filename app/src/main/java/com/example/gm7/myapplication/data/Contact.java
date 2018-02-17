package com.example.gm7.myapplication.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by GM7 on 2018-02-15.
 */

public class Contact implements Parcelable {
    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel source) {
            return new Contact(source);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };
    private String userName, userPhone;
    private int ID;

     public Contact() {}

    public Contact(String userName, String userPhone) {
        this.userName = userName;
        this.userPhone = userPhone;
    }

    Contact(int ID, String userName, String userPhone) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.ID = ID;
    }


    public Contact(Parcel in) {
        this.userName = in.readString();
        this.userPhone = in.readString();
        this.ID = in.readInt();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userName);
        dest.writeString(this.userPhone);
        dest.writeInt(this.ID);
    }
}
