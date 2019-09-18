package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.my_button);
        View.OnClickListener clicky = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texty = findViewById(R.id.textView);
                texty.setText("You have clicked the button");
            }
        };
        button.setOnClickListener(clicky);
    }


}
