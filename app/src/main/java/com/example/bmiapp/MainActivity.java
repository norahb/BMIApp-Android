package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtBMI;
    private EditText wieght, hieght;
    private Button btnCal;
    private float op1, op2, op3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBMI = (TextView) findViewById(R.id.txtResult);
        wieght = (EditText) findViewById(R.id.editWieght);
        hieght = (EditText) findViewById(R.id.editHieght);
        btnCal = (Button) findViewById(R.id.btnCla);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(wieght.getText().toString());
                op2 = Float.parseFloat(hieght.getText().toString());
                op3 = op1 / (op2*op2);
                txtBMI.setText(Float.toString(op3));
            }
        });
    }
}