package com.kin.mod;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.Html;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import java.io.ByteArrayOutputStream;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Random;
import android.view.Gravity;
import android.graphics.PixelFormat;
import android.view.ViewConfiguration;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import android.text.Html;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import android.view.View.OnClickListener;
import android.util.Size;
import android.text.style.TypefaceSpan;
import android.graphics.fonts.FontStyle;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.lang.Process;
import java.nio.file.Paths;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.Environment;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Launcher
extends Service {
   // final LinearLayout[] contentLayouts;
    float density;
    int dpi;
    RelativeLayout g_iconLayout;
    LinearLayout g_mainLayout;
   // final LinearLayout[] layoutParents;
    boolean resetAvailable;
    int scanThread;
    int screenHeight;
    int screenWidth;
    ESPView espLayout;
    SharedPreferences configPrefs;
    static Context ctx;
   // final ScrollView[] scrollLayouts;
    int selectedTab;
   // final FrameLayout[] tabLayouts;
    int type;
    LinearLayout linearLayout_page_Bypass,linearLayout_page_Vehicles,linearLayout_page_Items,linearLayout_page_Esp,linearLayout_page_Memory,linearLayout_bypass,linearLayout_tabBypass,linearLayout_tabmemory,linearLayout_tabesp,linearLayout_tabitems,linearLayout_tabvehicles,linearLayout_page_Memoryy;
    LinearLayout linearLayout_page_1,linearLayout_page_2,linearLayout_page_5,linearLayout_page_6,linearLayout_page_8,linearLayout_page_9, linearLayout_page_11,linearLayout_page_12,linearLayout_page_14,linearLayout_page_15,linearLayout_page_17,linearLayout_page_18,linearLayout_page_20,linearLayout_page_21;
    LinearLayout linearLayout_page_23,linearLayout_page_24, linearLayout_page_26,linearLayout_page_27,linearLayout_page_29,linearLayout_page_30,linearLayout_page_32,linearLayout_page_33,linearLayout_page_35,linearLayout_page_36;
    private ScrollView scrollView1,scrollView2,scrollView3,scrollView4,scrollView5,scrollView6,scrollView105,scrollView106;
  TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9;
      WindowManager windowManager;
    static boolean execs = false;
	static boolean count = false;
    private RelativeLayout relativeLayout;
    private native String MonsterLogo();
   // final String[] TABS;
Button button1,button2,button3,button4;
float mediumSize = 5.0f;
int ToggleON = Color.GREEN;
int ToggleOFF = Color.LTGRAY;
RelativeLayout relativeLayout2;
RelativeLayout relativeLayout3;
boolean lockBulletMode;
    boolean BulletMode;
    boolean lockFightMode;
    boolean fightMode;
    boolean Onclick;
    boolean BypassMain;
    boolean BypassBullet;
    boolean Esp;
    boolean lockfight_mode = false;
    boolean lockBullet_mode = false;
    boolean fight_mode = false;
    boolean Bullet_mode = false;
	Boolean Manager;


    
        private void FightFloat() {
		relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        relativeLayout2.setAlpha(0.6f);
        ImageView imageView2 = new ImageView(this);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(80, 80));
        relativeLayout2.addView(imageView2);

        try {
            InputStream inputStream = getApplicationContext().getAssets().open("FoxEngine/helper.dat");
            byte[] buffer = new byte[1024];
            int bytesRead;
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            byte[] icon = output.toByteArray();

            Bitmap bmp = BitmapFactory.decodeByteArray(icon, 0, icon.length);
            imageView2.setImageBitmap(bmp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		final WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-2, -2, this.type, 8, -3);
        layoutParams3.gravity = 51;
        layoutParams3.x = 0;
        layoutParams3.y = 0;
        relativeLayout2.setVisibility(8);
        this.windowManager.addView(relativeLayout2, layoutParams3);
        relativeLayout2.setOnTouchListener(new View.OnTouchListener() {
				float deltaX;
				float deltaY;
				float newX;
				float newY;
				float pressedX;
				float pressedY;

				public boolean onTouch(View view, MotionEvent motionEvent) {
					int actionMasked = motionEvent.getActionMasked();
					if (actionMasked == 0) {
						this.deltaX = ((float) layoutParams3.x) - motionEvent.getRawX();
						this.deltaY = ((float) layoutParams3.y) - motionEvent.getRawY();
						this.pressedX = motionEvent.getRawX();
						this.pressedY = motionEvent.getRawY();
					} else if (actionMasked == 1) {
						int rawX = (int) (motionEvent.getRawX() - this.pressedX);
						int rawY = (int) (motionEvent.getRawY() - this.pressedY);
						if (rawX == 0 && rawY == 0) {
							Launcher Launcher = Launcher.this;
							Launcher.fightMode = !Launcher.fightMode;
							if (Launcher.this.fightMode) {
								Toast.makeText(Launcher.this, "Fight Mode Enabled!", 0).show();
							} else {
								Toast.makeText(Launcher.this, "Fight Mode Disabled!", 0).show();
							}
							Launcher Launcher2 = Launcher.this;
							//Launcher2.UpdateConfiguration("FIGHT_MODE", Integer.valueOf(Launcher2.fightMode ? 1 : 0));
						}
						return true;
					} else if (actionMasked == 2) {
						this.newX = motionEvent.getRawX() + this.deltaX;
						this.newY = motionEvent.getRawY() + this.deltaY;
						float width = (float) (Launcher.this.screenWidth - view.getWidth());
						float height = (float) (Launcher.this.screenHeight - view.getHeight());
						if (this.newX < 0.0f) {
							this.newX = 0.0f;
						}
						if (this.newX > width) {
							this.newX = (float) ((int) width);
						}
						if (this.newY < 0.0f) {
							this.newY = 0.0f;
						}
						if (this.newY > height) {
							this.newY = (float) ((int) height);
						}
						if (!Launcher.this.lockFightMode) {
							layoutParams3.x = (int) this.newX;
							layoutParams3.y = (int) this.newY;
							Launcher.this.windowManager.updateViewLayout(relativeLayout2, layoutParams3);
						}
					}
					return false;
				}
			});
	}

private void BulletFloat() {
		relativeLayout3 = new RelativeLayout(this);
        relativeLayout3.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        relativeLayout3.setAlpha(0.6f);
        ImageView imageView3 = new ImageView(this);
        imageView3.setLayoutParams(new ViewGroup.LayoutParams(80, 80));
        relativeLayout3.addView(imageView3);

        try {
            InputStream inputStream = getApplicationContext().getAssets().open("FoxEngine/helper.dat");
            byte[] buffer = new byte[1024];
            int bytesRead;
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            byte[] icon = output.toByteArray();

            Bitmap bmp = BitmapFactory.decodeByteArray(icon, 0, icon.length);
            imageView3.setImageBitmap(bmp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		final WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(-2, -2, this.type, 8, -3);
        layoutParams4.gravity = 51;
        layoutParams4.x = 0;
        layoutParams4.y = 0;
        relativeLayout3.setVisibility(8);
        this.windowManager.addView(relativeLayout3, layoutParams4);
        relativeLayout3.setOnTouchListener(new View.OnTouchListener() {
				float deltaX;
				float deltaY;
				float newX;
				float newY;
				float pressedX;
				float pressedY;

				public boolean onTouch(View view, MotionEvent motionEvent) {
					int actionMasked = motionEvent.getActionMasked();
					if (actionMasked == 0) {
						this.deltaX = ((float) layoutParams4.x) - motionEvent.getRawX();
						this.deltaY = ((float) layoutParams4.y) - motionEvent.getRawY();
						this.pressedX = motionEvent.getRawX();
						this.pressedY = motionEvent.getRawY();
					} else if (actionMasked == 1) {
						int rawX = (int) (motionEvent.getRawX() - this.pressedX);
						int rawY = (int) (motionEvent.getRawY() - this.pressedY);
						if (rawX == 0 && rawY == 0) {
							Launcher Launcher = Launcher.this;
							Launcher.BulletMode = !Launcher.BulletMode;
							if (Launcher.this.BulletMode) {
								Toast.makeText(Launcher.this, "Fight Mode Enabled!", 0).show();
							} else {
								Toast.makeText(Launcher.this, "Fight Mode Disabled!", 0).show();
							}
							Launcher Launcher2 = Launcher.this;
							//Launcher2.UpdateConfiguration("FIGHT_MODE", Integer.valueOf(Launcher2.BulletMode ? 1 : 0));
						}
						return true;
					} else if (actionMasked == 2) {
						this.newX = motionEvent.getRawX() + this.deltaX;
						this.newY = motionEvent.getRawY() + this.deltaY;
						float width = (float) (Launcher.this.screenWidth - view.getWidth());
						float height = (float) (Launcher.this.screenHeight - view.getHeight());
						if (this.newX < 0.0f) {
							this.newX = 0.0f;
						}
						if (this.newX > width) {
							this.newX = (float) ((int) width);
						}
						if (this.newY < 0.0f) {
							this.newY = 0.0f;
						}
						if (this.newY > height) {
							this.newY = (float) ((int) height);
						}
						if (!Launcher.this.lockBulletMode) {
							layoutParams4.x = (int) this.newX;
							layoutParams4.y = (int) this.newY;
							Launcher.this.windowManager.updateViewLayout(relativeLayout3, layoutParams4);
						}
					}
					return false;
				}
			});
	}


/*void ButtonOnOff( String featureName) {
        final Button button = new Button(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT);
        layoutParams.setMargins(7, 5, 7, 5);
        button.setLayoutParams(layoutParams);
        button.setTextColor(TEXT_COLOR_2);
        button.setGravity(Gravity.CENTER);
        button.setAllCaps(false); //Disable caps to support html

        
        
        
        linearLayout_page_Memory.addView((View)button);
    }*/

 void AddButton1(String string, int n, int n2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(n, n2));
        linearLayout.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(15.0f));
        linearLayout.setGravity(17);
        this.button3 = new Button((Context)this);
        button3.setText((CharSequence)string);
        button3.setTextColor(Color.parseColor("#000000"));
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        button3.setTypeface(face);
        button3.setOnClickListener(onClickListener);
        button3.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
        gradientDrawable.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
        button3.setBackground((Drawable)gradientDrawable);
        linearLayout.addView((View)button3);
        linearLayout_page_Bypass.addView((View)linearLayout);
        
    }
    void AddButton21(String string, int n, int n2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(n, this.convertSizeToDp(45.0f)));
        linearLayout.setPadding(10,10,10,10);
        linearLayout.setGravity(17);
        this.button1 = new Button((Context)this);
        button1.setText((CharSequence)string);
        button1.setTextColor(Color.parseColor("#000000"));
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        button1.setTypeface(face);
        button1.setOnClickListener(onClickListener);
        button1.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
        gradientDrawable.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
        button1.setBackground((Drawable)gradientDrawable);
        linearLayout.addView((View)button1);
        linearLayout_page_Memory.addView((View)linearLayout);
        
    }
    void AddButton20(String string, int n, int n2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(n, this.convertSizeToDp(45.0f)));
        linearLayout.setPadding(10,10,10,10);
        linearLayout.setGravity(17);
        this.button2 = new Button((Context)this);
        button2.setText((CharSequence)string);
        button2.setTextColor(Color.parseColor("#000000"));
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        button2.setTypeface(face);
        button2.setOnClickListener(onClickListener);
        button2.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
        gradientDrawable.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
        button2.setBackground((Drawable)gradientDrawable);
        linearLayout.addView((View)button2);
        linearLayout_page_Memoryy.addView((View)linearLayout);
        
    }
    
     void AddButton3(String string, int n, int n2, View.OnClickListener onClickListener) {
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(n, n2));
        linearLayout.setPadding(5,5,5,5);
        linearLayout.setGravity(17);
        this.button4 = new Button((Context)this);
        button4.setText((CharSequence)string);
        button4.setTextColor(Color.parseColor("#000000"));
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        button4.setTypeface(face);
        button4.setOnClickListener(onClickListener);
        button4.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
        gradientDrawable.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
        button4.setBackground((Drawable)gradientDrawable);
        linearLayout.addView((View)button4);
        linearLayout_page_Esp.addView((View)linearLayout);
        
    }
    
    
    void AddCheckbox1( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_Items.addView(checkBox);
        
    }
    
    void AddCheckbox300( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_Items.addView(checkBox);
        
    }

    void AddCheckbox2( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_1.addView(checkBox);
        
    }

