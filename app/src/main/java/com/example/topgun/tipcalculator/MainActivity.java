package com.example.topgun.tipcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_onCreate), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_onStart), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_onResume), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_onPause), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_onStop), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.toast_onDestroy), Toast.LENGTH_SHORT).show();
    }




        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void calcTip(View view){
        //Declare vars for widgets in activity
        //Text Views
        TextView tv_tip = (TextView) findViewById(R.id.tv_tip);
        TextView tv_total = (TextView) findViewById(R.id.tv_totalAmt);

        //TextField (EditText)
        EditText tf_subTotal = (EditText) findViewById(R.id.tf_subTotal);

        //Spinner
        Spinner spin_tipAmt = (Spinner) findViewById((R.id.spinner));
        double tip_percent = (Double.parseDouble(String.valueOf(spin_tipAmt.getSelectedItem()).replaceAll("[-+.%^:,]","")) / 100);

        //Subtotal
        double subtotal = Double.parseDouble(tf_subTotal.getText().toString());

        //Determine tip amount
        double tip = subtotal * tip_percent;

        //Determine total
        double total = tip + subtotal;


        //Assign values to TextViews
        tv_tip.setText(String.valueOf(tip));

        tv_total.setText(String.valueOf(total));

                //Log.d(TAG, "" + spinVal);
    }
}
