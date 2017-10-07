package com.example.android.music_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MusicianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musician);
        Button btSearch = (Button) findViewById(R.id.button_search);
        TextView tvhomepage = (TextView) findViewById(R.id.homepage);
        TextView tvRecord = (TextView) findViewById(R.id.record);
        TextView tvPlaylist = (TextView) findViewById(R.id.playlist);
        btSearch.setOnClickListener(new MyListener());
        tvhomepage.setOnClickListener(new MyListener());
        tvRecord.setOnClickListener(new MyListener());
        tvPlaylist.setOnClickListener(new MyListener());

    }

    private class MyListener implements View.OnClickListener {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_search:
                    startActivity(new Intent(MusicianActivity.this, SearchActivity.class));
                    break;
                case R.id.musician:
                    startActivity(new Intent(MusicianActivity.this, MusicianActivity.class));
                    break;
                case R.id.record:
                    startActivity(new Intent(MusicianActivity.this, RecordActivity.class));
                    break;
                case R.id.playlist:
                    startActivity(new Intent(MusicianActivity.this, PlaylistActivity.class));
                    break;
                case R.id.homepage:
                    startActivity(new Intent(MusicianActivity.this, MainActivity.class));
                    break;
                default:
                    break;
            }
        }
    }

}


