package com.kin.mod;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.TextView;
import android.content.DialogInterface;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		StaticActivity.Start(this);
        }
}
