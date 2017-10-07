package com.example.android.music_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        TextView tvhomepage = (TextView) findViewById(R.id.homepage);
        TextView tvmusician = (TextView) findViewById(R.id.musician);
        TextView tvRecord = (TextView) findViewById(R.id.record);
        TextView tvPlaylist = (TextView) findViewById(R.id.playlist);
        tvmusician.setOnClickListener(new SearchActivity.MyListener());
        tvhomepage.setOnClickListener(new SearchActivity.MyListener());
        tvRecord.setOnClickListener(new SearchActivity.MyListener());
        tvPlaylist.setOnClickListener(new SearchActivity.MyListener());

    }

    private class MyListener implements View.OnClickListener {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_search:
                    startActivity(new Intent(SearchActivity.this, SearchActivity.class));
                    break;
                case R.id.musician:
                    startActivity(new Intent(SearchActivity.this, MusicianActivity.class));
                    break;
                case R.id.record:
                    startActivity(new Intent(SearchActivity.this, RecordActivity.class));
                    break;
                case R.id.playlist:
                    startActivity(new Intent(SearchActivity.this, PlaylistActivity.class));
                    break;
                case R.id.homepage:
                    startActivity(new Intent(SearchActivity.this, MainActivity.class));
                    break;
                default:
                    break;
            }
        }
    }

}


