package com.example.binaryworld.aglanproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    static RecAdapter recAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Model> data = new ArrayList<>();
        listView = findViewById(R.id.main_list);



        listView.setLayoutManager(new GridLayoutManager(getBaseContext(),2));
        recAdapter = new RecAdapter(getBaseContext(), data);

        FetchData fetchData =new FetchData();
        fetchData.execute();


        recyclerView.setAdapter(recAdapter);
    }
}
