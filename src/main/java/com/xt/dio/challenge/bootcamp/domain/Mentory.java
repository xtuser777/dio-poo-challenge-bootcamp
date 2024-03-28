package com.xt.dio.challenge.bootcamp.domain;

import java.time.LocalDate;

public class Mentory extends Content {

    private LocalDate date;

    public Mentory() {
        super();
    }

    public Mentory(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double xpCalculate() {
        return XP_DEFAULT + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + this.date +
                '}';
    }
}
