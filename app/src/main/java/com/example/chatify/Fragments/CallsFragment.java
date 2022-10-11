package com.example.chatify.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chatify.Adapters.UsersAdapter;
import com.example.chatify.Models.Users;
import com.example.chatify.R;
import com.example.chatify.databinding.FragmentChatsBinding;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class CallsFragment extends Fragment {



    public CallsFragment() {
        // Required empty public constructor
    }

    FragmentChatsBinding binding;
    ArrayList<Users> list = new ArrayList<>();
    FirebaseDatabase database;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentChatsBinding.inflate(inflater, container, false);

        //set adapter and layout Manager
        UsersAdapter adapter = new UsersAdapter(list, getContext());
        //binding.

        return binding.getRoot();
    }
}