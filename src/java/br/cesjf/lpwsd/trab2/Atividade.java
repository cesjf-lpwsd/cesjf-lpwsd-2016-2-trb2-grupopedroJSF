
package br.cesjf.lpwsd.trab2;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atividade implements Serializable {
    private String nomeAtividade;
    private String status;
    private float valor;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ArrayList<String> turma = new ArrayList<String> ();

    public Atividade() {
    }
    public void inserirAtividade(Aluno a){
        turma.add(a.getNome());
    }
    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<String> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<String> turma) {
        this.turma = turma;
    }

}
