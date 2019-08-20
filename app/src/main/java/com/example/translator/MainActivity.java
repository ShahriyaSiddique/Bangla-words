package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = findViewById(R.id.numbers);
        TextView color = findViewById(R.id.colors);
        TextView phrase = findViewById(R.id.phrases);
        TextView family = findViewById(R.id.family);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "list of numbers", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(),NumberActivity.class);

                startActivity(intent);
            }
        });

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "list of color", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(),ColorActivity.class);

                startActivity(intent);
            }
        });

        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "list of phrases", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(),PhraseActivity.class);

                startActivity(intent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "list of family", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(),FamilyActivity.class);

                startActivity(intent);
            }
        });

    }

}
