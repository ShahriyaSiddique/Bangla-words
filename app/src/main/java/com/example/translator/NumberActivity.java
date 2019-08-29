package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One",getString(R.string.One)));
        words.add(new Word("Two",getString(R.string.Two)));
        words.add(new Word("Three",getString(R.string.Three)));
        words.add(new Word("Four",getString(R.string.Four)));
        words.add(new Word("Five",getString(R.string.Five)));
        words.add(new Word("Six",getString(R.string.Six)));
        words.add(new Word("Seven",getString(R.string.Seven)));
        words.add(new Word("Eight",getString(R.string.Eight)));
        words.add(new Word("Nine",getString(R.string.Nine)));
        words.add(new Word("Ten",getString(R.string.Ten)));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);




    }
}


