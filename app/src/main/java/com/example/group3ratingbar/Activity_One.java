package com.example.group3ratingbar;
import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
public class Activity_One extends AppCompatActivity {
    Button buttonNext1;
    ImageView imageViews1;
    TextView textViewMsg1;

    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        buttonNext1 = findViewById(R.id.bt2);
        textViewMsg1 = findViewById(R.id.tv2);
        imageViews1 = findViewById(R.id.iv2);

        final RatingBar ratingBar = findViewById(R.id.rb1);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                String red_ratings = String.valueOf(ratingBar.getRating());
                double con1 = Double.parseDouble(red_ratings);
                if (con1 == 5.0) {
                    tereemotionmeslowmotionme(R.drawable.rate5, "Owsm i love it!!!  !!!", "Wow amazing Your Personality is Emotional, helpful, Talks to lot, Expressive, Likes to Instruct..");

                } else if (con1 == 4.0 || con1 == 4.5) {
                    tereemotionmeslowmotionme(R.drawable.rate4, "Ohh Great !!!", "Better luck next time!!");

                } else if (con1 == 3.0 || con1 == 3.5) {
                    tereemotionmeslowmotionme(R.drawable.rate3, "Ohh Nice !!!", "Tere lag gay ghode !");

                } else if (con1 == 2.0 || con1 == 2.5) {
                    tereemotionmeslowmotionme(R.drawable.rate2, "Ohh Sad !!!", "Tere lag gay ghode ke laat !");

                } else if (con1 == 1.0 || con1 == 1.5 || con1 == 0.5) {
                    tereemotionmeslowmotionme(R.drawable.rate1, "Ohh Nice Sad !!!", "Tere ghode bade lag gaye!");

                } else {
                    textViewMsg1.setText("Please rate now");
                    Toast.makeText(Activity_One.this, "Rate me", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //buttonNext1.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent intent = new Intent(MainActivity.this, Activity_One.class);
                //startActivity(intent);
            //}
        //});
    }





    private void tereemotionmeslowmotionme(int dedhaka, String laggai, String premdiwani) {
        InputStream inputStream = getResources().openRawResource(dedhaka);
        bitmap = BitmapFactory.decodeStream(inputStream);
        imageViews1.setImageBitmap(bitmap);
        Toast.makeText(Activity_One.this, laggai, Toast.LENGTH_SHORT).show();
        textViewMsg1.setText(premdiwani);

    }
}
