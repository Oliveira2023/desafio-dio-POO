import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descriçaõ mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Camila:\n" + devCamila.getConteudosInscritos());
        System.out.println("Progrediu->");
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila:\n" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:\n" + devCamila.getConteudosConcluidos());
        System.out.println("XP:\n" + devCamila.calcularTotalXp());

        System.out.println("-------");
        Dev devjoao = new Dev();
        devjoao.setNome("Joao");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João:\n" + devjoao.getConteudosInscritos());
        System.out.println("Progrediu->");
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("Conteudos Inscritos João:\n" + devjoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João:\n" + devjoao.getConteudosConcluidos());
        System.out.println("XP:\n" + devjoao.calcularTotalXp());
    }
}