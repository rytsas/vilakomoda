package com.example.basketballtrainer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.basketballtrainer.R;
import com.example.basketballtrainer.databinding.FragmentEShootingBinding;

public class EShooting extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        FragmentEShootingBinding binding = FragmentEShootingBinding.inflate (inflater, container, false);

        binding.JumpShot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_EShooting2_to_EAJumpShooting, binding);

            }
        });

        binding.fadeaway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_EShooting2_to_EBFadeAway, binding);
            }
        });



        binding.hook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_EShooting2_to_EDHook, binding);
            }
        });


        binding.pivot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_EShooting2_to_EEPivot, binding);
            }
        });

        return binding.getRoot();




    }

    private void bindNavigation(int id, FragmentEShootingBinding binding) {
        NavDirections action = new ActionOnlyNavDirections(id);
        Navigation.findNavController(binding.getRoot()).navigate(action);
    }
}

