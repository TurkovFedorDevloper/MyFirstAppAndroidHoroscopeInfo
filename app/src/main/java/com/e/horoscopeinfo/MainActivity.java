package com.e.horoscopeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textViewDescriptionsTemp;
    private Button buttonFindZodiac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerZodiacs);
        textViewDescriptionsTemp = findViewById(R.id.textViewZodiacsTemp);
        buttonFindZodiac = findViewById(R.id.buttonFindZodiacs);
    }

    public void showZodiac(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        textViewDescriptionsTemp.setText(description);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        view.startAnimation(animRotate);
    }

    public String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.zodiacs_of_temp);
        return descriptions[position];
    }
}


