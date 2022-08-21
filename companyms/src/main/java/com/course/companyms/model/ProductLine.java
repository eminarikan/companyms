package com.course.companyms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productlines")
public class ProductLine {
    
    @Id
    private String checkNumber;
    
    private String textDescription;
    private String htmlDescription;
    private String image;
    
    public String getCheckNumber() {
        return checkNumber;
    }
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
    public String getTextDescription() {
        return textDescription;
    }
    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }
    public String getHtmlDescription() {
        return htmlDescription;
    }
    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    
}
