package com.example.a123123;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a123123.databinding.ActivityTrigTozhdBinding;

public class TrigTozhd extends Activity {

    private TextView mTextView;
    private ActivityTrigTozhdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTrigTozhdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }

    public void nazad(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}