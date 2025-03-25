package com.cemalettinaltintas.kentsimgelerikitabi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.cemalettinaltintas.kentsimgelerikitabi.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Data
        landmarkArrayList=new ArrayList<>();

        Landmark pisa=new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel=new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark collesuem=new Landmark("Colloseum","Italy",R.drawable.colloseum);
        Landmark londonBridge=new Landmark("London Bridge","UK",R.drawable.london);
        Landmark ayasofya=new Landmark("Ayasofya","Türkiye",R.drawable.ayasofya);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(collesuem);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(collesuem);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(collesuem);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(ayasofya);
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(collesuem);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(ayasofya);
        //RecyclerView
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        //ListView
       /* ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });*/

    }
}