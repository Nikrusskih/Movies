package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?rating.kp=7-10&sortField=votes.kp&sortType=-1&limit=10")
    @Headers("X-API-KEY:MTF8W4R-78YMTP5-P5G0ZP5-CVVQ137")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
