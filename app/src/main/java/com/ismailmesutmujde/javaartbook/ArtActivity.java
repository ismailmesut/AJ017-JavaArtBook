package com.ismailmesutmujde.javaartbook;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.ismailmesutmujde.javaartbook.databinding.ActivityArtBinding;


public class ArtActivity extends AppCompatActivity {

    private ActivityArtBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArtBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }

    public void save (View view) {

    }
    public void selectImage (View view) {

    }
}