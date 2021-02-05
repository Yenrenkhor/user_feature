package com.example.mlasessment.model;

import javax.persistence.*;

//mark class as an Entity
@Entity
public class Users {
    @Id
    @Column(nullable=false)
    private String featureName;
    @Column(nullable=false, unique=true)
    private String email;
    @Column(nullable=false)
    private Boolean enable;

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
