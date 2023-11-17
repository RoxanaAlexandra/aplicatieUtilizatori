package com.example.magazin.service.implementare;

import com.example.magazin.obiecte.Utilizator;
import com.example.magazin.repository.UtilizatorRepository;
import com.example.magazin.service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilizatorServiceImplementare implements UtilizatorService {

    @Autowired
    private UtilizatorRepository utilizatorRepository;

    @Override
    public Utilizator afisareDupaId(int id) {
        return utilizatorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Utilizator> afisareTuturorUseri() {
        return utilizatorRepository.findAll();
    }

    @Override
    public void introducereaUnuiUser(String nume, String prenume, String email, int varsta) {
        Utilizator utilizator = new Utilizator();
        utilizator.setNume(nume);
        utilizator.setPrenume(prenume);
        utilizator.setEmail(email);
        utilizator.setVarsta(varsta);
        utilizatorRepository.save(utilizator);

    }

    @Override
    public void deleteUtilizator(int id) {
        utilizatorRepository.deleteById(id);
    }

    @Override
    public void modificareNumeDupaId(int id, String nume) {
        Utilizator utilizator = afisareDupaId(id);
        utilizator.setNume(nume);
        utilizatorRepository.save(utilizator);
    }

    @Override
    public void modificareEmailDupaId(int id, String email) {
        Utilizator utilizator = afisareDupaId(id);
        utilizator.setEmail(email);
        utilizatorRepository.save(utilizator);
    }

}
