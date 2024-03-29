package com.xt.dio.challenge.bootcamp;

import com.xt.dio.challenge.bootcamp.domain.Bootcamp;
import com.xt.dio.challenge.bootcamp.domain.Course;
import com.xt.dio.challenge.bootcamp.domain.Developer;
import com.xt.dio.challenge.bootcamp.domain.Mentory;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(
        "curso java", "descrição curso java", 8);

        Course course2 = new Course(
        "Course js", "descrição curso js", 4);

        Mentory mentory = new Mentory(
        "mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp(
        "Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentory);

        Developer devCamila = new Developer("Camila");
        devCamila.bootcampSubscribe(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedContents());
        devCamila.progressUp();
        devCamila.progressUp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getDoneContents());
        System.out.println("XP:" + devCamila.calculateTotalXp());

        System.out.println("-------");

        Developer devJoao = new Developer("Joao");
        devJoao.bootcampSubscribe(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedContents());
        devJoao.progressUp();
        devJoao.progressUp();
        devJoao.progressUp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedContents());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getDoneContents());
        System.out.println("XP:" + devJoao.calculateTotalXp());
    }
}
