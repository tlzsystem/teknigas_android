package cl.alebran.teknogas.ui.ph;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefectoRepository;

public class PhDefectosViewModel extends AndroidViewModel {

    private TipoDefectoRepository tipoDefectoRepository;
    private LiveData<List<TipoDefecto>> listaTipoDefectos;

    public PhDefectosViewModel(@NonNull Application application) {
        super(application);
        tipoDefectoRepository = new TipoDefectoRepository(application);
    }

    public LiveData<List<TipoDefecto>> getAllTipoDefectoByClasificacion(int clasificacion){
        listaTipoDefectos = tipoDefectoRepository.getTipoDefectoByClasificacion(clasificacion);
        return listaTipoDefectos;
    }





}
