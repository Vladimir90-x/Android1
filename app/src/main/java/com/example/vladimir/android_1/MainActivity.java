package com.example.vladimir.android_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView list_about_me = (TextView) findViewById(R.id.textView5);
        list_about_me.setText(" ");
        String[] scl = getResources().getStringArray(R.array.what_i_can);
        for (int i = 0; i < scl.length; i++) {
            list_about_me.setText(list_about_me.getText()+" --- "+scl[i]+( i < scl.length - 1  ? "\n":""));
        }
    }
}
