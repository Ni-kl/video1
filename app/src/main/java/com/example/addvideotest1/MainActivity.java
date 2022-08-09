package com.example.addvideotest1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    //VideoView vid ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv =(VideoView) findViewById(R.id.vv);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vv);

        //String path= "android resource://" + "com.example.addvideotest1" +  "/" + R.raw.mn ;

        Uri u=Uri.parse("https://drive.google.com/file/d/1v-Hdh5l2Y0U_J6W6xmuXOp-PlME1D0dC/view?usp=drivesdk");
        //vid.setVideoURI(u);


        vv.setMediaController(mediaController);
        vv.setVideoURI(u);
        vv.requestFocus();
        vv.start();

    }
}