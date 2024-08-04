package com.example.belikeelonmusk;

import androidx.cardview.widget.CardView;

import com.example.belikeelonmusk.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
