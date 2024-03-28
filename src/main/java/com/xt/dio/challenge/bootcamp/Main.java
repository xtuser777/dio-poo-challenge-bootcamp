package com.xt.dio.challenge.bootcamp;

import com.xt.dio.challenge.bootcamp.domain.Bootcamp;
import com.xt.dio.challenge.bootcamp.domain.Course;
import com.xt.dio.challenge.bootcamp.domain.Developer;
import com.xt.dio.challenge.bootcamp.domain.Mentory;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("curso java");
        course1.setDescription("descrição curso java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Course js");
        course2.setDescription("descrição curso js");
        course2.setWorkload(4);

        Mentory mentory = new Mentory();
        mentory.setTitle("mentoria de java");
        mentory.setDescription("descrição mentoria java");
        mentory.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentory);

        Developer devCamila = new Developer();
        devCamila.setName("Camila");
        devCamila.bootcampSubscribe(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedContents());
        devCamila.progressUp();
        devCamila.progressUp();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getDoneContents());
        System.out.println("XP:" + devCamila.calculateTotalXp());

        System.out.println("-------");

        Developer devJoao = new Developer();
        devJoao.setName("Joao");
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
