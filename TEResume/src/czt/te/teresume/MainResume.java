package czt.te.teresume;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainResume extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resume);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_resume, menu);
        return true;
    }
    
}
