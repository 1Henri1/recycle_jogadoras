package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Jogadoras> listaJogadoras;
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.listaJogadoras);
        listaJogadoras = new ArrayList<>();

        listaJogadoras.add(
                new Jogadoras("Adriana",
                        "1° Lugar na Copa Libertadores Feminina, 1° Lugar na Copa America Feminina, 4° Lugar no Campeonato Brasileiro Feminino, 1° Lugar na Supercopa do Brasil Feminina",
                        "Adriana Leal joga na posição de Atacante.",
                        "Orlando Pride–EUA",
                        R.drawable.adriana));
        listaJogadoras.add(
        new Jogadoras("Ary Borges",
                "1° Lugar na Copa Libertadores Feminina, " +
                        "1° Lugar na Copa America Feminina, " +
                        "1° Lugar no Campeonato Brasileiro Feminino A2, " +
                        "1° Lugar no Sudamericano Sub-20 Feminino",
                "Ela joga muinto.",
                "Louisville City–EUA",
                R.drawable.aryborges));

        listaJogadoras.add(
                new Jogadoras("Ana Vitória",
                        "1° Lugar na Copa Libertadores Feminina, " +
                                "3° Lugar no Nacional Feminino, " +
                                "2° Lugar na Supertaça Feminina, " +
                                "1° Lugar na Taça de portugal de futebol feminino, " +
                                "3° Taça da Liga Feminina, " +
                                "1° II Divisao Nacional Feminino, " +
                                "1° Lugar Campeonato Brasileiro Feminino, " +
                                "1° Lugar na Sub-20 Feminino",
                        "Ela joga muinto.",
                        "PSG",
                        R.drawable.anavitoria));
        listaJogadoras.add(
        new Jogadoras("Kerolin",
                "1° Lugar na Copa Libertadores Feminina, " +
                        "1° Lugar na Copa América Feminina, " +
                        "1° Lugar NWSL Challenge Cup, " +
                        "1° Lugar na Sub-20 Feminino",
                "Ela joga muinto.",
                "North Carolina–EUA",
                R.drawable.kerolin));
        listaJogadoras.add(
        new Jogadoras("Angelina ",
                "1° Lugar na Copa Libertadores Feminina, " +
                        "1° Lugar na Copa América Feminina, " +
                        "1° Lugar no Campeonato Brasileiro Feminino, " +
                        "1° Lugar na Sub-20 Feminino",
                "Ela joga muinto.",
                "OL Reign-EUA",
                R.drawable.angelina));

        listaJogadoras.add(
        new Jogadoras("Andressa Alves ",
                "1° Lugar na Copa Libertadores Feminina, " +
                        "1° Lugar Jogos Pan-Americanos de Futebol Feminino, " +
                        "2° Lugar na Copa Américana Feminina",
                "Ela joga muinto.",
                "Houston Dash-EUA",
                R.drawable.andressa));
        listaJogadoras.add(
        new Jogadoras("Bia Zaneratto ",
                "1° Lugar na Copa Libertadores Feminina, " +
                        "1° Lugar Jogos Pan-Americanos de Futebol Feminino, " +
                        "2° Lugar na Copa Américana Feminina",
                "Ela joga muinto.",
                "Palmeiras",
                R.drawable.andressa));

        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaJogadoras);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);
        idRecyclerView.setAdapter(adapter);
    }
}