package com.example.asianery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class countrieschoices extends AppCompatActivity {
    private Button btnback, btnafganistan,btnarmenia,btnbtnazerbaijan,btnbahrain,btnbangladesh,btnbhutan,
    btnbrunei,btncambodia,btnchina,btncyprus,btngeorgia,btnindia,btnindonesia,btniran,btniraq,btnisrael,
            btnjapan,btnjordan,btnkazakhstan,btnkuwait,btnkyrgyzstan,btnlaos,btnlebanon,btnmalaysia,btnmaldives,
            btnmongolia,btnmyanmar,btnnepal,btnnorthkorea,btnoman,btnpakistan,btnpalestine,btnphilippines,
            btnqatar,btnrussia,btnsaudiarabia,btnsingapore,btnsouthkorea,btnsrilanka,btnsyria,btntaiwan,
            btntajikistan,btnthailand,btntimorleste,btnturkey,btnturkmenistan,btnuae,btnuzbekistan,
            btnvietnam,btnyemen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countrieschoices);

        btnback = (Button) findViewById(R.id.btnback);
        btnafganistan = (Button) findViewById(R.id.btnafghanistan);
        btnarmenia = (Button) findViewById(R.id.btnarmenia);
        btnbtnazerbaijan = (Button) findViewById(R.id.btnazerbaijan);
        btnbahrain = (Button) findViewById(R.id.btnbahrain);
        btnbangladesh = (Button) findViewById(R.id.btnbangladesh);
        btnbhutan = (Button) findViewById(R.id.btnbhutan);
        btnbrunei = (Button) findViewById(R.id.btnbrunei);
        btncambodia = (Button) findViewById(R.id.btncambodia);
        btnchina = (Button) findViewById(R.id.btnchina);
        btncyprus = (Button) findViewById(R.id.btncyprus);
        btngeorgia = (Button) findViewById(R.id.btngeorgia);
        btnindia = (Button) findViewById(R.id.btnindia);
        btnindonesia = (Button) findViewById(R.id.btnindonesia);
        btniran = (Button) findViewById(R.id.btniran);
        btniraq = (Button) findViewById(R.id.btniraq);
        btnisrael = (Button) findViewById(R.id.btnisrael);
        btnjapan = (Button) findViewById(R.id.btnjapan);
        btnjordan = (Button) findViewById(R.id.btnjordan);
        btnkazakhstan = (Button) findViewById(R.id.btnkazakhstan);
        btnkuwait = (Button) findViewById(R.id.btnkuwait);
        btnkyrgyzstan = (Button) findViewById(R.id.btnkyrgyzstan);
        btnlaos = (Button) findViewById(R.id.btnlaos);
        btnlebanon = (Button) findViewById(R.id.btnlebanon);
        btnmalaysia = (Button) findViewById(R.id.btnmalaysia);
        btnmaldives = (Button) findViewById(R.id.btnmaldives);
        btnmongolia = (Button) findViewById(R.id.btnmongolia);
        btnmyanmar = (Button) findViewById(R.id.btnmyanmar);
        btnnepal = (Button) findViewById(R.id.btnnepal);
        btnnorthkorea = (Button) findViewById(R.id.btnnorthkorea);
        btnoman = (Button) findViewById(R.id.btnoman);
        btnpakistan = (Button) findViewById(R.id.btnpakistan);
        btnpalestine = (Button) findViewById(R.id.btnpalestine);
        btnphilippines = (Button) findViewById(R.id.btnphilippines);
        btnqatar = (Button) findViewById(R.id.btnqatar);
        btnrussia = (Button) findViewById(R.id.btnrussia);
        btnsaudiarabia = (Button) findViewById(R.id.btnsaudiarabia);
        btnsingapore = (Button) findViewById(R.id.btnsingapore);
        btnsouthkorea = (Button) findViewById(R.id.btnsouthkorea);
        btnsrilanka = (Button) findViewById(R.id.btnsrilanka);
        btnsyria = (Button) findViewById(R.id.btnsyria);
        btntaiwan = (Button) findViewById(R.id.btntaiwan);
        btntajikistan = (Button) findViewById(R.id.btntajikistan);
        btnthailand = (Button) findViewById(R.id.btnthailand);
        btntimorleste = (Button) findViewById(R.id.btntimorleste);
        btnturkey = (Button) findViewById(R.id.btnturkey);
        btnturkmenistan = (Button) findViewById(R.id.btnturkmenistan);
        btnuae = (Button) findViewById(R.id.btnuae);
        btnuzbekistan = (Button) findViewById(R.id.btnuzbekistan);
        btnvietnam = (Button) findViewById(R.id.btnvietnam);
        btnyemen = (Button) findViewById(R.id.btnyemen);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),home.class);
                startActivity(startIntent);
            }
        });

        btnafganistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),afghanistan.class);
                startActivity(startIntent);
            }
        });

        btnarmenia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),armenia.class);
                startActivity(startIntent);
            }
        });

        btnbtnazerbaijan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),azerbaijan.class);
                startActivity(startIntent);
            }
        });

        btnbahrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),bahrain.class);
                startActivity(startIntent);
            }
        });

        btnbangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),bangladesh.class);
                startActivity(startIntent);
            }
        });

        btnbhutan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),bhutan.class);
                startActivity(startIntent);
            }
        });

        btnbrunei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),brunei.class);
                startActivity(startIntent);
            }
        });

        btncambodia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),cambodia.class);
                startActivity(startIntent);
            }
        });

        btnchina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),china.class);
                startActivity(startIntent);
            }
        });
        btncyprus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),cyprus.class);
                startActivity(startIntent);
            }
        });

        btngeorgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),georgia.class);
                startActivity(startIntent);
            }
        });


        btnindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),india.class);
                startActivity(startIntent);
            }
        });

        btnindonesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),indonesia.class);
                startActivity(startIntent);
            }
        });
        btniran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),iran.class);
                startActivity(startIntent);
            }
        });
        btniraq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),iraq.class);
                startActivity(startIntent);
            }
        });
        btnisrael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),israel.class);
                startActivity(startIntent);
            }
        });
        btnjapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),japan.class);
                startActivity(startIntent);
            }
        });
        btnjordan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),jordan.class);
                startActivity(startIntent);
            }
        });
        btnkazakhstan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),kazakhstan.class);
                startActivity(startIntent);
            }
        });
        btnkuwait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),kuwait.class);
                startActivity(startIntent);
            }
        });
        btnkyrgyzstan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),kyrgyzstan.class);
                startActivity(startIntent);
            }
        });
        btnlaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),laos.class);
                startActivity(startIntent);
            }
        });
        btnlebanon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),lebanon.class);
                startActivity(startIntent);
            }
        });
        btnmalaysia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),malaysia.class);
                startActivity(startIntent);
            }
        });
        btnmaldives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),maldives.class);
                startActivity(startIntent);
            }
        });
        btnmongolia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),mongolia.class);
                startActivity(startIntent);
            }
        });
        btnmyanmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),myanmar.class);
                startActivity(startIntent);
            }
        });
        btnnepal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),nepal.class);
                startActivity(startIntent);
            }
        });
        btnnorthkorea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),northkorea.class);
                startActivity(startIntent);
            }
        });
        btnoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),oman.class);
                startActivity(startIntent);
            }
        });
        btnpakistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),pakistan.class);
                startActivity(startIntent);
            }
        });
        btnpalestine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),palestine.class);
                startActivity(startIntent);
            }
        });
        btnphilippines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),philippines.class);
                startActivity(startIntent);
            }
        });
        btnqatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),qatar.class);
                startActivity(startIntent);
            }
        });
        btnrussia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),russia.class);
                startActivity(startIntent);
            }
        });
        btnsaudiarabia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),saudiarabia.class);
                startActivity(startIntent);
            }
        });
        btnsingapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),singapore.class);
                startActivity(startIntent);
            }
        });
        btnsouthkorea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),southkorea.class);
                startActivity(startIntent);
            }
        });
        btnsrilanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),srilanka.class);
                startActivity(startIntent);
            }
        });
        btnsyria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),syria.class);
                startActivity(startIntent);
            }
        });
        btntaiwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),taiwan.class);
                startActivity(startIntent);
            }
        });
        btntajikistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),tajikistan.class);
                startActivity(startIntent);
            }
        });
        btnthailand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),thailand.class);
                startActivity(startIntent);
            }
        });
        btntimorleste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),timorleste.class);
                startActivity(startIntent);
            }
        });
        btnturkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),turkey.class);
                startActivity(startIntent);
            }
        });
        btnturkmenistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),turkmenistan.class);
                startActivity(startIntent);
            }
        });
        btnuae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),uae.class);
                startActivity(startIntent);
            }
        });
        btnuzbekistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),uzbekistan.class);
                startActivity(startIntent);
            }
        });
        btnvietnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),vietnam.class);
                startActivity(startIntent);
            }
        });
        btnyemen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent=new Intent(getApplicationContext(),yemen.class);
                startActivity(startIntent);
            }
        });











    }
}