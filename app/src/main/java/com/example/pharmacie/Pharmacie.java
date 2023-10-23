package com.example.pharmacie;
import androidx.annotation.NonNull;

import java.util.ArrayList;
public class Pharmacie {
    private String nom;
    private String Addresse;
    private String number;
    private String place;
    private boolean parapharmacy;
    private static ArrayList<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
    Pharmacie(){

    }
    Pharmacie(String nom, String addresse, String number, String place, Boolean parapharmacy){
        this.nom = nom;
        this.Addresse = addresse;
        this.number = number;
        this.place = place;
        this.parapharmacy = parapharmacy;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setAddresse(String addresse){
        this.Addresse = addresse;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setParapharmacy(Boolean parapharmacy){
        this.parapharmacy = parapharmacy;
    }
    public void setPlace(String place){
        this.place = place;
    }
    public String getPlace(){
        return place;
    }
    public String getNom(){
        return  nom;
    }
    public String getAddresse(){
        return Addresse;
    }
    public String getNumber(){
        return number;
    }
    public boolean getParapharmacy(){
        return  parapharmacy;
    }
    public static ArrayList<Pharmacie> getPharmacies(){
        return pharmacies;
    }
    public static Pharmacie Recheche(String  place){
        for (Pharmacie pharmacie : pharmacies){
            if(pharmacie.getPlace().equals(place)){
                return pharmacie;
            }
        }
        return null;
    }
    public static void addPharmacie(Pharmacie pharmacie){
        pharmacies.add(pharmacie);
    }


    @Override
    public String toString() {
        return "Name : "+nom+ " Location : "+ Addresse+ " The place : "+ place + " is Parapharmacie : "+ parapharmacy;
    }
}
