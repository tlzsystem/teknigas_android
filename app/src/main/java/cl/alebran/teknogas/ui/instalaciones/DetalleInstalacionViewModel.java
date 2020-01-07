package cl.alebran.teknogas.ui.instalaciones;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.departamento.Departamento;
import cl.alebran.teknogas.persistencia.departamento.DepartamentoRepository;

public class DetalleInstalacionViewModel extends AndroidViewModel {

    private DepartamentoRepository departamentoRepository;
    private LiveData<List<Departamento>> listaDepartamentos;

    public DetalleInstalacionViewModel(@NonNull Application application) {
        super(application);

        departamentoRepository = new DepartamentoRepository(application);
    }


    public LiveData<List<Departamento>> getDepartamentoByInstalacion(int idInstalacion){
        listaDepartamentos = departamentoRepository.getDepartamentosByInstalacion(idInstalacion);
        return listaDepartamentos;
    }




}
