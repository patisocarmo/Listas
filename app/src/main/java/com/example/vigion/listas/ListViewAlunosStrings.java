package com.example.vigion.listas;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListViewAlunosStrings extends ActionBarActivity {

    String[] nomeAlunos = {"Bruno Coimbra", "Catalin Critste", "David Sousa", "João Ventura", "Jorge Silva", "Marcelo Rachado", "Mariana Costa", "Patricia Carmo", "Ricardo Gomes", "Ruben Severino", "Rui Ricardo", "Samuel Santos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obter o controlo da ListView Gráfica
        ListView listViewTurma = (ListView)findViewById(R.id.listViewTurma);

        //ArrayAdapter para tratar os dados
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomeAlunos);

        //Adapter os dados preparados para listView
        listViewTurma.setAdapter(adapter);

        //criar um listener para cada item
    /*    listViewTurma.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
                String str = "Clicou em" + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(ListViewAlunosStrings.this, str, Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
