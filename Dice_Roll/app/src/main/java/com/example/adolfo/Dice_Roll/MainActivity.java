package com.example.adolfo.Dice_Roll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int iRoll_1=0;
    private int iRoll_2=0;
    private int iRoll_3=0;
    private int iRoll_4=0;
    private int iRoll_5=0;
    private int iRoll_6=0;

    private int iRolled;
    private boolean bRed=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void button1_click(View view) {
        TextView tv = (TextView) findViewById(R.id.roll_1);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.click_sound2);
        mp.start();
        tv.setText("0");

        tv = (TextView) findViewById(R.id.roll_2);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.roll_3);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.roll_4);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.roll_5);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.roll_6);
        tv.setText("0");

        tv= (TextView) findViewById(R.id.textView);
        tv.setText("Reset the game");

        iRoll_1=0;
        iRoll_2=0;
        iRoll_3=0;
        iRoll_4=0;
        iRoll_5=0;
        iRoll_6=0;
    }

    public void dice_click(View view) {
        Random rand = new Random();
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.click_sound1);
        mp.start();

        iRolled = rand.nextInt(6)+1;
        TextView title = (TextView) findViewById(R.id.textView);
        TextView tv;
        ImageButton ib = (ImageButton) findViewById(R.id.imageButton);
        title.setText("Your rolled a "+Integer.toString(iRolled));
        switch (iRolled){
            case 1:
                iRoll_1++;

                if(bRed) {
                    ib.setImageResource(R.drawable.red_die_1);
                }else {
                    ib.setImageResource(R.drawable.white_die_1);
                }
                tv = (TextView) findViewById(R.id.roll_1);
                tv.setText(Integer.toString(iRoll_1));
                break;
            case 2:
                iRoll_2++;
                if(bRed) {
                    ib.setImageResource(R.drawable.red_die_2);
                }else {
                    ib.setImageResource(R.drawable.white_die_2);
                }
                tv = (TextView) findViewById(R.id.roll_2);
                tv.setText(Integer.toString(iRoll_2));
                break;
            case 3:
                iRoll_3++;
                if(bRed) {
                    ib.setImageResource(R.drawable.red_die_3);
                }else {
                    ib.setImageResource(R.drawable.white_die_3);
                }
                tv = (TextView) findViewById(R.id.roll_3);
                tv.setText(Integer.toString(iRoll_3));
                break;
            case 4:
                iRoll_4++;
                if(bRed) {
                    ib.setImageResource(R.drawable.red_die_4);
                }else {
                    ib.setImageResource(R.drawable.white_die_4);
                }
                tv = (TextView) findViewById(R.id.roll_4);
                tv.setText(Integer.toString(iRoll_4));
                break;
            case 5:
                iRoll_5++;
                if(bRed) {
                    ib.setImageResource(R.drawable.red_die_5);
                }else {
                    ib.setImageResource(R.drawable.white_die_5);
                }
                tv = (TextView) findViewById(R.id.roll_5);
                tv.setText(Integer.toString(iRoll_5));
                break;
            case 6:
                iRoll_6++;
                if(bRed) {
                    ib.setImageResource(R.drawable.red_die_6);
                }else {
                    ib.setImageResource(R.drawable.white_die_6);
                }
                tv = (TextView) findViewById(R.id.roll_6);
                tv.setText(Integer.toString(iRoll_6));
                break;
        }

    }

    public void color_click(View view) {
        ImageButton ib = (ImageButton) findViewById(R.id.imageButton);
        TextView title = (TextView) findViewById(R.id.textView);
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.click_sound2);
        mp.start();
        title.setText("Changed Dice Color");
        if(bRed) {
            switch(iRolled){
                case 1:
                    ib.setImageResource(R.drawable.white_die_1);
                    break;
                case 2:
                    ib.setImageResource(R.drawable.white_die_2);
                    break;
                case 3:
                    ib.setImageResource(R.drawable.white_die_3);
                    break;
                case 4:
                    ib.setImageResource(R.drawable.white_die_4);
                    break;
                case 5:
                    ib.setImageResource(R.drawable.white_die_5);
                    break;
                case 6:
                    ib.setImageResource(R.drawable.white_die_6);
                    break;
            }
        }else {
            switch(iRolled){
                case 1:
                    ib.setImageResource(R.drawable.red_die_1);
                    break;
                case 2:
                    ib.setImageResource(R.drawable.red_die_2);
                    break;
                case 3:
                    ib.setImageResource(R.drawable.red_die_3);
                    break;
                case 4:
                    ib.setImageResource(R.drawable.red_die_4);
                    break;
                case 5:
                    ib.setImageResource(R.drawable.red_die_5);
                    break;
                case 6:
                    ib.setImageResource(R.drawable.red_die_6);
                    break;
            }
        }
        bRed=!bRed;
    }
}
