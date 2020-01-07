package cl.alebran.teknogas.persistencia.departamento;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;

@Dao
public interface DepartamentoDAO {

    @Query("DELETE FROM departamentos")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Departamento departamento);

    @Query("SELECT * FROM departamentos")
    LiveData<List<Departamento>> getAllDepartamentos();

    @Query("SELECT * FROM departamentos WHERE id_instalacion=:instalacion")
    LiveData<List<Departamento>> getDepartamentosByInstalacion(int instalacion);

}
