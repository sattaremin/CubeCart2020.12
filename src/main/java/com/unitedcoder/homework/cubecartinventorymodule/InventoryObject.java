package com.unitedcoder.homework.cubecartinventorymodule;

public class InventoryObject {
        private String productName;
        private String productCode;
        private String ProductWeight;
        private String ProductWidth;
        private String stockLevel;
        private String upcCode;

        private String retailPrice;

        private String salePrice;

        private String costPrice;

        private String reviewerName;

        private String reviewerEmail;

        private String reviewerTitle;

        private String content;



        public InventoryObject(String productName, String productCode, String productWeight, String productWidth,
                                    String stockLevel, String upcCode, String retailPrice, String salePrice,
                                    String costPrice, String reviewerName, String reviewerEmail, String reviewerTitle, String content) {
            this.productName = productName;
            this.productCode = productCode;
            ProductWeight = productWeight;
            ProductWidth = productWidth;
            this.stockLevel = stockLevel;
            this.upcCode = upcCode;
            this.retailPrice = retailPrice;
            this.salePrice = salePrice;
            this.costPrice = costPrice;
            this.reviewerName = reviewerName;
            this.reviewerEmail = reviewerEmail;
            this.reviewerTitle = reviewerTitle;
            this.content = content;
        }

        public InventoryObject() {
        }


        public String getProductName() {
            return productName;
        }

        public String getProductCode() {
            return productCode;
        }

        public String getProductWeight() {
            return ProductWeight;
        }

        public String getProductWidth() {
            return ProductWidth;
        }

        public String getStockLevel() {
            return stockLevel;
        }

        public String getUpcCode() {
            return upcCode;
        }

        public String getRetailPrice() {
            return retailPrice;
        }

        public String getSalePrice() {
            return salePrice;
        }

        public String getCostPrice() {
            return costPrice;
        }

        public String getReviewerName() {
            return reviewerName;
        }

        public String getReviewerEmail() {
            return reviewerEmail;
        }

        public String getReviewerTitle() {
            return reviewerTitle;
        }

        public String getContent() {
            return content;
        }
    }

