package cl.alebran.teknogas.ui.defectos;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;

/**
 * A simple {@link Fragment} subclass.
 */
public class DefectosBuscarFragment extends Fragment {

    private DefectosBuscarViewModel defectosBuscarViewModel;


    public DefectosBuscarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        defectosBuscarViewModel = ViewModelProviders.of(this).get(DefectosBuscarViewModel.class);

        return inflater.inflate(R.layout.fragment_defectos_buscar, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_tipo_defectos);
        // Create your layout manager.
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layout);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayout.VERTICAL));

        final DefectosBuscarListAdapter defectosBuscarListAdapter = new DefectosBuscarListAdapter(getActivity());
        recyclerView.setAdapter(defectosBuscarListAdapter);


        defectosBuscarViewModel.getAllTipoDefectoByClasificacion(171).observe(this, new Observer<List<TipoDefecto>>() {
            @Override
            public void onChanged(List<TipoDefecto> tipoDefectos) {
                defectosBuscarListAdapter.setListaTipoDefecto(tipoDefectos);
            }
        });






    }
}
