package com.example.magazin.obiecte.dto;

public class UtilizatorDTO {
  private String nume;
  private String prenume;
  private String email;
  private int varsta;

  public UtilizatorDTO() {
  }

  public UtilizatorDTO(String nume, String prenume, String email, int varsta) {
    this.nume = nume;
    this.prenume = prenume;
    this.email = email;
    this.varsta = varsta;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public String getPrenume() {
    return prenume;
  }

  public void setPrenume(String prenume) {
    this.prenume = prenume;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getVarsta() {
    return varsta;
  }

  public void setVarsta(int varsta) {
    this.varsta = varsta;
  }
}
