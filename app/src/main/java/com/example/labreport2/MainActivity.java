package com.example.labreport2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //assigning variables
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonadd, buttonSub, buttonDiv,
            buttonMul, buttonPoint, buttonReset, buttonModule,buttonEqual;
    EditText eT;
    float ValueOne, ValueTwo, result;
    boolean Addition, Subtract, Multiplication, Division, Modulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencing
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonDot);
        buttonadd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonEqual = (Button) findViewById(R.id.buttonEql);
        buttonModule = (Button) findViewById(R.id.buttonModule);
        eT = (EditText) findViewById(R.id.Et);
        //set button for edit text
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+ "0");
            }
        });
        //0-9.......
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set text 1 in edit text
                eT.setText(eT.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set text 2 in edit text
                eT.setText(eT.getText()+ "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+ "9");
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+ ".");
            }
        });
        //clear the display
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText("");
            }
        });
        //arithmetic buttons work addition, multiply, subtraction, division, modulus as same
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Addition = true;
                eT.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Subtract = true;
                eT.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Multiplication = true;
                eT.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Division = true;
                eT.setText(null);
            }
        });
        buttonModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueOne = Float.parseFloat(eT.getText().toString());
                Modulus = true;
                eT.setText(null);
            }
        });

        //implementing calculating method
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueTwo = Float.parseFloat(eT.getText().toString());

                if (Addition == true) {
                    result = ValueOne + ValueTwo;
                    eT.setText(String.valueOf(result));
                    Addition = false;
                }
                if (Subtract == true) {
                    result = ValueOne - ValueTwo;
                    eT.setText(String.valueOf(result));
                }
                if (Multiplication == true) {
                    result = ValueOne * ValueTwo;
                    eT.setText(String.valueOf(result));
                }
                if (Division == true) {
                    result = ValueOne / ValueTwo;
                    eT.setText(String.valueOf(result));
                }
                if (Modulus == true) {
                    result = ValueOne % ValueTwo;
                    eT.setText(String.valueOf(result));
                }

            }
        });
    }
}