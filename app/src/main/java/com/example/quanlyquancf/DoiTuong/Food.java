package com.example.quanlyquancf.DoiTuong;

public class Food {
    private int Image;
    private String Name;
    private String Price;
    private String Detail;
    private String Dicount;
    private String Id;
    private String IdCategory;

    public Food(int image, String name, String price, String detail, String dicount, String id, String idCategory) {
        Image = image;
        Name = name;
        Price = price;
        Detail = detail;
        Dicount = dicount;
        Id = id;
        IdCategory = idCategory;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getDicount() {
        return Dicount;
    }

    public void setDicount(String dicount) {
        Dicount = dicount;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getIdCategory() {
        return IdCategory;
    }

    public void setIdCategory(String idCategory) {
        IdCategory = idCategory;
    }
}