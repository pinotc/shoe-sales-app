package com.example.doanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.doanapp.adapter.ProductAdapter;
import com.example.doanapp.model.App;
import com.example.doanapp.model.Products;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity implements ProductAdapter.Listener{

    RecyclerView rcvAllPro;
    ArrayList<Products> allPro;
    ProductAdapter proAdapter;
    ImageView imgBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        rcvAllPro = (RecyclerView) findViewById(R.id.rcvAllPro);
        imgBack = (ImageView) findViewById(R.id.imgBack);

        allPro = App.initdataForProducts();
        proAdapter = new ProductAdapter(ShopActivity.this, allPro);
        rcvAllPro.setAdapter(proAdapter);
        rcvAllPro.setLayoutManager(new GridLayoutManager(this, 2));


        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    @Override
    public void setOnItemClickListener(Products product) {
        Intent intentPro = new Intent(ShopActivity.this, ProductInfo.class);
        intentPro.putExtra("product", product);
        startActivity(intentPro);

    }


}