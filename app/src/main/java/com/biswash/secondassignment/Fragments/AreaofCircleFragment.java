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
public class AreaofCircleFragment extends Fragment implements View.OnClickListener{

    private Button btnAreaofCircle;
    private EditText etRadius;
    private TextView tvArea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_areaof_circle, container, false);
        etRadius = view.findViewById(R.id.etArea);
        tvArea = view.findViewById(R.id.tvArea);
        btnAreaofCircle= view.findViewById(R.id.btnAreaofCircle);

        btnAreaofCircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        float radius= Float.parseFloat(etRadius.getText().toString());
        float area= 3.14f * radius* radius;

        tvArea.setText("Area of Circle is:" + area);
    }
}
