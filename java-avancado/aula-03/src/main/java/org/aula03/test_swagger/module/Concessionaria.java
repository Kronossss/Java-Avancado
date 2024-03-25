package org.aula03.test_swagger.module;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Concessionaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany
    private List<Carro> carros;

    public Concessionaria() {
    }

    public Concessionaria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    public String toString(){
        String str = "";
        for(Carro carro : carros)
            str += carro.toString();
        return "Concessionária: "+nome+
                "\nCarros:\n"+str;
    }

    public void mostrarConcessionaria(){
        System.out.println(toString());
    }

}
