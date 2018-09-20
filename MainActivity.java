package hk.ust.cse.comp107x.timegreetfriend;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Date;

//import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button greetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get a reference to the greetButton on the UI
        greetButton = (Button) findViewById(R.id.greetButton);
        // Set the onClickListener for the greetButton to be this class.
        greetButton.setOnClickListener(this);
        
        // Set the onClickListener for the layout to be this class.
        RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.mainLayout);
        rlayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        // My random colors array
        int colors[] = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED,
                Color.CYAN };
        int pos = random.nextInt(colors.length);
        

        switch (v.getId()) {

        case R.id.greetButton:

            v.setBackgroundColor(colors[pos]);

            break;

        case R.id.mainLayout  :

            v.setBackgroundColor(colors[pos]);

            break;

        default:

        break;
        }
    }
}
