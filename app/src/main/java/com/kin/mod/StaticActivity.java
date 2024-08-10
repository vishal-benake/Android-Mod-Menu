package com.kin.mod;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import android.app.AlertDialog;
import android.view.Window;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.app.ProgressDialog;
import android.os.Message;

public class StaticActivity {

    public static void Start(final Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(context)) {
            context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION",
                                             Uri.parse("package:" + context.getPackageName())));
                    } else {
                        
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                    @Override
                                public void run() {
									context.startService(new Intent(context, Launcher.class));
                                }
       }, 1000);
        }}
}

