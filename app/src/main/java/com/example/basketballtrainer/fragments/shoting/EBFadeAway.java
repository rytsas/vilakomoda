package com.example.basketballtrainer.fragments.shoting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.basketballtrainer.databinding.EbFadeAwayBinding;
import com.example.basketballtrainer.databinding.FragmentEShootingBinding;

public class EBFadeAway extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        EbFadeAwayBinding binding= EbFadeAwayBinding.inflate (inflater, container, false);

        return binding.getRoot();




    }
}
