package edu.ib;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Cantor cantor = new Cantor();
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonExchangeOnClick(View view) {
        Spinner currencyFirst = (Spinner) findViewById(R.id.currencyFirst);
        Spinner currencySecond = (Spinner) findViewById(R.id.currencySecond);
        EditText editTextInput = (EditText) findViewById(R.id.textEntry);
        TextView textViewOutput = (TextView) findViewById(R.id.textViewResult);

        try {

            int indexFirst = currencyFirst.getSelectedItemPosition();
            int indexSecond = currencySecond.getSelectedItemPosition();

            String input = String.valueOf(editTextInput.getText());
            double value = Double.valueOf(input);

            if (value <= 0)
                throw new IllegalArgumentException();

            result = cantor.exchangeValues(value, indexFirst, indexSecond);
            textViewOutput.setText(result);
        } catch (NumberFormatException e) {
            result = "Please enter the value";
            textViewOutput.setText(result);

        } catch (IllegalArgumentException e) {
            result = "Incorrect value";
            textViewOutput.setText(result);
        }
    }//end of buttonExchangeOnClick
}//end of class
