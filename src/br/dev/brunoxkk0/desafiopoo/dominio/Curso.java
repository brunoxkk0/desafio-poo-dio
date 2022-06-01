package br.dev.brunoxkk0.desafiopoo.dominio;

public class Curso extends Conteudo{

    private Long cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Long getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Long cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
