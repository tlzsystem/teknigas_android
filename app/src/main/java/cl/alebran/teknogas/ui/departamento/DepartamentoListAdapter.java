package cl.alebran.teknogas.ui.departamento;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.departamento.Departamento;

public class DepartamentoListAdapter extends RecyclerView.Adapter<DepartamentoListAdapter.DepartamentoViewHolder> {


    private final LayoutInflater mInflater;
    private List<Departamento> listaDepartamentos;
    private Context context;
    private int checkedPosition = 0;

    public DepartamentoListAdapter(Context context) {
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DepartamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.departamentoview_item, parent, false);
        return new DepartamentoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DepartamentoViewHolder holder, int position) {
        if(listaDepartamentos!=null){
            holder.bind(listaDepartamentos.get(position));
        }
    }

    @Override
    public int getItemCount() {
        if(listaDepartamentos!=null){
            return listaDepartamentos.size();
        }else{
            return 0;
        }
    }

    public class DepartamentoViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNumeroTorre_item;
        private TextView txtNumeroPiso_item;
        private TextView txtNumeroInmueble_item;
        private TextView txtResultadoPH_item;
        private TextView txtResultadoComb_item;
        private TextView txtNumeroLinea_item;
        private Button btnPh_item;

        public DepartamentoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNumeroTorre_item = itemView.findViewById(R.id.txtNumeroTorre_item);
            txtNumeroPiso_item = itemView.findViewById(R.id.txtNumeroPiso_item);
            txtNumeroInmueble_item = itemView.findViewById(R.id.txtNumeroInmueble_item);
            txtResultadoPH_item = itemView.findViewById(R.id.txtResultadoPH_item);
            txtResultadoComb_item = itemView.findViewById(R.id.txtResultadoComb_item);
            txtNumeroLinea_item = itemView.findViewById(R.id.txtNumeroLinea_item);
            btnPh_item = itemView.findViewById(R.id.btn_ph_item);
        }

        void bind(final Departamento departamento){
            checkedPosition = getAdapterPosition();
            this.txtNumeroTorre_item.setText("Nro Torre: 0");
            this.txtNumeroPiso_item.setText("Nro Piso: 0");
            this.txtNumeroInmueble_item.setText("Nro Inmueble: "+departamento.getNro_departamento());
            this.txtResultadoPH_item.setText("Resultado PH: "+ departamento.getPh_departamento());
            this.txtResultadoComb_item.setText("Resultado Comb: "+ departamento.getCombustion_nro());
            this.txtNumeroLinea_item.setText("Nro Linea: "+departamento.getNro_linea_departamento());

            btnPh_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Navigation.findNavController(v).navigate(R.id.action_departamentoListFragment_to_PHBaseFragment);
                }
            });

        }


    }

    public void setDepartamentos(List<Departamento> departamentos){
        listaDepartamentos = departamentos;
        notifyDataSetChanged();
    }

    public Departamento getDepartamentoSelected(){
        if(checkedPosition!=-1){
            return listaDepartamentos.get(checkedPosition);
        }
        return null;
    }

}
