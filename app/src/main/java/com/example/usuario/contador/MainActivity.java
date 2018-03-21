package com.example.usuario.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num = 0;
    TextView txtContador, txtAviso;
    boolean Cont = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContador = (TextView) findViewById(R.id.txtContador);
        txtAviso = (TextView) findViewById(R.id.txtAviso);
    }
    public void inicio(View V) {
        if (Cont) {
            num++;
            this.txtContador.setText("" + num);
            if (num == 7)
                this.txtAviso.setText("Ya casi llega”");
            if (num == 6)
                this.txtAviso.setText("Aviso");
            if (num== 5)
                Log.e("van 5", "vamos bien");
            if (num== 8)
                this.txtAviso.setText("Aviso");
            if (num== 9)
                this.txtAviso.setText("ya merito");
            if (num == 10) {
                this.txtAviso.setText("Aviso");
                Cont = false;
                Log.e("van 5", "vamos bien");
            }
        } else
            num--;
        if (num== 9)
            this.txtAviso.setText("ya merito");
        this.txtContador.setText(("" + num));
        if (num== 8)
            this.txtAviso.setText("Aviso");
        if (num == 7)
            this.txtAviso.setText("Ya casi llega”");
        if (num == 6)
            this.txtAviso.setText("Aviso");
        if (num == 5)
            Log.e("van 5", "vamos bien");
        if (num == 4)
            this.txtAviso.setText("Aviso");
        if (num == 3)
            this.txtAviso.setText("muy bajo");
        if (num== 2)
            this.txtAviso.setText("bajito");
        if (num== 1)
            this.txtAviso.setText("Aviso");
        if (num == 0) {
            Cont = true;
            Log.e("van 5", "vamos bien");

        }
    }

}
