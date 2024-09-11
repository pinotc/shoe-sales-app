package com.example.doanapp.model;

import java.io.Serializable;

public class Brand implements Serializable {
    private int Id;
    private String NameBrand;
    private int ImageBrand;

    public Brand(int id, String nameBrand, int imageBrand) {
        Id = id;
        NameBrand = nameBrand;
        ImageBrand = imageBrand;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameBrand() {
        return NameBrand;
    }

    public void setNameBrand(String nameBrand) {
        NameBrand = nameBrand;
    }

    public int getImageBrand() {
        return ImageBrand;
    }

    public void setImageBrand(int imageBrand) {
        ImageBrand = imageBrand;
    }
}
