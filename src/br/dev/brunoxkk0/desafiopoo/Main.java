package br.dev.brunoxkk0.desafiopoo;

import br.dev.brunoxkk0.desafiopoo.dominio.Bootcamp;
import br.dev.brunoxkk0.desafiopoo.dominio.Curso;
import br.dev.brunoxkk0.desafiopoo.dominio.Devs;
import br.dev.brunoxkk0.desafiopoo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo a desenvolver em Java.");
        curso1.setCargaHoraria(8L);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprendendo a desenvolver em JavaScript.");
        curso2.setCargaHoraria(4L);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());
//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs devMaria = new Devs();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();

        System.out.println("====");

        System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("Xp Maria: " + devMaria.calcularTotalXp());


        System.out.println("----");

        Devs devPaulo = new Devs();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("====");

        System.out.println("Conteudos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("Xp Paulo: " + devPaulo.calcularTotalXp());



    }

}
