package com.cyberx.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button selectButton;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.currentDateId);
        selectButton = (Button) findViewById(R.id.button_id);
        datePicker = (DatePicker) findViewById(R.id.datePickerId);
        textView.setText(currentDate());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });
    }
    StringBuilder currentDate() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current date: ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append((datePicker.getMonth() + 1) + "/");
        stringBuilder.append(datePicker.getYear());
        stringBuilder.toString();

        return stringBuilder;
    }
}