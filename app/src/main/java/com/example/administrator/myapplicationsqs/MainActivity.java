package com.example.administrator.myapplicationsqs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView= (ExpandableListView) findViewById(R.id.elv);
        MyAdapter adapter=new MyAdapter(this);
        adapter.addMyData(getData.getGroupData(),getData.getChildData());
        expandableListView.setAdapter(adapter);
    }
}
