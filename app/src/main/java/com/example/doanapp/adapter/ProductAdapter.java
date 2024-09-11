package com.example.doanapp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.GnssAntennaInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanapp.MainActivity;
import com.example.doanapp.R;
import com.example.doanapp.model.Products;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductVH> {

    ArrayList<Products> products;
    //Context context;
    Listener listener;

    public ProductAdapter(Listener listener, ArrayList<Products> products) {
        this.listener = listener;
        this.products = products;
        //this.context = context;

    }


    @NonNull
    @Override
    public ProductVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent,false);
        return new ProductVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductVH holder, int position) {

        Products product = products.get(position);
        holder.tvNamePro.setText(product.getName());

        holder.imgPro.setImageResource(product.getImagePro());

        //chuyen byte[] -> bitmap
//        byte[] img = product.getImagePro();
//        Bitmap bitmap = BitmapFactory.decodeByteArray(img, 0, img.length);
//        holder.imgPro.setImageBitmap(bitmap);

        //don vi tien VN
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String price = currencyVN.format(product.getPrice());
        holder.tvPricePro.setText(price);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.setOnItemClickListener(product);
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductVH extends RecyclerView.ViewHolder {

        ImageView imgPro;
        TextView tvNamePro, tvPricePro;

        public ProductVH(@NonNull View itemView) {
            super(itemView);

            imgPro = itemView.findViewById(R.id.imgProduct);
            tvNamePro = itemView.findViewById(R.id.tvNamePro);
            tvPricePro = itemView.findViewById(R.id.tvPricePro);
        }

    }

    public interface Listener{
        void setOnItemClickListener(Products product);
    }
}
