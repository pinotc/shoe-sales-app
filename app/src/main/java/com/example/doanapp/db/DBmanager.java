package com.example.doanapp.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.doanapp.R;
import com.example.doanapp.model.Products;

import java.util.ArrayList;

public class DBmanager  {

//    private static final String DATABASE_NAME = "product";
//    private static final int VERSION = 1;
//
//   public DBmanager(Context context){
//       super(context, DATABASE_NAME, null, VERSION);
//   }
//
//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//
//       String Products = "CREATE TABLE Product (ID INTEGER Primary key AUTOINCREMENT, NamePro VARCHAR(255), Category VARCHAR(255), Brand VARCHAR(50), Description VARCHAR(500), Price INTEGER, ImagePro VARCHAR(255), SizePro INTEGER(2), ColorPro VARCHAR(55))";
//       sqLiteDatabase.execSQL(Products);
//   }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
//
//    }
//
//    public ArrayList<Products> getAllProduct(){
//
//       ArrayList<Products> pro = new ArrayList<>();
//
//       SQLiteDatabase db = getReadableDatabase();
//       Cursor cursor = db.rawQuery("select * from Product", null);
//
//       cursor.moveToFirst();
//       while (!cursor.isAfterLast()){
//           int Id = cursor.getInt(0)
//           String Name = cursor.getString(1);
//           String Category = cursor.getString(2);
//           String Brand = cursor.getString(3);
//           String Description = cursor.getString(4);
//           int Price = cursor.getInt(5);
//           String img = cursor.getString(6);
//           String Size = cursor.getString(7);
//           String Color = cursor.getString(8);
//
//           pro.add(new Products(Id, Name, Category, Brand, Description, Price, img, Size, Color));
//           cursor.moveToNext();
//
//       }
//    }
}
