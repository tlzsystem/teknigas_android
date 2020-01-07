package cl.alebran.teknogas.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;

import cl.alebran.teknogas.utils.VolleyNet;

public class BaseVolleyFragment extends Fragment {
    private VolleyNet volley;
    protected RequestQueue fRequestQueque;



    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        volley = VolleyNet.getInstance(getActivity().getApplicationContext());
        fRequestQueque = volley.getmRequestQueque();
    }

    public void addToQueue(Request request) {
        if (request != null) {
            request.setTag(this);
            if (fRequestQueque == null)
                fRequestQueque = volley.getmRequestQueque();
            request.setRetryPolicy(new DefaultRetryPolicy(
                    60000, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
            ));
            onPreStartConnection();
            fRequestQueque.add(request);
        }
    }

    public void onPreStartConnection() {
        getActivity().setProgressBarIndeterminateVisibility(true);
    }

    public void onConnectionFinished() {
        Toast.makeText(getContext(), "Datos extraidos", Toast.LENGTH_SHORT).show();
        getActivity().setProgressBarIndeterminateVisibility(false);
    }

    public void onConnectionFailed(String error) {
        getActivity().setProgressBarIndeterminateVisibility(false);
        Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
    }

}
