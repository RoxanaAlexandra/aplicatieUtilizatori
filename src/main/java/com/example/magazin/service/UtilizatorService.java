package com.example.magazin.service;

import com.example.magazin.obiecte.Utilizator;

import java.util.List;

public interface UtilizatorService {
    Utilizator afisareDupaId(int id);

    List<Utilizator> afisareTuturorUseri();

    void introducereaUnuiUser(String nume, String prenume, String email, int varsta);

    void deleteUtilizator(int id);
    void modificareNumeDupaId(int id, String nume);
    void modificareEmailDupaId(int id, String email);

}
