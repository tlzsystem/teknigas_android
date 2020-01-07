package cl.alebran.teknogas.ui.descargar;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStore;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;

import java.util.Arrays;
import java.util.List;

import cl.alebran.teknogas.R;
import cl.alebran.teknogas.persistencia.departamento.Departamento;
import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;
import cl.alebran.teknogas.persistencia.instalaciones.InstalacionesRepository;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;
import cl.alebran.teknogas.ui.BaseVolleyFragment;
import cl.alebran.teknogas.ui.instalaciones.InstalacionesViewModel;


public class DescargarFragment extends BaseVolleyFragment {

    private DescargarViewModel descargarViewModel;
    private Button btn;
    private Button btn_eliminar;
    private TextView texto_ejemplo;
    private Gson gson;
    private ProgressBar prgrsBar;

    public DescargarFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_descargar, container, false);
        btn = (Button) root.findViewById(R.id.btn_descargar);
        prgrsBar = (ProgressBar) root.findViewById(R.id.progressBarDescargar);
        btn_eliminar = (Button) root.findViewById(R.id.btn_borrar_descargar);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.create();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prgrsBar.setVisibility(View.VISIBLE);
                getDataRequest();
                getDepartamentosRequest();
                getTipoDefectoRequest();
                prgrsBar.setVisibility(View.INVISIBLE);
            }
        });

        btn_eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteData();
            }
        });

        return root;
    }

    private void getDataRequest(){
        String url = "https://morning-bayou-76475.herokuapp.com/instalaciones/";
        JsonArrayRequest request = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            List<Instalaciones> listado;
            InstalacionesViewModel viewModel =  ViewModelProviders.of(getActivity()).get(InstalacionesViewModel.class);

            @Override
            public void onResponse(JSONArray response) {

                if(response.length()>0){
                   this.listado = Arrays.asList(gson.fromJson(response.toString(), Instalaciones[].class));
                   for(Instalaciones instalacion: listado){
                        viewModel.insert(instalacion);
                   }

                }

                onConnectionFinished();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                onConnectionFailed(error.toString());
            }

    });

        addToQueue(request);
    }
    private void getDepartamentosRequest(){
        String url = "https://morning-bayou-76475.herokuapp.com/departamentos/";
        JsonArrayRequest request = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            List<Departamento> listado;


            DescargarViewModel descargarViewModel = ViewModelProviders.of(getActivity()).get(DescargarViewModel.class);

            @Override
            public void onResponse(JSONArray response) {

                if(response.length()>0){
                    this.listado = Arrays.asList(gson.fromJson(response.toString(), Departamento[].class));
                    for(Departamento departamento: listado){
                        descargarViewModel.insert(departamento);
                    }

                }

                onConnectionFinished();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                onConnectionFailed(error.toString());
            }

        });

        addToQueue(request);
    }

    private void getTipoDefectoRequest(){
        String utl = "https://morning-bayou-76475.herokuapp.com/tipo_defectos/";
        JsonArrayRequest request = new JsonArrayRequest(utl, new Response.Listener<JSONArray>() {
            List<TipoDefecto> listado;
            DescargarViewModel descargarViewModel = ViewModelProviders.of(getActivity()).get(DescargarViewModel.class);


            @Override
            public void onResponse(JSONArray response) {
                if(response.length()>0){
                    this.listado = Arrays.asList(gson.fromJson(response.toString(), TipoDefecto[].class));
                    for(TipoDefecto def: listado){
                        descargarViewModel.insertTipoDefecto(def);
                    }
                }
                onConnectionFinished();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                onConnectionFailed(error.toString());
            }
        });

        addToQueue(request);

    }


    private void deleteData(){
        descargarViewModel = ViewModelProviders.of(getActivity()).get(DescargarViewModel.class);
        descargarViewModel.deleteAll();
        Toast.makeText(getContext(), "Datos eliminados", Toast.LENGTH_SHORT).show();

    }


}
