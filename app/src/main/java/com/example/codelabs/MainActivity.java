package com.example.codelabs;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Number number = new Number();

    TextView numberDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberDisplay = findViewById(R.id.numberDisplay);
    }

    public void makeToast(View view) {

        Toast toast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {

        number.setCurrentNumber(number.getCurrentNumber()+1);

        numberDisplay.setText(Integer.toString(number.getCurrentNumber()) );

    }
}