void AddCheckbox3( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_2.addView(checkBox);
        
    }
    
    void AddCheckbox4( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_5.addView(checkBox);
        
    }

void AddCheckbox5( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_6.addView(checkBox);
        
    }
    
     
    void AddCheckbox6( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_8.addView(checkBox);
        
    }

void AddCheckbox7( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_9.addView(checkBox);
        
    }

 
    void AddCheckbox8( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_11.addView(checkBox);
        
    }

void AddCheckbox9( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_12.addView(checkBox);
        
    }

 void AddCheckbox10( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_14.addView(checkBox);
        
    }

void AddCheckbox11( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_15.addView(checkBox);
        
    }
    
     void AddCheckbox12( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_17.addView(checkBox);
        
    }

void AddCheckbox13( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_18.addView(checkBox);
        
    }

void AddCheckbox14( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_20.addView(checkBox);
        
    }

void AddCheckbox15( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_21.addView(checkBox);
        
    }

void AddCheckbox16( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_23.addView(checkBox);
        
    }

void AddCheckbox17( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_24.addView(checkBox);
        
    }


void AddCheckbox18( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_26.addView(checkBox);
        
    }

void AddCheckbox19( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_27.addView(checkBox);
        
    }

void AddCheckbox20( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_29.addView(checkBox);
        
    }

void AddCheckbox21( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_30.addView(checkBox);
        
    }

void AddCheckbox22( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_32.addView(checkBox);
        
    }

void AddCheckbox23( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_33.addView(checkBox);
        
    }

void AddCheckbox24( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_35.addView(checkBox);
        
    }

void AddCheckbox147( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_Vehicles.addView(checkBox);
        
    }

void AddCheckbox25( String text, CompoundButton.OnCheckedChangeListener listener) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        checkBox.setTextSize(convertSizeToDp(6.0f));
        checkBox.setTextColor(Color.WHITE);
       // checkBox.setChecked(checked);
       Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        checkBox.setTypeface(face3);
        checkBox.setOnCheckedChangeListener(listener);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					Color.WHITE
                    }
            );
            checkBox.setButtonTintList(colorStateList);
        }
       linearLayout_page_36.addView(checkBox);
        
    }

    void AddText1(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Bypass.addView(textView);
       
            
    }


	void AddText22(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setTextColor(color);
        textView.setPadding(5,5,5,5);
        textView.setTextSize(convertSizeToDp(size));
        textView.setTranslationX(20.0f);
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Memoryy.addView(textView);
       
            
    }
    
    void AddText23(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setTextColor(color);
        textView.setPadding(5,5,5,5);
        textView.setTextSize(convertSizeToDp(size));
        textView.setTranslationX(20.0f);
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Memory.addView(textView);
       
            
    }

    void AddText3(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Memoryy.addView(textView);
       
            
    }

void AddText24(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setTextColor(color);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Items.addView(textView);
       
            
    }

void AddText25(String text, float size, int color) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextColor(color);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView.setTypeface(face);
        textView.setPadding(15, 15, 15, 15);
        textView.setTextSize(convertSizeToDp(size));
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout_page_Vehicles.addView(textView);
       
            
    }
    
    void AddSwitch1( String text, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        Switch toggle = new Switch(this);
        toggle.setText(text);
        toggle.setTextSize(convertSizeToDp(mediumSize));
        toggle.setTextColor(Color.WHITE);
        toggle.setChecked(checked);
        toggle.setPadding(15, 15, 15, 15);
        toggle.setOnCheckedChangeListener(listener);
        toggle.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					ToggleON, // ON
					ToggleOFF // OFF
                    }
            );
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
				toggle.getThumbDrawable().setTintList(colorStateList);
				toggle.getTrackDrawable().setTintList(colorStateList);
			}
		    
        }
        linearLayout_page_Memoryy.addView(toggle);
       
    }

    void AddSwitch2( String text, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        Switch toggle = new Switch(this);
        toggle.setText(text);
        toggle.setTextSize(2,convertSizeToDp(mediumSize));
        toggle.setTextColor(Color.WHITE);
        toggle.setChecked(checked);
        toggle.setPadding(15, 15, 15, 15);
        toggle.setOnCheckedChangeListener(listener);
        toggle.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					ToggleON, // ON
					ToggleOFF // OFF
                    }
            );
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
				toggle.getThumbDrawable().setTintList(colorStateList);
				toggle.getTrackDrawable().setTintList(colorStateList);
			}
		    
        }
        linearLayout_page_Memory.addView(toggle);
       
    }

void AddSwitch3( String text, boolean checked, CompoundButton.OnCheckedChangeListener listener) {
        Switch toggle = new Switch(this);
        toggle.setText(text);
        toggle.setTextSize(convertSizeToDp(mediumSize));
        toggle.setTextColor(Color.WHITE);
        toggle.setChecked(checked);
        Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        toggle.setTypeface(face3);
        toggle.setPadding(15, 15, 15, 15);
        toggle.setOnCheckedChangeListener(listener);
        toggle.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        if (Build.VERSION.SDK_INT >= 21) {
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked}, // unchecked
                            new int[]{android.R.attr.state_checked}  // checked
                    },
                    new int[]{
					Color.WHITE,
					ToggleON, // ON
					ToggleOFF // OFF
                    }
            );
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
				toggle.getThumbDrawable().setTintList(colorStateList);
				toggle.getTrackDrawable().setTintList(colorStateList);
			}
		    
        }
        linearLayout_page_Esp.addView(toggle);
       
    }


void AddSeekbar1(String string, final int n, int n2, int n3, final String string2, final String string3, final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        int n4 = n3;
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        TextView textView = new TextView((Context)this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        textView.setText((CharSequence)stringBuilder.toString());
        textView.setTextSize(1, 12.5f);
        textView.setPadding(this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f));
        textView.setTextColor(-1);
        textView.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-2, -2));
        textView.setGravity(3);
        SeekBar seekBar = new SeekBar((Context)this);
        seekBar.setMax(n2);
        if (Build.VERSION.SDK_INT >= 26) {
            seekBar.setMin(n);
            seekBar.setProgress(n);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setThumbTintList(ColorStateList.valueOf((int)-1));
            seekBar.setProgressTintList(ColorStateList.valueOf((int)-1));
        }
        seekBar.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f));
        final TextView textView2 = new TextView((Context)this);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append(n);
        stringBuilder2.append(string3);
        textView2.setText((CharSequence)stringBuilder2.toString());
        textView2.setGravity(5);
        textView2.setTextSize(1, 12.5f);
        textView2.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        textView2.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f));
        textView2.setTextColor(-1);
        if (n4 != 0) {
            if (n4 < n) {
                n4 = n;
            }
            if (n4 > n2) {
                n4 = n2;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append(n4);
            stringBuilder3.append(string3);
            textView2.setText((CharSequence)stringBuilder3.toString());
            seekBar.setProgress(n4);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = new SeekBar.OnSeekBarChangeListener(){

            public void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2;
                if (n2 < n) {
                    n2 = n;
                    seekBar.setProgress(n2);
                }
                if ((onSeekBarChangeListener2 = onSeekBarChangeListener) != null) {
                    onSeekBarChangeListener2.onProgressChanged(seekBar, n2, bl);
                }
                TextView textView = textView2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(n2);
                stringBuilder.append(string3);
                textView.setText((CharSequence)stringBuilder.toString());
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStartTrackingTouch(seekBar);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(seekBar);
                }
            }
        };
        seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener2);
        linearLayout.addView((View)textView);
        linearLayout.addView((View)textView2);
        linearLayout_page_Memoryy.addView(linearLayout);
        linearLayout_page_Memoryy.addView(seekBar);
     
    }

void AddSeekbar2(String string, final int n, int n2, int n3, final String string2, final String string3, final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        int n4 = n3;
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        TextView textView = new TextView((Context)this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        textView.setText((CharSequence)stringBuilder.toString());
        textView.setTextSize(2, 12.5f);
        textView.setPadding(this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f));
        textView.setTextColor(-1);
        Typeface face3 = Typeface.createFromAsset(getAssets(), "tolerant.ttf");
        textView.setTypeface(face3);
        textView.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-2, -2));
        textView.setGravity(3);
        SeekBar seekBar = new SeekBar((Context)this);
        seekBar.setMax(n2);
        if (Build.VERSION.SDK_INT >= 26) {
            seekBar.setMin(n);
            seekBar.setProgress(n);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setThumbTintList(ColorStateList.valueOf((int)-1));
            seekBar.setProgressTintList(ColorStateList.valueOf((int)-1));
        }
        seekBar.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f));
        final TextView textView2 = new TextView((Context)this);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append(n);
        stringBuilder2.append(string3);
        textView2.setText((CharSequence)stringBuilder2.toString());
        textView2.setGravity(5);
        textView2.setTextSize(1, 12.5f);
        textView2.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        textView2.setPadding(this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(15.0f), this.convertSizeToDp(5.0f));
        textView2.setTextColor(-1);
        if (n4 != 0) {
            if (n4 < n) {
                n4 = n;
            }
            if (n4 > n2) {
                n4 = n2;
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append(n4);
            stringBuilder3.append(string3);
            textView2.setText((CharSequence)stringBuilder3.toString());
            seekBar.setProgress(n4);
        }
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = new SeekBar.OnSeekBarChangeListener(){

            public void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2;
                if (n2 < n) {
                    n2 = n;
                    seekBar.setProgress(n2);
                }
                if ((onSeekBarChangeListener2 = onSeekBarChangeListener) != null) {
                    onSeekBarChangeListener2.onProgressChanged(seekBar, n2, bl);
                }
                TextView textView = textView2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(n2);
                stringBuilder.append(string3);
                textView.setText((CharSequence)stringBuilder.toString());
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStartTrackingTouch(seekBar);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(seekBar);
                }
            }
        };
        seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener2);
        linearLayout.addView((View)textView);
        linearLayout.addView((View)textView2);
        linearLayout_page_Esp.addView(linearLayout);
        linearLayout_page_Esp.addView(seekBar);
     
    }

