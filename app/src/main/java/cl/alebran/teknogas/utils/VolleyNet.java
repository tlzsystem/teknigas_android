package cl.alebran.teknogas.utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyNet {
    private static VolleyNet INSTANCE;

    private RequestQueue mRequestQueque;

    private VolleyNet(Context context){
        mRequestQueque = Volley.newRequestQueue(context);
    }

    public static VolleyNet getInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = new VolleyNet(context);
        }

        return INSTANCE;
    }


    public RequestQueue getmRequestQueque() {
        return mRequestQueque;
    }
}
