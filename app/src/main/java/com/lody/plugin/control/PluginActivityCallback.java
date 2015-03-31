package com.lody.plugin.control;

import android.os.Bundle;
import android.view.KeyEvent;

/**
 * Created by lody  on 2015/3/26.
 */
public interface PluginActivityCallback {

    void callOnCreate(Bundle saveInstance);

    void callOnStart();

    void callOnResume();

    void callOnDestroy();

    void callOnStop();

    void callOnRestart();

    void callOnSaveInstanceState(Bundle outState);

    void callOnRestoreInstanceState(Bundle savedInstanceState);

    void callOnPause();

    void callOnBackPressed();

    boolean callOnKeyDown(int keyCode, KeyEvent event);
}
