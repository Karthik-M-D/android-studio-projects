package in.karthik.metricconversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button button;

    TextView result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.user_input);
        button = findViewById(R.id.calc_button);

        result1 = findViewById(R.id.km_to_mile);
        result2 = findViewById(R.id.km_to_m);
        result3 = findViewById(R.id.km_to_feet);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userInput = input.getText().toString();

                Double kmToMile = (Double) (Double.parseDouble(userInput) * 0.62137119);
                Integer kmToMeter = (Integer) (Integer.parseInt(userInput) * 1000);
                Double kmToFeet = (Double) (Double.parseDouble(userInput) * 3280.84);

                result1.setText(String.valueOf("Result Km to Miles: " + kmToMile));
                result2.setText(String.valueOf("Result Km to Meter: " + kmToMeter));
                result3.setText(String.valueOf("Result Km to Feet: " + kmToFeet));
            }
        });

    }
}