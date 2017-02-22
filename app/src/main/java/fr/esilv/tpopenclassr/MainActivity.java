package fr.esilv.tpopenclassr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String Newligne=System.getProperty("line.separator");
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText(R.string.app_name);
        setContentView(text);

        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OC_RSS", "ça marche");

                Intent myIntent = new Intent(MainActivity.this, de6.class );
                startActivity(myIntent);
            }

        });

        Button myButton2 = (Button) findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OC_RSS", "ça marche2");

                Intent myIntent = new Intent(MainActivity.this, de20.class );
                startActivity(myIntent);
            }

        });



    }
}
