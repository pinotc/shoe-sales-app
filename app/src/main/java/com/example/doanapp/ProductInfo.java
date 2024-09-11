package com.example.doanapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doanapp.adapter.ViewPagerAdapter;
import com.example.doanapp.model.Products;
import com.google.android.material.tabs.TabLayout;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ProductInfo extends AppCompatActivity {

    ViewPager vpPro;
    TabLayout tabLayout;
    ViewPagerAdapter viewAdap;
    TextView tvName, tvPrice, tvDes;
    Button btnAddCart, btnColor, btnSize;
    Products pro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        AnhXa();

//        viewAdap = new ViewPagerAdapter(getSupportFragmentManager());
//        vpPro.setAdapter(viewAdap);
//        tabLayout.setupWithViewPager(vpPro);

        Intent intent = getIntent();
        pro = (Products) intent.getSerializableExtra("product");

        vpPro.setBackgroundResource(pro.getImagePro());
        tvName.setText(pro.getName());
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String price = currencyVN.format(pro.getPrice());
        tvPrice.setText(price);
        tvDes.setText(pro.getDescription());


        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductInfo.this, CartActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("intImg", pro.getImagePro());
                bundle.putString("strName", pro.getName());
                bundle.putInt("intGia", pro.getPrice());
                bundle.putString("strSize", btnSize.getText().toString());
                bundle.putString("strColor", btnColor.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    String selectedColor = "";
    final  String[] colors = {"Hồng", "Xanh lá", "Vàng", "Trắng"};

    public void btnColor_onclick(View view) {
        AlertDialog.Builder dialogcolor = new AlertDialog.Builder(ProductInfo.this);
        dialogcolor.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int c) {
                selectedColor = colors[c];
                btnColor.setText(selectedColor);
            }
        });
        dialogcolor.create().show();
    }


    String selectedOption = "";
    final String[] option = {"size 35", "size 36", "size 37", "size 38", "size 39","size 40", "size 41", "size 42"};
    public void btnSize_onclick(View view) {
        AlertDialog.Builder dialogsize = new AlertDialog.Builder(ProductInfo.this);
        dialogsize.setItems(option, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selectedOption = option[i];
                btnSize.setText(selectedOption);
            }
        });
        dialogsize.create().show();
    }


    private void AnhXa() {
        vpPro = (ViewPager) findViewById(R.id.vp_SP);
        tvName = (TextView) findViewById(R.id.tvTenSP);
        tvPrice = (TextView) findViewById(R.id.tvGia);
        tvDes = (TextView) findViewById(R.id.tvMota);
        tabLayout = findViewById(R.id.tablo_SP);
        vpPro = (ViewPager) findViewById(R.id.vp_SP);
        btnAddCart = (Button) findViewById(R.id.btnAddSP);
        btnColor = (Button) findViewById(R.id.btnColor);
        btnSize = (Button) findViewById(R.id.btnSize);


    }

}