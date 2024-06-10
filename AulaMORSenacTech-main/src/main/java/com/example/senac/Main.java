package com.example.senac;

import com.example.senac.model.Author;
import com.example.senac.model.Telefone;
import com.example.senac.model.Usuario;
import com.example.senac.model.Vulneravel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Object usuario;

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Criar vulneravel
        Vulneravel vulneravel = new Vulneravel();
        vulneravel.setNome("João Silva");
        vulneravel.setEndereco("João Pessoa");
        vulneravel.setCep("9170-788");
        vulneravel.setDataNascimento(null);
        vulneravel.setMotivoCadastro();
         
        // Salvar vulnerável
         em.persist(vulneravel);


        // Criar Usario

        // Criar telefones
        Telefone telefone1 = new Telefone("123456789", "Celular");
        Telefone telefone2 = new Telefone("987654321", "Fixo");

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(telefone1);
        telefones.add(telefone2);

        // Associar telefones ao autor
        Usuario.setTelefones(telefones);

        // Salvar autor e telefones
        em.persist(usuario);


        // Criar Usuario
        Usuario usuario = new Usuario();
        usuario.setNome("Java Persistence with JPA");

        //Associar Velneravel ao Usuario
        usuario.setUsuario(usuario);

        // Salvar autor e telefones
        em.persist(usuario);


        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Autor e telefones salvos com sucesso!");
    }
}
