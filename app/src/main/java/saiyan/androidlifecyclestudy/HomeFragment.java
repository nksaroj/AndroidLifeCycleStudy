package saiyan.androidlifecyclestudy;


import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static saiyan.androidlifecyclestudy.MainActivity.parseNull;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private int count = 0;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("FragmentCycle===>", "onCreateView: bundle="+parseNull(savedInstanceState));
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.textViewHello);
        textView.setText(String.valueOf(++count));
        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("FragmentCycle===>", "onCreate: bundle="+parseNull(savedInstanceState));
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.d("FragmentCycle===>", "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d("FragmentCycle===>", "onViewCreated: bundle="+parseNull(savedInstanceState));
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d("FragmentCycle===>", "onActivityCreated: bundle="+parseNull(savedInstanceState));
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        Log.d("FragmentCycle===>", "onViewStateRestored: bundle="+parseNull(savedInstanceState));
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("FragmentCycle===>", "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("FragmentCycle===>", "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("FragmentCycle===>", "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("FragmentCycle===>", "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("FragmentCycle===>", "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        Log.d("FragmentCycle===>", "onInflate: bundle="+parseNull(savedInstanceState));
        super.onInflate(context, attrs, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.d("FragmentCycle===>", "onSaveInstanceState: outState="+parseNull(outState));
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d("FragmentCycle===>", "onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onDestroy() {
        Log.d("FragmentCycle===>", "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("FragmentCycle===>", "onDetach");
        super.onDetach();
    }

    @Override
    public void setInitialSavedState(SavedState state) {
        Log.d("FragmentCycle===>", "setInitialSavedState");
        super.setInitialSavedState(state);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        Log.d("FragmentCycle===>", "onHiddenChanged");
        super.onHiddenChanged(hidden);
    }

    @Override
    public void onLowMemory() {
        Log.d("FragmentCycle===>", "onLowMemory");
        super.onLowMemory();
    }

}
