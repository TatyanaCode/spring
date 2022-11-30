package com.calculator.demo.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * author danilova.tatyana 27.11.2022
 */
@Entity
public class CalkMessage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) //  авто определение порядка id в БД
    private Integer id;
    private String text;
    private String tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
