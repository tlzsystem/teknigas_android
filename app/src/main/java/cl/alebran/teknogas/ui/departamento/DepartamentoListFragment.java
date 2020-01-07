package cl.alebran.teknogas.ui.departamento;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.departamento.Departamento;
import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;
import cl.alebran.teknogas.ui.instalaciones.InstalacionesListAdapter;

public class DepartamentoListFragment extends Fragment {

    private DepartamentoListViewModel mViewModel;

    public static DepartamentoListFragment newInstance() {
        return new DepartamentoListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mViewModel = ViewModelProviders.of(this).get(DepartamentoListViewModel.class);
        return inflater.inflate(R.layout.fragment_departamento_list, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // Bind your views.
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recicler_lista_departamentos);

        // Create your layout manager.
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layout);
        recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayout.VERTICAL));


        final DepartamentoListAdapter adapter = new DepartamentoListAdapter(getActivity());
        recyclerView.setAdapter(adapter);

        DepartamentoListViewModel departamentoListViewModel = new DepartamentoListViewModel(getActivity().getApplication());

        int id_instalacion = 0;
        if(getArguments()!=null){

            id_instalacion = DepartamentoListFragmentArgs.fromBundle(getArguments()).getIdInstalacion();

        }

        departamentoListViewModel.getAllDepartamentosByInstalacion(id_instalacion).observe(this, new Observer<List<Departamento>>() {
            @Override
            public void onChanged(List<Departamento> departamentos) {
                adapter.setDepartamentos(departamentos);
            }
        });



    }
}
