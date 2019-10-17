package com.kevin.tugas1pem4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textnpm;
    TextView textnama;
    TextView textprodi;
    TextView textalamat;
    EditText edtnpm;
    EditText edtnama;
    EditText edtalamat;
    EditText edtprodi;

    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textnpm=(TextView)findViewById(R.id.textnpm);
        textnama=(TextView)findViewById(R.id.textnama);
        textprodi=(TextView)findViewById(R.id.textprodi);
        textalamat=(TextView)findViewById(R.id.textalamat);
        edtnpm=(EditText)findViewById(R.id.edtnpm);
        edtnama=(EditText) findViewById(R.id.edtnama);
        edtalamat=(EditText)findViewById(R.id.edtalamat);
        edtprodi=(EditText) findViewById(R.id.edtprodi);
        btnsubmit=(Button) findViewById(R.id.Submit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String stralamat =edtalamat.getText().toString();
                String strprodi =edtprodi.getText().toString();
                String strnpm =edtnpm.getText().toString();
                String strnama =edtnama.getText().toString();
                textnpm.setText(strnpm);
                textnama.setText(strnama);
                textalamat.setText(stralamat);
                textprodi.setText(strprodi);


            }
        });
    }
}
