package com.example.magazin.controler;

import com.example.magazin.obiecte.Utilizator;
import com.example.magazin.obiecte.dto.UtilizatorDTO;
import com.example.magazin.service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilizatori")
public class UtilizatorController {

    @Autowired
    private UtilizatorService utilizatorService;

    @GetMapping("/{id}")
    public Utilizator afisareDupaId(@PathVariable int id) {
        return utilizatorService.afisareDupaId(id);
    }

    @GetMapping
    public List<Utilizator> afisareTuturorUseri() {
        return utilizatorService.afisareTuturorUseri();
    }

    @PostMapping
    public void introducereaUnuiUser(@RequestBody UtilizatorDTO utilizator) {
        utilizatorService.introducereaUnuiUser(utilizator);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilizator(@PathVariable int id) {
        utilizatorService.deleteUtilizator(id);
    }

    @PutMapping("/{id}/nume")
    public void modificareNumeDupaId(@PathVariable int id, @RequestParam String nume) {
        utilizatorService.modificareNumeDupaId(id, nume);
    }

    @PutMapping("/{id}/email")
    public void modificareEmailDupaId(@PathVariable int id, @RequestParam String email) {
        utilizatorService.modificareEmailDupaId(id, email);
    }
}
