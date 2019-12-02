package polinema.ac.id.androiduistarter.fragments.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import polinema.ac.id.androiduistarter.R;

public class SplachActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_activities);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplachActivities.this,WelcomeActivity.class));
                finish();
            }
        },5000);
    }
}
