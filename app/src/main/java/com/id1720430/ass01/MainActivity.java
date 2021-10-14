package com.id1720430.ass01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView countText;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //countText = findViewById(R.id.countTxt);
    }

    public void showToast(View view) {
        String msg = "Hello Toast!";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
        if (counter > 0) {
            counter = 0;
            setCountText();
        }
    }

    public void increaseTextCount(View view) {
        countText = findViewById(R.id.countTxt);
        counter++;
        setCountText();
    }

    public void setCountText() {
        countText.setText(Integer.toString(counter));
    }
}