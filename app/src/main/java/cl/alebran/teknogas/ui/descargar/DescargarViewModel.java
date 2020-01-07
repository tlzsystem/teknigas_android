package cl.alebran.teknogas.ui.descargar;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import cl.alebran.teknogas.persistencia.departamento.Departamento;
import cl.alebran.teknogas.persistencia.departamento.DepartamentoRepository;
import cl.alebran.teknogas.persistencia.instalaciones.InstalacionesRepository;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefectoRepository;

public class DescargarViewModel  extends AndroidViewModel {

    private InstalacionesRepository instalacionRepository;
    private DepartamentoRepository departamentoRepository;
    private LiveData<List<Departamento>> listaDepartamentos;

    private TipoDefectoRepository tipoDefectoRepository;
    private LiveData<List<TipoDefecto>> listaTipoDefecto;


    public LiveData<List<Departamento>> getDepartamentoByInstalacion(int idInstalacion){
        listaDepartamentos = departamentoRepository.getDepartamentosByInstalacion(idInstalacion);
        return listaDepartamentos;
    }


    public void insert(Departamento departamento){departamentoRepository.insert(departamento);}

    public void insertTipoDefecto(TipoDefecto tipoDefecto){
        tipoDefectoRepository.insert(tipoDefecto);
    }


    public DescargarViewModel(@NonNull Application application) {
        super(application);
        instalacionRepository = new InstalacionesRepository(application);
        departamentoRepository = new DepartamentoRepository(application);
        tipoDefectoRepository = new TipoDefectoRepository(application);
    }
    public void deleteAll(){
        instalacionRepository.deleteAll();
        departamentoRepository.deleteAll();
        tipoDefectoRepository.deleteAll();

    }
}
