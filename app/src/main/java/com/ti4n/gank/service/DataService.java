package com.ti4n.gank.service;


import com.ti4n.gank.Data.FuliData;
import com.ti4n.gank.Data.TodayData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by liany on 12/30/2016.
 */

public interface DataService {
    @GET("day/{year}/{month}/{day}")
    Call<TodayData> date(@Path("year") int year, @Path("month") int month, @Path("day") int day);

    @GET("data/福利/20/1")
    Call<FuliData> fuli();
}
