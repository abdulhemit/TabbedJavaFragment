package com.example.tabbetjavafaragment.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

   private MutableLiveData<String> nameInput = new MutableLiveData<>();

    /*public void setNameInput(MutableLiveData<String> nameInput) {
        this.nameInput = nameInput;
    }

    public MutableLiveData<String> getNameInput() {
        return nameInput;
    }*/
    public void setName(String name){
        nameInput.setValue(name);
    }
    public LiveData<String> getname(){
        return nameInput;
    }
}