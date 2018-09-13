package com.thanh.tung.ptb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        EditText etAInput = (EditText) findViewById(R.id.et_aInput);
        EditText etBInput = (EditText) findViewById(R.id.et_bInput);
        EditText etCInput = (EditText) findViewById(R.id.et_cInput);

        double a = Double.parseDouble(etAInput.getText().toString());
        double b = Double.parseDouble(etBInput.getText().toString());
        double c = Double.parseDouble(etCInput.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(TAG + "a", a);
        intent.putExtra(TAG + "b", b);
        intent.putExtra(TAG + "c", c);
        startActivity(intent);


    }
}
