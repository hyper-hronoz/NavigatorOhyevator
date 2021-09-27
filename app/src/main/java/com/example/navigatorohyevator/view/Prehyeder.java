package com.example.navigatorohyevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.navigatorohyevator.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Prehyeder#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Prehyeder extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Prehyeder() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Prehyeder.
     */
    // TODO: Rename and change types and number of parameters
    public static Prehyeder newInstance(String param1, String param2) {
        Prehyeder fragment = new Prehyeder();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prehyeder, container, false);

        ImageView imageView = view.findViewById(R.id.hyeader);

        Handler handel = new Handler();

        Runnable run = new Runnable() {

            @Override
            public void run() {
                Navigation.findNavController(view).navigate(R.id.action_prehyeder_to_surprizeMatherFucka);
            }
        };

        imageView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                switch (arg1.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        handel.postDelayed(run, 3000);
                        break;

                    default:
                        handel.removeCallbacks(run);
                        break;

                }
                return true;
            }
        });


        return view;
    }
}