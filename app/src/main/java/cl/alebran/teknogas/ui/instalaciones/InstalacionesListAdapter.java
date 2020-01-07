package cl.alebran.teknogas.ui.instalaciones;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;

public class InstalacionesListAdapter extends RecyclerView.Adapter<InstalacionesListAdapter.InstalacionViewHolder> {

    private final LayoutInflater mInflater;
    private List<Instalaciones> listaInstalaciones;
    private Context context;
    private int checkedPosition = 0;


    class InstalacionViewHolder extends RecyclerView.ViewHolder{
        private final TextView instalacionItemView;
        private final TextView txtFechaInspeccionItemView;
        private final TextView txtNombreInstalacionItemView;
        private InstalacionViewHolder(View itemView){
            super(itemView);
            instalacionItemView = itemView.findViewById(R.id.textView);
            txtFechaInspeccionItemView = itemView.findViewById(R.id.txtfechas_inspeccion);
            txtNombreInstalacionItemView = itemView.findViewById(R.id.txtnombre_instalacion);
        }

        void bind(final Instalaciones instalacion){
            checkedPosition = getAdapterPosition();
            this.instalacionItemView.setText(instalacion.getDireccion_inspeccion());
            this.txtFechaInspeccionItemView.setText("Fecha Instalación: "+instalacion.getFecha_inspeccion());
            this.txtNombreInstalacionItemView.setText("Nombre Instalación: "+instalacion.getNombre_instalacion());
            this.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notifyItemChanged(checkedPosition);
                    checkedPosition = getAdapterPosition();
                    Toast.makeText(v.getContext().getApplicationContext(), "Seleccionado "+getInstalacionSelected().getNombre_instalacion(),Toast.LENGTH_SHORT).show();

                    NavDirections directions = InstalacionesFragmentDirections.actionInstalacionesToDetalleInstalaciones(getInstalacionSelected());
                    Navigation.findNavController(v).navigate(directions);


                }
            });

        }


    }



    public InstalacionesListAdapter(Context context){
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }



    @Override
    public InstalacionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new InstalacionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InstalacionViewHolder holder, int position) {
        if(listaInstalaciones!=null){


            holder.bind(listaInstalaciones.get(position));



        }else{
            holder.instalacionItemView.setText("No hay registros");
        }
    }
    public void setInstalaciones(List<Instalaciones> instalaciones){
        listaInstalaciones = instalaciones;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(listaInstalaciones!=null){
            return listaInstalaciones.size();
        }else{
            return 0;
        }
    }

    public Instalaciones getInstalacionSelected(){
        if(checkedPosition!=-1){
            return listaInstalaciones.get(checkedPosition);
        }
        return null;
    }


}
