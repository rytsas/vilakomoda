package com.example.basketballtrainer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.basketballtrainer.databinding.FragmentBPhysicalBinding;
import com.example.basketballtrainer.databinding.FragmentCPassingBinding;

public class CPassing extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        FragmentCPassingBinding binding = FragmentCPassingBinding.inflate (inflater, container, false);

        return binding.getRoot();





    }
}