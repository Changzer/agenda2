package Entities;

import java.time.LocalDateTime;

public class AbstractEntity {
    private Long id;
    private LocalDateTime cadastro;
    private LocalDateTime atualizado;
    private LocalDateTime excluido;

    public AbstractEntity() {
    }

    public AbstractEntity(Long id, LocalDateTime cadastro, LocalDateTime atualizado, LocalDateTime excluido) {
        this.id = id;
        this.cadastro = cadastro;
        this.atualizado = atualizado;
        this.excluido = excluido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCadastro() {
        return cadastro;
    }

    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }

    public LocalDateTime getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(LocalDateTime atualizado) {
        this.atualizado = atualizado;
    }

    public LocalDateTime getExcluido() {
        return excluido;
    }

    public void setExcluido(LocalDateTime excluido) {
        this.excluido = excluido;
    }
}
