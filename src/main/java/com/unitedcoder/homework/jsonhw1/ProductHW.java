package com.unitedcoder.homework.jsonhw1;

public class ProductHW {
    private boolean status;
    private String productName;
    private String manufacturer;
    private String productCode;
    private double productWeight;
    private double productWidth;
    private double productHeight;
    private int stockLevel;
    private int stockLevelWarning;
    private boolean active;

    public ProductHW() {
    }

    public ProductHW(boolean status, String productName, String manufacturer, String productCode,
                     double productWeight, double productWidth,
                     double productHeight, int stockLevel, int stockLevelWarning, boolean active) {
        this.status = status;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productCode = productCode;
        this.productWeight = productWeight;
        this.productWidth = productWidth;
        this.productHeight = productHeight;
        this.stockLevel = stockLevel;
        this.stockLevelWarning = stockLevelWarning;
        this.active = active;
    }

    public boolean isStatus() {
        return status;
    }

    public String getProductName() {
        return productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public double getProductWidth() {
        return productWidth;
    }

    public double getProductHeight() {
        return productHeight;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public int getStockLevelWarning() {
        return stockLevelWarning;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "ProductHW{" +
                "status=" + status +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productWeight=" + productWeight +
                ", productWidth=" + productWidth +
                ", productHeight=" + productHeight +
                ", stockLevel=" + stockLevel +
                ", stockLevelWarning=" + stockLevelWarning +
                ", active=" + active +
                '}';
    }
}
