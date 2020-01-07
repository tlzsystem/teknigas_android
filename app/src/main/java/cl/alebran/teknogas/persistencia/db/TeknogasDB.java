package cl.alebran.teknogas.persistencia.db;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import cl.alebran.teknogas.persistencia.departamento.Departamento;
import cl.alebran.teknogas.persistencia.departamento.DepartamentoDAO;
import cl.alebran.teknogas.persistencia.instalaciones.Instalaciones;
import cl.alebran.teknogas.persistencia.instalaciones.InstalacionesDAO;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefecto;
import cl.alebran.teknogas.persistencia.tipodefecto.TipoDefectoDAO;


@Database(entities = {Instalaciones.class, Departamento.class, TipoDefecto.class}, version = 4)
public abstract class TeknogasDB extends RoomDatabase {


    public abstract InstalacionesDAO instalacionesDAO();
    public abstract DepartamentoDAO departamentoDAO();
    public abstract TipoDefectoDAO tipoDefectoDAO();
    private static volatile TeknogasDB INSTANCE;

    public static TeknogasDB getDatabase(final Context context){
        if (INSTANCE==null){
          synchronized (TeknogasDB.class){
              if(INSTANCE==null){
                  INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                          TeknogasDB.class, "teknogas_db")
                          .fallbackToDestructiveMigration()
                          .addCallback(sRoomDatabaseCallback)
                          .build();
              }
          }
        }

        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){
        @Override
        public void onOpen (@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
            new PopulateDbAsync(INSTANCE).execute();
        }

    };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
        private final InstalacionesDAO instalacionesDAO;

        PopulateDbAsync(TeknogasDB db) {
            instalacionesDAO = db.instalacionesDAO();
        }
        @Override
        protected Void doInBackground(final Void... params){
            //instalacionesDAO.deleteAll();

            return null;
        }


    }



}
