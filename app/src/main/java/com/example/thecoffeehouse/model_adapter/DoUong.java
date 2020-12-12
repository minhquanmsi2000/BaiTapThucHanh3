package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong implements Serializable {
    private int hinh;
    private String ten;
    private String gia;

    public int getHinh() {
        return hinh;
    }

    public ImageView setHinh(int hinh) {
        this.hinh = hinh;
        return null;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public DoUong(int hinh, String ten, String gia) {
        this.hinh = hinh;
        this.ten = ten;
        this.gia = gia;
    }

    public DoUong() {
    }
}
