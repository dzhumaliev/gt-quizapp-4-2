package com.geektech.quizapp_gt_4_2.settings;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {
    MutableLiveData<Integer> button = new MutableLiveData<>();
    private int count = 0;

    public void plus() {
        button.postValue(count++);
    }

    public void minus() {
        button.postValue(count--);
    }
}


