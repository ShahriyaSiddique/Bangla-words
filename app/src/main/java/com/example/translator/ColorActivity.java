package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Red","লাল"));
        words.add(new Word("Blue","নীল"));
        words.add(new Word("Yellow","হলুদ"));
        words.add(new Word("Green","সবুজ"));
        words.add(new Word("White","সাদা"));
        words.add(new Word("Black","কালো"));
        words.add(new Word("Gray","ধূসর"));
        words.add(new Word("Brown","বাদামী"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);




    }
}
