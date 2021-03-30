package com.company;

import java.util.Scanner;

public class  Account {
    private String Imie;
    private String Nazwisko;
    private String Haslo;
    private String Dzial;
    private String Email;
    private int PojemnoscSkrzynki = 1000;
    private int DomyslneHasloLosowe = 10;
    private String MailZapasowy;
    private String SkrotFirmowy = "firma.com";
    private String pokazInformacjeOKoncie;

    // konstruktor tworzący Imię i Nazwisko
    public Account(String Imie, String Nazwisko) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        System.out.println("Utworzono konto: " + this.Imie + " " + this.Nazwisko);

        // Tworzymy metodę pytającą o Dział i getujemy Dział
        this.Dzial = wybierzDzial();
        System.out.println("Dział: " + this.Dzial);

        // Wywołuję metodę, która zwraca losowe hasło
        this.Haslo = HasloLosowe(DomyslneHasloLosowe);
        System.out.println("Twoje hasło to: " + this.Haslo);

        // Tworzenie adresu emailowego
        Email = Imie.toLowerCase() + "." + Nazwisko.toLowerCase() + "@" + Dzial + "." + SkrotFirmowy;
        System.out.println("Adres Twojej skrzynki pocztowej to: " + Email);

    }

        // Pytanie o Dział
    private String wybierzDzial() {
        System.out.println("Wybierz Dział\n1 Ksiegowosc\n2 Sprzedaż\n3 Magazyn\n4 Technologia\n5 Logistyka\n6 Produkcja\n0 Administracja\nWprowadź nazwę działu: ");
        Scanner in = new Scanner(System.in);
        int WyborDzialu = in.nextInt();
        if (WyborDzialu == 1) { return "Księgowość"; }
        else if (WyborDzialu == 2) { return "Sprzedaż"; }
        else if (WyborDzialu == 3) { return "Magazyn"; }
        else if (WyborDzialu == 4) { return "Technologia"; }
        else if (WyborDzialu == 5) { return "Logistyka"; }
        else if (WyborDzialu == 6) { return "Produkcja"; }
        else if (WyborDzialu == 0) { return "Administracja"; }
        return null;
    }


        // Tworzenie losowego hasła
    private String HasloLosowe(int dlugosc) {
        String UstawienieHasla = "ABCDEFGHIJKLMNOPRSTUWXYZabcdefghijklmnoprstuvwxyz1234567890!@#$%^&*():?";
        char[] haslo = new char[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            int rand = (int) (Math.random() * UstawienieHasla.length());
            haslo[i] = UstawienieHasla.charAt(rand);
        }
        return new String(haslo);
        }

        // Ustawienie PojemnoscSkrzynki
        public void setPojemnosciSkrzynki(int pojemnosc) {
            this.PojemnoscSkrzynki = pojemnosc;
        }

        // Ustawienie MailZapasowy
        public void setMailZapasowy(String drugiEmail) {
            this.MailZapasowy = drugiEmail;
        }

        // Zmiana hasła
        public void changeHaslo(String Haslo) {
            this.Haslo = Haslo;
        }

        public int getPojemnoscSkrzynki() {
            return PojemnoscSkrzynki;
        }

        public String getMailZapasowy() {
            return MailZapasowy;
        }

        public String getHaslo() {
            return Haslo;
        }

        //public String PokazInformacjeOKoncie() {
        //    return "Informacje o koncie: " + Imie + Nazwisko +
        //            "Poczta firmowa: " + Email +
        //            "Pojemność skrzynki: " + PojemnoscSkrzynki + "mb";
        //}

    public String getPokazInformacjeOKoncie() {
        return "Informacje o koncie: " + Imie + " " + Nazwisko + " " +
                "Poczta firmowa: " + Email + " " +
                "Pojemność skrzynki: " + PojemnoscSkrzynki + "MB";
    }
}
