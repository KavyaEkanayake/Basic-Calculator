package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div;
    TextView rs;
    EditText n1,n2;

    float result;
    int numb1,numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.btnplus);
        sub=findViewById(R.id.btnmin);
        mul=findViewById(R.id.btnmul);
        div=findViewById(R.id.btndiv);

        rs=findViewById(R.id.result);
        n1=findViewById(R.id.number1);
        n2=findViewById(R.id.number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numb1=Integer.parseInt(n1.getText().toString());
                numb2=Integer.parseInt(n2.getText().toString());

                result=numb1+numb2;

                rs.setText(String.valueOf(result));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1=Integer.parseInt(n1.getText().toString());
                numb2=Integer.parseInt(n2.getText().toString());

                result=numb1-numb2;

                rs.setText(String.valueOf(result));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1=Integer.parseInt(n1.getText().toString());
                numb2=Integer.parseInt(n2.getText().toString());

                result=numb1*numb2;

                rs.setText(String.valueOf(result));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1=Integer.parseInt(n1.getText().toString());
                numb2=Integer.parseInt(n2.getText().toString());

                result=numb1/numb2;

                rs.setText(String.valueOf(result));
            }
        });

    }
}