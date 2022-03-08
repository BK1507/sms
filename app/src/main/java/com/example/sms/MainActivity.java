package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ednum;
    EditText edmsg;
    Button b;
    ImageView img;
    Animation anime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        img=findViewById(R.id.imageView);
        anime= AnimationUtils.loadAnimation(this,R.anim.pic);
        img.startAnimation(anime);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ednum=findViewById(R.id.editTextPhone);
                edmsg=findViewById(R.id.editTextTextPersonName2);
                SmsManager sm = SmsManager.getDefault();
                sm.sendTextMessage(ednum.getText().toString(),null,edmsg.getText().toString(),null,null);

            }
        });


    }

}