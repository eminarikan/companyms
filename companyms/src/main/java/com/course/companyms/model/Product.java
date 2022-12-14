package com.course.companyms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    private String productCode;

    @Column(nullable = false)
    private String productName;
    
    @Column(nullable = false)
    private String productLine;
    
    @Column(nullable = false)
    private String productScale;
    
    @Column(nullable = false)
    private String productVendor;
    
    @Column(nullable = false)
    private String productDescription;
    
    @Column(nullable = false)
    private int quantityInStock;
    
    @Column(nullable = false)
    private double buyPrice;

    @Column(nullable = false)
    private double msrp;

    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductLine() {
        return productLine;
    }
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }
    public String getProductScale() {
        return productScale;
    }
    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }
    public String getProductVendor() {
        return productVendor;
    }
    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    public double getBuyPrice() {
        return buyPrice;
    }
    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
    public double getMsrp() {
        return msrp;
    }
    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    
}
