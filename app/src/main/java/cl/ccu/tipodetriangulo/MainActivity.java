package cl.ccu.tipodetriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ladoA, ladoB, ladoC, textoresultado;
    private Button tipoTriangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ladoA = findViewById(R.id.ladoAinput);
        ladoB = findViewById(R.id.ladoBinput);
        ladoC = findViewById(R.id.ladoCinput);
        tipoTriangulo = findViewById(R.id.btnTipoTriangulo);
        textoresultado = findViewById(R.id.txtTipoTriangulo);


        tipoTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vladoA = Integer.parseInt(ladoA.getText().toString());
                int vladoB = Integer.parseInt(ladoB.getText().toString());
                int vladoC = Integer.parseInt(ladoC.getText().toString());

                if (((vladoA + vladoB) <= vladoC) || ((vladoB + vladoC) <= vladoA) || ((vladoC + vladoA) <= vladoB))
                {
                    textoresultado.setText("VALORES INGRESADOS NO FORMAN UN TRIÁNGULO");
                }
                else{
                    if (vladoA == vladoB && vladoB == vladoC) {
                        textoresultado.setText("EQUILATERO");
                    }
                    else if ((vladoA != vladoB) && (vladoA != vladoC) && (vladoC != vladoB)) {
                        textoresultado.setText("ESCALENO");
                    }
                    else {
                        textoresultado.setText("ISOSCELES");
                    }
                }
            }
        });
    }
}
