package com.hotelapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MenuGridFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
            ) {
        View view = inflater.inflate(R.layout.menu_grid_fragment, container, false);

        setUpToolbar(view);

        //RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
       // recyclerView.setHasFixedSize(true);
        return view;
    }

    private void setUpToolbar(View view) {
        Toolbar toolbar = view.findViewById(R.id.app_bar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        if(activity != null) {
            activity.setSupportActionBar(toolbar);
        }
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
         menuInflater.inflate(R.menu.toolbar_menu, menu);
         super.onCreateOptionsMenu(menu, menuInflater);
    }
}
