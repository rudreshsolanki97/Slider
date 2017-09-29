package com.hmm.startup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView appName;
    private TextView unlock;
    private SeekBar sb;
    private TextView slide;
    private TextView disp;
    private String loggedIn="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = (SeekBar)findViewById(R.id.myseek);

        sb.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        if (seekBar.getProgress() > 90) {

                        } else {

                            seekBar.setThumb(getResources().getDrawable(R.drawable.swipe_right));
                            seekBar.setProgress(0);

                        }

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {


                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser) {
                        if(progress>90){



                            Intent i = new Intent(MainActivity.this, MainActivity.class);
                            i.putExtra("status", loggedIn);
                            startActivity(i);
                            finish();
                        }
                    }
                });

    }
}
