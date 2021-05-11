package com.example.exer7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    TextView txt1, txt2, txt3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 =findViewById(R.id.edt1);
        edt2 =findViewById(R.id.edt2);
        edt3 =findViewById(R.id.edt3);
        txt1= findViewById(R.id.txt1);
        txt2= findViewById(R.id.txt2);
        txt3= findViewById(R.id.txt3);
        btn=findViewById(R.id.btn);


    }
    public void OnClick(View v){
        double Pf =Double.parseDouble(edt1.getText().toString());
        double Ld =Double.parseDouble(edt2.getText().toString());
        double Pi =Double.parseDouble(edt3.getText().toString());
      double ld=Pf*(Ld/100);
        txt1.setText("O valor do lucro do distrubuidor é " + ld);
        double pi=Pf*(Pi/100);
        txt2.setText("O valor correspondente ao imposto " + pi);
        txt3.setText("O preco final do veiculo é " + (Pf+pi+ld));
    }
}