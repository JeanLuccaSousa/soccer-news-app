package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover Mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Palmeiras Tem Desfalque Importante","testando para ver se funciona "));
        news.add(new News("Palmeiras Joga Amanhã", "testando para ver se funciona "));
        news.add(new News("Copa do Mundo Feminina Está Terminando", "testando para ver se funciona "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}