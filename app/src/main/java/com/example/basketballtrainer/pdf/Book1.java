package com.example.basketballtrainer.pdf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.basketballtrainer.databinding.Book1Binding;
import com.github.barteksc.pdfviewer.PDFView;

public class Book1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        Book1Binding binding = Book1Binding.inflate (inflater, container, false);
        PDFView book1 = binding.pdfbook;

        book1.fromAsset("book1.pdf").load();

        return binding.getRoot();
    }

}
