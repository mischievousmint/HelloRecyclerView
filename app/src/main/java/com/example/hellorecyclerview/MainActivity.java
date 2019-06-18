package com.example.hellorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvFilms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilms = findViewById(R.id.rvFilms);

        rvFilms.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        FilmAdapter mAdapter = new FilmAdapter(getFilms());

        rvFilms.setAdapter(mAdapter);

    }

   private List<FilmModel> getFilms(){

        FilmModel film1 = new FilmModel();
        film1.setTitle("Fantasía");

        FilmModel film2 = new FilmModel();
        film2.setTitle("Anastasia");

        FilmModel film3 = new FilmModel();
        film3.setTitle("Matrix");

        List<FilmModel> listadepeliculas = new ArrayList<>();
        listadepeliculas.add(film1);
        listadepeliculas.add(film2);
        listadepeliculas.add(film3);

        return listadepeliculas;
   }

}