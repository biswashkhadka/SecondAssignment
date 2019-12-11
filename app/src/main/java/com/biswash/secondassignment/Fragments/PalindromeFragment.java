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
public class PalindromeFragment extends Fragment implements View.OnClickListener{

    EditText etnum;
    TextView tvPalindrome;
    Button btnPalindrome;
/*
    public PalindromeFragment() {
        // Required empty public constructor
    }
*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etnum = view.findViewById(R.id.etnum);
        tvPalindrome = view.findViewById(R.id.tvPalindrome);
        btnPalindrome = view.findViewById(R.id.btnPalindrome);

        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        int num = Integer.parseInt(etnum.getText().toString());
        int reverseNum=0, remainder, originalNum;
        originalNum = num;

        while (num !=0)
        {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /=10;
        }

        if(originalNum == reverseNum){
            tvPalindrome.setText("It is palindrome");
        }else{
            tvPalindrome.setText("It is not palindrome");
        }

    }
}
