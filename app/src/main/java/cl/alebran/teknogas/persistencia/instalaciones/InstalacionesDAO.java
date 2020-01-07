package cl.alebran.teknogas.persistencia.instalaciones;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface InstalacionesDAO {

    @Query("DELETE FROM instalaciones")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Instalaciones instalaciones);

    @Query("SELECT * FROM instalaciones")
    LiveData <List<Instalaciones>> getAllInstalaciones();



}
