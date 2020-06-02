package com.example.quanlyquancf.DoiTuong;

public class Food {
    private int hinh;
    private String Ten;
    private String gia;

    public Food(int hinh, String ten, String gia) {
        this.hinh = hinh;
        Ten = ten;
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}