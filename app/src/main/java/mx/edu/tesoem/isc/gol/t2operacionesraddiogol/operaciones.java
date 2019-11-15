package mx.edu.tesoem.isc.gol.t2operacionesraddiogol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class operaciones extends AppCompatActivity {

    EditText et1, et2;
    TextView tv1;
    RadioButton vsuma, vresta, vmultiplicacion, vdivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
        vsuma = (RadioButton) findViewById(R.id.rbsuma);
        vresta = (RadioButton) findViewById(R.id.rbresta);
        vmultiplicacion = (RadioButton) findViewById(R.id.rbmulti);
        vdivision = (RadioButton) findViewById(R.id.rbdivision);

        getSupportActionBar().hide();

        et1 = (EditText) findViewById(R.id.num1);
        et2 = (EditText) findViewById(R.id.num2);
        tv1 = (TextView) findViewById(R.id.resultado);
    }

    public void Sumar (View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int suma = numero1 + numero2;

        String resultado = String.valueOf(suma);
        tv1.setText("RESULTADO = "+resultado);
    }

    public void Resta (View view)
    {

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int resta = numero1 - numero2;

        String resultado = String.valueOf(resta);
        tv1.setText("RESULTADO = "+resultado);

    }

    public void Multiplicar(View view)
    {

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int multi = numero1 * numero2;

        String resultado = String.valueOf(multi);
        tv1.setText("RESULTADO = "+resultado);

    }

    public void Dividir(View view)
    {

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        double division = numero1 / numero2;

        String resultado = String.valueOf(division);
        tv1.setText("RESULTADO = "+resultado);

    }
}
