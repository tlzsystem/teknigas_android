package cl.alebran.teknogas.ui.instalaciones;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetalleInstalacionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class DetalleInstalacionFragment extends Fragment {


    private Instalaciones instalacion;

    private DetalleInstalacionViewModel detalleInstalacionViewModel;

    private OnFragmentInteractionListener mListener;


    private TextView txtFechaInstalacion;
    private TextView txtHoraInspeccion;
    private TextView txtNumeroVisitaInspeccion;
    private TextView txtRComercial;
    private TextView txtNombreInstalacion;
    private TextView txtComuna;
    private TextView txtDireccion;
    private TextView txtNumero;
    private Button btnInmuebles_detalle;

    public DetalleInstalacionFragment(){

    }

    public DetalleInstalacionFragment(Instalaciones inst) {
        this.instalacion = inst;    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        detalleInstalacionViewModel = ViewModelProviders.of(this).get(DetalleInstalacionViewModel.class);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View root = inflater.inflate(R.layout.fragment_detalle_instalacion, container, false);
        txtFechaInstalacion = root.findViewById(R.id.txtFechaInstalación);
        txtHoraInspeccion = root.findViewById(R.id.txtHoraInicio);
        txtNumeroVisitaInspeccion = root.findViewById(R.id.txtNumeroVisita);
        txtRComercial = root.findViewById(R.id.txtRComercial);
        txtNombreInstalacion = root.findViewById(R.id.txtNombreInstalacion);
        txtComuna = root.findViewById(R.id.txtComuna);
        txtDireccion = root.findViewById(R.id.txtDireccion);
        txtNumero = root.findViewById(R.id.txtNumero);
        btnInmuebles_detalle = root.findViewById(R.id.btnInmuebles_detalle);



        return root;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if(getArguments()!=null){
            final Instalaciones ins = DetalleInstalacionFragmentArgs.fromBundle(getArguments()).getInstalacion();
            txtFechaInstalacion.setText(ins.getFecha_inspeccion());
            txtHoraInspeccion.setText(ins.getHora_inspeccion());
            txtNumeroVisitaInspeccion.setText(ins.getNum_correlativo_inspeccion_inspector());
            txtRComercial.setText(ins.getUsuario_creacion());
            txtNombreInstalacion.setText(ins.getNombre_instalacion());
            txtComuna.setText(ins.getDireccion_inspeccion());
            txtDireccion.setText(ins.getDireccion_inspeccion());
            txtNumero.setText(ins.getNumero());

            btnInmuebles_detalle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    NavDirections directions = DetalleInstalacionFragmentDirections.actionNavDetalleInstalacionToDepartamentoListFragment(ins.getId_instalacion());
                    Navigation.findNavController(v).navigate(directions);

                }
            });




        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