void AddRadioButton(String[] arrstring, int n, RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        RadioGroup radioGroup = new RadioGroup((Context)this);
        RadioButton[] arrradioButton = new RadioButton[arrstring.length];
        radioGroup.setOrientation(1);
        for (int i = 0; i < arrstring.length; ++i) {
            arrradioButton[i] = new RadioButton((Context)this);
            if (i == n) {
                arrradioButton[i].setChecked(true);
            }
            arrradioButton[i].setPadding(this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f), this.convertSizeToDp(10.0f), this.convertSizeToDp(5.0f));
            arrradioButton[i].setText((CharSequence)arrstring[i]);
            arrradioButton[i].setTextSize(1, 12.5f);
            arrradioButton[i].setId(i);
            arrradioButton[i].setGravity(5);
            arrradioButton[i].setTextColor(-1);
            radioGroup.addView((View)arrradioButton[i]);
        }
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        radioGroup.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        linearLayout_page_Memoryy.addView(radioGroup);       
    }


    
    int convertSizeToDp(float f) {
        return Math.round((float)TypedValue.applyDimension((int)1, (float)f, (DisplayMetrics)this.getResources().getDisplayMetrics()));
    }

    public IBinder onBind(Intent intent) {
        return null;
    }


    static boolean getConfig(String key){
        SharedPreferences sp=ctx.getSharedPreferences("espValue",Context.MODE_PRIVATE);
        return  sp.getBoolean(key,false);
    }
    

        public void onCreate() {
        super.onCreate();
        System.loadLibrary("KingMod");
        FileUtil.writeFile("/storage/emulated/0/Android/CodeXpatcherLogs.txt", "BGMI BY @Monster_1234");
        ctx=this;
        configPrefs = getSharedPreferences("config", MODE_PRIVATE);	    
        final LinearLayout linearLayout;
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        final Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        screenWidth = point.x;
        screenHeight = point.y;
        dpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        density = Resources.getSystem().getDisplayMetrics().density;
        final int n = convertSizeToDp(360.0f);
        final int n2 = convertSizeToDp(280.0f);
        g_mainLayout = linearLayout = new LinearLayout((Context)this);
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setPadding(9,9,9,9);  
        GradientDrawable gradientDrawable1= new GradientDrawable();
        gradientDrawable1.setColor(Color.parseColor("#FDC400"));
        gradientDrawable1.setCornerRadius(4.0f);
        linearLayout.setBackground(gradientDrawable1);
        Integer n3 = 1;
        linearLayout.setOrientation(1);
        int n4 = convertSizeToDp(32.0f);
        final LinearLayout frameLayout = new LinearLayout(this);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setOrientation(0);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, n4));
        GradientDrawable gradientDrawable2= new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#FDC400"));
        gradientDrawable2.setStroke(3, Color.parseColor("#000000"));
        gradientDrawable2.setCornerRadius(3.0f);       
        frameLayout.setBackground(gradientDrawable2);    
        Button button = new Button((Context)this);
        GradientDrawable buttonBG =  new GradientDrawable();
        button.setPadding(this.convertSizeToDp(5.0f), 0, 0, 0);
        button.setText("❌");
        button.setGravity(2);
        button.setTextColor(-1);
        button.setTextSize(1,15.0f);
        button.setWidth(0);
        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams1.setMargins(10, 0, 0, 0);
        button.setLayoutParams(layoutParams1);
        button.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK);
        button.setGravity(Gravity.VERTICAL_GRAVITY_MASK);
        button.setBackground(buttonBG);
        frameLayout.addView((View)button);
        linearLayout.addView(frameLayout);
        TextView textView = new TextView(this);
        Typeface face1 = Typeface.createFromAsset(getAssets(), "pubg.ttf");
        textView.setText("                  KING MOD");
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.parseColor("#000000"));
        textView.setTypeface(face1);
        textView.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView.setTextSize(1, 20.0f);
        frameLayout.addView(textView);
        
        int n5 = convertSizeToDp(25.0f);
        this.linearLayout_bypass = new LinearLayout(this);
        linearLayout_bypass.setLayoutParams(new LinearLayout.LayoutParams(-1, n5));
        linearLayout_bypass.setGravity(Gravity.CENTER);
        int[] colorsCRNUB = { Color.parseColor("#FE3200"), Color.parseColor("#FE3200") };
        android.graphics.drawable.GradientDrawable CRNUB = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNUB);
        CRNUB.setCornerRadii(new float[]{(int)0,(int)0,(int)0,(int)0,(int)121,(int)121,(int)121,(int)121});
        CRNUB.setStroke((int) 0, Color.parseColor("#000000"));
        linearLayout_bypass.setElevation((float) 6);
        linearLayout_bypass.setBackground(CRNUB);
        this.textView1 = new TextView(this);
        textView1.setText("BYPASS NOT YET ACTIVATED");
        textView1.setGravity(Gravity.CENTER);
        textView1.setTextColor(Color.parseColor("#000000"));
        textView1.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView1.setTextSize(1, 12.0f);
        linearLayout_bypass.addView(textView1);
        linearLayout.addView(linearLayout_bypass);

        int n6 = convertSizeToDp(5.0f);
        final LinearLayout linearLayout_space = new LinearLayout(this);
        linearLayout_space.setLayoutParams(new LinearLayout.LayoutParams(-1, n6));
        linearLayout.addView(linearLayout_space);


        final LinearLayout linearLayout1 = new LinearLayout(this);
        linearLayout1.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout1.setBackgroundColor(Color.parseColor("#ffffff"));
        linearLayout1.setOrientation(0);
        linearLayout.addView(linearLayout1);
        
        //tab_home
        int n7 = convertSizeToDp(100.0f);
        final LinearLayout linearLayout_tabHome = new LinearLayout(this);
        linearLayout_tabHome.setLayoutParams(new LinearLayout.LayoutParams(n7, -1));
        linearLayout_tabHome.setBackgroundColor(Color.parseColor("#FDC400"));
        linearLayout_tabHome.setOrientation(1);
        linearLayout1.addView(linearLayout_tabHome);
        
        this.scrollView1 = new ScrollView((Context)this);
        this.scrollView1.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
       // this.scrollView1.setOrientation(1);
        linearLayout_tabHome.addView(scrollView1);
        
        final LinearLayout linearLayout_tabHomeup = new LinearLayout(this);
        linearLayout_tabHomeup.setLayoutParams(new LinearLayout.LayoutParams(n7, -1));
        linearLayout_tabHomeup.setBackgroundColor(Color.parseColor("#FDC400"));
        linearLayout_tabHomeup.setOrientation(1);
        scrollView1.addView(linearLayout_tabHomeup);
        
        //page_home
        final LinearLayout linearLayout_pageHome = new LinearLayout(this);
        linearLayout_pageHome.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_pageHome.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_pageHome.setOrientation(0);
        linearLayout1.addView(linearLayout_pageHome);
        
         //page_bypass_base
        final LinearLayout linearLayout_Bypass = new LinearLayout(this);
        linearLayout_Bypass.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_Bypass.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_Bypass.setOrientation(1);
        linearLayout_pageHome.addView(linearLayout_Bypass);
        
        //page_memory_base
      /*  final LinearLayout linearLayout_Memory = new LinearLayout(this);
        linearLayout_Memory.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_Memory.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_Memory.setOrientation(1);
        linearLayout_pageHome.addView(linearLayout_Memory);
        
        //page_esp_base
        final LinearLayout linearLayout_Esp = new LinearLayout(this);
        linearLayout_Esp.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_Esp.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_Esp.setOrientation(1);
        linearLayout_pageHome.addView(linearLayout_Esp);
        
        //page_items_base
        final LinearLayout linearLayout_Items = new LinearLayout(this);
        linearLayout_Items.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_Items.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_Items.setOrientation(1);
        linearLayout_pageHome.addView(linearLayout_Items);
 
        //page_vehicles_base
        final LinearLayout linearLayout_Vehicles = new LinearLayout(this);
        linearLayout_Vehicles.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_Vehicles.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_Vehicles.setOrientation(1);
        linearLayout_pageHome.addView(linearLayout_Vehicles);
        
     */
        this.scrollView2 = new ScrollView((Context)this);
        this.scrollView2.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
        linearLayout_Bypass.addView(scrollView2);
        
        this.scrollView3 = new ScrollView((Context)this);
        this.scrollView3.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
        linearLayout_Bypass.addView(scrollView3);
        
        this.scrollView4 = new ScrollView((Context)this);
        this.scrollView4.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
        linearLayout_Bypass.addView(scrollView4);
        
        this.scrollView5 = new ScrollView((Context)this);
        this.scrollView5.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
        linearLayout_Bypass.addView(scrollView5);
        
        this.scrollView6 = new ScrollView((Context)this);
        this.scrollView6.setLayoutParams(new ScrollView.LayoutParams(-1,-1));
        linearLayout_Bypass.addView(scrollView6);
        
        //page_bypass
        this.linearLayout_page_Bypass = new LinearLayout(this);
        linearLayout_page_Bypass.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_page_Bypass.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Bypass.setOrientation(1);
        linearLayout_page_Bypass.setPadding(8,10,8,8);
        linearLayout_page_Bypass.setGravity(Gravity.CENTER);
        scrollView2.addView(linearLayout_page_Bypass);
        
        //page_memory
        this.linearLayout_page_Memory = new LinearLayout(this);
        linearLayout_page_Memory.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_page_Memory.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Memory.setOrientation(1);
        linearLayout_page_Memory.setPadding(8,8,8,8);
        scrollView3.addView(linearLayout_page_Memory);
        
        //page_esp
        this.linearLayout_page_Esp = new LinearLayout(this);
        linearLayout_page_Esp.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_page_Esp.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Esp.setOrientation(1);
        linearLayout_page_Esp.setPadding(8,8,8,8);
        scrollView4.addView(linearLayout_page_Esp);
        
        //page_items
        this.linearLayout_page_Items = new LinearLayout(this);
        linearLayout_page_Items.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_page_Items.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Items.setOrientation(1);
        linearLayout_page_Items.setPadding(8,8,8,8);
        scrollView5.addView(linearLayout_page_Items);
 
        //page_vehicles
        this.linearLayout_page_Vehicles = new LinearLayout(this);
        linearLayout_page_Vehicles.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout_page_Vehicles.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Vehicles.setOrientation(1);
        linearLayout_page_Vehicles.setPadding(8,8,8,8);
        scrollView6.addView(linearLayout_page_Vehicles);
        
        //tab_Bypass
        int n9 = convertSizeToDp(40.0f);
        this.linearLayout_tabBypass = new LinearLayout(this);
        linearLayout_tabBypass.setLayoutParams(new LinearLayout.LayoutParams(-1, n9));
        int[] colorsCRNAK = { Color.parseColor("#253336"), Color.parseColor("#253336") }; android.graphics.drawable.GradientDrawable CRNAK = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNAK);
        CRNAK.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
        CRNAK.setStroke((int)0, Color.parseColor("#000000"));
        linearLayout_tabBypass.setElevation((float) 0);
        linearLayout_tabBypass.setBackground(CRNAK);
        linearLayout_tabBypass.setGravity(Gravity.CENTER);
        this.textView2 = new TextView(this);
        Typeface face = Typeface.createFromAsset(getAssets(), "code.ttf");
        textView2.setText("BYPASS");
        textView2.setGravity(Gravity.CENTER);
        textView2.setTextColor(Color.parseColor("#FFFFFF"));
        textView2.setTypeface(face);
        textView2.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView2.setTextSize(1, 13.0f);
        linearLayout_tabBypass.addView(textView2);
        linearLayout_tabHomeup.addView(linearLayout_tabBypass);
        

        //space_1
        int n10 = convertSizeToDp(2.0f);
        final LinearLayout linearLayout_space1 = new LinearLayout(this);
        linearLayout_space1.setLayoutParams(new LinearLayout.LayoutParams(-1, n10));
        linearLayout_space1.setBackgroundColor(Color.parseColor("#42575E"));
        linearLayout_tabHomeup.addView(linearLayout_space1);

        //tab_memory
        this.linearLayout_tabmemory = new LinearLayout(this);
        linearLayout_tabmemory.setLayoutParams(new LinearLayout.LayoutParams(-1, n9));
        linearLayout_tabmemory.setGravity(Gravity.CENTER);
        int[] colorsCRNAQ = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNAQ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNAQ);
        CRNAQ.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
        CRNAQ.setStroke((int)0, Color.parseColor("#000000"));
        linearLayout_tabmemory.setElevation((float) 0);
        linearLayout_tabmemory.setBackground(CRNAQ);
        this.textView3 = new TextView(this);
        textView3.setText("MEMORY");
        textView3.setGravity(Gravity.CENTER);
        textView3.setTextColor(Color.parseColor("#000000"));
        textView3.setTypeface(face);
        textView3.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView3.setTextSize(1, 13.0f);
        linearLayout_tabmemory.addView(textView3);
        linearLayout_tabHomeup.addView(linearLayout_tabmemory);
        
        //space_2
        final LinearLayout linearLayout_space2 = new LinearLayout(this);
        linearLayout_space2.setLayoutParams(new LinearLayout.LayoutParams(-1, n10));
        linearLayout_space2.setBackgroundColor(Color.parseColor("#42575E"));
        linearLayout_tabHomeup.addView(linearLayout_space2);

        //tab_Esp
         this.linearLayout_tabesp = new LinearLayout(this);
        linearLayout_tabesp.setLayoutParams(new LinearLayout.LayoutParams(-1, n9));
        int[] colorsCRNWH = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNWH = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNWH);
        CRNWH.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
        CRNWH.setStroke((int)0, Color.parseColor("#000000"));
        linearLayout_tabesp.setElevation((float) 0);
        linearLayout_tabesp.setBackground(CRNWH);
        linearLayout_tabesp.setGravity(Gravity.CENTER);
        this.textView4 = new TextView(this);
        textView4.setText("ESP");
        textView4.setGravity(Gravity.CENTER);
        textView4.setTextColor(Color.parseColor("#000000"));
        textView4.setTypeface(face);
        textView4.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView4.setTextSize(1, 13.0f);
        linearLayout_tabesp.addView(textView4);
        linearLayout_tabHomeup.addView(linearLayout_tabesp);
        
        //space_3
        final LinearLayout linearLayout_space3 = new LinearLayout(this);
        linearLayout_space3.setLayoutParams(new LinearLayout.LayoutParams(-1, n10));
        linearLayout_space3.setBackgroundColor(Color.parseColor("#42575E"));
        linearLayout_tabHomeup.addView(linearLayout_space3);

       // tab_items
        this.linearLayout_tabitems = new LinearLayout(this);
        linearLayout_tabitems.setLayoutParams(new LinearLayout.LayoutParams(-1, n9));
        int[] colorsCRNHD = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNHD = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNHD);
        CRNHD.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
        CRNHD.setStroke((int)0, Color.parseColor("#000000"));
        linearLayout_tabitems.setElevation((float) 0);
        linearLayout_tabitems.setBackground(CRNHD);
        linearLayout_tabitems.setGravity(Gravity.CENTER);
        this.textView5 = new TextView(this);
        textView5.setText("ITEMS");
        textView5.setGravity(Gravity.CENTER);
        textView5.setTextColor(Color.parseColor("#000000"));
        textView5.setTypeface(face);
        textView5.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView5.setTextSize(1, 13.0f);
        linearLayout_tabitems.addView(textView5);
        linearLayout_tabHomeup.addView(linearLayout_tabitems);
         
        //space_4
        final LinearLayout linearLayout_space4 = new LinearLayout(this);
        linearLayout_space4.setLayoutParams(new LinearLayout.LayoutParams(-1, n10));
        linearLayout_space4.setBackgroundColor(Color.parseColor("#42575E"));
        linearLayout_tabHomeup.addView(linearLayout_space4);
        
        //tab_vehicles
        this.linearLayout_tabvehicles = new LinearLayout(this);
        linearLayout_tabvehicles.setLayoutParams(new LinearLayout.LayoutParams(-1, n9));
        int[] colorsCRNKY = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNKY = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNKY);
        CRNKY.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
        CRNKY.setStroke((int)0, Color.parseColor("#000000"));
        linearLayout_tabvehicles.setElevation((float) 0);
        linearLayout_tabvehicles.setBackground(CRNKY);
        linearLayout_tabvehicles.setGravity(Gravity.CENTER);
        this.textView6 = new TextView(this);
        textView6.setText("VEHICLES");
        textView6.setGravity(Gravity.CENTER);
        textView6.setTextColor(Color.parseColor("#000000"));
        textView6.setTypeface(face);
        textView6.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView6.setTextSize(1, 13.0f);
        linearLayout_tabvehicles.addView(textView6);
        linearLayout_tabHomeup.addView(linearLayout_tabvehicles);
        
        linearLayout_tabBypass.setOnClickListener(new View.OnClickListener(){
               @Override
                public void onClick(View view)
                {                 
                   scrollView2.setVisibility(ScrollView.VISIBLE);  
				   scrollView3.setVisibility(ScrollView.GONE);  
                   scrollView4.setVisibility(ScrollView.GONE);  
                   scrollView5.setVisibility(ScrollView.GONE);  
                   scrollView6.setVisibility(ScrollView.GONE);  
                   
                   textView2.setTextColor(Color.parseColor("#FFFFFF"));
                   textView3.setTextColor(Color.parseColor("#000000"));
                   textView4.setTextColor(Color.parseColor("#000000"));
                   textView5.setTextColor(Color.parseColor("#000000"));
                   textView6.setTextColor(Color.parseColor("#000000"));
    
                   int[] colorsCRNII = { Color.parseColor("#253336"), Color.parseColor("#253336") }; android.graphics.drawable.GradientDrawable CRNII = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNII);
                   CRNII.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNII.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabBypass.setElevation((float) 0);
                   linearLayout_tabBypass.setBackground(CRNII);
                   
                   int[] colorsCRNBT = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNBT = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNBT);
                   CRNBT.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNBT.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabmemory.setElevation((float) 0);
                   linearLayout_tabmemory.setBackground(CRNBT);
                   
                   int[] colorsCRNRA = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNRA = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNRA);
                   CRNRA.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNRA.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabesp.setElevation((float) 0);
                   linearLayout_tabesp.setBackground(CRNRA);
                   
                   int[] colorsCRNJE = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNJE = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNJE);
                   CRNJE.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNJE.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabitems.setElevation((float) 0);
                   linearLayout_tabitems.setBackground(CRNJE);
                   
                   int[] colorsCRNNF = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNNF = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNNF);
                   CRNNF.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNNF.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabvehicles.setElevation((float) 0);
                   linearLayout_tabvehicles.setBackground(CRNNF);
                 }
                 });
            
            linearLayout_tabmemory.setOnClickListener(new View.OnClickListener(){
               @Override
                public void onClick(View view)
                {
                   scrollView3.setVisibility(ScrollView.VISIBLE);  
				   scrollView2.setVisibility(ScrollView.GONE);  
                   scrollView4.setVisibility(ScrollView.GONE);  
                   scrollView5.setVisibility(ScrollView.GONE);  
                   scrollView6.setVisibility(ScrollView.GONE);  
                   
                   textView2.setTextColor(Color.parseColor("#000000"));
                   textView3.setTextColor(Color.parseColor("#FFFFFF"));
                   textView4.setTextColor(Color.parseColor("#000000"));
                   textView5.setTextColor(Color.parseColor("#000000"));
                   textView6.setTextColor(Color.parseColor("#000000"));
                                       
                   int[] colorsCRNSC = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNSC = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNSC);
                   CRNSC.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNSC.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabBypass.setElevation((float) 0);
                   linearLayout_tabBypass.setBackground(CRNSC);

                   int[] colorsCRNXR = { Color.parseColor("#253336"), Color.parseColor("#253336") }; android.graphics.drawable.GradientDrawable CRNXR = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNXR);
                   CRNXR.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNXR.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabmemory.setElevation((float) 0);
                   linearLayout_tabmemory.setBackground(CRNXR);

                   int[] colorsCRNFJ = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNFJ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNFJ);
                   CRNFJ.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNFJ.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabesp.setElevation((float) 0);
                   linearLayout_tabesp.setBackground(CRNFJ);

                   int[] colorsCRNEV = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNEV = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNEV);
                   CRNEV.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNEV.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabitems.setElevation((float) 0);
                   linearLayout_tabitems.setBackground(CRNEV);
            
                   int[] colorsCRNFC = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNFC = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNFC);
                   CRNFC.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNFC.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabvehicles.setElevation((float) 0);
                   linearLayout_tabvehicles.setBackground(CRNFC);
                }
                });

             linearLayout_tabesp.setOnClickListener(new View.OnClickListener(){
               @Override
                public void onClick(View view)
                {
                   scrollView4.setVisibility(ScrollView.VISIBLE);  
				   scrollView3.setVisibility(ScrollView.GONE);  
                   scrollView2.setVisibility(ScrollView.GONE);  
                   scrollView5.setVisibility(ScrollView.GONE);  
                   scrollView6.setVisibility(ScrollView.GONE);  
                   
                   textView2.setTextColor(Color.parseColor("#000000"));
                   textView3.setTextColor(Color.parseColor("#000000"));
                   textView4.setTextColor(Color.parseColor("#FFFFFF"));
                   textView5.setTextColor(Color.parseColor("#000000"));
                   textView6.setTextColor(Color.parseColor("#000000"));
                                        
                   int[] colorsCRNHQ = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNHQ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNHQ);
                   CRNHQ.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNHQ.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabBypass.setElevation((float) 0);
                   linearLayout_tabBypass.setBackground(CRNHQ);

                   int[] colorsCRNKO = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNKO = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNKO);
                   CRNKO.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNKO.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabmemory.setElevation((float) 0);
                   linearLayout_tabmemory.setBackground(CRNKO);

                   int[] colorsCRNTO = { Color.parseColor("#253336"), Color.parseColor("#253336") }; android.graphics.drawable.GradientDrawable CRNTO = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNTO);
                   CRNTO.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNTO.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabesp.setElevation((float) 0);
                   linearLayout_tabesp.setBackground(CRNTO);

                   int[] colorsCRNVQ = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNVQ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNVQ);
                   CRNVQ.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNVQ.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabitems.setElevation((float) 0);
                   linearLayout_tabitems.setBackground(CRNVQ);

                   int[] colorsCRNPQ = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNPQ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNPQ);
                   CRNPQ.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNPQ.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabvehicles.setElevation((float) 0);
                   linearLayout_tabvehicles.setBackground(CRNPQ);
                }
                });

            linearLayout_tabitems.setOnClickListener(new View.OnClickListener(){
               @Override
                public void onClick(View view)
                {
                   scrollView5.setVisibility(ScrollView.VISIBLE);  
				   scrollView3.setVisibility(ScrollView.GONE);  
                   scrollView4.setVisibility(ScrollView.GONE);  
                   scrollView2.setVisibility(ScrollView.GONE);  
                   scrollView6.setVisibility(ScrollView.GONE);  
                   
                   textView2.setTextColor(Color.parseColor("#000000"));
                   textView3.setTextColor(Color.parseColor("#000000"));
                   textView4.setTextColor(Color.parseColor("#000000"));
                   textView5.setTextColor(Color.parseColor("#FFFFFF"));
                   textView6.setTextColor(Color.parseColor("#000000"));
 
                   int[] colorsCRNLV = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNLV = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNLV);
                   CRNLV.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNLV.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabBypass.setElevation((float) 0);
                   linearLayout_tabBypass.setBackground(CRNLV);

                   int[] colorsCRNOA = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNOA = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNOA);
                   CRNOA.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNOA.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabmemory.setElevation((float) 0);
                   linearLayout_tabmemory.setBackground(CRNOA);
                   
                   int[] colorsCRNRU = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNRU = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNRU);
                   CRNRU.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNRU.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabesp.setElevation((float) 0);
                   linearLayout_tabesp.setBackground(CRNRU);

                   int[] colorsCRNVW = { Color.parseColor("#253336"), Color.parseColor("#253336") }; android.graphics.drawable.GradientDrawable CRNVW = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNVW);
                   CRNVW.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNVW.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabitems.setElevation((float) 0);
                   linearLayout_tabitems.setBackground(CRNVW);

                   int[] colorsCRNSA = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNSA = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNSA);
                   CRNSA.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNSA.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabvehicles.setElevation((float) 0);
                   linearLayout_tabvehicles.setBackground(CRNSA);
                }
                });

            linearLayout_tabvehicles.setOnClickListener(new View.OnClickListener(){
               @Override
                public void onClick(View view)
                {
                   scrollView6.setVisibility(ScrollView.VISIBLE);  
				   scrollView3.setVisibility(ScrollView.GONE);  
                   scrollView4.setVisibility(ScrollView.GONE);  
                   scrollView5.setVisibility(ScrollView.GONE);  
                   scrollView2.setVisibility(ScrollView.GONE);  
                   
                   textView2.setTextColor(Color.parseColor("#000000"));
                   textView3.setTextColor(Color.parseColor("#000000"));
                   textView4.setTextColor(Color.parseColor("#000000"));
                   textView5.setTextColor(Color.parseColor("#000000"));
                   textView6.setTextColor(Color.parseColor("#FFFFFF"));
          
                   int[] colorsCRNDS = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNDS = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNDS);
                   CRNDS.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNDS.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabBypass.setElevation((float) 0);
                   linearLayout_tabBypass.setBackground(CRNDS);

                   int[] colorsCRNKL = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNKL = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNKL);
                   CRNKL.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNKL.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabmemory.setElevation((float) 0);
                   linearLayout_tabmemory.setBackground(CRNKL);

                   int[] colorsCRNCA = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNCA = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNCA);
                   CRNCA.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNCA.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabesp.setElevation((float) 0);
                   linearLayout_tabesp.setBackground(CRNCA);
                   
                   int[] colorsCRNBJ = { Color.parseColor("#FDC400"), Color.parseColor("#FDC400") }; android.graphics.drawable.GradientDrawable CRNBJ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNBJ);
                   CRNBJ.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNBJ.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabitems.setElevation((float) 0);
                   linearLayout_tabitems.setBackground(CRNBJ);
                   
                   int[] colorsCRNZB = { Color.parseColor("#253336"), Color.parseColor("#253336") }; android.graphics.drawable.GradientDrawable CRNZB = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNZB);
                   CRNZB.setCornerRadii(new float[]{(int)15,(int)15,(int)0,(int)0,(int)0,(int)0,(int)15,(int)15});
                   CRNZB.setStroke((int)0, Color.parseColor("#000000"));
                   linearLayout_tabvehicles.setElevation((float) 0);
                   linearLayout_tabvehicles.setBackground(CRNZB);
                }
                });

        

        int n11 = convertSizeToDp(100.0f);
        int n12 = convertSizeToDp(100.0f);
        final LinearLayout linearLayout_monster = new LinearLayout(this);
        linearLayout_monster.setLayoutParams(new LinearLayout.LayoutParams(n11, n12));
        linearLayout_monster.setGravity(Gravity.CENTER);
        linearLayout_page_Bypass.addView(linearLayout_monster);
        
        ImageView MonsterImg = new ImageView(this);
        byte[] arrby3 = Base64.decode(MonsterLogo(), 0);
        MonsterImg.setImageBitmap(BitmapFactory.decodeByteArray((byte[])arrby3, (int)0, (int)arrby3.length));
        linearLayout_monster.addView(MonsterImg);
        
        final LinearLayout linearLayout_monstertext = new LinearLayout(this);
        linearLayout_monstertext.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_monstertext.setGravity(Gravity.CENTER);
        this.textView7 = new TextView(this);
        textView7.setText("KING MOD SERVER");
        textView7.setGravity(Gravity.CENTER);
        textView7.setTextColor(Color.parseColor("#FFFFFF"));
        textView7.setTypeface(face1);
        textView7.setPadding(convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f),convertSizeToDp(5.0f));
        textView7.setTextSize(1, 20.0f);
        linearLayout_monstertext.addView(textView7);
        linearLayout_page_Bypass.addView(linearLayout_monstertext);
        
        
 
   
        this.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        
         
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(n, n2, this.type, 520, -3);
        layoutParams.x = 280;//150
        layoutParams.y = 100;//150
        layoutParams.gravity = 51;
        frameLayout.setOnTouchListener(new View.OnTouchListener(){
                float deltaX;
                float deltaY;
                float maxX;
                float maxY;
                float newX;
                float newY;
                float pressedX;
                float pressedY;
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    float f,f2,f3,f4;
                    int n = motionEvent.getActionMasked();
                    if (n == 0) {
                        this.deltaX = (float)layoutParams.x - motionEvent.getRawX();
                        this.deltaY = (float)layoutParams.y - motionEvent.getRawY();
                        this.pressedX = motionEvent.getRawX();
                        this.pressedY = motionEvent.getRawY();
                        return false;
                    }
                    if (n != 1) {
                        float f5;
                        float f6;
                        if (n != 2) {
                            return false;
                        }
                        this.newX = motionEvent.getRawX() + deltaX;
                        this.newY = motionEvent.getRawY() + deltaY;
                        this.maxX = point.x - linearLayout.getWidth();
                        this.maxY = f6 = (point.y - linearLayout.getHeight());
                        float f7 = newX;
                        if (!(f7 < 0.0f || f7 > maxX || (f5 = newY) < 0.0f || f5 > f6)) {
                            linearLayout.setAlpha(1.0f);
                        } else {
                            linearLayout.setAlpha(0.5f);
                        }
                        layoutParams.x = (int)newX;
                        layoutParams.y = (int)newY;
                        windowManager.updateViewLayout(linearLayout,layoutParams);
                        return false;
                    }
                    maxX = point.x - linearLayout.getWidth();
                    maxY = point.y - linearLayout.getHeight();
                    if (newX < 0.0f) {
                        newX = 0.0f;
                    }
                    if ((f = newX) > (f4 = maxX)) {
                        newX = f4;
                    }
                    if (newY < 0.0f) {
                        newY = 0.0f;
                    }
                    if ((f3 = newY) > (f2 = maxY)) {
                        newY = (int)f2;
                    }
                    layoutParams.x = (int)newX;
                    layoutParams.y = (int)newY;
                    windowManager.updateViewLayout(linearLayout,layoutParams);
                    linearLayout.setAlpha(1.0f);
                    return true;
                }
            });
            
         

       

        this.g_iconLayout = relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(convertSizeToDp(50.0f), convertSizeToDp(50.0f)));
        relativeLayout.addView((View)imageView);
        byte[] arrby = Base64.decode(Icon(),0); 
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(arrby,0,arrby.length));
        final WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2,type, 8, -3);
        layoutParams2.gravity = 51;
        layoutParams2.x = 0;
        layoutParams2.y = 0;
        relativeLayout.setVisibility(8);
        windowManager.addView(relativeLayout,layoutParams2);
        windowManager.addView(linearLayout,layoutParams);
        relativeLayout.setOnTouchListener(new View.OnTouchListener(){
                float deltaX;
                float deltaY;
                float newX;
                float newY;
                float pressedX;
                float pressedY;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int n = motionEvent.getActionMasked();
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                return false;
                            }
                            newX = motionEvent.getRawX() + deltaX;
                            newY = motionEvent.getRawY() + deltaY;
                            float f = screenWidth - view.getWidth();
                            float f2 = screenHeight - view.getHeight();
                            if (newX < 0.0f) {
                                newX = 0.0f;
                            }
                            if (newX > f) {
                                newX = f;
                            }
                            if (newY < 0.0f) {
                                newY = 0.0f;
                            }
                            if (newY > f2) {
                                newY = f2;
                            }
                            layoutParams2.x = (int)newX;
                            layoutParams2.y = (int)newY;
                            windowManager.updateViewLayout(relativeLayout,layoutParams2);
                            return false;
                        }
                        int n2 = (int)(motionEvent.getRawX() - pressedX);
                        int n3 = (int)(motionEvent.getRawY() - pressedY);
                        if (n2 == 0 && n3 == 0) {
                            linearLayout.setVisibility(0);
                            relativeLayout.setVisibility(8);
                        }
                        return true;
                    }
                    this.deltaX = layoutParams2.x - motionEvent.getRawX();
                    this.deltaY = layoutParams2.y - motionEvent.getRawY();
                    this.pressedX = motionEvent.getRawX();
                    this.pressedY = motionEvent.getRawY();
                    return false;
                }
            });
            
      /*  ColseImg.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    linearLayout.setVisibility(8);
                    relativeLayout.setVisibility(0);
                }
            });*/
        button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    linearLayout.setVisibility(8);
                    relativeLayout.setVisibility(0);
                }
            });
            
            
          


        DrawCanvas();
        
        
        
        
  AddButton1("NOT ACTIVATED", -1, -2, new View.OnClickListener(){
                public void onClick(View view) {

 Launcher Launcher = Launcher.this;
	 Launcher.BypassMain = !Launcher.BypassMain;
	 if (Launcher.this.BypassMain) {
	 GradientDrawable gradientDrawable2 = new GradientDrawable();
     gradientDrawable2.setColor(Color.parseColor("#0FFD01"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable2.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button3.setBackground((Drawable)gradientDrawable2);
	 Toast.makeText(Launcher.this, "Bypass Activating Plz Wait....!", 0).show();
	 button3.setText("ACTIVATED");
     int[] colorsCRNUBA = { Color.parseColor("#0DFE01"), Color.parseColor("#0DFE01") };
     android.graphics.drawable.GradientDrawable CRNUBA = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNUBA);
     CRNUBA.setCornerRadii(new float[]{(int)0,(int)0,(int)0,(int)0,(int)121,(int)121,(int)121,(int)121});
     CRNUBA.setStroke((int) 0, Color.parseColor("#000000"));
     linearLayout_bypass.setElevation((float) 6);
     linearLayout_bypass.setBackground(CRNUBA);
     textView1.setText("BYPASS ACTIVATED");
        
        
	 }else{
	 GradientDrawable gradientDrawable3 = new GradientDrawable();
     gradientDrawable3.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable3.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button3.setBackground((Drawable)gradientDrawable3); 
	 Toast.makeText(Launcher.this, "Bypass Deactivating Plz Wait....!", 0).show();
	 button3.setText("NOT ACTIVATED");
	 int[] colorsCRNUBN = { Color.parseColor("#FE3200"), Color.parseColor("#FE3200") };
     android.graphics.drawable.GradientDrawable CRNUBN = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNUBN);
     CRNUBN.setCornerRadii(new float[]{(int)0,(int)0,(int)0,(int)0,(int)121,(int)121,(int)121,(int)121});
     CRNUBN.setStroke((int) 0, Color.parseColor("#000000"));
     linearLayout_bypass.setElevation((float) 6);
     linearLayout_bypass.setBackground(CRNUBN);
     textView1.setText("BYPASS NOT YET ACTIVATED");
	}
         
                }
            });

   AddButton21("NOT ACTIVATED", -1, -2, new View.OnClickListener(){
                public void onClick(View view) {
 Launcher Launcher = Launcher.this;
	 Launcher.BypassBullet = !Launcher.BypassBullet;
	 if (Launcher.this.BypassBullet) {
	 GradientDrawable gradientDrawable2 = new GradientDrawable();
     gradientDrawable2.setColor(Color.parseColor("#0FFD01"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable2.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button1.setBackground((Drawable)gradientDrawable2);
	 Toast.makeText(Launcher.this, "Bypass Activating Plz Wait....!", 0).show();
	 button1.setText("ACTIVATED");
	 }else{
	 GradientDrawable gradientDrawable3 = new GradientDrawable();
     gradientDrawable3.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable3.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button1.setBackground((Drawable)gradientDrawable3);
	 
	 Toast.makeText(Launcher.this, "Bypass Deactivating Plz Wait....!", 0).show();
	 button1.setText("NOT ACTIVATED");
	}
                }
            });
   AddSwitch2("Bullet Track Functions", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			     if (isChecked){
			     linearLayout_page_Memoryy.setVisibility(View.VISIBLE);
			     }
			     else{
			     linearLayout_page_Memoryy.setVisibility(View.GONE);
			     }
				}
			});
        this.linearLayout_page_Memoryy = new LinearLayout(this);
        linearLayout_page_Memoryy.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_Memoryy.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Memoryy.setOrientation(1);
        linearLayout_page_Memoryy.setPadding(0,0,0,0);
        linearLayout_page_Memoryy.setVisibility(View.GONE);
        linearLayout_page_Memory.addView(linearLayout_page_Memoryy);
        
        
            
   
   AddText22( "BULLET TRACK CONTROL", 7.0f, Color.WHITE);
    
     AddButton20("BULLET TRACK OFF", -1, -2, new View.OnClickListener(){
     
     public void onClick(View view) {
     
     Launcher Launcher = Launcher.this;
	 Launcher.Onclick = !Launcher.Onclick;
	 if (Launcher.this.Onclick) {
	 BulletFloat();
	 GradientDrawable gradientDrawable = new GradientDrawable();
     gradientDrawable.setColor(Color.parseColor("#0FFD01"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button2.setBackground((Drawable)gradientDrawable);
 	 relativeLayout3.setVisibility(0);
	 Toast.makeText(Launcher.this, "Fight Mode Enabled!", 0).show();
	 button2.setText("BULLET TRACK ON");
	 }else{
	 GradientDrawable gradientDrawable1 = new GradientDrawable();
     gradientDrawable1.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable1.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button2.setBackground((Drawable)gradientDrawable1);
	 relativeLayout3.setVisibility(8);
	 Launcher.this.BulletMode = false;
	 Toast.makeText(Launcher.this, "Fight Mode Disabled!", 0).show();
	 button2.setText("BULLET TRACK OFF");
	}
                }
            });

       int BulletTrack =0;
        AddSeekbar1("Set Bullet Track Range", 0, 200, BulletTrack, "", "", new SeekBar.OnSeekBarChangeListener(){
                public void onProgressChanged(SeekBar seekBar, int BulletTrack, boolean isChecked) {
                    Size(4, BulletTrack);
                }
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });

AddSwitch1("Lock Floating Position", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
					lockBulletMode = isChecked;
					Boolean lockfight_mode = false;
				}
			});

 AddText3("Set Target Location ", 6.2f,  Color.WHITE);
    AddRadioButton(new String[]{"Head", "Chest", "Waist"}, 0, new RadioGroup.OnCheckedChangeListener(){
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    Target(i);
                }
            });
            
            AddText3("Aim By ", 6.2f,  Color.WHITE);
        AddRadioButton(new String[]{"Crosshair","Distance"}, 0, new RadioGroup.OnCheckedChangeListener(){
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    Target(i);
                }
            });
            
           AddText3("Aim When ", 6.2f,  Color.WHITE);
        AddRadioButton(new String[]{"ADS or Firing","ADS Only","Firing Only"}, 0, new RadioGroup.OnCheckedChangeListener(){
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    Target(i);
                }
            });
