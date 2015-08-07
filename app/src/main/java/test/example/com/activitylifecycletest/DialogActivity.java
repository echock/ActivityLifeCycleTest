package test.example.com.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by echo on 2015/8/3.
 */
public class DialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_layout);
    }
}
