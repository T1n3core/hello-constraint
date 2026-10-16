package com.example.helloconstraint;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button toastButton = findViewById(R.id.toastButton);
        Button zeroButton = findViewById(R.id.zeroButton);
        Button countButton = findViewById(R.id.countButton);
        TextView counterView = findViewById(R.id.counterView);

        toastButton.setOnClickListener(v -> Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show());
        zeroButton.setOnClickListener(v -> {
            counter = 0;
            counterView.setText(String.valueOf(counter));
        });
        countButton.setOnClickListener(v -> counterView.setText(String.valueOf(++counter)));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}