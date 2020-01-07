package cl.alebran.teknogas.ui.ph;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import cl.alebran.teknogas.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 */
public class PHBaseFragment extends Fragment {



    public PHBaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_phbase, container, false);

        final ViewPager viewPager= root.findViewById(R.id.id_view_ph);
        viewPager.setAdapter(new PagerAdapter(getFragmentManager()));


        TabLayout tab = root.findViewById(R.id.id_tabs_ph);
        tab.setupWithViewPager(viewPager);


        return root;
    }



    public class PagerAdapter extends FragmentStatePagerAdapter{

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new PhFragment();
                case 1:
                    return new PhDefectosFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "PH";
                case 1:
                    return "Defectos";
                default:
                    return null;
            }
        }


    }




}




