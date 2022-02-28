package com.example.a123123;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a123123.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void tt(View view) {
        Intent intent = new Intent(this,TrigTozhd.class);
        startActivity(intent);
    }

    public void viet(View view) {
        Intent intent = new Intent(this, Viet.class);
        startActivity(intent);
    }

    public void discs(View view) {
        Intent intent = new Intent(this, Discr.class);
        startActivity(intent);
    }
}