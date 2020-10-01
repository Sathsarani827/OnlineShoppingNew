package com.example.onlineshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView vegetables,fruits,meat,fish;
    private ImageView beverages,chilled,beans,tobacco;
    private ImageView pharmacy,stationary,household,bakery;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        vegetables = (ImageView) findViewById(R.id.vegetables);
        fruits = (ImageView) findViewById(R.id.fruits);
        meat = (ImageView) findViewById(R.id.meat);
        fish = (ImageView) findViewById(R.id.fish);

        beverages = (ImageView) findViewById(R.id.beverages);
        chilled = (ImageView) findViewById(R.id.chilled);
        beans = (ImageView) findViewById(R.id.beans);
        tobacco = (ImageView) findViewById(R.id.tobacco);

        pharmacy= (ImageView) findViewById(R.id.pharmacy);
        stationary = (ImageView) findViewById(R.id.stationary);
        household = (ImageView) findViewById(R.id.household);
        bakery = (ImageView) findViewById(R.id.bakery);


        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Vegetables");
                startActivity(intent);
            }
        });


        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fruits");
                startActivity(intent);
            }
        });


        meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Meat");
                startActivity(intent);
            }
        });


        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fish");
                startActivity(intent);
            }
        });


        beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Beverages");
                startActivity(intent);
            }
        });


        chilled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Chilled");
                startActivity(intent);
            }
        });



        beans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Beans");
                startActivity(intent);
            }
        });


        tobacco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tobacco");
                startActivity(intent);
            }
        });



        pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pharmacy");
                startActivity(intent);
            }
        });


        stationary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Stationary");
                startActivity(intent);
            }
        });


        household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "House Hold");
                startActivity(intent);
            }
        });


        bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Bakery");
                startActivity(intent);
            }
        });
    }

}