package com.senorin.nbaplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] playersList = {"Kevin Durant", "LeBron James", "Stephen Curry", "James Harden", "Kyrie Irving", "Kawhi Leonard"};
    int[] playerImages = {R.drawable.kevin, R.drawable.lebron, R.drawable.stephen, R.drawable.james, R.drawable.kyrie, R.drawable.kawhi};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.nbaplayers);
        Players players = new Players(getApplicationContext(), playersList, playerImages);
        listView.setAdapter(players);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("CUSTOM_LIST_VIEW", "item is clicked @ position :: " + position);
            }
        });
    }
}