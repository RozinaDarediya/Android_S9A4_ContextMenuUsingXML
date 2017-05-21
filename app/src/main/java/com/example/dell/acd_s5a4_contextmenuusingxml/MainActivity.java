package com.example.dell.acd_s5a4_contextmenuusingxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *          created context menu having three options through xml
 *          and show toast on selection of particular option.
 *          User has to click on button to see the context menu.
 */

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        registerForContextMenu(button);
    }

    //onCreateContextMenu() -> inflates the menu file with the activity.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
    }

    //onContextItemSelected() -> will display the toast msg according the selection of menu
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action1:
                Toast.makeText(this, " You have selected Action1 ", Toast.LENGTH_LONG).show();
                return true;
            case  R.id.action2:
                Toast.makeText(this, " You have selected Action2 ", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action3:
                Toast.makeText(this, " You have selected Action3 ", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
