package com.example.dz33month;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private final List<String> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_name);
        list.add("shdvfhiu");
        list.add("shdvfhi");
        list.add("ihsufau");
        list.add("fhihsuf");
        list.add("sh");
        list.add("dvu");
        list.add("fhiau");
        list.add("toosd");
        list.add("sffd");
        list.add("ghiogo");
        list.add("loofd");
        list.add("mkfd");
        list.add("kknfd");

        NamesAdapter namesAdapter = new NamesAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), recyclerView.VERTICAL, false));
        recyclerView.setAdapter(namesAdapter);


    }
}