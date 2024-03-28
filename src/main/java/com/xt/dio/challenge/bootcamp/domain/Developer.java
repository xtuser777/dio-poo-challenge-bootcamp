package com.xt.dio.challenge.bootcamp.domain;

import java.util.*;

public class Developer {

    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> doneContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getDoneContents() {
        return doneContents;
    }

    public void setDoneContents(Set<Content> doneContents) {
        this.doneContents = doneContents;
    }

    public void bootcampSubscribe(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscriptedDevs().add(this);
    }

    public void progressUp() {
        Optional<Content> conteudo = this.subscribedContents.stream().findFirst();
        if(conteudo.isPresent()) {
            this.doneContents.add(conteudo.get());
            this.subscribedContents.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        Iterator<Content> iterator = this.doneContents.iterator();
        double sum = 0;
        while(iterator.hasNext()){
            double next = iterator.next().xpCalculate();
            sum += next;
        }
        return sum;

        /*return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();*/
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribedContents, developer.subscribedContents) && Objects.equals(doneContents, developer.doneContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, doneContents);
    }
}
