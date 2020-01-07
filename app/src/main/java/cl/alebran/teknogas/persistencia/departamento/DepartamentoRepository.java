package cl.alebran.teknogas.persistencia.departamento;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

import cl.alebran.teknogas.persistencia.db.TeknogasDB;


public class DepartamentoRepository {

    private DepartamentoDAO departamentoDAO;
    private LiveData<List<Departamento>> listaDepartamentos;

    public DepartamentoRepository(Application application){
        TeknogasDB db = TeknogasDB.getDatabase(application);
        departamentoDAO = db.departamentoDAO();
    }

    public LiveData<List<Departamento>> getDepartamentosByInstalacion(int idInstalacion){
        listaDepartamentos = departamentoDAO.getDepartamentosByInstalacion(idInstalacion);
        return listaDepartamentos;
    }

    public void insert(Departamento departamento){
        new insertAsyncTask(departamentoDAO).execute(departamento);

    }

    public void deleteAll(){
        new deleteAsyncTak(departamentoDAO).execute();
    }

    private static class insertAsyncTask extends AsyncTask<Departamento, Void, Void> {
        private DepartamentoDAO departamentoDAO;
        insertAsyncTask(DepartamentoDAO dao){
            departamentoDAO = dao;
        }


        @Override
        protected Void doInBackground(final Departamento... params) {
            departamentoDAO.insert(params[0]);
            return null;
        }
    }


    private static class deleteAsyncTak extends AsyncTask<Void, Void, Void>{
        private DepartamentoDAO departamentoDAO;
        deleteAsyncTak(DepartamentoDAO dao){departamentoDAO = dao;}


        @Override
        protected Void doInBackground(Void... voids) {
            departamentoDAO.deleteAll();
            return null;
        }
    }

}
