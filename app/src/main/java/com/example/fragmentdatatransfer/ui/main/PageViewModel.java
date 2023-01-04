package com.example.fragmentdatatransfer.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private static final String name = "rkloun";
    private static final String password = "12345";
    private MutableLiveData<String> userName = new MutableLiveData<>();
    private MutableLiveData<String> userPaswword = new MutableLiveData<>();

    public void setUserName(String userName) {

    }

    {
        this.userName.setValue(String.valueOf(userName));
    }

    public void setUserPassword(String userPassword){
        this.userPaswword.setValue(userPassword);
    }
    public LiveData<String> getUserName(){
        return userName;
    }
    public LiveData<String> getUserPassword(){
        return userPaswword;
    }
    public static String getName() {return name;}
    public static String getPassword(){return password;}

    public void setIndex(int index) {
    }

    public LiveData<String> getText() {

        return null;
    }
}