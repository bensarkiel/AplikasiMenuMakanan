package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan =findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    public void initData()
    {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan
                (
                        "Baguette",
                        "Rp30.000,00",
                        "Roti dengan bentuk yang panjang dan kulit yang renyah",
                        R.drawable.baguete
                )
        );

        listMakanan.add(new Makanan
                (
                        "Bouillabaisse",
                        "Rp225.000,00",
                        "Olahan Seafood dengan rasa mewah, manis, dan sedikit pedas",
                        R.drawable.bouillabaisse
                )
        );

        listMakanan.add(new Makanan
                (
                        "Coq Au Vin",
                        "Rp275.000,00",
                        "Hidangan ayam rebus yang direbus dengan anggur, menghasilkan rasa yang tajam, harum, dan bumbu yang menggoda",
                        R.drawable.coq_au_vin
                )
        );

        listMakanan.add(new Makanan
                (
                        "Crepes",
                        "Rp95.000,00",
                        "Pancake tipis yang disajikan dengan selai/nutella di dalamnya",
                        R.drawable.crepes
                )
        );

        listMakanan.add(new Makanan
                (
                        "French Macaron",
                        "Rp100.000,00",
                        "Terdiri dari dua cangkang berbahan dasar meringue dan isian yang manis dan lembut di tengahnya",
                        R.drawable.macaron
                )
        );

        listMakanan.add(new Makanan
                (
                        "Quiche Lorraine",
                        "Rp320.000,00",
                        "Tart gurih dengan kulit pastry yang diisi dengan daging, keju, bacon, dan sayuran",
                        R.drawable.quiche_lorraine
                )
        );

        listMakanan.add(new Makanan
                (
                        "Ratatouille",
                        "Rp385.000,00",
                        "Hidangan beberapa sayuran, yaitu tomat, terong, paprika, rempah-rempah, dan zucchini yang diaduk bersama",
                        R.drawable.ratatouille
                )
        );
    }
}
