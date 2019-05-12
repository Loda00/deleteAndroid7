package pe.cibertec.t5am_clase06b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import pe.cibertec.t5am_clase06b.modelo.Empleado;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Empleado> empleados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.lista = (ListView) findViewById(R.id.lvLista);

    }

    private void llenarDatos(){
        this.empleados = new ArrayList<Empleado>();

        //datos empleado
        Empleado emp = new Empleado("Javier Lopez", "Jefe", "Av. Los Heroes", "98989898");
        //ingreso empleado a la lista de empleados
        empleados.add(emp);

        emp = new Empleado("Maria Cardenas", "Sub Gerente", "Los Jaguares", "95959595");
        empleados.add(emp);

        emp = new Empleado("Isabel Gonzales", "Analista", "San Ignacio", "97979797");
        empleados.add(emp);

    }

}
































