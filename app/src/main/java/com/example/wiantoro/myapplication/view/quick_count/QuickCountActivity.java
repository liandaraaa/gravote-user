package com.example.wiantoro.myapplication.view.quick_count;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wiantoro.myapplication.Adapter.quickCountAdapter;
import com.example.wiantoro.myapplication.R;

import java.util.ArrayList;

public class QuickCountActivity extends AppCompatActivity {

    RecyclerView recyclerViewQuickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_count);

        recyclerViewQuickCount = (RecyclerView) findViewById(R.id.rv_quick_count);

        ArrayList<Integer> listViewType = new ArrayList<>();
        listViewType.add(quickCountAdapter.TYPE_1);
        listViewType.add(quickCountAdapter.TYPE_2);
        listViewType.add(quickCountAdapter.TYPE_1);
        listViewType.add(quickCountAdapter.TYPE_2);
        listViewType.add(quickCountAdapter.TYPE_1);
        listViewType.add(quickCountAdapter.TYPE_2);
        listViewType.add(quickCountAdapter.TYPE_1);
        listViewType.add(quickCountAdapter.TYPE_2);
        listViewType.add(quickCountAdapter.TYPE_1);
        listViewType.add(quickCountAdapter.TYPE_2);

        quickCountAdapter adapter = new quickCountAdapter(listViewType, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerViewQuickCount.setLayoutManager(layoutManager);

        recyclerViewQuickCount.setAdapter(adapter);

    }
}
