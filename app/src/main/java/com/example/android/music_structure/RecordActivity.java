package com.example.android.music_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        Button btSearch = (Button) findViewById(R.id.button_search);
        TextView tvhomepage = (TextView) findViewById(R.id.homepage);
        TextView tvmusician = (TextView) findViewById(R.id.musician);
        TextView tvPlaylist = (TextView) findViewById(R.id.playlist);
        btSearch.setOnClickListener(new MyListener());
        tvhomepage.setOnClickListener(new MyListener());
        tvmusician.setOnClickListener(new MyListener());
        tvPlaylist.setOnClickListener(new MyListener());

    }

    private class MyListener implements View.OnClickListener {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_search:
                    startActivity(new Intent(RecordActivity.this, SearchActivity.class));
                    break;
                case R.id.musician:
                    startActivity(new Intent(RecordActivity.this, MusicianActivity.class));
                    break;
                case R.id.record:
                    startActivity(new Intent(RecordActivity.this, RecordActivity.class));
                    break;
                case R.id.playlist:
                    startActivity(new Intent(RecordActivity.this, PlaylistActivity.class));
                    break;
                case R.id.homepage:
                    startActivity(new Intent(RecordActivity.this, MainActivity.class));
                    break;
                default:
                    break;
            }
        }
    }
}


