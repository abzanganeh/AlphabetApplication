package edu.pcc.barzinzanganeh.alireza.alphabetapplication;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ABZanganeh on 10/24/17.
 */

public class ReadyFragment extends DialogFragment{

//    Another way to show a Dialog without having XML

//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState){
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Hi, this is a test Alert");
//        builder.setMessage("if you want to proceed, touch yes");
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
//            @Override
//            public void onClick (DialogInterface dialog, int which) {
//                dismiss();
//            }
//        });
//        builder.setNegativeButton("NOPE", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//                dismiss();
//            }
//        });
//        return  builder.create();
//    }


@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ready, container, false);
        getDialog().setTitle("Simple Dialog");
        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        Button submitButton = (Button) rootView.findViewById(R.id.submitButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return rootView;
    }

}
