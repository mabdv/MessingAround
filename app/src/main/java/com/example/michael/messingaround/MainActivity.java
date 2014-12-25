package com.example.michael.messingaround;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button sunshineButton, rainyButton, snowyButton;
    private EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sunshineButton = (Button) findViewById(R.id.sunshine_button);
        rainyButton = (Button) findViewById(R.id.rainy_button);
        snowyButton = (Button) findViewById(R.id.snowy_button);
        userNameEditText = (EditText) findViewById(R.id.user_name);

        final TextView weatherChange = (TextView) findViewById(R.id.weather_change);



        sunshineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weatherChange.setText("Sunshine");
                setWeatherSunshine(weatherChange);
            }
        });

        rainyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherChange.setText("Rainy");
                setWeatherRainy(weatherChange);
            }
        });

        snowyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherChange.setText("Snowy");
                setWeatherSnow(weatherChange);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void setWeatherSunshine(View view) {

        String userName = String.valueOf(userNameEditText.getText());

        String yourSunshineResponse = "It's Beautiful Outside, " + userName;

        Toast.makeText(this,yourSunshineResponse, Toast.LENGTH_SHORT).show();

    }

    public void setWeatherRainy(View view) {

        String userName = String.valueOf(userNameEditText.getText());

        String yourRainyResponse = "It's Wet Outside, " + userName;

        Toast.makeText(this,yourRainyResponse, Toast.LENGTH_SHORT).show();
    }

    public void setWeatherSnow(View view) {

        String userName = String.valueOf(userNameEditText.getText());

        String yourSnowyResponse = "It's Cold Outside, " + userName;

        Toast.makeText(this,yourSnowyResponse, Toast.LENGTH_LONG).show();


    }
}
