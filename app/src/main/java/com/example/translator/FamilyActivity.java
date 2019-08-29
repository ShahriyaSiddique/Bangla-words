package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Father","আব্বু"));
        words.add(new Word("Mother","আম্মু"));
        words.add(new Word("Son","পুত্র"));
        words.add(new Word("Daughter","কন্যা"));
        words.add(new Word("Brother","ভাই"));
        words.add(new Word("Sister","বোন"));
        words.add(new Word("Grandmother","দাদু/নানু"));
        words.add(new Word("GrandFather","দাদা/নানা"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
