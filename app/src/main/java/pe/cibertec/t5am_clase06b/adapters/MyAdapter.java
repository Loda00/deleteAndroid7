package pe.cibertec.t5am_clase06b.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pe.cibertec.t5am_clase06b.R;
import pe.cibertec.t5am_clase06b.modelo.Empleado;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Empleado> lista;

    public MyAdapter(Context context, int layout, List<Empleado> lista) {
        this.context = context;
        this.layout = layout;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return this.lista.size();
    }

    @Override
    public Object getItem(int position) {
        return this.lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.list_item, null);

        Empleado empleado = this.lista.get(position);

        TextView tvNombre = view.findViewById(R.id.tvNombreEmpleado);
        tvNombre.setText(empleado.getNombreEmpleado());

        TextView tvCargo = view.findViewById(R.id.tvCargoEmpleado);
        tvCargo.setText(empleado.getCargoEmpleado());

        ImageView ivFoto = view.findViewById(R.id.ivFotoEmpleado);
        int icono = context.getResources().getIdentifier(empleado.getNombreFoto(),
                "mipmap", context.getPackageName());
        ivFoto.setImageResource(icono);

        return view;
    }
}















