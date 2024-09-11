package com.example.doanapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanapp.R;
import com.example.doanapp.model.Brand;
import com.example.doanapp.model.Products;

import java.util.ArrayList;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.BrandVH> {

    ArrayList<Brand> brands;
    Listener listener;

    public BrandAdapter(ArrayList<Brand> brands, Listener listener) {
        this.brands = brands;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BrandVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brand, parent,false);
        return new BrandVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandVH holder, int position) {
        Brand brand = brands.get(position);

        holder.imgBrand.setImageResource(brand.getImageBrand());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.setOnItemClickListener(brand);
            }
        });
    }

    @Override
    public int getItemCount() {
        return brands.size();
    }

    public class BrandVH extends RecyclerView.ViewHolder {

        ImageView imgBrand;

        public BrandVH(@NonNull View itemView) {
            super(itemView);
            imgBrand = (ImageView) itemView.findViewById(R.id.imgLogo);
        }
    }
    public interface Listener{
        void setOnItemClickListener(Brand brand);
    }
}
