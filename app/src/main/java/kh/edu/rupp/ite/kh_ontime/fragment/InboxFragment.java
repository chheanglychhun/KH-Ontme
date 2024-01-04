package kh.edu.rupp.ite.kh_ontime.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import kh.edu.rupp.ite.kh_ontime.databinding.FragmentInboxBinding;
import kh.edu.rupp.ite.kh_ontime.databinding.FragmentSearchBinding;

public class InboxFragment extends Fragment {

    private FragmentInboxBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentInboxBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
