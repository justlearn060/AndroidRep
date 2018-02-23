package com.othman060.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = findViewById(R.id.RollButton);

        final ImageView leftdicee = findViewById(R.id.imageLeftDice);
        final ImageView rightdicee = findViewById(R.id.imageRightDice);

        final int[] diceeArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        //To listen to the taps on screen we need to activate listener

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee","Listening to the Roll Button clicked");
                //Generating random number for left dice
                Random randGenerator = new Random();
                int number = randGenerator.nextInt(6);


                Log.d("Dicee","Random number is : " + number);

                leftdicee.setImageResource(diceeArray[number]);

                //Generating Random number for right dicee
                //you can also use the same variable number to create a new random number
                //eg number = randGenerator.nextInt(6);
                Random randGenarator1 = new Random();
                int number1 = randGenarator1.nextInt(6);

                rightdicee.setImageResource(diceeArray[number1]);
            }
        });

    }
}
