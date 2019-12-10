package com.sherwinvaz4827.user.popupwindowtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDialog=(Button)findViewById(R.id.buttonDialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder=new AlertDialog.Builder(MainActivity.this);
                View view=getLayoutInflater().inflate(R.layout.dialog_box,null);
                ImageButton mRank1=(ImageButton)view.findViewById(R.id.rank1);
                ImageButton mRank2=(ImageButton)view.findViewById(R.id.rank2);
                ImageButton mRank3=(ImageButton)view.findViewById(R.id.rank3);
                ImageButton mRank4=(ImageButton)view.findViewById(R.id.rank4);
                ImageButton mRank5=(ImageButton)view.findViewById(R.id.rank5);
                ImageButton mRank6=(ImageButton)view.findViewById(R.id.rank6);
                ImageButton mRank7=(ImageButton)view.findViewById(R.id.rank7);
                ImageButton mRank8=(ImageButton)view.findViewById(R.id.rank8);


                mBuilder.setView(view);
                AlertDialog dialog=mBuilder.create();
                dialog.show();
            }
        });
    }
}
