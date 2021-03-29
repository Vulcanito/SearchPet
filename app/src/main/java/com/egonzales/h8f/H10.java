package com.egonzales.h8f;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class H10 extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h10);

        pieChart=findViewById(R.id.graficopastel);

        crearGraficoPastel();
    }

    private void crearGraficoPastel() {
        Description description = new Description();
        description.setText("Gráfico de Pastel");
        description.setTextSize(15);

        pieChart.setDescription(description);
        ArrayList<PieEntry> pieEntries=new ArrayList<>();
        pieEntries.add(new PieEntry(20,3));
        pieEntries.add(new PieEntry(30,8));
        pieEntries.add(new PieEntry(10,2));
        PieDataSet pieDataSet=new PieDataSet(pieEntries, "Mascotas encontradas y perdidas");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);


    }
}

