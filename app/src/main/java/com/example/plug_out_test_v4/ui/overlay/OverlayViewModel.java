package com.example.plug_out_test_v4.ui.overlay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OverlayViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OverlayViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}