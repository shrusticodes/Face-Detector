package com.example.facedetector;
import android.app.Application;
import com.google.firebase.FirebaseApp;

public class FaceDetection extends Application {
    public final static String RESULT_TEXT = "RESULT_TEXT";
    public final static String RESULT_DIALOG = "RESULT_DIALOG";

    // initializing our firebase
    @Override
    public void onCreate()
    {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}