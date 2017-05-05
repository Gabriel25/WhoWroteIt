package com.android1.gabriel.whowroteit;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText IngresoLibro;
    private TextView autor,titulo;
    private Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IngresoLibro = (EditText) findViewById(R.id.bookInput);
        titulo = (TextView) findViewById(R.id.titleText);
        autor = (TextView) findViewById(R.id.authorText);
        buscar = (Button) findViewById(R.id.BTNbuscar);
    }

    public void searchBooks(){
        String queryString = IngresoLibro.getText().toString();
        new FetchBook(titulo, autor).execute((Runnable) IngresoLibro);
            }

}
