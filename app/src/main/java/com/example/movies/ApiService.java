package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    String TOKEN = "MTF8W4R-78YMTP5-P5G0ZP5-CVVQ137";

    @GET("movie?rating.kp=7-10&sortField=votes.kp&sortType=-1&limit=30")
    @Headers("X-API-KEY:" + TOKEN)
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{id}")
    @Headers("X-API-KEY:" + TOKEN)
    Single<TrailerResponse> loadTrailers(@Path("id") int id);

    @GET("review?field=movieId")
    @Headers("X-API-KEY:" + TOKEN)
    Single<ReviewResponse> loadReviews(@Query("search") int id);

}
