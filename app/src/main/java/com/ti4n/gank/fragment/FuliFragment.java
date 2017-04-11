package com.ti4n.gank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.ti4n.gank.Adapter.FuliAdapter;
import com.ti4n.gank.Adapter.TodayAdapter;
import com.ti4n.gank.Data.FuliData;
import com.ti4n.gank.R;
import com.ti4n.gank.service.DataService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by liany on 1/1/2017.
 */

public class FuliFragment extends Fragment {
    @Nullable

    DataService service;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fuli, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.fuli_toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("福利");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(DataService.class);


        Call<FuliData> fuli = service.fuli();
        fuli.enqueue(new Callback<FuliData>() {
            @Override
            public void onResponse(Call<FuliData> call, Response<FuliData> response) {

                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fuli_recyclerview);
                RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(new FuliAdapter(response.body(), getContext()));
            }

            @Override
            public void onFailure(Call<FuliData> call, Throwable t) {

            }
        });


        return view;
    }

    public static FuliFragment newInstance() {
        
        Bundle args = new Bundle();
        
        FuliFragment fragment = new FuliFragment();
        fragment.setArguments(args);
        return fragment;
    }
}

