package com.example.doanapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.doanapp.R;
import com.example.doanapp.model.Products;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CartAdapter extends ArrayAdapter<Products> {
    Activity context = null;
    ArrayList<Products> myArray = null;
    int layoutid;

    public CartAdapter(Activity context, int layoutid, ArrayList<Products>myArray)
    {
        super(context, layoutid, myArray);
        this.context = context;
        this.myArray = myArray;
        this.layoutid = layoutid;
    }

    public View getView(int position, View convertview, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        convertview = inflater.inflate(layoutid, null);
        if(myArray.size() > 0 && position >= 0)
        {
            final ImageView imgPro = (ImageView) convertview.findViewById(R.id.imgCartList);
            final TextView tvName = (TextView) convertview.findViewById(R.id.tvTenSP_Cart);
            final TextView tvGia = (TextView) convertview.findViewById(R.id.tvGia_Cart);
            final TextView tvSize = (TextView) convertview.findViewById(R.id.tvSize_Cart);
            final TextView tvColor = (TextView) convertview.findViewById(R.id.tvMauSP_Cart);
            final Products emp = myArray.get(position);
            imgPro.setImageResource(emp.getImagePro());
            tvName.setText(emp.getName());

            Locale localeVN = new Locale("vi", "VN");
            NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
            String price = currencyVN.format(emp.getPrice());
            tvGia.setText(price);
            tvSize.setText(emp.getSize());
            tvColor.setText(emp.getColor());


        }
        return convertview;
    }
}
