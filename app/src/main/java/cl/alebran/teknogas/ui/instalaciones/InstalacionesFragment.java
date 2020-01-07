package cl.alebran.teknogas.ui.instalaciones;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;

/**
 * A simple {@link Fragment} subclass.
 */
public class InstalacionesFragment extends Fragment {


    public InstalacionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_instalaciones, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Bind your views.
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.lista_instalaciones);

        // Create your layout manager.
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layout);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayout.VERTICAL));


        final InstalacionesListAdapter adapter = new InstalacionesListAdapter(getActivity());
        recyclerView.setAdapter(adapter);

        InstalacionesViewModel instalacionViewMoldel = new InstalacionesViewModel(getActivity().getApplication());

       instalacionViewMoldel.getAllInstalaciones().observe(this, new Observer<List<Instalaciones>>() {
           @Override
           public void onChanged(List<Instalaciones> instalaciones) {
               adapter.setInstalaciones(instalaciones);
           }
       });




    }







}
