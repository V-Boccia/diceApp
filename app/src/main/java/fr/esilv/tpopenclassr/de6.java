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

public class de6 extends MainActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String Newligne = System.getProperty("line.separator");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.de6);

        TextView pres = (TextView) findViewById(R.id.pres);
        pres.setText("Vous avez choisi un Dé de 6");

        result = (TextView) findViewById(R.id.result);
        result.setText("");



        ImageButton myButton = (ImageButton) findViewById(R.id.back);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OC_RSS", "ça marche");

                Intent myIntent = new Intent(de6.this, MainActivity.class );
                startActivity(myIntent);
            }

        });

        Button  roll = (Button) findViewById(R.id.btnRoll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecureRandom random = new SecureRandom();
                int resultat = random.nextInt(6) + 1;
                result.setText(String.valueOf(resultat));
            }
        });


    }
}
