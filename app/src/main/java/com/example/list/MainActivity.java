package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries = {"Аргентина", "Бразилия", "Чили"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, Argentina.class);
                        startActivity(intent);
                        break;

                }
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        };

    getListView().setOnItemClickListener(itemListener);
    }
}