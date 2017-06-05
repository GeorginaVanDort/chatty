package com.example.guest.messageboard.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guest.messageboard.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.categoriesButton) Button catButt;
    @Bind(R.id.newPostButton) Button postButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        catButt.setOnClickListener(this);
        postButt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == catButt) {
            //view categories
        }
        if (view == postButt) {
            Intent intent = new Intent(MainActivity.this, NewPostActivity.class);
            startActivity(intent);
        }
    }
}
