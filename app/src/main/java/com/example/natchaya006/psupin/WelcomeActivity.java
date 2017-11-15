package com.example.natchaya006.psupin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class WelcomeActivity extends AppCompatActivity {
    ArrayList<PinObject> pinObjects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        createPinList();
    }
    private void createPinList(){
        PinObject pinObject = new PinObject(1,"pin","pin","pim","pin");
        PinObject pinObject2 = new PinObject(2,"pin","pin","pim","pin");
        PinObject pinObject3 = new PinObject(3,"pin","pin","pim","pin");
        PinObject pinObject4 = new PinObject(4,"pin","pin","pim","pin");
        PinObject pinObject5 = new PinObject(1,"pin","pin","pim","pin");
        pinObjects.add(pinObject);
        pinObjects.add(pinObject2);
        pinObjects.add(pinObject3);
        pinObjects.add(pinObject4);
        pinObjects.add(pinObject5);
        PinAdapter adapter = new PinAdapter(this,pinObjects);
        ListView listView = (ListView) findViewById(R.id.listviewpins);
        listView.setAdapter(adapter);

    }
    // Create a message handling object as an anonymous class.
}
