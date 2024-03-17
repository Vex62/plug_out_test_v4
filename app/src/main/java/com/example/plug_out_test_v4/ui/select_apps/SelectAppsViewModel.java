package com.example.plug_out_test_v4.ui.select_apps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SelectAppsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SelectAppsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}