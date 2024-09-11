package com.example.doanapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.doanapp.model.Products;

public class MyDatabase {
    SQLiteDatabase database;
    DBHelper helper;

    public MyDatabase(Context context) {
        helper = new DBHelper(context);
        database = helper.getWritableDatabase();
    }

    public Cursor layTatCaDuLieu() {
        // Biến cot là khai báo danh sách các cột cần lấy.
        String[] cotPro = { DBHelper.COT_ID_PRO, DBHelper.COT_NAME_PRO, DBHelper.COT_CATEGORY,
                DBHelper.COT_BRAND_PRO, DBHelper.COT_DESCRIPTION_PRO, DBHelper.COT_PRICE, DBHelper.COT_IMAGE_PRO,
                DBHelper.COT_SIZE_PRO, DBHelper.COT_COLOR_PRO };

        Cursor cursor = null;

        cursor = database.query(DBHelper.
                        TEN_BANG_PRODUCTS, cotPro, null, null, null, null,
                DBHelper.COT_ID_PRO + " ASC");
        return cursor;
    }

    public long Add(Products products) {

        ContentValues values = new ContentValues();
        values.put(DBHelper.COT_NAME_PRO, products.getName());
        values.put(DBHelper.COT_CATEGORY, products.getCategory());
        values.put(DBHelper.COT_BRAND_PRO, products.getBrand());
        values.put(DBHelper.COT_DESCRIPTION_PRO, products.getDescription());
        values.put(DBHelper.COT_PRICE, products.getPrice());
        values.put(DBHelper.COT_IMAGE_PRO, products.getImagePro());
        values.put(DBHelper.COT_SIZE_PRO, products.getSize());
        values.put(DBHelper.COT_COLOR_PRO, products.getColor());

        return database.insert(DBHelper.TEN_BANG_PRODUCTS, null, values);
    }

    public long Delete(Products products) {

        return database.delete(DBHelper.TEN_BANG_PRODUCTS, DBHelper.COT_NAME_PRO + " = " + "'" +
                products.getName() + "'", null);
    }

    public long Edit(Products products) {
        ContentValues values = new ContentValues();
        values.put(DBHelper.COT_NAME_PRO, products.getName());
        values.put(DBHelper.COT_CATEGORY, products.getCategory());
        values.put(DBHelper.COT_BRAND_PRO, products.getBrand());
        values.put(DBHelper.COT_DESCRIPTION_PRO, products.getDescription());
        values.put(DBHelper.COT_PRICE, products.getPrice());
        values.put(DBHelper.COT_IMAGE_PRO, products.getImagePro());
        values.put(DBHelper.COT_SIZE_PRO, products.getSize());
        values.put(DBHelper.COT_COLOR_PRO, products.getColor());

        return database.update(DBHelper.TEN_BANG_PRODUCTS, values,
                DBHelper.COT_ID_PRO + " = " + products.getId(), null);
    }
}
