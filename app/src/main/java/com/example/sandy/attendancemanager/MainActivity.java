package com.example.sandy.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button go_to_subjects, go_to_tt, go_to_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_to_subjects = (Button) findViewById(R.id.btn_subjects);
        go_to_subjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,SubjectsActivity.class);
                startActivity(intent);
            }
        });
        //For Time table Button
        go_to_tt = (Button) findViewById(R.id.btn_TT);
        go_to_tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,TimeTableActivity.class);
                startActivity(intent);
            }
        });

        go_to_details = (Button) findViewById(R.id.btn_details);
        go_to_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
