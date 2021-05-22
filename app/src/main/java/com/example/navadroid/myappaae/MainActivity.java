package com.example.navadroid.myappaae;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ========== create an instance ==========
        TextView tvGreeting = findViewById(R.id.tv_greeting);
        tvGreeting.setText(getString(R.string.tv_greeting));
        tvGreeting.setTextSize(getResources().getDimension(R.dimen.tv_greeting));
        tvGreeting.setTextColor(getResources().getColor(R.color.tv_greeting));
        //tvGreeting.setTextAppearance(R.style.headerText);

        // ========== anonymous object ==========
        ((TextView) findViewById(R.id.tv_greeting)).setText(R.string.tv_greeting);
        ((TextView) findViewById(R.id.tv_greeting)).setTextSize(R.dimen.tv_greeting);
//                getResources().getDimension(R.dimen.tv_greeting)
        ((TextView) findViewById(R.id.tv_greeting)).setTextColor(getResources().getColor(R.color.tv_greeting));
    }
}

  
