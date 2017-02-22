package fr.esilv.tpopenclassr;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by meo-v on 21/02/2017.
 */

public class de20 extends MainActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String Newligne = System.getProperty("line.separator");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.de20);

        TextView pres = (TextView) findViewById(R.id.pres20);
        pres.setText("Vous avez choisi un Dé de 20");

        result = (TextView) findViewById(R.id.result20);
        result.setText("");



        ImageButton myButton = (ImageButton) findViewById(R.id.back20);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OC_RSS", "ça marche");

                Intent myIntent = new Intent(de20.this, MainActivity.class );
                startActivity(myIntent);
            }

        });

        Button  roll = (Button) findViewById(R.id.btnRoll20);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecureRandom random = new SecureRandom();
                int resultat = random.nextInt(20) + 1;
                result.setText(String.valueOf(resultat));
            }
        });


    }
}
