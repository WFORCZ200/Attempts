package SARainbowApp.com;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //LOGIN: SETTING THE BOXES
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //
        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.txtInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Info.setText("No of attempts remaining: 5");


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //TAKES YOU TO THE NEXT PAGE WHEN THE USERNAME AND PASSWORD ARE CORRECT
                startActivity(intent);
                /*
                validate(Name.getText().toString(),Password.getText().toString());
                */
            }
        });


        };









/*
    //Function which validates the username and password (REACTS ON ONCLICK LISTENER)
    private void validate(String Name,String Password){
    if((Name == "Admin") && (Password == "Rainbow")){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        //TAKES YOU TO THE NEXT PAGE WHEN THE USERNAME AND PASSWORD ARE CORRECT
        startActivity(intent);

    }else{
        //DISPLAY NUMBER OF WRONG ATTEMPTS OR...
        counter--;
        Info.setText("No of attempts remaining: " + String.valueOf(counter));

        if(counter==0){
            //OR SET THE BUTTON TO UNABLE
            Login.setEnabled(false);
        }
    }

    }
*/
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
}