AddSwitch1("Aim Prediction (Crash XX)", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch1("Ignore Knocked", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddText23( "MEMORY HACKS", 7.0f, Color.WHITE);
AddSwitch2("Aimbot(100m)", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch2("AimLock", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch2("Less Recoil", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch2("Static Crosshair", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch2("Wide View", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch2("Headshot/magic", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch2("No fog", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
			
AddButton3("NOT ACTIVATED", -1, -2, new View.OnClickListener(){
                public void onClick(View view) {
     Launcher Launcher = Launcher.this;
	 Launcher.Esp = !Launcher.Esp;
	 if (Launcher.this.Esp) {
	 SettingValue(0,Esp);
	 GradientDrawable gradientDrawable2 = new GradientDrawable();
     gradientDrawable2.setColor(Color.parseColor("#0FFD01"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable2.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button4.setBackground((Drawable)gradientDrawable2);
	 Toast.makeText(Launcher.this, "Esp Activating Plz Wait....!", 0).show();
	 button4.setText("ACTIVATED");
	 }else{
	 SettingValue(0,Esp);
	 GradientDrawable gradientDrawable3 = new GradientDrawable();
     gradientDrawable3.setColor(Color.parseColor("#F44236"));//Color.argb((int)255, (int)63, (int)63, (int)63));
     gradientDrawable3.setStroke(2, Color.argb((int)255, (int)0, (int)0, (int)0));
     button4.setBackground((Drawable)gradientDrawable3);
	 
	 Toast.makeText(Launcher.this, "Esp Deactivating Plz Wait....!", 0).show();
	 button4.setText("NOT ACTIVATED");
	}
                }
            });
        final LinearLayout linearLayout_page_xyz = new LinearLayout(this);
        linearLayout_page_xyz.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_xyz.setBackgroundColor(Color.TRANSPARENT);
        linearLayout_page_xyz.setGravity(Gravity.CENTER);
        linearLayout_page_xyz.setPadding(0,0,0,0);
         this.textView9 = new TextView(this);
        textView9.setText("Activate when you are in lobby or in game!");
        textView9.setGravity(Gravity.CENTER);
        textView9.setTextColor(Color.parseColor("#FFFFFF"));
       // textView9.setTypeface(face1);
        textView9.setPadding(0,0,0,0);
        textView9.setTextSize(1, 10.0f);
        linearLayout_page_xyz.addView(textView9);
        linearLayout_page_Esp.addView(linearLayout_page_xyz);
        
        
         final LinearLayout linearLayout_page_Memoryzy = new LinearLayout(this);
        linearLayout_page_Memoryzy.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
       // linearLayout_page_Memoryy.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_Memoryzy.setOrientation(1);
        linearLayout_page_Memoryzy.setPadding(0,0,0,0);
        linearLayout_page_Memoryzy.setVisibility(View.GONE);
        linearLayout_page_Esp.addView(linearLayout_page_Memoryzy);
  

          int Fpsrender =80;
        AddSeekbar2("Adjust FPS", 0, 200,Fpsrender, "", "", new SeekBar.OnSeekBarChangeListener(){
                public void onProgressChanged(SeekBar seekBar, int Fpsrender, boolean isChecked) {
                    Size(4, Fpsrender);
                }
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }
               
            });
            
AddSwitch3("Show Count", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {				
					SettingValue(13,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Box", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {				
					SettingValue(1,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Line", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(2,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Distance", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(3,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Health", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(4,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Name", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(5,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Head Position", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(6,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("360° Alert", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(7,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
			
AddSwitch3("Enemy Skeleton", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(8,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
			
AddSwitch3("Grenade Warning", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(9,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddSwitch3("Enemy Weapon", false, new CompoundButton.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				SettingValue(10,isChecked);
					//UpdateConfiguration("ESP::TEAMID", isChecked ? 1 : 0);
				}
			});
AddText24( "ITEM CUSTOMISATION", 7.0f, Color.WHITE);
AddCheckbox1( "Enable Items",new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					SettingValue(11,isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
AddCheckbox1( "Images Only", new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("Icon",isChecked);//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
AddCheckbox1( "Images + Distance",  new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("Icon And Distance",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
AddCheckbox1( "No Images (Default)",new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("Default",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
/*
AddCheckbox300( "Fight Mode Button",  new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

				if (isChecked) {
						FightFloat();
						relativeLayout2.setVisibility(0);
					}else{
					    relativeLayout2.setVisibility(8);
					    //Launcher.this.UpdateConfiguration("FIGHT_MODE", 0);
					    Launcher.this.fightMode = false;
					}
				}
			});
AddCheckbox300("Lock Button Position [Fight]",  new CompoundButton.OnCheckedChangeListener() {
			  Boolean lockfight_mode = false;
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					lockFightMode = isChecked;
				}
			});*/

AddText24( "SPECIAL ITEMS", 7.0f, Color.WHITE);
final LinearLayout linearLayout_page_0 = new LinearLayout(this);
        linearLayout_page_0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_0.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_0.setOrientation(0);
        linearLayout_page_0.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_0);
        

        this.linearLayout_page_1 = new LinearLayout(this);
        linearLayout_page_1.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_1.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_1.setOrientation(1);
        linearLayout_page_1.setPadding(0,0,0,0);
        linearLayout_page_0.addView(linearLayout_page_1);
        
        AddCheckbox2( "Flare Gun", new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("Flare Gun",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
			
			AddCheckbox2( "Air Drop",new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("AirDrop",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
			
			AddCheckbox2( "Crate",  new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("Crate",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});


        this.linearLayout_page_2 = new LinearLayout(this);
        linearLayout_page_2.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_2.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_2.setOrientation(1);
        linearLayout_page_2.setPadding(0,0,0,0);
        linearLayout_page_0.addView(linearLayout_page_2);
        

AddCheckbox3( "Ghillie Suit",  new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("Ghillie Suit",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});

AddCheckbox3( "Drop Plane", new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					setValue("DropPlane",isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});

AddText24("Weapon's",7.0f, Color.WHITE);

final LinearLayout linearLayout_page_4 = new LinearLayout(this);
        linearLayout_page_4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_4.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_4.setOrientation(0);
        linearLayout_page_4.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_4);
        

        this.linearLayout_page_5 = new LinearLayout(this);
        linearLayout_page_5.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_5.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_5.setOrientation(1);
        linearLayout_page_5.setPadding(0,0,0,0);
        linearLayout_page_4.addView(linearLayout_page_5);

        AddCheckbox4("M16A4",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("M16A4",isChecked);
                }});
        AddCheckbox4("Mk14",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Mk14",isChecked);
                }});
        AddCheckbox4("DP28",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("DP28",isChecked);
                }});
        AddCheckbox4("G36C",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("G36C",isChecked);
                }});
        AddCheckbox4("Mk47 Mutant",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Mk47 Mutant",isChecked);
                }});
        AddCheckbox4("Groza",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Groza",isChecked);
                }});
        AddCheckbox4("M762",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("M762",isChecked);
                }});
                
            this.linearLayout_page_6 = new LinearLayout(this);
        linearLayout_page_6.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_6.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_6.setOrientation(1);
        linearLayout_page_6.setPadding(0,0,0,0);
        linearLayout_page_4.addView(linearLayout_page_6);

        AddCheckbox5("AKM",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("AKM",isChecked);
                }});
        AddCheckbox5("M249",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("M249",isChecked);
                }});
        AddCheckbox5("AUG",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("AUG",isChecked);
                }});
        AddCheckbox5("QBZ",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("QBZ",isChecked);
                }});
        AddCheckbox5("M416",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("M416",isChecked);
                }});
        AddCheckbox5("SCAR",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("SCAR",isChecked);
                }});
        AddCheckbox5("CrossBow",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("CrossBow",isChecked);
                }});
        AddText24( "SMG",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_7 = new LinearLayout(this);
        linearLayout_page_7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_7.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_7.setOrientation(0);
        linearLayout_page_7.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_7);
        

        this.linearLayout_page_8 = new LinearLayout(this);
        linearLayout_page_8.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_8.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_8.setOrientation(1);
        linearLayout_page_8.setPadding(0,0,0,0);
        linearLayout_page_7.addView(linearLayout_page_8);

        AddCheckbox6("PP19",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("PP19",isChecked);
                }});
        AddCheckbox6("UMP45",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("UMP45",isChecked);
                }});
        AddCheckbox6("TommyGun",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("TommyGun",isChecked);
                }});
        AddCheckbox6("Vector",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Vector",isChecked);
                }});
                
           this.linearLayout_page_9 = new LinearLayout(this);
        linearLayout_page_9.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_9.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_9.setOrientation(1);
        linearLayout_page_9.setPadding(0,0,0,0);
        linearLayout_page_7.addView(linearLayout_page_9);
        
        AddCheckbox7("MP5K",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("MP5K",isChecked);
                }});
        AddCheckbox7("Bizon",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bizon",isChecked);
                }});
        AddCheckbox7("Uzi",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Uzi",isChecked);
                }});
        AddCheckbox7("Skorpion",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Skorpion",isChecked);
                }});
        AddText24( "SNIPER",7.0f, Color.WHITE);
        final LinearLayout linearLayout_page_10 = new LinearLayout(this);
        linearLayout_page_10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_10.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_10.setOrientation(0);
        linearLayout_page_10.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_10);
        

        this.linearLayout_page_11 = new LinearLayout(this);
        linearLayout_page_11.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_11.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_11.setOrientation(1);
        linearLayout_page_11.setPadding(0,0,0,0);
        linearLayout_page_10.addView(linearLayout_page_11);

        AddCheckbox8("AWM",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("AWM",isChecked);
                }});
        AddCheckbox8("Kar98k",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Kar98k",isChecked);
                }});
        AddCheckbox8("SKS",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("SKS",isChecked);
                }});
        AddCheckbox8("SLR",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("SLR",isChecked);
                }});
        AddCheckbox8("QBU",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("QBU",isChecked);
                }});
                
                this.linearLayout_page_12 = new LinearLayout(this);
        linearLayout_page_12.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_12.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_12.setOrientation(1);
        linearLayout_page_12.setPadding(0,0,0,0);
        linearLayout_page_10.addView(linearLayout_page_12);


        AddCheckbox9("Mini14",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Mini14",isChecked);
                }});
        AddCheckbox9("VSS",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("VSS",isChecked);
                }});
        AddCheckbox9("Win94",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Win94",isChecked);
                }});
        AddCheckbox9("M24",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("M24",isChecked);
                }});
        AddText24( "Shotgun",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_13 = new LinearLayout(this);
        linearLayout_page_13.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_13.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_13.setOrientation(0);
        linearLayout_page_13.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_13);
        

        this.linearLayout_page_14 = new LinearLayout(this);
        linearLayout_page_14.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_14.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_14.setOrientation(1);
        linearLayout_page_14.setPadding(0,0,0,0);
        linearLayout_page_13.addView(linearLayout_page_14);


        
        AddCheckbox10("SawedOff",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("SawedOff",isChecked);
                }});
        AddCheckbox10("DBS",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("DBS",isChecked);
                }});
        AddCheckbox10("S686",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("S686",isChecked);
                }});
                
                 this.linearLayout_page_15 = new LinearLayout(this);
        linearLayout_page_15.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_15.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_15.setOrientation(1);
        linearLayout_page_15.setPadding(0,0,0,0);
        linearLayout_page_13.addView(linearLayout_page_15);


        AddCheckbox11("S12K",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("S12K",isChecked);
                }});
        AddCheckbox11("S1897",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("S1897",isChecked);
                }});
        AddCheckbox11("DP12",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("DP12",isChecked);
                }});
        AddText24( "PISTOLS",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_16 = new LinearLayout(this);
        linearLayout_page_16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_16.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_16.setOrientation(0);
        linearLayout_page_16.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_16);
        

        this.linearLayout_page_17 = new LinearLayout(this);
        linearLayout_page_17.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_17.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_17.setOrientation(1);
        linearLayout_page_17.setPadding(0,0,0,0);
        linearLayout_page_16.addView(linearLayout_page_17);

        
        AddCheckbox12("P18C",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("P18C",isChecked);
                }});
        AddCheckbox12("Desert Eagle",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Desert Eagle",isChecked);
                }});
        AddCheckbox12("R45",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("R45",isChecked);
                }});
                
           this.linearLayout_page_18 = new LinearLayout(this);
        linearLayout_page_18.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_18.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_18.setOrientation(1);
        linearLayout_page_18.setPadding(0,0,0,0);
        linearLayout_page_16.addView(linearLayout_page_18);     
                
        AddCheckbox13("P1911",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("P1911",isChecked);
                }});
        AddCheckbox13("Pistol",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Pistol",isChecked);
                }});
        AddText24( "AMMO",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_19 = new LinearLayout(this);
        linearLayout_page_19.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_19.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_19.setOrientation(0);
        linearLayout_page_19.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_19);
        

        this.linearLayout_page_20 = new LinearLayout(this);
        linearLayout_page_20.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_20.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_20.setOrientation(1);
        linearLayout_page_20.setPadding(0,0,0,0);
        linearLayout_page_19.addView(linearLayout_page_20);

        AddCheckbox14("7.62",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("7.62",isChecked);
                }});
        AddCheckbox14("45ACP",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("45ACP",isChecked);
                }});
        AddCheckbox14("5.56",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("5.56",isChecked);
                }});
        AddCheckbox14("9mm",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("9mm",isChecked);
                }});
                
                this.linearLayout_page_21 = new LinearLayout(this);
        linearLayout_page_21.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_21.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_21.setOrientation(1);
        linearLayout_page_21.setPadding(0,0,0,0);
        linearLayout_page_19.addView(linearLayout_page_21);


        AddCheckbox15("300Magnum",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("300Magnum",isChecked);
                }});
        AddCheckbox15("12 Guage",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("12 Guage",isChecked);
                }});
        AddCheckbox15("Arrow",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Arrow",isChecked);
                }});
        AddText24( "SCOPE",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_22 = new LinearLayout(this);
        linearLayout_page_22.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_22.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_22.setOrientation(0);
        linearLayout_page_22.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_22);
        

        this.linearLayout_page_23 = new LinearLayout(this);
        linearLayout_page_23.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_23.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_23.setOrientation(1);
        linearLayout_page_23.setPadding(0,0,0,0);
        linearLayout_page_22.addView(linearLayout_page_23);


        
        AddCheckbox16("2x",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("2x",isChecked);
                }});
        AddCheckbox16("3x",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("3x",isChecked);
                }});
        AddCheckbox16("4x",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("4x",isChecked);
                }});
        AddCheckbox16("6x",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("6x",isChecked);
                }});
                
                this.linearLayout_page_24 = new LinearLayout(this);
        linearLayout_page_24.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_24.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_24.setOrientation(1);
        linearLayout_page_24.setPadding(0,0,0,0);
        linearLayout_page_22.addView(linearLayout_page_24);


        AddCheckbox17("8x",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("8x",isChecked);
                }});
        AddCheckbox17("Red Dot",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Red Dot",isChecked);
                }});
        AddCheckbox17("Hollow",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Hollow",isChecked);
                }});
        AddCheckbox17("Canted",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Canted",isChecked);
                }});
        AddText24( "ARMOUR",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_25 = new LinearLayout(this);
        linearLayout_page_25.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_25.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_25.setOrientation(0);
        linearLayout_page_25.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_25);
        

        this.linearLayout_page_26 = new LinearLayout(this);
        linearLayout_page_26.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_26.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_26.setOrientation(1);
        linearLayout_page_26.setPadding(0,0,0,0);
        linearLayout_page_25.addView(linearLayout_page_26);


        AddCheckbox18("Vest L 1",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Vest L 1",isChecked);
                }});
        AddCheckbox18("Vest L 2",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Vest L 2",isChecked);
                }});
        AddCheckbox18("Vest L 3",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Vest L 3",isChecked);
                }});
        AddCheckbox18("Helmet L 1",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Helmet L 1",isChecked);
                }});
        AddCheckbox18("Helmet L 2",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Helmet L 2",isChecked);
                }});
                
                this.linearLayout_page_27 = new LinearLayout(this);
        linearLayout_page_27.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_27.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_27.setOrientation(1);
        linearLayout_page_27.setPadding(0,0,0,0);
        linearLayout_page_25.addView(linearLayout_page_27);


        AddCheckbox19("Helmet L 3",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Helmet L 3",isChecked);
                }});
        AddCheckbox19("Bag L 1",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bag L 1",isChecked);
                }});
        AddCheckbox19("Bag L 2",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bag L 2",isChecked);
                }});
        AddCheckbox19("Bag L 3",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bag L 3",isChecked);
                }});
        AddText24( "HEALTH",7.0f, Color.WHITE);
        
        final LinearLayout linearLayout_page_28 = new LinearLayout(this);
        linearLayout_page_28.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_28.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_28.setOrientation(0);
        linearLayout_page_28.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_28);
        

        this.linearLayout_page_29 = new LinearLayout(this);
        linearLayout_page_29.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_29.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_29.setOrientation(1);
        linearLayout_page_29.setPadding(0,0,0,0);
        linearLayout_page_28.addView(linearLayout_page_29);


        AddCheckbox20("Medkit",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Medkit",isChecked);
                }});
        AddCheckbox20("FirstAidKit",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("FirstAidKit",isChecked);
                }});
        AddCheckbox20("Bandage",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bandage",isChecked);
                }});
                
                this.linearLayout_page_30 = new LinearLayout(this);
        linearLayout_page_30.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_30.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_30.setOrientation(1);
        linearLayout_page_30.setPadding(0,0,0,0);
        linearLayout_page_28.addView(linearLayout_page_30);

        AddCheckbox21("Energy Drink",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Energy Drink",isChecked);
                }});
        AddCheckbox21("Adrenaline",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Adrenaline",isChecked);
                }});
        AddCheckbox21("PainKiller",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("PainKiller",isChecked);
                }});
        AddText24( "Guns Comments",7.0f, Color.WHITE);
        
         final LinearLayout linearLayout_page_31 = new LinearLayout(this);
        linearLayout_page_31.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_31.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_31.setOrientation(0);
        linearLayout_page_31.setPadding(0,0,0,0);
        linearLayout_page_Items.addView(linearLayout_page_31);
        

        this.linearLayout_page_32 = new LinearLayout(this);
        linearLayout_page_32.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_32.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_32.setOrientation(1);
        linearLayout_page_32.setPadding(0,0,0,0);
        linearLayout_page_31.addView(linearLayout_page_32);


        AddCheckbox22("Flash Hider Ar",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Flash Hider Ar",isChecked);
                }});
        AddCheckbox22("Ar Compensator",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ar Compensator",isChecked);
                }});
        AddCheckbox22("Sup Sniper",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Sup Sniper",isChecked);
                }});
        AddCheckbox22("Tactical Stock",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Tactical Stock",isChecked);
                }});
        AddCheckbox22("Duckbill",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Duckbill",isChecked);
                }});
        AddCheckbox22("Suppressor SMG",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Suppressor SMG",isChecked);
                }});
        AddCheckbox22("Half Grip",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Half Grip",isChecked);
                }});
        AddCheckbox22("Choke",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Choke",isChecked);
                }});
        AddCheckbox22("Stock Micro UZI",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Stock Micro UZI",isChecked);
                }});
        AddCheckbox22("Flash Hider SMGr",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Flash Hider SMGr",isChecked);
                }});
        AddCheckbox22("Suppressor Ar",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Suppressor Ar",isChecked);
                }});
        AddCheckbox22("Ex.Qd.Sniper",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ex.Qd.Sniper",isChecked);
                }});
        AddCheckbox22("Qd.SMG",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Qd.SMG",isChecked);
                }});
        AddCheckbox22("Ex.SMG",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ex.SMG",isChecked);
                }});
        AddCheckbox22("Qd.Sniper",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Qd.Sniper",isChecked);
                }});
                
          this.linearLayout_page_33 = new LinearLayout(this);
        linearLayout_page_33.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_33.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_33.setOrientation(1);
        linearLayout_page_33.setPadding(0,0,0,0);
        linearLayout_page_31.addView(linearLayout_page_33);

        AddCheckbox23("Ex.Sniper",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ex.Sniper",isChecked);
                }});
        AddCheckbox23("Ex.Ar",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ex.Ar",isChecked);
                }});
        AddCheckbox23("Ex.Qd.Ar",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ex.Qd.Ar",isChecked);
                }});
        AddCheckbox23("Qd.Ar",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Qd.Ar",isChecked);
                }});
        AddCheckbox23("Ex.Qd.SMG",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Ex.Qd.SMG",isChecked);
                }});
        AddCheckbox23("Quiver CrossBow",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Quiver CrossBow",isChecked);
                }});
        AddCheckbox23("Bullet Loop",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bullet Loop",isChecked);
                }});
        AddCheckbox23("Thumb Grip",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Thumb Grip",isChecked);
                }});
        AddCheckbox23("Laser Sight",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Laser Sight",isChecked);
                }});
        AddCheckbox23("Angled Grip",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Angled Grip",isChecked);
                }});
        AddCheckbox23("Light Grip",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Light Grip",isChecked);
                }});
        AddCheckbox23("Vertical Grip",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Vertical Grip",isChecked);
                }});
        AddCheckbox23("Gas Can",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Gas Can",isChecked);
                }});
        AddCheckbox23("Compensator SMG",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Compensator SMG",isChecked);
                }});
        AddCheckbox23("SniperCompensator",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("SniperCompensator",isChecked);
                }});
                
                AddCheckbox147( "Enable Vehicles",new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
					SettingValue(12,isChecked);
					//UpdateConfiguration("SETTING_HIDE_FPS", Integer.valueOf(isChecked ? 1 : 0));
				}
			});
           AddText25( "VEHICLES",7.0f, Color.WHITE);
           
         
        final LinearLayout linearLayout_page_34 = new LinearLayout(this);
        linearLayout_page_34.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout_page_34.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_34.setOrientation(0);
        linearLayout_page_34.setPadding(0,0,0,0);
        linearLayout_page_Vehicles.addView(linearLayout_page_34);
        

        this.linearLayout_page_35 = new LinearLayout(this);
        linearLayout_page_35.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_35.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_35.setOrientation(1);
        linearLayout_page_35.setPadding(0,0,0,0);
        linearLayout_page_34.addView(linearLayout_page_35);

        AddCheckbox24("Buggy",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Buggy",isChecked);
                }});
        AddCheckbox24("UAZ",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("UAZ",isChecked);
                }});
        AddCheckbox24("Trike",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Trike",isChecked);
                }});
        AddCheckbox24("Dasia",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Dasia",isChecked);
                }});
        AddCheckbox24("Jet",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Jet",isChecked);
                }});
        AddCheckbox24("Boat",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Boat",isChecked);
                }});
        AddCheckbox24("Bus",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bus",isChecked);
                }});
        AddCheckbox24("Mirado",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Mirado",isChecked);
                }});
        AddCheckbox24("Scooter",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Scooter",isChecked);
                }});
                
                
               this.linearLayout_page_36 = new LinearLayout(this);
        linearLayout_page_36.setLayoutParams(new LinearLayout.LayoutParams(convertSizeToDp(10.0f), -2,1));
        linearLayout_page_36.setBackgroundColor(Color.parseColor("#253336"));
        linearLayout_page_36.setOrientation(1);
        linearLayout_page_36.setPadding(0,0,0,0);
        linearLayout_page_34.addView(linearLayout_page_36); 
        
        AddCheckbox25("Rony",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Rony",isChecked);
                }});
        AddCheckbox25("Snowbike",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Snowbike",isChecked);
                }});
        AddCheckbox25("Snowmobile",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Snowmobile",isChecked);
                }});
        AddCheckbox25("Tempo",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Tempo",isChecked);
                }});
        AddCheckbox25("Truck",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Truck",isChecked);
                }});
        AddCheckbox25("LadaNiva",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("LadaNiva",isChecked);
                }});
        AddCheckbox25("BRDM",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("BRDM",isChecked);
                }});
        AddCheckbox25("Bigfoot",new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    setValue("Bigfoot",isChecked);
                }});
         }
    private void DrawCanvas() {

        ESPView overlayView = new ESPView(this);   int LAYOUT_FLAG;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY;
        }
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT, 0, getNavigationBarHeight(),
            LAYOUT_FLAG,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
            | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE | WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN | WindowManager.LayoutParams.FLAG_FULLSCREEN,
            PixelFormat.RGBA_8888);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            params.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

        params.gravity = Gravity.TOP | Gravity.START;        //Initially view will be added to top-left corner
        params.x = 0;
        params.y = 0;
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        windowManager.addView(overlayView, params);
    }
    private int getNavigationBarHeight() {
        boolean hasMenuKey = ViewConfiguration.get(this).hasPermanentMenuKey();
        int resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0 && !hasMenuKey) {
            return getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }
    
    
