package com.course.companyms.model;

public enum Status {
    SHIPPED("Shipped"),
    ON_HOLD("On Hold"),
    DISPUTED("Disputed"),
    IN_PROCESS("In Process"),
    RESOLVED("Resolved"),
    CANCELLED("Cancelled");

    private String value;

    Status(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
