package com.example.a123123;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a123123.databinding.ActivityVietBinding;

public class Viet extends Activity {

    private TextView mTextView;
    private ActivityVietBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityVietBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void nazad1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}