package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBackPressed(){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
       // builder.setTitle("New Simple Alert Dialog");
        builder.setMessage("Do you really want to Exit?")
                .setIcon(R.drawable.ic_warning_24)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish ();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);

        //Set Height and Width or Alert Dialog Box
      //  int width = (int) (getResources().getDisplayMetrics().widthPixels*0.85);
        //int height = (int) (getResources().getDisplayMetrics().heightPixels*0.85);
       // alertDialog.getWindow().setLayout(width,height);
    }
}