public void onDestroy() {
        this.windowManager.removeViewImmediate((View)this.espLayout);
        this.windowManager.removeViewImmediate((View)this.g_iconLayout);
        this.windowManager.removeViewImmediate((View)this.g_mainLayout);
        super.onDestroy();
    }

    private void  setValue(String key,boolean b) {
        SharedPreferences sp=this.getSharedPreferences("espValue",Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= sp.edit();
        ed.putBoolean(key,b);
        ed.apply();

    }
	public static void delete(String path){
        File dir = new File(path);
        if (dir.isDirectory())
        {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++)
            {
                new File(dir, children[i]).delete();
            }
        }
    }
    public int onStartCommand(Intent intent, int n, int n2) {
        return 2;
    }
    public static interface OnListChoosedListener {
        public void onChoosed(int var1);
    }
    public native void SettingValue(int setting_code,boolean value);
    public native void Hack(int setting_code,boolean jboolean1);
    public native void Protection(int setting_code,boolean jboolean1);
    static native void Switch(int i, boolean k);
    public static native void Size(int num, float size);
	public native void Range(int range);  
	public native void Target(int i);
    public native void AimBy(int i);
    public native void AimWhen(int i);
    public static native void Switch2(int num, boolean flag);
    public static native void Switch3(int num);
    private native String Icon();
    private native String IconClose();
    public static native void DrawOn(ESPView espView, Canvas canvas);
    

    public void onTaskRemoved(Intent intent) {
        stopSelf();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onTaskRemoved(intent);
   }
}
