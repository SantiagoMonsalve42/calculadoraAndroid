package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resul;
    private EditText num1;
    private RadioButton bin,oct,hex;
    Calculator obj=new Calculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.txt_numero1);
        resul=(TextView)findViewById(R.id.txt_resul);
        bin=(RadioButton)findViewById(R.id.op_binario);
        oct=(RadioButton)findViewById(R.id.op_octal);
        hex=(RadioButton)findViewById(R.id.op_hexa);
    }
    public void Operar(View view){
        String v1= num1.getText().toString();
        int n1= Integer.parseInt(v1);
        obj.setNum1(n1);
        if(bin.isChecked()){
            resul.setText(obj.binario());
        }
        if(oct.isChecked()){
            resul.setText(obj.octal());
        }
        if(hex.isChecked()){
            resul.setText(obj.hexa());
        }
    }
}