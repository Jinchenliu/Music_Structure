package com.example.android.music_structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSearch = (Button) findViewById(R.id.button_search);
        TextView tvMusician = (TextView) findViewById(R.id.musician);
        TextView tvRecord = (TextView) findViewById(R.id.record);
        TextView tvPlaylist = (TextView) findViewById(R.id.playlist);

        btSearch.setOnClickListener(new MainActivity.MyListener());
        tvMusician.setOnClickListener(new MainActivity.MyListener());
        tvRecord.setOnClickListener(new MainActivity.MyListener());
        tvPlaylist.setOnClickListener(new MainActivity.MyListener());
    }


    private class MyListener implements View.OnClickListener {

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_search:
                    startActivity(new Intent(MainActivity.this, SearchActivity.class));
                    break;
                case R.id.musician:
                    startActivity(new Intent(MainActivity.this, MusicianActivity.class));
                    break;
                case R.id.record:
                    startActivity(new Intent(MainActivity.this, RecordActivity.class));
                    break;
                case R.id.playlist:
                    startActivity(new Intent(MainActivity.this, PlaylistActivity.class));
                    break;
                default:
                    break;
            }
        }
    }

}
