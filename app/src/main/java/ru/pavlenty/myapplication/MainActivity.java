package ru.pavlenty.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView first_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_image = (ImageView) findViewById(R.id.imageView);
        first_image.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        first_image.setImageDrawable(getResources().getDrawable(R.drawable.second,null));
    }
}
