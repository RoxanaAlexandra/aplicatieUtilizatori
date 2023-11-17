package com.example.magazin.repository;

import com.example.magazin.obiecte.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilizatorRepository extends JpaRepository<Utilizator, Integer> {
    // Metode specifice pentru interogări pot fi adăugate aici, JpaRepository oferă deja metode CRUD standard
}