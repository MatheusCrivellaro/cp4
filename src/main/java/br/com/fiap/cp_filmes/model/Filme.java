package br.com.fiap.cp_filmes.model;

import br.com.fiap.cp_filmes.dto.FilmeDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private Integer anoDeLancamento;
    @NotBlank
    private String genero;
    @NotBlank
    private String classificacao;

    public Filme(FilmeDTO filmeDTO) {
        this.id = filmeDTO.getId();
        this.titulo = filmeDTO.getTitulo();
        this.anoDeLancamento = filmeDTO.getAnoDeLancamento();
        this.genero = filmeDTO.getGenero();
        this.classificacao = filmeDTO.getClassificacao();
    }

}
