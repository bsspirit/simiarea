package org.conan.simiblog.event.model;

import java.util.Date;

import org.conan.simiblog.common.model.BaseDTO;

public class EventDTO extends BaseDTO {

    private static final long serialVersionUID = 4339256973691066359L;

    private int id;
    private Date date = new Date();

    private String property;
    private String myMood;
    private String otherMood;
    private String whopay;

    private String content;
    private String address;
    private Float cost = new Float(0.0f);
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMyMood() {
        return myMood;
    }

    public void setMyMood(String myMood) {
        this.myMood = myMood;
    }

    public String getOtherMood() {
        return otherMood;
    }

    public void setOtherMood(String otherMood) {
        this.otherMood = otherMood;
    }

    public String getWhopay() {
        return whopay;
    }

    public void setWhopay(String whopay) {
        this.whopay = whopay;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
