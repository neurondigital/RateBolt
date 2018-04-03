package com.neurondigital.rateboltdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.neurondigital.ratebolt.RateView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout rateLayout = (LinearLayout) findViewById(R.id.rateLayout);
        RateView rateView = (RateView) findViewById(R.id.rateview);
        rateView.setParentView(rateLayout);
    }
}
