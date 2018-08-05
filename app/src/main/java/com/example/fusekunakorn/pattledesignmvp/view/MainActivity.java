package com.example.fusekunakorn.pattledesignmvp.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.fusekunakorn.pattledesignmvp.presenter.PresenterInterface;
import com.example.fusekunakorn.pattledesignmvp.R;

//TODO This class is View
public class MainActivity extends AppCompatActivity implements ViewInterface {
    // link  presenter
    private PresenterInterface presenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();

        Toast.makeText(this,"Run Main URI "+data,Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Run Main action "+action,Toast.LENGTH_LONG).show();


    }

    @Override
    public void ViewInterfaceMethod() {

    }
}
