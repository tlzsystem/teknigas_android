package cl.alebran.teknogas.persistencia.instalaciones;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.db.TeknogasDB;

public class InstalacionesRepository {

    private InstalacionesDAO instalacionesDAO;
    private LiveData<List<Instalaciones>> listaInstalaciones;


    public InstalacionesRepository(Application application){
        TeknogasDB db = TeknogasDB.getDatabase(application);
        instalacionesDAO = db.instalacionesDAO();
        listaInstalaciones = instalacionesDAO.getAllInstalaciones();
    }

    public LiveData<List<Instalaciones>> getAllInstalaciones(){
        return listaInstalaciones;
    }

    public void deleteAll(){
        new deleteAsyncTak(instalacionesDAO).execute();
    }

    public void insert(Instalaciones instalacion){
        new insertAsyncTask(instalacionesDAO).execute(instalacion);

    }

    private static class insertAsyncTask extends AsyncTask<Instalaciones, Void, Void>{
        private InstalacionesDAO instalacionDAO;
        insertAsyncTask(InstalacionesDAO dao){
            instalacionDAO = dao;
        }


        @Override
        protected Void doInBackground(final Instalaciones... params) {
            instalacionDAO.insert(params[0]);
            return null;
        }
    }

    private static class deleteAsyncTak extends AsyncTask<Void, Void, Void>{
        private InstalacionesDAO instalacionDAO;
        deleteAsyncTak(InstalacionesDAO dao){instalacionDAO = dao;}


        @Override
        protected Void doInBackground(Void... voids) {
            instalacionDAO.deleteAll();
            return null;
        }
    }





}
