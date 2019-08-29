package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?","আপনি কোথায় যাচ্ছেন?"));
        words.add(new Word("What is your name?","আপনার নাম কি?"));
        words.add(new Word("My name is...","আমার নাম..."));
        words.add(new Word("How are you feeling?","কেমন লাগছে?"));
        words.add(new Word("I’m feeling good.","আমার ভালো লাগছে"));
        words.add(new Word("Are you coming?","তুমি কি আসছ?"));
        words.add(new Word("Yes, I’m coming.","হ্যাঁ, আমি আসছি।"));
        words.add(new Word("Let’s go.","চলো যাই."));


        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
