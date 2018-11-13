package com.example.ludimar.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText num1, num2, result;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;

    double n1, n2, resultado;


    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        num1 = (EditText) findViewById(R.calc.num1);
        num2 = (EditText) findViewById(R.calc.num2);
        result = (EditText) findViewById(R.calc.result);

        btSomar = (Button)   findViewById(R.botao.btSomar);
        btSubtrair = (Button)   findViewById(R.botao.btSubtrair);
        btDividir = (Button)   findViewById(R.botao.btDividir);
        btMultiplicar = (Button)   findViewById(R.botao.btMultiplicar);

        btSomar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

			n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1+n2;

                result.setText(String.valueOf(resultado));
            }
        });
        
        btSubtrair.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1-n2;

                result.setText(String.valueOf(resultado));
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
      
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1/n2;

                result.setText(String.valueOf(resultado));
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            
                n1 = Double.parseDouble(num1.getText().toString());
                n2 = Double.parseDouble(num2.getText().toString());

                resultado = n1*n2;

                result.setText(String.valueOf(resultado));
            }
        });

    }
}