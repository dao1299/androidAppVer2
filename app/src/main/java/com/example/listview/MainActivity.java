package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity {
    ListView listTruyen;
    ArrayList<truyen> mangTruyen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listTruyen = findViewById(R.id.listviewTruyen);
        mangTruyen= new ArrayList<truyen>();

        mangTruyen.add(new truyen("Sự tích mèo và chuột",R.drawable.img1,R.drawable.next));
        mangTruyen.add(new truyen("Truyện hạc trả ơn",R.drawable.img2,R.drawable.next));
        mangTruyen.add(new truyen("Truyện cổ tích cây khế",R.drawable.img3,R.drawable.next));
        mangTruyen.add(new truyen("Truyện tấm cám",R.drawable.img4,R.drawable.next));
        mangTruyen.add(new truyen("Truyện sự tích trầu cau",R.drawable.img5,R.drawable.next));
        mangTruyen.add(new truyen("Truyện sự tich con sam",R.drawable.img6,R.drawable.next));
        mangTruyen.add(new truyen("Truyện sự tích Hồ Gươm",R.drawable.img8,R.drawable.next));
        mangTruyen.add(new truyen("Truyện con cáo và trùm nho",R.drawable.img9,R.drawable.next));
        truyenAdapter adapter = new truyenAdapter(
                MainActivity.this,
                R.layout.dong,
                mangTruyen
        );
        listTruyen.setAdapter(adapter);

        listTruyen.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent=new Intent(MainActivity.this,truyen1.class);
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent=new Intent(MainActivity.this,truyen2.class);
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent=new Intent(MainActivity.this,truyen3.class);
                    startActivity(intent);
                }
                if (position==3)
                {
                    Intent intent=new Intent(MainActivity.this,truyen4.class);
                    startActivity(intent);
                }
                if (position==4)
                {
                    Intent intent=new Intent(MainActivity.this,truyen5.class);
                    startActivity(intent);
                }
                if (position==5)
                {
                    Intent intent=new Intent(MainActivity.this,truyen6.class);
                    startActivity(intent);
                }
                if (position==6)
                {
                    Intent intent=new Intent(MainActivity.this,truyen8.class);
                    startActivity(intent);
                }
                if (position==7)
                {
                    Intent intent=new Intent(MainActivity.this,truyen9.class);
                    startActivity(intent);
                }
            }
        });

    }
}
