package com.example.user.mycalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText input1,input2;
    Button btn1,btn2,btn3,btn4;
    TextView sview;

    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        num1 = Integer.parseInt(input1.toString());
        input2 = (EditText) findViewById(R.id.input2);
        num2 = Integer.parseInt(input2.toString());

        result = num1 + num2;
        result = num1 - num2;
        result = num1 * num2;
        result = num1 / num2;
        result = num1 % num2;

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        sview = (TextView) findViewById(R.id.sview);

        )

    }
}
