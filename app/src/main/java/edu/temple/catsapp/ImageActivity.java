package edu.temple.catsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;


import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    int[] catImagesArray;
    Spinner spinner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);

        ArrayList catsArray = new ArrayList<String>();
        catsArray.add("Bengal");
        catsArray.add("British Blue");
        catsArray.add("Norwegian Forest");
        catsArray.add("Persian");
        catsArray.add("Siamese");


        catImagesArray = new int[]{R.drawable.bengal, R.drawable.britishblue, R.drawable.norwegianforest, R.drawable.persian, R.drawable.siamese};

        ImageAdapter adapter = new ImageAdapter(this, catsArray);

        spinner.setAdapter(adapter);




    }
}
