package cl.alebran.teknogas.persistencia.tipodefecto;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


@Dao
public interface TipoDefectoDAO {


    @Query("DELETE FROM tipo_defectos")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(TipoDefecto tipoDefecto);

    @Query("SELECT * FROM tipo_defectos WHERE id_Clasificacion=:id_clasificacion")
    LiveData<List<TipoDefecto>> getTipoDefectoByClasificacion(int id_clasificacion);
}
