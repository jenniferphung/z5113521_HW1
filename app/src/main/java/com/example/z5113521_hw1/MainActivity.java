package com.example.z5113521_hw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calendar calendar = Calendar.getInstance();

        /*SYDNEY TITLE AND IMAGE*/
        final ConstraintLayout sydneyitem = findViewById(R.id.sydney_time);
        TextView sydneytitle = sydneyitem.findViewById(R.id.city);
        sydneytitle.setText("Sydney");

        ImageView sydneyimage = sydneyitem.findViewById(R.id.picture);
        sydneyimage.setImageResource(R.drawable.sydney);

        /*NEWYORK TITLE AND IMAGE*/
        final ConstraintLayout newyorkitem = findViewById(R.id.newyork_time);
        TextView newyorktitle = newyorkitem.findViewById(R.id.city);
        newyorktitle.setText("New York");

        ImageView newyorkimage = newyorkitem.findViewById(R.id.picture);
        newyorkimage.setImageResource(R.drawable.newyork);

        /*TOKYO TITLE AND IMAGE*/
        final ConstraintLayout tokyoitem = findViewById(R.id.tokyo_time);
        TextView tokyotitle = tokyoitem.findViewById(R.id.city);
        tokyotitle.setText("Tokyo");

        ImageView tokyoimage = tokyoitem.findViewById(R.id.picture);
        tokyoimage.setImageResource(R.drawable.tokyo);

        /*LONDON TITLE AND IMAGE*/
        final ConstraintLayout londonitem = findViewById(R.id.london_time);
        TextView londontitle = londonitem.findViewById(R.id.city);
        londontitle.setText("London");

        ImageView londonimage = londonitem.findViewById(R.id.picture);
        londonimage.setImageResource(R.drawable.london);

        /*LOS ANGELES TITLE AND IMAGE*/
        final ConstraintLayout losangelesitem = findViewById(R.id.losangeles_time);
        TextView losangelestitle = losangelesitem.findViewById(R.id.city);
        losangelestitle.setText("Los Angeles");

        ImageView losangelesimage = losangelesitem.findViewById(R.id.picture);
        losangelesimage.setImageResource(R.drawable.losangeles);

        /*12H BUTTON */
        Button button12h = findViewById(R.id.Button12H);
        button12h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat time12h = new SimpleDateFormat("hh:mm a");

                /*SYDNEY 12H TIME*/
                time12h.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
                TextView sydneytime = sydneyitem.findViewById(R.id.time);
                sydneytime.setText(time12h.format(calendar.getTime()));

                /*NEW YORK 12H TIME*/
                time12h.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                TextView newyorktime = newyorkitem.findViewById(R.id.time);
                newyorktime.setText(time12h.format(calendar.getTime()));

                /*TOKYO 12H TIME*/
                time12h.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
                TextView tokyotime = tokyoitem.findViewById(R.id.time);
                tokyotime.setText(time12h.format(calendar.getTime()));

                /*LONDON 12H TIME*/
                time12h.setTimeZone(TimeZone.getTimeZone("Europe/London"));
                TextView londontime = londonitem.findViewById(R.id.time);
                londontime.setText(time12h.format(calendar.getTime()));

                /*LOS ANGELES 12H TIME*/
                time12h.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
                TextView losangelestime = losangelesitem.findViewById(R.id.time);
                losangelestime.setText(time12h.format(calendar.getTime()));
            }
        });

        /*24H BUTTON */
        Button button24h = findViewById(R.id.Button24H);
        button24h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat time24h = new SimpleDateFormat("HH:mm");

                /*SYDNEY 24H TIME*/
                time24h.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
                TextView sydneytime = sydneyitem.findViewById(R.id.time);
                sydneytime.setText(time24h.format(calendar.getTime()));

                /*NEW YORK 24H TIME*/
                time24h.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                TextView newyorktime = newyorkitem.findViewById(R.id.time);
                newyorktime.setText(time24h.format(calendar.getTime()));

                /*TOKYO 24H TIME*/
                time24h.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
                TextView tokyotime = tokyoitem.findViewById(R.id.time);
                tokyotime.setText(time24h.format(calendar.getTime()));

                /*LONDON 24H TIME*/
                time24h.setTimeZone(TimeZone.getTimeZone("Europe/London"));
                TextView londontime = londonitem.findViewById(R.id.time);
                londontime.setText(time24h.format(calendar.getTime()));

                /*LOS ANGELES 24H TIME*/
                time24h.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
                TextView losangelestime = losangelesitem.findViewById(R.id.time);
                losangelestime.setText(time24h.format(calendar.getTime()));
            }
        });

        /*SETS DEFAULT TIME*/
        button12h.callOnClick();

        /*REFRESH BUTTON*/
        ImageButton refreshbutton = findViewById(R.id.refreshbutton);
        refreshbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                finish();
                startActivity(intent);
            }
        });
    }
}
