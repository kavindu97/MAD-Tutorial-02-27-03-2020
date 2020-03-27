package com.example.intentsproj;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class FirstActivity extends AppCompatActivity {
    Button ok_button;
    EditText number_1, number_2;

    String number1;
    String number2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ok_button = findViewById(R.id.ok_button);
        number_1 = findViewById(R.id.editText);
        number_2 = findViewById(R.id.editText2);

        ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = number_1.getText().toString();
                number2 = number_2.getText().toString();
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("NUM1", number1);
                i.putExtra("NUM2", number2);
                Toast toast = Toast.makeText(getApplicationContext(), "You just clicked the OK button", Toast.LENGTH_SHORT);
                toast.show();
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 250,700);
                startActivity(i);
            }
        });
    }
}
