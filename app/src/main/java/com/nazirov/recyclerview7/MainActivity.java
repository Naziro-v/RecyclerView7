package com.nazirov.recyclerview7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.icu.util.Measure;
import android.os.Bundle;

import com.nazirov.recyclerview7.model.Member;
import com.nazirov.recyclerview7.model.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        List<Member> members =prepareMemerList();
        refreshAdapter(members);
    }

    private void initViews() {
        recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,3));
    }
    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter= new CustomAdapter(context,members);
       recyclerView.setAdapter(adapter);
    }
    private List<Member> prepareMemerList () {
        List<Member> members =new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            members.add(new Member("Nazirov" +i ,"Elmurod"+i));
        }
        return members;
    }
}