package com.example.asianery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button btnCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCountries = (Button) findViewById(R.id.btncountries);
        btnCountries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openapps();
            }
        });
    }
    public void openapps(){
        Intent intent = new Intent(this, countrieschoices.class);
        startActivity(intent);

    }
}
