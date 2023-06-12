package com.example.mt2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment_search_shape extends Fragment {


    private View view;
    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search_shape, container, false);
        button1 = view.findViewById(R.id.btn_shape);
        button2= view.findViewById(R.id.btn_words);
        button3 = view.findViewById(R.id.btn_color);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); //무언가 담을 준비를 할 수 있는 보따리
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                fragment_search_shape2 shape2 = new fragment_search_shape2();
                shape2.setArguments(bundle);
                transaction.replace(R.id.menu_frame_layout,shape2);
                transaction.commit(); //저장
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); //무언가 담을 준비를 할 수 있는 보따리
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                fragment_search_words words = new fragment_search_words();
                words.setArguments(bundle);
                transaction.replace(R.id.menu_frame_layout,words);
                transaction.commit(); //저장
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); //무언가 담을 준비를 할 수 있는 보따리
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                fragment_search_color color = new fragment_search_color();
                color.setArguments(bundle);
                transaction.replace(R.id.menu_frame_layout,color);
                transaction.commit(); //저장
            }
        });

        return view;
    }

}