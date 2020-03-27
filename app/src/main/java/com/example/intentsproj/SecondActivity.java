package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button plus, minus, divide, multiply;
    EditText n_1, n_2;
    TextView text_View3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        divide = findViewById(R.id.button3);
        multiply = findViewById(R.id.button4);

        n_1 = findViewById(R.id.editText);
        n_2 = findViewById(R.id.editText2);
        text_View3 = findViewById(R.id.textView3);

        Intent i = getIntent();
        Bundle obj = getIntent().getExtras();

        final String n1 = obj.getString("NUM1");
        String n2 = obj.getString("NUM2");

        n_1.setText(n1);
        n_2.setText(n2);

        final int intn_1=Integer.parseInt(n1);
        final int intn_2=Integer.parseInt(n2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_View3.setText(intn_2 +"+" + intn_1 +"=" +(intn_2+intn_1));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_View3.setText(intn_2 +"-" + intn_1 +"=" +(intn_2-intn_1));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_View3.setText(intn_2 +"/" + intn_1 +"=" +(intn_2/intn_1));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_View3.setText(intn_2 +"*" + intn_1 +"=" +(intn_2*intn_1));
            }
        });
    }
}
