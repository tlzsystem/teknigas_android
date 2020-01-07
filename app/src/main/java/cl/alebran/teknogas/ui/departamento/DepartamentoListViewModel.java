package cl.alebran.teknogas.ui.departamento;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import cl.alebran.teknogas.persistencia.departamento.Departamento;
import cl.alebran.teknogas.persistencia.departamento.DepartamentoRepository;



public class DepartamentoListViewModel extends AndroidViewModel {

    private DepartamentoRepository departamentoRepository;
    private LiveData<List<Departamento>> listaDepartamentos;



    public DepartamentoListViewModel(@NonNull Application application) {
        super(application);
        departamentoRepository = new DepartamentoRepository(application);

    }



    public LiveData<List<Departamento>> getAllDepartamentosByInstalacion(int instalacion){
       listaDepartamentos = departamentoRepository.getDepartamentosByInstalacion(instalacion);
        return listaDepartamentos;
    }

}
