package com.example.translator;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
        R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentAndroidFlavor = getItem(position);

        TextView numberTextView = listItemView.findViewById(R.id.english_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getmEnglishWordTranslation());
        // Find the TextView in the list_item.xml layout with the ID banglaText
        TextView nameTextView = listItemView.findViewById(R.id.bangla_text_view);
        // Get the banglaText from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getmBanglaWordTranslation());

        // Find the TextView in the list_item.xml layout with the ID english_text_view

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
        }
        }
