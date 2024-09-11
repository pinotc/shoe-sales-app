package com.example.doanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doanapp.adapter.BrandAdapter;
import com.example.doanapp.adapter.ProductAdapter;
import com.example.doanapp.model.App;
import com.example.doanapp.model.Brand;
import com.example.doanapp.model.Products;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ProductAdapter.Listener, BrandAdapter.Listener {

    Toolbar toolbarMain;
    DrawerLayout drawerLayoutMain;
    NavigationView nvMain;
    ListView lvMenu;
    ImageView imgSearch, imgCart;
    RecyclerView rcvTheThao, rcvSneaker, rcvRunning, rcvBongDa, rcvBrand;
    ArrayList<Products> sneakerPro, theThaoPro, bongDaPro, runningPro;
    ProductAdapter sneakerAdapter, theThaoAdapter, bongDaAdapter, runningAdapter;
    ArrayList<Brand> brand;
    BrandAdapter brandAdapter;
    TextView tvHomeMenu, tvAllProMenu, tvCartMenu, tvFavorityMenu, tvLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        ActionToolBar();

        RecyclerViewMain();

        ViewPagerProduct();

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

    }

    private void ViewPagerProduct() {
    }

    private void RecyclerViewMain() {

//        rcvTheThao.setHasFixedSize(true);
//        rcvSneaker.setHasFixedSize(true);
//        rcvRunning.setHasFixedSize(true);
//        rcvBongDa.setHasFixedSize(true);


        brand = App.initdataForBrand();
        brandAdapter = new BrandAdapter(brand, this);
        rcvBrand.setAdapter(brandAdapter);
        rcvBrand.setLayoutManager(new GridLayoutManager(this, 2));


        sneakerPro = App.initdataForSneaker();
        sneakerAdapter = new ProductAdapter(MainActivity.this, sneakerPro);
        rcvSneaker.setAdapter(sneakerAdapter);
        rcvSneaker.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
        // rcvTheThao.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));


        theThaoPro = App.initdataForTheThao();
        theThaoAdapter = new ProductAdapter(MainActivity.this, theThaoPro);
        rcvTheThao.setAdapter(theThaoAdapter);
        rcvTheThao.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));


        bongDaPro = App.initdataForBongDa();
        bongDaAdapter = new ProductAdapter(MainActivity.this, bongDaPro);
        rcvBongDa.setAdapter(bongDaAdapter);
        rcvBongDa.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));


        runningPro = App.initdataForRunning();
        runningAdapter = new ProductAdapter(MainActivity.this, runningPro);
        rcvRunning.setAdapter(runningAdapter);
        rcvRunning.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));




    }

    private void ActionToolBar() {
        setSupportActionBar(toolbarMain);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarMain.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayoutMain.openDrawer(GravityCompat.START);
            }
        });
    }

    private void AnhXa() {
        toolbarMain = (Toolbar) findViewById(R.id.toolbarMain);
        drawerLayoutMain = (DrawerLayout) findViewById(R.id.drawerMain);
        nvMain = (NavigationView) findViewById(R.id.nvMenu);
        imgSearch = (ImageView) findViewById(R.id.imvSearch);
        imgCart = (ImageView) findViewById(R.id.imgCart);
        rcvTheThao = (RecyclerView)findViewById(R.id.rcvTheThao);
        rcvSneaker = (RecyclerView)findViewById(R.id.rcvSneaker);
        rcvRunning = (RecyclerView)findViewById(R.id.rcvRunning);
        rcvBongDa = (RecyclerView)findViewById(R.id.rcvBongDa);
        rcvBrand = (RecyclerView) findViewById(R.id.rcvBrand);
        tvAllProMenu = (TextView) findViewById(R.id.tvMenuAllPro);
        tvHomeMenu = (TextView) findViewById(R.id.tvMenuHome);
        tvCartMenu = (TextView) findViewById(R.id.tvMenuCart);
        tvFavorityMenu = (TextView) findViewById(R.id.tvMenuFavority);
        tvLogin = (TextView) findViewById(R.id.tvLogin);
    }

    @Override
    public void setOnItemClickListener(Products product) {

        //Toast.makeText(MainActivity.this, product.getName(), Toast.LENGTH_LONG).show();


        Intent intentPro = new Intent(MainActivity.this, ProductInfo.class);
        intentPro.putExtra("product", product);
        startActivity(intentPro);

    }

    @Override
    public void setOnItemClickListener(Brand brand) {

    }

    public void itemMenuHomeOnClick(View view) {
    }

    public void itemMenuAllProOnClick(View view) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }

    public void itemMenuCartOnClick(View view) {
//        Intent intent = new Intent(MainActivity.this, CartActivity.class);
//        startActivity(intent);

    }

    public void itemMenuFavorityOnClick(View view) {
    }
}