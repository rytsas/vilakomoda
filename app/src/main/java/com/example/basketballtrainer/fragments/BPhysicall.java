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
import com.example.basketballtrainer.databinding.FragmentABasketballTrainerBinding;
import com.example.basketballtrainer.databinding.FragmentBPhysicalBinding;

public class BPhysicall extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

       final FragmentBPhysicalBinding binding = FragmentBPhysicalBinding.inflate (inflater, container, false);


        binding.speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BASpeedAndAgility, binding);

            }
        });


        binding.agility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BAWormUp, binding);
            }
        });

        binding.summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BASummer, binding);
            }
        });


        binding.conditioning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BAConditioning, binding);
            }
        });

        binding.flexibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BAFlexibility, binding);
            }
        });

        binding.injury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BAInjury, binding);
            }
        });

        binding.plyometrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BAPlyometrics, binding);
            }
        });

        binding.streight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BPhysicall_to_BAStreightAndpower, binding);
            }
        });






        return binding.getRoot();




    }


    private void bindNavigation(int id, FragmentBPhysicalBinding binding) {
        NavDirections action = new ActionOnlyNavDirections(id);
        Navigation.findNavController(binding.getRoot()).navigate(action);
    }
}


