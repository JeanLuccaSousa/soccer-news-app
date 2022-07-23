package me.dio.soccernews.data.remote;

import android.telecom.Call;

import java.util.List;

import me.dio.soccernews.domain.News;
import retrofit2.http.GET;


public interface SoccerNewsApi {
    @GET("news.json")
    Call<List<News>> getNews();
}
