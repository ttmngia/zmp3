package com.example.zmp3.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.zmp3.R;

public class Fragment_Trang_Chu extends Fragment {
    View view;
    @Nullable
    @Override
    //gắn view cho fragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_trang_chu,container,false);
        return view;
    }
}
