package cl.alebran.teknogas.ui.ph;


import android.graphics.Path;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhDefectosFragment extends Fragment {

    private PhDefectosViewModel phDefectosViewModel;
    private Spinner spinner_lista_defectos_ph;
    private ImageButton btnAgregarDefecto;


    public PhDefectosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_ph_defectos, container, false);
        phDefectosViewModel = ViewModelProviders.of(this).get(PhDefectosViewModel.class);
        spinner_lista_defectos_ph = root.findViewById(R.id.spinner_lista_defectos_ph);
        btnAgregarDefecto = root.findViewById(R.id.btnAgregarDefecto);

        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listaDefectos_ph);
        // Create your layout manager.
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layout);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayout.VERTICAL));

        final PhDefectosListAdapter defectosBuscarListAdapter = new PhDefectosListAdapter(getActivity());
        recyclerView.setAdapter(defectosBuscarListAdapter);

        defectosBuscarListAdapter.setListaTipoDefecto(new ArrayList<TipoDefecto>());


        phDefectosViewModel.getAllTipoDefectoByClasificacion(171).observe(this, new Observer<List<TipoDefecto>>() {
            @Override
            public void onChanged(List<TipoDefecto> tipoDefectos) {

                ArrayList<TipoDefecto> arrayList = new ArrayList<TipoDefecto>( tipoDefectos);

                ArrayAdapter<TipoDefecto> spinnerArrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item,arrayList );
                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_lista_defectos_ph.setAdapter(spinnerArrayAdapter);

            }
        });


        btnAgregarDefecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipoDefecto tipoDefecto = (TipoDefecto)spinner_lista_defectos_ph.getSelectedItem();
                defectosBuscarListAdapter.addDefecto(tipoDefecto);
            }
        });


    }


}
