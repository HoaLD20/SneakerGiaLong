package com.sneaker.snakergialong.Model.Entities;

public class Product {
    private int pId;
    private String pName;
    private double pPrice;
    private String pBrand;
    private String pDescription;
    private String pColor;
    private int pSize;
    private int pQuantity;
    private String pImage1;
    private String pImage2;
    private String pImage3;
    private String pImage4;
    private int pInStock;
    private int pOnOrder;
    private int pStatus;

    public Product() {
    }

    public Product(int pId, String pName, double pPrice, String pBrand, String pDescription, String pColor, int pSize, int pQuantity, String pImage1, String pImage2, String pImage3, String pImage4, int pInStock, int pOnOrder, int pStatus) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pBrand = pBrand;
        this.pDescription = pDescription;
        this.pColor = pColor;
        this.pSize = pSize;
        this.pQuantity = pQuantity;
        this.pImage1 = pImage1;
        this.pImage2 = pImage2;
        this.pImage3 = pImage3;
        this.pImage4 = pImage4;
        this.pInStock = pInStock;
        this.pOnOrder = pOnOrder;
        this.pStatus = pStatus;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public String getpColor() {
        return pColor;
    }

    public void setpColor(String pColor) {
        this.pColor = pColor;
    }

    public int getpSize() {
        return pSize;
    }

    public void setpSize(int pSize) {
        this.pSize = pSize;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public String getpImage1() {
        return pImage1;
    }

    public void setpImage1(String pImage1) {
        this.pImage1 = pImage1;
    }

    public String getpImage2() {
        return pImage2;
    }

    public void setpImage2(String pImage2) {
        this.pImage2 = pImage2;
    }

    public String getpImage3() {
        return pImage3;
    }

    public void setpImage3(String pImage3) {
        this.pImage3 = pImage3;
    }

    public String getpImage4() {
        return pImage4;
    }

    public void setpImage4(String pImage4) {
        this.pImage4 = pImage4;
    }

    public int getpInStock() {
        return pInStock;
    }

    public void setpInStock(int pInStock) {
        this.pInStock = pInStock;
    }

    public int getpOnOrder() {
        return pOnOrder;
    }

    public void setpOnOrder(int pOnOrder) {
        this.pOnOrder = pOnOrder;
    }

    public int getpStatus() {
        return pStatus;
    }

    public void setpStatus(int pStatus) {
        this.pStatus = pStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pBrand='" + pBrand + '\'' +
                ", pDescription='" + pDescription + '\'' +
                ", pColor='" + pColor + '\'' +
                ", pSize=" + pSize +
                ", pQuantity=" + pQuantity +
                ", pImage1='" + pImage1 + '\'' +
                ", pImage2='" + pImage2 + '\'' +
                ", pImage3='" + pImage3 + '\'' +
                ", pImage4='" + pImage4 + '\'' +
                ", pInStock=" + pInStock +
                ", pOnOrder=" + pOnOrder +
                ", pStatus=" + pStatus +
                '}';
    }
}
