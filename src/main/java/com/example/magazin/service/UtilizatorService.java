package com.example.magazin.service;

import com.example.magazin.obiecte.Utilizator;

import com.example.magazin.obiecte.dto.UtilizatorDTO;
import java.util.List;

public interface UtilizatorService {
    Utilizator afisareDupaId(int id);

    List<Utilizator> afisareTuturorUseri();

    void introducereaUnuiUser(UtilizatorDTO utilizator);

    void deleteUtilizator(int id);
    void modificareNumeDupaId(int id, String nume);
    void modificareEmailDupaId(int id, String email);

}
