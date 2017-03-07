package saiyan.androidlifecyclestudy;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static String parseNull(Object obj){
        return obj == null?"null"  : "Object";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Log.e("ActivityCycle", "onCreate: bundle="+parseNull(savedInstanceState));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new HomeFragment())
                    .commit();
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("ActivityCycle", "onConfigurationChanged");
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.e("ActivityCycle", "onCreateView");
        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        Log.e("ActivityCycle", "onPostCreate: bundle="+parseNull(savedInstanceState));
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        Log.e("ActivityCycle", "onResume");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.e("ActivityCycle", "onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onResumeFragments() {
        Log.e("ActivityCycle", "onResumeFragments");
        super.onResumeFragments();
    }

    @Override
    protected void onStop() {
        Log.e("ActivityCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.e("ActivityCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.e("ActivityCycle", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.e("ActivityCycle", "onSaveInstanceState: outState="+parseNull(outState));
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.e("ActivityCycle", "onAttachFragment");
        super.onAttachFragment(fragment);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.e("ActivityCycle", "onRestoreInstanceState: bundle="+parseNull(savedInstanceState));
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        Log.e("ActivityCycle", "onRestart");
        super.onRestart();
    }

    @Override
    public void onAttachedToWindow() {
        Log.e("ActivityCycle", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        Log.e("ActivityCycle", "onDetachedFromWindow");
        super.onDetachedFromWindow();
    }

    @Override
    protected void onStart() {
        Log.e("ActivityCycle", "onStart");
        super.onStart();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Log.e("ActivityCycle", "onWindowFocusChanged");
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    public void onLowMemory() {
        Log.e("ActivityCycle", "onLowMemory");
        super.onLowMemory();
    }


}
