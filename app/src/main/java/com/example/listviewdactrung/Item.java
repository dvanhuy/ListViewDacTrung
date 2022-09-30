package com.example.listviewdactrung;

public class Item {
    private String logoTen;
    private String hoTen;
    private String gioiThieu ;

    public Item() {
    }

    public Item(String logoTen, String hoTen, String gioiThieu) {
        this.logoTen = logoTen;
        this.hoTen = hoTen;
        this.gioiThieu = gioiThieu;
    }

    public String getLogoTen() {
        return logoTen;
    }

    public void setLogoTen(String logoTen) {
        this.logoTen = logoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }
}
