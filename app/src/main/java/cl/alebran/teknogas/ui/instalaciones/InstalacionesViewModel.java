package cl.alebran.teknogas.ui.instalaciones;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;
import cl.alebran.teknogas.persistencia.instalaciones.InstalacionesRepository;

public class InstalacionesViewModel extends AndroidViewModel {

    private InstalacionesRepository instalacionRepository;
    private LiveData<List<Instalaciones>> listaInstalaciones;

    public InstalacionesViewModel(Application application){
        super(application);
        instalacionRepository = new InstalacionesRepository(application);
        listaInstalaciones = instalacionRepository.getAllInstalaciones();

    }

    public LiveData<List<Instalaciones>> getAllInstalaciones(){
        return listaInstalaciones;
    }

    public void insert(Instalaciones instalacion){instalacionRepository.insert(instalacion);}

    public void deleteAll(){instalacionRepository.deleteAll();}


}
