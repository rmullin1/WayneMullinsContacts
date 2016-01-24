package cs6242.westga.edu.waynemullinscontacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    public void btnSave_onClick(View v) {
        TextView txtName = (TextView)findViewById(R.id.txtName);
        TextView txtEmail= (TextView)findViewById(R.id.txtEmail);
        TextView txtPhone = (TextView)findViewById(R.id.txtPhone);
        RadioButton optHome = (RadioButton)findViewById(R.id.optHome);

        TextView tvName = (TextView)findViewById(R.id.tvName);
        tvName.setText(txtName.getText());
        TextView tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvEmail.setText(txtEmail.getText());
        TextView tvPhone= (TextView)findViewById(R.id.tvPhone);
        CharSequence phoneText;
        if (optHome.isChecked())
            phoneText = txtPhone.getText() + " (H)";
        else
            phoneText = txtPhone.getText() + " (C)";
        tvPhone.setText(phoneText);
    }
}
