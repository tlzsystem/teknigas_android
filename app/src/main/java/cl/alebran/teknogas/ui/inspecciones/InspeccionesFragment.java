package cl.alebran.teknogas.ui.inspecciones;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.alebran.teknogas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InspeccionesFragment extends Fragment {


    public InspeccionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inspecciones, container, false);
    }

}
