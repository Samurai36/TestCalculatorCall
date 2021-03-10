package viktor.khlebnikov.geekgrains.android1.testcalculatorcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtnCalculateCall = findViewById(R.id.buttonCallCalculate);

        mBtnCalculateCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.CALCULATE");
                intent.setType("application/calculate");
                Intent chosenIntent = Intent.createChooser(intent, getString(R.string.select_calc_app));
                startActivity(chosenIntent);
            }
        });

    }

}