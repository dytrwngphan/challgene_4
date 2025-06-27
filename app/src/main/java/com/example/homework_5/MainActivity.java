package com.example.homework_5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SportAdapter sportAdapter;
    private List<Sport> sportList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // 2. Tạo danh sách môn thể thao
        sportList = new ArrayList<>();
        sportList.add(new Sport("Badminton", R.drawable.badminton));
        sportList.add(new Sport("Basketball", R.drawable.basketball));
        sportList.add(new Sport("Football", R.drawable.football));
        sportList.add(new Sport("Tennis", R.drawable.tennis));

        // 3. Gán adapter
        sportAdapter = new SportAdapter(this, sportList);
        recyclerView.setAdapter(sportAdapter);
    }
}