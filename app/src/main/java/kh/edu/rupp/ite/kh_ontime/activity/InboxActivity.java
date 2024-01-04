package kh.edu.rupp.ite.kh_ontime.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import kh.edu.rupp.ite.kh_ontime.databinding.ActivityInboxBinding;

public class InboxActivity extends AppCompatActivity {

    private ActivityInboxBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInboxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
