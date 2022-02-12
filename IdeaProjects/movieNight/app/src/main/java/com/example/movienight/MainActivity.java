package com.example.movienight;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText movieEntry;
    EditText snackEntry;
    EditText searchMovieEntry;
    TextView resultsText;

    ArrayList<String> movies = new ArrayList<>();
    ArrayList<String> snacks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieEntry = findViewById(R.id.movieEntry);
        snackEntry = findViewById(R.id.snackEntry);
        searchMovieEntry = findViewById(R.id.searchMovieEntry);
        resultsText = findViewById(R.id.resultsText);

        movies.add("Elf");
        movies.add("White Christmas");
        movies.add("The Grinch");
        snacks.add("kettle corn");
        snacks.add("ice cream");
        snacks.add("buttery popcorn");
    }

    public void AddMovie(View view){
        String newMovie = movieEntry.getText().toString();
        movies.add(newMovie);
        movieEntry.setText(" ");
    }

    public void AddSnack(View view){
        String newSnack = snackEntry.getText().toString();
        snacks.add(newSnack);
        snackEntry.setText(" ");
    }

    public void RandomizeMovie(View view){
        Random random = new Random();
        int randomNumberInArray =random.nextInt(movies.size());
        String randomMovie = movies.get(randomNumberInArray).toString();
        searchMovieEntry.setText(randomMovie);

    }

    public void CreateFinal(View view){
        String movieToSearch = searchMovieEntry.getText().toString();
        String selectedMovie = SelectMovie(movies, movieToSearch);
        String selectedSnack = SelectSnack(snacks);

        String result = "You should watch " + selectedMovie + " with " + selectedSnack + "!";
        resultsText.setText(result);
    }

    public static String SelectMovie(ArrayList movies, String searchValue){
        String movie = "";
        for (int i = 0; i<movies.size(); i++){
            if (movies.get(i).toString().toLowerCase(Locale.ROOT).contains(searchValue.toLowerCase(Locale.ROOT))){
                movie = movies.get(i).toString();
            }
        }
        //if movie has not been set - meaning searchValue didn't match anything
        if (movie == "") {
            Random random = new Random();
            int randomNumberInArray =random.nextInt(movies.size());
            movie = movies.get(randomNumberInArray).toString();
        }
        return movie;
    }

    public static String SelectSnack(ArrayList snacks){
        Random random = new Random();
        String snack = snacks.get(random.nextInt(snacks.size())).toString();
        return snack;
    }

}