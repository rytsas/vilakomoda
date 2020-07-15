package com.example.basketballtrainer.physical_training;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


import com.example.basketballtrainer.MainActivity;
import com.example.basketballtrainer.R;
import com.example.basketballtrainer.databinding.BaSummerBinding;
import com.example.basketballtrainer.databinding.FragmentBPhysicalBinding;
import com.example.basketballtrainer.pdf.Book1;
import com.github.barteksc.pdfviewer.PDFView;

public class BASummer extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        BaSummerBinding binding = BaSummerBinding.inflate (inflater, container, false);



        binding.book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindNavigation(R.id.action_BASummer_to_book1, binding);
            }
        });


        return binding.getRoot();


    }

    private void bindNavigation(int id, BaSummerBinding binding) {
        NavDirections action = new ActionOnlyNavDirections(id);
        Navigation.findNavController(binding.getRoot()).navigate(action);
}
}