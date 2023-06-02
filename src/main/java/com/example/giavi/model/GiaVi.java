package com.example.giavi.model;

public class GiaVi {
    private String tenGiaVi;
    private boolean giaViChon;

    public GiaVi() {
    }

    public GiaVi(String tenGiaVi, boolean giaViChon) {
        this.tenGiaVi = tenGiaVi;
        this.giaViChon = giaViChon;
    }

    public String getTenGiaVi() {
        return tenGiaVi;
    }

    public void setTenGiaVi(String tenGiaVi) {
        this.tenGiaVi = tenGiaVi;
    }

    public boolean isGiaViChon() {
        return giaViChon;
    }

    public void setGiaViChon(boolean giaViChon) {
        this.giaViChon = giaViChon;
    }

    @Override
    public String toString() {
        return "GiaVi{" +
                "tenGiaVi='" + tenGiaVi + '\'' +
                ", giaViChon=" + giaViChon +
                '}';
    }
}
