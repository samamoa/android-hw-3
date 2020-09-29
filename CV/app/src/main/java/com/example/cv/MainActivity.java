package com.example.cv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.editTextTextPersonName);
        final EditText age = findViewById(R.id.editTextNumber);
        final EditText job = findViewById(R.id.editTextTextPersonName2);
        final EditText phone = findViewById(R.id.editTextPhone);
        final EditText email = findViewById(R.id.editTextTextEmailAddress);
        Button next = findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cv = new Intent(MainActivity.this, MainActivity2.class);
                cv.putExtra("info", name.getText().toString());
                cv.putExtra("in", age.getText().toString());
                cv.putExtra("inf", job.getText().toString());
                cv.putExtra("i", phone.getText().toString());
                cv.putExtra("fo", email.getText().toString());
                startActivity(cv);
            }
        });
        dia = findViewById(R.id.dia);
        dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog() {
ExampleDialog dialog=new ExampleDialog();
dialog.show(getSupportFragmentManager(),"dialog");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item1 selected", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item2:
                Toast.makeText(this, "Item2 selected", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item3:
                Toast.makeText(this, "Item3 selected", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.subitem1:
                Toast.makeText(this, "sub Item1 selected", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.subitem2:
                Toast.makeText(this, "sub Item3 selected", Toast.LENGTH_SHORT).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }//main close

    public static class ExampleDialog extends AppCompatDialogFragment {
    @Override
        public Dialog onCreateDialog (Bundle savedInstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
    builder.setTitle("information")
            .setMessage("This is dialog")
    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    });
    return builder.create();
    }
    }
}