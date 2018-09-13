package com.thanh.tung.ptb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private static final String TAG = ResultActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        double a = intent.getDoubleExtra(MainActivity.TAG + "a", 0);
        double b = intent.getDoubleExtra(MainActivity.TAG + "b", 0);
        double c = intent.getDoubleExtra(MainActivity.TAG + "c", 0);
//        Log.d(TAG, "onCreate: "+intent.getStringExtra(MainActivity.TAG+"a"));
//        double a = Double.parseDouble(intent.getStringExtra(MainActivity.TAG+"a"));
//        double b = Double.parseDouble(intent.getStringExtra(MainActivity.TAG+"b"));
//        double c = Double.parseDouble(intent.getStringExtra(MainActivity.TAG+"c"));


        TextView tvResult = (TextView) findViewById(R.id.tv_Result);

        double delta = (double) (b * b) - 4 * a * c;
        if (delta < 0) {
            tvResult.setText("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double result = -b / (2 * a);
            tvResult.setText("Phương trình có 1 nghiệm: x = " + result);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            tvResult.setText("Phương trình có 2 nghiệm: \n x1 = " + x1 + "\n x2 = " + x2);
        }
    }
}
