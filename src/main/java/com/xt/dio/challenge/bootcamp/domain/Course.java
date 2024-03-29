package com.xt.dio.challenge.bootcamp.domain;

public class Course extends Content {

    private Integer workload;

    public Course() {
        super();
    }

    public Course(String title, String description, Integer workload) {
        super(title, description);
        this.workload = workload;
    }

    @Override
    public double xpCalculate() {
        return XP_DEFAULT + this.workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso{" + "'" + getTitle() + '\'' + '}';
    }
}
