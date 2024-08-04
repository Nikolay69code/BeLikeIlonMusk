package com.example.belikeelonmusk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    private Switch sw1,sw2,sw3,sw4,sw5,sw6,sw7,sw8,sw9,sw10;
    boolean sw_st1,sw_st2,sw_st3,sw_st4,sw_st5,sw_st6,sw_st7,sw_st8,sw_st9,sw_st10;


    private static String MY_PREF = "switch_prefs1";
    private static String SWITCH = "switch_status1";
    boolean switch_status;

    SharedPreferences pref1;
    SharedPreferences.Editor myEditor;


    private static String MY_PREF2 = "switch_prefs2";
    private static String SWITCH2 = "switch_status2";
    boolean switch_status2;
    SharedPreferences pref2;
    SharedPreferences.Editor myEditor2;

    private static String MY_PREF3 = "switch_prefs3";
    private static String SWITCH3 = "switch_status3";
    boolean switch_status3;
    SharedPreferences pref3;
    SharedPreferences.Editor myEditor3;

    private static String MY_PREF4 = "switch_prefs4";
    private static String SWITCH4 = "switch_status4";
    boolean switch_status4;
    SharedPreferences pref4;
    SharedPreferences.Editor myEditor4;

    private static String MY_PREF5 = "switch_prefs5";
    private static String SWITCH5 = "switch_status5";
    boolean switch_status5;
    SharedPreferences pref5;
    SharedPreferences.Editor myEditor5;

    private static String MY_PREF6 = "switch_prefs6";
    private static String SWITCH6 = "switch_status6";
    boolean switch_status6;
    SharedPreferences pref6;
    SharedPreferences.Editor myEditor6;

    private static String MY_PREF8 = "switch_prefs8";
    private static String SWITCH8 = "switch_status8";
    boolean switch_status8;
    SharedPreferences pref8;
    SharedPreferences.Editor myEditor8;

    private static String MY_PREF7 = "switch_prefs7";
    private static String SWITCH7 = "switch_status7";
    boolean switch_status7;
    SharedPreferences pref7;
    SharedPreferences.Editor myEditor7;

    private static String MY_PREF9 = "switch_prefs9";
    private static String SWITCH9= "switch_status9";
    boolean switch_status9;
    SharedPreferences pref9;
    SharedPreferences.Editor myEditor9;

    private static String MY_PREF10 = "switch_prefs10";
    private static String SWITCH10 = "switch_status10";
    boolean switch_status10;
    SharedPreferences pref10;
    SharedPreferences.Editor myEditor10;

    SharedPreferences pref;
    public static int days;
    TextView textView;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        sw3 = findViewById(R.id.switch3);
        sw4 = findViewById(R.id.switch4);
        sw5 = findViewById(R.id.switch5);
        sw6 = findViewById(R.id.switch6);
        sw7 = findViewById(R.id.switch7);
        sw8 = findViewById(R.id.switch8);
        sw9 = findViewById(R.id.switch9);
        sw10 = findViewById(R.id.switch10);
        textView = findViewById(R.id.textView12);
        pref = getPreferences(MODE_PRIVATE);
        try {
            int bm = Integer.parseInt(pref.getString("days", ""));
            textView.setText(Integer.toString(bm) + " день");
        }catch (Exception e){
            int bm = 0;
            textView.setText(Integer.toString(bm) + " день");
        }


        sw1 = findViewById(R.id.switch1);
        pref1 = getPreferences(MODE_PRIVATE);
        myEditor = getPreferences(MODE_PRIVATE).edit();
        switch_status = pref1.getBoolean(SWITCH,false);
        sw1.setChecked(switch_status);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    myEditor.putBoolean(SWITCH,true);
                    myEditor.apply();
                    sw1.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Начало положено!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor.putBoolean(SWITCH,false);
                    myEditor.apply();
                    sw1.setChecked(false);
                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){
                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;

                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();
                }
            }
        });


        sw2 = findViewById(R.id.switch2);
        pref2 = getPreferences(MODE_PRIVATE);
        myEditor2 = getPreferences(MODE_PRIVATE).edit();
        switch_status2 = pref2.getBoolean(SWITCH2,false);
        sw2.setChecked(switch_status2);
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor2.putBoolean(SWITCH2,true);
                    myEditor2.apply();
                    sw2.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Молодец, ты уже лучше чем 53% жителей России!!!!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor2.putBoolean(SWITCH2,false);
                    myEditor2.apply();
                    sw2.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;

                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");

                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw3 = findViewById(R.id.switch3);
        pref3 = getPreferences(MODE_PRIVATE);
        myEditor3 = getPreferences(MODE_PRIVATE).edit();
        switch_status3 = pref3.getBoolean(SWITCH3,false);
        sw3.setChecked(switch_status3);
        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor3.putBoolean(SWITCH3,true);
                    myEditor3.apply();
                    sw3.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Прекрасно, теперь можно приступать к работе!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor3.putBoolean(SWITCH3,false);
                    myEditor3.apply();
                    sw3.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){
                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw4 = findViewById(R.id.switch4);
        pref4 = getPreferences(MODE_PRIVATE);
        myEditor4 = getPreferences(MODE_PRIVATE).edit();
        switch_status4 = pref4.getBoolean(SWITCH4,false);
        sw4.setChecked(switch_status4);
        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor4.putBoolean(SWITCH4,true);
                    myEditor4.apply();
                    sw4.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Это огромный подвиг, легкий источник дофамина для слабаков!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor4.putBoolean(SWITCH4,false);
                    myEditor4.apply();
                    sw4.setChecked(false);
                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw5 = findViewById(R.id.switch5);
        pref5 = getPreferences(MODE_PRIVATE);
        myEditor5 = getPreferences(MODE_PRIVATE).edit();
        switch_status5 = pref5.getBoolean(SWITCH5,false);
        sw5.setChecked(switch_status5);
        sw5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor5.putBoolean(SWITCH5,true);
                    myEditor5.apply();
                    sw5.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Перезагрузился? Красава, пора возвращаться к работе!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor5.putBoolean(SWITCH5,false);
                    myEditor5.apply();
                    sw5.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw6 = findViewById(R.id.switch6);
        pref6 = getPreferences(MODE_PRIVATE);
        myEditor6 = getPreferences(MODE_PRIVATE).edit();
        switch_status6 = pref6.getBoolean(SWITCH6,false);
        sw6.setChecked(switch_status6);
        sw6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor6.putBoolean(SWITCH6,true);
                    myEditor6.apply();
                    sw6.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "График сна очень важен, именно он даст тебе силы покорять мир!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor6.putBoolean(SWITCH6,false);
                    myEditor6.apply();
                    sw6.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw7 = findViewById(R.id.switch7);
        pref7 = getPreferences(MODE_PRIVATE);
        myEditor7 = getPreferences(MODE_PRIVATE).edit();
        switch_status7 = pref7.getBoolean(SWITCH7,false);
        sw7.setChecked(switch_status7);
        sw7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor7.putBoolean(SWITCH7,true);
                    myEditor7.apply();
                    sw7.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Минимум выполнен! Поздравляю, но это же еще не конец, верно?", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor7.putBoolean(SWITCH7,false);
                    myEditor7.apply();
                    sw7.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw8 = findViewById(R.id.switch8);
        pref8 = getPreferences(MODE_PRIVATE);
        myEditor8 = getPreferences(MODE_PRIVATE).edit();
        switch_status8 = pref8.getBoolean(SWITCH8,false);
        sw8.setChecked(switch_status8);
        sw8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor8.putBoolean(SWITCH8,true);
                    myEditor8.apply();
                    sw8.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Ты король, продолжай в том же духе, это самая главная зависимость, от которо нужно избавляться!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor8.putBoolean(SWITCH8,false);
                    myEditor8.apply();
                    sw8.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw9 = findViewById(R.id.switch9);
        pref9 = getPreferences(MODE_PRIVATE);
        myEditor9 = getPreferences(MODE_PRIVATE).edit();
        switch_status9 = pref9.getBoolean(SWITCH9,false);
        sw9.setChecked(switch_status9);
        sw9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor9.putBoolean(SWITCH9,true);
                    myEditor9.apply();
                    sw9.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Респект, уже через 2 недели ты почувствуешь себя сфокусированнее и счастливее!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor9.putBoolean(SWITCH9,false);
                    myEditor9.apply();
                    sw9.setChecked(false);
                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });

        sw10 = findViewById(R.id.switch10);
        pref10 = getPreferences(MODE_PRIVATE);
        myEditor10 = getPreferences(MODE_PRIVATE).edit();
        switch_status10 = pref10.getBoolean(SWITCH10,false);
        sw10.setChecked(switch_status10);
        sw10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    myEditor10.putBoolean(SWITCH10,true);
                    myEditor10.apply();
                    sw10.setChecked(true);
                    Toast.makeText(SuccessActivity.this, "Супер, и так день за днем, пока не пройдет 6 месяцев и ты не войдешь топ 0.2% жителей нашей планеты!", Toast.LENGTH_LONG).show();
                }
                else{
                    myEditor10.putBoolean(SWITCH10,false);
                    myEditor10.apply();
                    sw10.setChecked(false);

                }

                pref2 = getPreferences(MODE_PRIVATE);
                switch_status2 = pref2.getBoolean(SWITCH2,false);
                pref1 = getPreferences(MODE_PRIVATE);
                switch_status = pref1.getBoolean(SWITCH,false);
                pref3 = getPreferences(MODE_PRIVATE);
                switch_status3 = pref3.getBoolean(SWITCH3,false);
                pref4 = getPreferences(MODE_PRIVATE);
                switch_status4 = pref4.getBoolean(SWITCH4,false);
                pref5 = getPreferences(MODE_PRIVATE);
                switch_status5 = pref5.getBoolean(SWITCH5,false);
                pref6 = getPreferences(MODE_PRIVATE);
                switch_status6 = pref6.getBoolean(SWITCH6,false);
                pref7 = getPreferences(MODE_PRIVATE);
                switch_status7 = pref7.getBoolean(SWITCH7,false);
                pref8 = getPreferences(MODE_PRIVATE);
                switch_status8 = pref8.getBoolean(SWITCH8,false);
                pref9 = getPreferences(MODE_PRIVATE);
                switch_status9 = pref9.getBoolean(SWITCH9,false);
                pref10 = getPreferences(MODE_PRIVATE);
                switch_status10 = pref10.getBoolean(SWITCH10,false);

                if (switch_status == true & switch_status2 == true & switch_status3 == true & switch_status4 == true & switch_status5 == true & switch_status6 == true & switch_status7 == true & switch_status8 == true & switch_status9 == true & switch_status10 == true){

                    try {
                        pref = getPreferences(MODE_PRIVATE);
                        String baseday = pref.getString("days", "");
                        int b_m_int = Integer.parseInt(baseday) + 0;
                        int otv = b_m_int +1;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }catch (Exception e){
                        int b_m_int = 1;
                        int otv = b_m_int;
                        SharedPreferences.Editor ed = pref.edit();
                        ed.putString("days", Integer.toString(otv));
                        ed.commit();
                        textView.setText(Integer.toString(otv) + " день");
                        myEditor.putBoolean(SWITCH,false);
                        myEditor.apply();
                        sw1.setChecked(false);

                        myEditor2.putBoolean(SWITCH2,false);
                        myEditor2.apply();
                        sw2.setChecked(false);

                        myEditor3.putBoolean(SWITCH3,false);
                        myEditor3.apply();
                        sw3.setChecked(false);

                        myEditor4.putBoolean(SWITCH4,false);
                        myEditor4.apply();
                        sw4.setChecked(false);

                        myEditor5.putBoolean(SWITCH5,false);
                        myEditor5.apply();
                        sw5.setChecked(false);

                        myEditor6.putBoolean(SWITCH6,false);
                        myEditor6.apply();
                        sw6.setChecked(false);

                        myEditor7.putBoolean(SWITCH7,false);
                        myEditor7.apply();
                        sw7.setChecked(false);

                        myEditor8.putBoolean(SWITCH8,false);
                        myEditor8.apply();
                        sw8.setChecked(false);

                        myEditor9.putBoolean(SWITCH9,false);
                        myEditor9.apply();
                        sw9.setChecked(false);

                        myEditor10.putBoolean(SWITCH10,false);
                        myEditor10.apply();
                        sw10.setChecked(false);
                    }
                    Toast.makeText(SuccessActivity.this, "Вы все выполнили, отлично,ждём вас завтра!", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
