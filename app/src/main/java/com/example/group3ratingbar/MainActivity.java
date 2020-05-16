package com.example.group3ratingbar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonNext1;
    //Intent intent;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext1 = findViewById(R.id.click_go);

        buttonNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hello" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "" +
                        "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Activity_One.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
/*

        button=findViewById(R.id.bt2);
        imageView=findViewById(R.id.iv2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                */






