package com.example.a123123;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a123123.databinding.ActivityDiscrBinding;

public class Discr extends Activity {

    private TextView mTextView;
    private ActivityDiscrBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDiscrBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
    public void nazad2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}