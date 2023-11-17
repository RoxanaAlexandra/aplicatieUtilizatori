package com.example.magazin.service.implementare;

import com.example.magazin.obiecte.Utilizator;
import com.example.magazin.repository.UtilizatorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UtilizatorServiceImplementareTest {

    @Mock
    private UtilizatorRepository utilizatorRepository;

    @InjectMocks
    private UtilizatorServiceImplementare utilizatorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAfisareDupaId() {
        // Mock data
        Utilizator mockUtilizator = new Utilizator();
        mockUtilizator.setId(1);
        when(utilizatorRepository.findById(1)).thenReturn(Optional.of(mockUtilizator));

        // Test
        Utilizator result = utilizatorService.afisareDupaId(1);

        // Verify and assert
        verify(utilizatorRepository, times(1)).findById(1);
        assertEquals(1, result.getId());
    }

    @Test
    void testAfisareTuturorUseri() {
        // Mock data
        List<Utilizator> mockUtilizatori = Arrays.asList(new Utilizator(), new Utilizator());
        when(utilizatorRepository.findAll()).thenReturn(mockUtilizatori);

        // Test
        List<Utilizator> result = utilizatorService.afisareTuturorUseri();

        // Verify and assert
        verify(utilizatorRepository, times(1)).findAll();
        assertEquals(2, result.size());
    }

    @Test
    void testIntroducereaUnuiUser() {
        // Mock data
        Utilizator mockUtilizator = new Utilizator();
        when(utilizatorRepository.save(any(Utilizator.class))).thenReturn(mockUtilizator);

        // Test
        utilizatorService.introducereaUnuiUser("Roxana", "Szabo", "email.email@yahoo.com", 98);

        // Verify
        verify(utilizatorRepository, times(1)).save(any(Utilizator.class));
    }

    @Test
    void testDeleteUtilizator() {
        // Test
        utilizatorService.deleteUtilizator(1);

        // Verify
        verify(utilizatorRepository, times(1)).deleteById(1);
    }

    @Test
    void testModificareNumeDupaId() {
        // Mock data
        Utilizator mockUtilizator = new Utilizator();
        mockUtilizator.setId(1);
        when(utilizatorRepository.findById(1)).thenReturn(Optional.of(mockUtilizator));
        when(utilizatorRepository.save(any(Utilizator.class))).thenReturn(mockUtilizator);

        // Test
        utilizatorService.modificareNumeDupaId(1, "Alexandra");

        // Verify
        verify(utilizatorRepository, times(1)).findById(1);
        verify(utilizatorRepository, times(1)).save(any(Utilizator.class));
        assertEquals("Alexandra", mockUtilizator.getNume());
    }

    @Test
    void testModificareEmailDupaId() {
        // Mock data
        Utilizator mockUtilizator = new Utilizator();
        mockUtilizator.setId(1);
        when(utilizatorRepository.findById(1)).thenReturn(Optional.of(mockUtilizator));
        when(utilizatorRepository.save(any(Utilizator.class))).thenReturn(mockUtilizator);

        // Test
        utilizatorService.modificareEmailDupaId(1, "new.email@example.com");

        // Verify
        verify(utilizatorRepository, times(1)).findById(1);
        verify(utilizatorRepository, times(1)).save(any(Utilizator.class));
        assertEquals("new.email@example.com", mockUtilizator.getEmail());
    }
}