package com.example.doanapp.model;

import java.io.Serializable;

public class Products implements Serializable {
    private int Id;
    private String Name;
    private String Category;
    private String Brand;
    private String Description;
    private int Price;
//    private byte[] ImagePro;
    private int ImagePro;
    private String Size;
    private String Color;

    public Products(int id, String name, String category, String brand, String description, int price, int imagePro, String size, String color) {
        Id = id;
        Name = name;
        Category = category;
        Brand = brand;
        Description = description;
        Price = price;
        ImagePro = imagePro;
        Size = size;
        Color = color;
    }
    //    public Products(int id, String name, String category, String brand, String description, int price, byte[] imagePro, int size, String color) {
//        Id = id;
//        Name = name;
//        Category = category;
//        Brand = brand;
//        Description = description;
//        Price = price;
//        ImagePro = imagePro;
//        Size = size;
//        Color = color;
//    }

//    public Products(int id, byte[] imagePro, String name, int price) {
//        Id = id;
//        ImagePro = imagePro;
//        Name = name;
//        Price = price;
//    }

    public Products(int id, int imagePro, String name, int price, String description) {
        Id = id;
        Name = name;
        Price = price;
        ImagePro = imagePro;
        Description = description;
    }

    public Products(int imagePro, String name, int price) {
        Name = name;
        Price = price;
        ImagePro = imagePro;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

//    public byte[] getImagePro() {return ImagePro;}

//    public void setImagePro(byte[] imagePro) {
//        ImagePro = imagePro;
//    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }


    public int getImagePro() {
        return ImagePro;
    }
    public void setImagePro(int imagePro) {
        ImagePro = imagePro;
    }
}
