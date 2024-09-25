package br.com.fiap.cp_filmes.dto;

import br.com.fiap.cp_filmes.model.Filme;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmeDTO {

    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private Integer anoDeLancamento;
    @NotBlank
    private String genero;
    @NotBlank
    private String classificacao;

    public FilmeDTO(Filme entity) {
        this.id = entity.getId();
        this.titulo = entity.getTitulo();
        this.anoDeLancamento = entity.getAnoDeLancamento();
        this.genero = entity.getGenero();
        this.classificacao = entity.getClassificacao();
    }

}
