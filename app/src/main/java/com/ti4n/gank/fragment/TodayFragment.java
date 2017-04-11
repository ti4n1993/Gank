package com.ti4n.gank.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.ti4n.gank.Adapter.TodayAdapter;
import com.ti4n.gank.Data.FuliData;
import com.ti4n.gank.Data.TodayData;
import com.ti4n.gank.R;
import com.ti4n.gank.service.DataService;

import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by liany on 12/30/2016.
 */

public class TodayFragment extends Fragment {
    @Nullable

    DataService service;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_today,container,false);
        Toolbar toolbar= (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("每日推荐");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service= retrofit.create(DataService.class);

        Calendar calendar=Calendar.getInstance();

        Call<TodayData> date=service.date(2016,12,30);
        date.enqueue(new Callback<TodayData>() {
            @Override
            public void onResponse(Call<TodayData> call, Response<TodayData> response) {
                final TodayData todayData=response.body();
                Call<FuliData> fuli=service.fuli();
                fuli.enqueue(new Callback<FuliData>() {
                    @Override
                    public void onResponse(Call<FuliData> call, Response<FuliData> response) {

                        ImageView imageView= (ImageView) view.findViewById(R.id.toolbar_image);
                        Picasso.with(getContext()).load(response.body().getResults().get(0).getUrl()).into(imageView);

                    }

                    @Override
                    public void onFailure(Call<FuliData> call, Throwable t) {

                    }
                });
                RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.today_recyclerview);
                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
                recyclerView.setHasFixedSize(true);
                recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
                recyclerView.setLayoutManager(layoutManager);
                        Log.i("tag",""+todayData.getCategory().size());
                recyclerView.setAdapter(new TodayAdapter(todayData,getContext()));
            }

            @Override
            public void onFailure(Call<TodayData> call, Throwable t) {
                Toast.makeText(getContext(),"lose",Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }

    public static TodayFragment newInstance() {

        Bundle args = new Bundle();

        TodayFragment fragment = new TodayFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
