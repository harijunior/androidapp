package comtelindo.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTxtClick(View v)
    {
        if(v.getId() == R.id.sign_up || v.getId() == R.id.login)
        {
            Intent i = new Intent(getApplicationContext(), sign_up.class);
            startActivity(i);
        }
    }

}
