package com.biswash.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.biswash.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArmstrongFragment extends Fragment implements View.OnClickListener{

    private EditText etnum;
    private TextView tvarmstrong;
    private Button btncheck;


    public ArmstrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_armstrong,container,false);
        etnum=view.findViewById(R.id.etnum);
        tvarmstrong=view.findViewById(R.id.tvarmstrong);

        btncheck=view.findViewById(R.id.btncheck);

        btncheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        int a;
        int c=0;
        int temp;
        int n=Integer.parseInt(etnum.getText().toString());
        temp=n;
        while (n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
        {
            //Toast.makeText(getActivity(), "is: " + temp, Toast.LENGTH_SHORT).show();

            tvarmstrong.setText("it is a armstrong number");
        }
        else
        {
            // Toast.makeText(getActivity(), "is not: " + temp, Toast.LENGTH_SHORT).show();

            tvarmstrong.setText("it is not an armstrong number");

        }

    }
}
