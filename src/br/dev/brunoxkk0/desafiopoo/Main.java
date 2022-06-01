package br.dev.brunoxkk0.desafiopoo;

import br.dev.brunoxkk0.desafiopoo.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}
