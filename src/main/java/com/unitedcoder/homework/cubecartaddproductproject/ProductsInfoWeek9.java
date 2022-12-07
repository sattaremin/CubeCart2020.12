package com.unitedcoder.homework.cubecartaddproductproject;

public class ProductsInfoWeek9 {
    private String productName;
    private String productCode;
    private String productWeight;
    private String productWidth;
    private String productHeight;
    private String productDepth;
    private String stockLevel;
    private String stockLevelWarning;
    private String upcCode;
    private String eanCode;
    private String janCode;
    private String isbnCode;
    private String gtinCode;
    private String mpnCode;
    private String googleCategory;


    public ProductsInfoWeek9() {
    }

    public ProductsInfoWeek9(String productName, String productCode, String productWeight,
                             String productWidth, String productHeight, String productDepth,
                             String stockLevel, String stockLevelWarning, String upcCode, String eanCode,
                             String janCode, String isbnCode, String gtinCode, String mpnCode) {
        this.productName = productName;
        this.productCode = productCode;
        this.productWeight = productWeight;
        this.productWidth = productWidth;
        this.productHeight = productHeight;
        this.productDepth = productDepth;
        this.stockLevel = stockLevel;
        this.stockLevelWarning = stockLevelWarning;
        this.upcCode = upcCode;
        this.eanCode = eanCode;
        this.janCode = janCode;
        this.isbnCode = isbnCode;
        this.gtinCode = gtinCode;
        this.mpnCode = mpnCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public String getProductWidth() {
        return productWidth;
    }

    public String getProductHeight() {
        return productHeight;
    }

    public String getProductDepth() {
        return productDepth;
    }

    public String getStockLevel() {
        return stockLevel;
    }

    public String getStockLevelWarning() {
        return stockLevelWarning;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public String getEanCode() {
        return eanCode;
    }

    public String getJanCode() {
        return janCode;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public String getGtinCode() {
        return gtinCode;
    }

    public String getMpnCode() {
        return mpnCode;
    }

    public String getGoogleCategory() {
        return googleCategory;
    }
}
