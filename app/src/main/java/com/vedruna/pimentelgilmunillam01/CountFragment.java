package com.vedruna.pimentelgilmunillam01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CountFragment extends Fragment {
    public CountFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_count, container, false);
        String username = getActivity().getIntent().getStringExtra("usuario");
        TextView tvUsername = view.findViewById(R.id.textView3);
        tvUsername.setText("By " + username);
        return view;
    }
}
