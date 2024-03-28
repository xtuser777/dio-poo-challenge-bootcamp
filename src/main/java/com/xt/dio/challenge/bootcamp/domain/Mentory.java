package com.xt.dio.challenge.bootcamp.domain;

import java.time.LocalDate;

public class Mentory {

    private String title;
    private String description;
    private LocalDate date;

    public Mentory() {
    }

    public Mentory(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
