package css.cis3334.heartratetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class HeartDetailActivity extends AppCompatActivity{

    TextView textViewTop;
    TextView textViewPulse;
    TextView textViewRange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_detail);

        textViewTop = (TextView) findViewById(R.id.textViewTop);
        textViewPulse = (TextView) findViewById(R.id.textViewPulse);
        textViewRange = (TextView) findViewById(R.id.textViewRange);

        Bundle extras = getIntent().getExtras();
        HeartRate hr = (HeartRate) extras.getSerializable("HEARTRATE_KEY");

        textViewRange.setText(hr.getRangeName().toString());
        textViewPulse.setText(hr.getPulse().toString());
    }
}
