package org.mydomain.pellerito.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int MAXBTN = 6;

        final Button[] arrRIdBtn = new Button[MAXBTN];

        final int[] arrButtonId = {R.id.spotifyButton, R.id.scoresButton, R.id.libraryButton, R.id.buildButton, R.id.xyzReaderButton, R.id.capStoneButton};


        // inizialize MyArrButton with text in resources values/string
        String[] myArrButton = getResources().getStringArray(R.array.button_array);

        for (int i=0; i<arrRIdBtn.length; i++) {
            arrRIdBtn[i] = (Button) findViewById(arrButtonId[i]);
            // set text in button
            arrRIdBtn[i].setText(myArrButton[i]);
        }

        View.OnClickListener clickBtn = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get values button press in GUI
                Button b = (Button)v;
                String strLaunch = "This button will launch my ";
                String strBtnPress = strLaunch + b.getText().toString();

                // format text view in toast
                if(strBtnPress.equals(strLaunch+"CAPSTONE: MY OWN APP")){

                    strBtnPress = strLaunch + "capstone app!" ;

                }else{

                    strBtnPress = strBtnPress.toLowerCase() + "!";

                }


                switch (v.getId()) {

                    case R.id.spotifyButton:
                        Toast.makeText(getApplicationContext(), strBtnPress,
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.scoresButton:
                        Toast.makeText(getApplicationContext(), strBtnPress,
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.libraryButton:
                        Toast.makeText(getApplicationContext(), strBtnPress,
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.buildButton:
                        Toast.makeText(getApplicationContext(), strBtnPress,
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.xyzReaderButton:
                        Toast.makeText(getApplicationContext(), strBtnPress,
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.capStoneButton:
                        Toast.makeText(getApplicationContext(), strBtnPress,
                                Toast.LENGTH_SHORT).show();
                        break;

                } // end switch

            }
        }; //  View.OnClickListener()

        // set listener button
        for (int i=0; i<arrRIdBtn.length; i++) arrRIdBtn[i].setOnClickListener(clickBtn);

    }

}
