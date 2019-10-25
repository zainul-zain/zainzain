package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
    }

    public void ngelinkregister(View view) {
        Intent intent = new Intent(this, Halaman3.class);
        startActivity(intent);
    }

    public void ngelinkLogin(View view) {
        Intent intent = new Intent(this, Lasthalaman.class);
        startActivity(intent);
    }
}
