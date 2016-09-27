package com.example.rokobabic.edukacija;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

/**
 * Created by Roko Babic on 18.8.2016..
 */
public class Tab2 extends Fragment {

    private TextView tw11;
    private TextView tw12;
    private TextView tw21;
    private TextView tw22;
    private TextView tw31;
    private TextView tw32;
    private TextView tw41;
    private TextView tw42;
    private TextView tw51;
    private TextView tw52;
    private TextView postotak;
    private TextView tocno_ukupno;
    private Button b1;
    private Button b2;
    int[] tmpArray;
    boolean p1, p2, p3, p4, p5;
    float rez1, rez2, rez3, rez4, rez5;
    float uspjesnost; String pos;
    float count_nv, count_pr;



    public int[] randomInt(int max) {
        int min = 1;
        Random r = new Random();

        int[] array = {0, 0, 0, 0, 0};

        for (int i = 0; i<5 ;i++)
        {
            array[i] = r.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public int randomI(int max) {
        int i,min = 1;
        Random r = new Random();

        i = r.nextInt(max - min + 1) + min;

        return  i;
    }

    public static int getBackgroundColor(TextView textView) {
        ColorDrawable drawable = (ColorDrawable) textView.getBackground();
        if (Build.VERSION.SDK_INT >= 11) {
            return drawable.getColor();
        }
        try {
            Field field = drawable.getClass().getDeclaredField("mState");
            field.setAccessible(true);
            Object object = field.get(drawable);
            field = object.getClass().getDeclaredField("mUseColor");
            field.setAccessible(true);
            return field.getInt(object);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_2,container,false);

        tw11 = (TextView) v.findViewById(R.id.textView2);
        tw12 = (TextView) v.findViewById(R.id.textView3);
        tw21 = (TextView) v.findViewById(R.id.textView4);
        tw22 = (TextView) v.findViewById(R.id.textView5);
        tw31 = (TextView) v.findViewById(R.id.textView6);
        tw32 = (TextView) v.findViewById(R.id.textView7);
        tw41 = (TextView) v.findViewById(R.id.textView8);
        tw42 = (TextView) v.findViewById(R.id.textView9);
        tw51 = (TextView) v.findViewById(R.id.textView10);
        tw52 = (TextView) v.findViewById(R.id.textView11);
        postotak = (TextView) v.findViewById(R.id.postotak);
        tocno_ukupno = (TextView) v.findViewById(R.id.textView14);

        b1 = (Button) v.findViewById(R.id.button);b1.setEnabled(false);
        b2 = (Button) v.findViewById(R.id.button2);

        rez1 = 0; rez2 = 0; rez3 = 0; rez4 = 0; rez5 = 0; count_nv = count_pr = 0;

        final String[] rijeci = getResources().getStringArray(R.array.rječnikList);

        b1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) { // klik na 'Provjeri'

                if(p1 && p2 && p3 && p4 && p5){
                    if(getBackgroundColor(tw11) == -5383962){
                        if((tw11.getText().toString().toLowerCase()).equals(rijeci[tmpArray[0]]))
                        {
                            tw11.setBackgroundColor(Color.GREEN);
                            if(rez1 == 0){rez1++;}
                        }
                        else
                        {
                            tw11.setBackgroundColor(Color.RED);
                            if(rez1 == 1){rez1--;}
                        }
                    } else if(getBackgroundColor(tw12) == -5383962) {
                        if((tw12.getText().toString().toLowerCase()).equals(rijeci[tmpArray[0]]))
                        {
                            tw12.setBackgroundColor(Color.GREEN);
                            if(rez1 == 0){rez1++;}
                        }
                        else
                        {
                            tw12.setBackgroundColor(Color.RED);
                            if(rez1 == 1){rez1--;}
                        }
                    }
                    //-----------------------------------------------
                    if(getBackgroundColor(tw21) == -5383962){
                        if((tw21.getText().toString().toLowerCase()).equals(rijeci[tmpArray[1]]))
                        {
                            tw21.setBackgroundColor(Color.GREEN);
                            if(rez2 == 0){rez2++;}
                        }
                        else
                        {
                            tw21.setBackgroundColor(Color.RED);
                            if(rez2 == 1){rez2--;}
                        }
                    } else if(getBackgroundColor(tw22) == -5383962) {
                        if((tw22.getText().toString().toLowerCase()).equals(rijeci[tmpArray[1]]))
                        {
                            tw22.setBackgroundColor(Color.GREEN);
                            if(rez2 == 0){rez2++;}
                        }
                        else
                        {
                            tw22.setBackgroundColor(Color.RED);
                            if(rez2 == 1){rez2--;}
                        }
                    }
                    //-----------------------------------------------
                    if(getBackgroundColor(tw31) == -5383962){
                        if((tw31.getText().toString().toLowerCase()).equals(rijeci[tmpArray[2]]))
                        {
                            tw31.setBackgroundColor(Color.GREEN);
                            if(rez3 == 0){rez3++;}
                        }
                        else
                        {
                            tw31.setBackgroundColor(Color.RED);
                            if(rez3 == 1){rez3--;}
                        }
                    } else if(getBackgroundColor(tw32) == -5383962) {
                        if((tw32.getText().toString().toLowerCase()).equals(rijeci[tmpArray[2]]))
                        {
                            tw32.setBackgroundColor(Color.GREEN);
                            if(rez3 == 0){rez3++;}
                        }
                        else
                        {
                            tw32.setBackgroundColor(Color.RED);
                            if(rez3 == 1){rez3--;}
                        }
                    }
                    //-----------------------------------------------
                    if(getBackgroundColor(tw41) == -5383962){
                        if((tw41.getText().toString().toLowerCase()).equals(rijeci[tmpArray[3]]))
                        {
                            tw41.setBackgroundColor(Color.GREEN);
                            if(rez4 == 0){rez4++;}
                        }
                        else
                        {
                            tw41.setBackgroundColor(Color.RED);
                            if(rez4 == 1){rez4--;}
                        }
                    } else if(getBackgroundColor(tw42) == -5383962) {
                        if((tw42.getText().toString().toLowerCase()).equals(rijeci[tmpArray[3]]))
                        {
                            tw42.setBackgroundColor(Color.GREEN);
                            if(rez4 == 0){rez4++;}
                        }
                        else
                        {
                            tw42.setBackgroundColor(Color.RED);
                            if(rez4 == 1){rez4--;}
                        }
                    }
                    //-----------------------------------------------
                    if(getBackgroundColor(tw51) == -5383962){
                        if((tw51.getText().toString().toLowerCase()).equals(rijeci[tmpArray[4]]))
                        {
                            tw51.setBackgroundColor(Color.GREEN);
                            if(rez5 == 0){rez5++;}
                        }
                        else
                        {
                            tw51.setBackgroundColor(Color.RED);
                            if(rez5 == 1){rez5--;}
                        }
                    } else if(getBackgroundColor(tw52) == -5383962) {
                        if((tw52.getText().toString().toLowerCase()).equals(rijeci[tmpArray[4]]))
                        {
                            tw52.setBackgroundColor(Color.GREEN);
                            if(rez5 == 0){rez5++;}
                        }
                        else
                        {
                            tw52.setBackgroundColor(Color.RED);
                            if(rez5 == 1){rez5--;}
                        }
                    }

                    /*if(count == 0){
                        //count = 1;

                    }*/
                    uspjesnost = 0.0f;
                    count_pr += rez1 + rez2 + rez3 + rez4 + rez5;
                    //racunanje postotka (broj tocnih riječi / broj svih riječi)
                    uspjesnost = (count_pr / count_nv) * 100.0f;
                    //spremanje u TextView
                    pos = String.format(Locale.US, "%.2f", uspjesnost);
                    pos += "% ";
                    postotak.setText(pos);
                    String make = "("+(int)count_pr+"/"+(int)count_nv+")";
                    tocno_ukupno.setText(make);
                    //omogućavanje gumba Nove riječi
                    b2.setEnabled(true);
                    //onemogućavanje gumba Provjeri
                    b1.setEnabled(false);

              }
                else
                {
                    Toast.makeText(getActivity().getBaseContext(), "Nisu odabrane sve riječi!",
                            Toast.LENGTH_LONG).show();
                }
              }
        }
        );

        postotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                builder.setTitle("Uspješnost");
                builder.setMessage("Želite li resetirat postotak?");
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(uspjesnost != 0.0f) {
                            uspjesnost = 0.0f;
                            pos = String.format(Locale.US, "%.2f", uspjesnost);
                            pos += "% ";
                            postotak.setText(pos);
                            count_nv = 5;
                            count_pr = 0;
                            String make = "("+(int)count_pr+"/"+(int)count_nv+")";
                            tocno_ukupno.setText(make);
                            b1.setEnabled(true);
                            b2.setEnabled(false);
                        }
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Nista
                        dialog.dismiss();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

            tw11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw11.setEnabled(true);
                        p1 = true;
                        tw11.setTextColor(Color.GRAY);
                        tw11.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw12.setBackgroundColor(Color.TRANSPARENT);
                        //tw12.setEnabled(false);
                    }
                }
            });
            tw12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw12.setEnabled(true);
                        p1 = true;
                        tw12.setTextColor(Color.GRAY);
                        tw12.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw11.setBackgroundColor(Color.TRANSPARENT);
                        //tw11.setEnabled(false);
                    }
                }
            });
            tw21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw21.setEnabled(true);
                        p2 = true;
                        tw21.setTextColor(Color.GRAY);
                        tw21.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw22.setBackgroundColor(Color.TRANSPARENT);
                        //tw12.setEnabled(false);
                    }
                }
            });
            tw22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw22.setEnabled(true);
                        p2 = true;
                        tw22.setTextColor(Color.GRAY);
                        tw22.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw21.setBackgroundColor(Color.TRANSPARENT);
                        //tw11.setEnabled(false);
                    }
                }
            });
            tw31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw31.setEnabled(true);
                        p3 = true;
                        tw31.setTextColor(Color.GRAY);
                        tw31.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw32.setBackgroundColor(Color.TRANSPARENT);
                        //tw12.setEnabled(false);
                    }
                }
            });
            tw32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw32.setEnabled(true);
                        p3 = true;
                        tw32.setTextColor(Color.GRAY);
                        tw32.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw31.setBackgroundColor(Color.TRANSPARENT);
                        //tw11.setEnabled(false);
                    }
                }
            });
            tw41.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw41.setEnabled(true);
                        p4 = true;
                        tw41.setTextColor(Color.GRAY);
                        tw41.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw42.setBackgroundColor(Color.TRANSPARENT);
                        //tw12.setEnabled(false);
                    }
                }
            });
            tw42.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw42.setEnabled(true);
                        p4 = true;
                        tw42.setTextColor(Color.GRAY);
                        tw42.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw41.setBackgroundColor(Color.TRANSPARENT);
                        //tw11.setEnabled(false);
                    }
                }
            });
            tw51.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw51.setEnabled(true);
                        p5 = true;
                        tw51.setTextColor(Color.GRAY);
                        tw51.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw52.setBackgroundColor(Color.TRANSPARENT);
                        //tw12.setEnabled(false);
                    }
                }
            });
            tw52.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b1.isEnabled()) {
                        tw52.setEnabled(true);
                        p5 = true;
                        tw52.setTextColor(Color.GRAY);
                        tw52.setBackgroundColor(Color.parseColor("#ADD8E6"));
                        tw51.setBackgroundColor(Color.TRANSPARENT);
                        //tw11.setEnabled(false);
                    }
                }
            });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // klik na 'Nove riječi'
                p1 = p2 = p3 = p4 = p5 = false;
                int[] wordNums = randomInt(18804);
                int rand12 = 0;
                tmpArray = wordNums;
                int cnt = 0;
                boolean tf;

                rand12 = randomI(2);
                tw12.setBackgroundColor(Color.TRANSPARENT);
                tw11.setBackgroundColor(Color.TRANSPARENT);tf = true;
                if (rand12 == 1)
                {
                    tw11.setText(rijeci[wordNums[0]]);
                    char[] charRijec = rijeci[wordNums[0]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw12.setText(String.valueOf(charRijec));

                }
                else if (rand12 == 2)
                {
                    tw12.setText(rijeci[wordNums[0]]);
                    char[] charRijec = rijeci[wordNums[0]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw11.setText(String.valueOf(charRijec));
                }

                cnt = 0;
                rand12 = randomI(2);
                tw22.setBackgroundColor(Color.TRANSPARENT);
                tw21.setBackgroundColor(Color.TRANSPARENT);tf = true;
                if (rand12 == 1)
                {
                    tw21.setText(rijeci[wordNums[1]]);
                    char[] charRijec = rijeci[wordNums[1]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw22.setText(String.valueOf(charRijec));

                }
                else if (rand12 == 2)
                {
                    tw22.setText(rijeci[wordNums[1]]);
                    char[] charRijec = rijeci[wordNums[1]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw21.setText(String.valueOf(charRijec));
                }

                cnt = 0;
                rand12 = randomI(2);
                tw32.setBackgroundColor(Color.TRANSPARENT);
                tw31.setBackgroundColor(Color.TRANSPARENT);tf = true;
                if (rand12 == 1)
                {
                    tw31.setText(rijeci[wordNums[2]]);
                    char[] charRijec = rijeci[wordNums[2]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw32.setText(String.valueOf(charRijec));

                }
                else if (rand12 == 2)
                {
                    tw32.setText(rijeci[wordNums[2]]);
                    char[] charRijec = rijeci[wordNums[2]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw31.setText(String.valueOf(charRijec));
                }

                cnt = 0;
                rand12 = randomI(2);
                tw42.setBackgroundColor(Color.TRANSPARENT);
                tw41.setBackgroundColor(Color.TRANSPARENT);tf = true;
                if (rand12 == 1)
                {
                    tw41.setText(rijeci[wordNums[3]]);
                    char[] charRijec = rijeci[wordNums[3]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw42.setText(String.valueOf(charRijec));

                }
                else if (rand12 == 2)
                {
                    tw42.setText(rijeci[wordNums[3]]);
                    char[] charRijec = rijeci[wordNums[3]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw41.setText(String.valueOf(charRijec));
                }

                cnt = 0;
                rand12 = randomI(2);
                tw52.setBackgroundColor(Color.TRANSPARENT);
                tw51.setBackgroundColor(Color.TRANSPARENT);tf = true;
                if (rand12 == 1)
                {
                    tw51.setText(rijeci[wordNums[4]]);
                    char[] charRijec = rijeci[wordNums[4]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw52.setText(String.valueOf(charRijec));

                }
                else if (rand12 == 2)
                {
                    tw52.setText(rijeci[wordNums[4]]);
                    char[] charRijec = rijeci[wordNums[4]].toCharArray();
                    for (char c : charRijec){

                        if(c == 'č' ){
                            charRijec[cnt] = 'ć';
                            tf = false;
                        }
                        else if(c == 'ć' && tf){
                            charRijec[cnt] = 'č';
                        }
                        cnt++;
                    }
                    tw51.setText(String.valueOf(charRijec));
                }

                cnt = 0;
                /*if(count == 1) {
                    count = 2;
                }
                if(count == 0){
                    count = 1;
                }*/

                count_nv += 5;
                //String make = "("+(int)count_pr+"/"+(int)count_nv+")";
                //tocno_ukupno.setText(make);
                b2.setEnabled(false);
                b1.setEnabled(true);

            }
        });
        return v;
    }
}
