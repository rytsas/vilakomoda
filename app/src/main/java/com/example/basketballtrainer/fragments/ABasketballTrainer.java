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

import static com.example.basketballtrainer.databinding.FragmentBPhysicalBinding.inflate;

public class ABasketballTrainer extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

         final FragmentABasketballTrainerBinding binding = FragmentABasketballTrainerBinding.inflate (inflater, container, false);

        binding.buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_ABasketballTrainer_to_BPhysicall2, binding);
            }
        });

        binding.passing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_ABasketballTrainer_to_CPassing2, binding);
            }
        });


        binding.dribbling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_ABasketballTrainer_to_DDribling, binding);
            }
        });

        binding.shooting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_ABasketballTrainer_to_EShooting2, binding);
            }
        });




        return binding.getRoot();






    }

    private void bindNavigation(int id, com.example.basketballtrainer.databinding.FragmentABasketballTrainerBinding binding) {
        NavDirections action = new ActionOnlyNavDirections(id);
        Navigation.findNavController(binding.getRoot()).navigate(action);
    }
}
