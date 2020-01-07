package cl.alebran.teknogas.ui.defectos;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefectoRepository;

public class DefectosBuscarViewModel extends AndroidViewModel {

    private TipoDefectoRepository tipoDefectoRepository;
    private LiveData<List<TipoDefecto>> listaTipoDefectos;

    public DefectosBuscarViewModel(@NonNull Application application) {
        super(application);
        tipoDefectoRepository = new TipoDefectoRepository(application);
    }

    public LiveData<List<TipoDefecto>> getAllTipoDefectoByClasificacion(int clasificacion){
        listaTipoDefectos = tipoDefectoRepository.getTipoDefectoByClasificacion(clasificacion);
        return listaTipoDefectos;
    }
}
