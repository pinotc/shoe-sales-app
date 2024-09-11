package com.example.doanapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String TEN_DATABASE= "ShoeStore";
    //Bang Product
    public static final String TEN_BANG_PRODUCTS = "Pro";

    public static final String COT_ID_PRO = "_Id";
    public static final String COT_NAME_PRO = "_NamePro";
    public static final String COT_CATEGORY = "_Category";
    public static final String COT_BRAND_PRO = "_Brand";
    public static final String COT_DESCRIPTION_PRO = "_descriptionPro";
    public static final String COT_PRICE = "_Price";
    public static final String COT_IMAGE_PRO = "_ImagePro";
    public static final String COT_SIZE_PRO = "_SizePro";
    public static final String COT_COLOR_PRO = "_ColorPro";



    private static final String TAO_BANG_PRODUCT = ""
            + "create table " + TEN_BANG_PRODUCTS + " ( "
            + COT_ID_PRO + " integer primary key autoincrement ,"
            + COT_NAME_PRO + " text not null, "
            + COT_CATEGORY + " text, "
            + COT_BRAND_PRO + " text, "
            + COT_DESCRIPTION_PRO + " text, "
            + COT_PRICE + " integer, "
            + COT_IMAGE_PRO + " blob, "
            + COT_SIZE_PRO + " integer, "
            + COT_COLOR_PRO + " text );";



    public DBHelper(Context context) {
        super(context, TEN_DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TAO_BANG_PRODUCT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
