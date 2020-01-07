package cl.alebran.teknogas.ui.defectos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;

public class DefectosBuscarListAdapter extends RecyclerView.Adapter<DefectosBuscarListAdapter.DefectosViewHolder> {

    private final LayoutInflater mInflater;
    private List<TipoDefecto> listaTipoDefecto;
    private Context context;
    private int checkedPosition = 0;


    public DefectosBuscarListAdapter(Context context){
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }

    class DefectosViewHolder extends RecyclerView.ViewHolder{
        private TextView txtCodigoDefecto_item;
        private TextView txtDescripcionDefecto_item;

        public DefectosViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCodigoDefecto_item = itemView.findViewById(R.id.txtCodigoDefecto_item2);
            txtDescripcionDefecto_item = itemView.findViewById(R.id.txtDescripcionDefecto_item2);
        }

        void bind(TipoDefecto defecto){
            checkedPosition = getAdapterPosition();
            this.txtCodigoDefecto_item.setText(defecto.getCodigo_Defecto());
            this.txtDescripcionDefecto_item.setText(defecto.getDescripcion());

        }

    }



    @NonNull
    @Override
    public DefectosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_defecto_busqueda, parent, false);
        return new DefectosViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DefectosViewHolder holder, int position) {
        if(listaTipoDefecto!=null){
            holder.bind(listaTipoDefecto.get(position));
        }
    }

    @Override
    public int getItemCount() {
        if(listaTipoDefecto!=null){
            return listaTipoDefecto.size();
        }else{
            return 0;
        }
    }

    public void setListaTipoDefecto(List<TipoDefecto> tipoDefectos){
        this.listaTipoDefecto = tipoDefectos;
        notifyDataSetChanged();

    }
    public TipoDefecto getTipoDefectoSelected(){
        if(checkedPosition!=-1){
            return listaTipoDefecto.get(checkedPosition);
        }
        return null;
    }



}
