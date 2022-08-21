package com.course.companyms.model;

public class Info {

    private String serviceName;
    private String description;
    private String baseEndpoint;
    private String[] sources;

    

    public String getBaseEndpoint() {
        return baseEndpoint;
    }
    public void setBaseEndpoint(String baseEndpoint) {
        this.baseEndpoint = baseEndpoint;
    }
    public String[] getSources() {
        return sources;
    }
    public void setSources(String[] sources) {
        this.sources = sources;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
}
