package com.example.fusekunakorn.pattledesignmvp.presenter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.example.fusekunakorn.pattledesignmvp.view.MainActivity;
import com.example.fusekunakorn.pattledesignmvp.view.SecondActivity;

import java.util.List;

public class SchemaActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        Toast.makeText(this,"Run SchemaActivity",Toast.LENGTH_LONG).show();
        finish();

//        adb shell am start -a android.intent.action.VIEW -d "example://gizmos" com.example.fusekunakorn
       // adb shell am start -a android.intent.action.VIEW -d "yay://call" com.example


//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//
//        Uri uri = getIntent().getData();
//
//        // For app://play?id=10&name=SleepingForLess&os=android
//        ///adb shell am start -a android.intent.action.VIEW -d "example://gizmos" com.myapp
//        Log.i("Check", "Data : " + uri);
//
//        for(String key : uri.getQueryParameterNames()) {
//            Log.i("Check", "Key : " + key);
//        }
//
//        String id = uri.getQueryParameter("id");
//        String name = uri.getQueryParameter("name");
//        String os = uri.getQueryParameter("os");
//
//        Log.i("Check", "ID : " + id);
//        Log.i("Check", "Name : " + name);
//        Log.i("Check", "OS : " + os);
//
//
//        Log.i("Check", "Parameter : " + uri.getQuery() );
//        Log.i("Check", "Authority : " + uri.getAuthority());
//        Log.i("Check", "Scheme : " + uri.getScheme());


        // For app://play?name=Nexus4&version=JellyBean&version=KitKat&version=Lollipop

//        List<String> listVersion = uri.getQueryParameters("ver");
//        for(String version : listVersion) {
//            Log.i("Check", "Version : " + version);
//        }
//
//        finish();
    }



}
