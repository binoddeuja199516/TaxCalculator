package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText EtxtAmount;
    private Button Btn_Calculate;
    private TextView VtxtOutput,txtAnnual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtxtAmount = findViewById(R.id.etAmount);
        Btn_Calculate = findViewById(R.id.btnCalculate);
        VtxtOutput = findViewById(R.id.tvOutput);
        txtAnnual = findViewById(R.id.txtAnnual);

        Btn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Amt = Double.parseDouble(EtxtAmount.getText().toString());
                double amount = Amt*12;
                txtAnnual.setText(Double.toString(amount));

                TaxCalculate taxx = new TaxCalculate();
                taxx.setAmount(amount);
                if(amount<200000){
                    double res = taxx.lowTax();
                    VtxtOutput.setText(Double.toString(res));
                }else if(amount >=200000 && Amt<350000){
                    double res = taxx.mediumTax();
                    VtxtOutput.setText(Double.toString(res));
                }else if(amount>=350000){
                    double res = taxx.highTax();
                    VtxtOutput.setText(Double.toString(res));
                }
            }
        });
    }
}

