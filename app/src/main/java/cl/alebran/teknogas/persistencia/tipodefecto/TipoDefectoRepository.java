package cl.alebran.teknogas.persistencia.tipodefecto;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.db.TeknogasDB;

public class TipoDefectoRepository {

    private TipoDefectoDAO tipoDefectoDAO;
    private LiveData<List<TipoDefecto>> listaTipoDefecto;

    public TipoDefectoRepository(Application application){
        TeknogasDB db = TeknogasDB.getDatabase(application);
        tipoDefectoDAO = db.tipoDefectoDAO();
    }


    public LiveData<List<TipoDefecto>> getTipoDefectoByClasificacion(int id_clasificacion){
        listaTipoDefecto = tipoDefectoDAO.getTipoDefectoByClasificacion (id_clasificacion);
        return listaTipoDefecto;
    }

    public void insert(TipoDefecto tipoDefecto){
        new insertAsyncTask(tipoDefectoDAO).execute(tipoDefecto);

    }
    public void deleteAll(){
        new deleteAsyncTak(tipoDefectoDAO).execute();
    }


    private static class insertAsyncTask extends AsyncTask<TipoDefecto, Void, Void>{
        private TipoDefectoDAO tipoDefectoDAO;
        insertAsyncTask(TipoDefectoDAO dao){
            tipoDefectoDAO = dao;
        }

        @Override
        protected Void doInBackground(TipoDefecto... tipoDefectos) {
            tipoDefectoDAO.insert(tipoDefectos[0]);
            return null;
        }
    }

    private static class deleteAsyncTak extends AsyncTask<Void, Void, Void>{
        private TipoDefectoDAO tipoDefectoDAO;
        deleteAsyncTak(TipoDefectoDAO dao){tipoDefectoDAO = dao;}


        @Override
        protected Void doInBackground(Void... voids) {
            tipoDefectoDAO.deleteAll();
            return null;
        }
    }



}
