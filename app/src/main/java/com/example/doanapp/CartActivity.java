package com.example.doanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.doanapp.adapter.CartAdapter;
import com.example.doanapp.model.Products;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CartActivity extends AppCompatActivity {

    Products proCart;
    ArrayList<Products> arrPro;
    ListView lvCart;
    CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        lvCart = (ListView) findViewById(R.id.lvGioHang);
        arrPro = new ArrayList<Products>();
        cartAdapter = new CartAdapter(this, R.layout.item_cart, arrPro);

        lvCart.setAdapter(cartAdapter);

        Bundle cartBundle = getIntent().getExtras();
        proCart = new Products(1,cartBundle.getString("strName"),null, null, null, cartBundle.getInt("intGia"),  cartBundle.getInt("intImg"), cartBundle.getString("strSize"), cartBundle.getString("strColor")  );

        arrPro.add(proCart);
        cartAdapter.notifyDataSetChanged();

        TextView tvTT = (TextView) findViewById(R.id.tvTT);
        TextView tvTD = (TextView) findViewById(R.id.tvTD);

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String price = currencyVN.format(cartBundle.getInt("intGia"));
        tvTT.setText(price);
        tvTD.setText(price);
    }
}