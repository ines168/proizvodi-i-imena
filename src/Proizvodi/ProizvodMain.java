package Proizvodi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProizvodMain {
    public static void main(String[] args) {
        List<Proizvod> proizvodi = new ArrayList<Proizvod>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Proizvod ima naziv, cijenu i količinu. Unesi proizvode. ");
        System.out.println("Završi unošenje sa 'stop'. \n");

        do {
            try {
                System.out.println("Unesi naziv proizvoda: ");
                String naziv = sc.nextLine();

                //stop prekida program
                if(naziv.toLowerCase().equals("stop")) {
                    break;
                }

                System.out.println("Unesite cijenu proizvoda: ");
                double cijena = sc.nextDouble();

                System.out.println("Unesite količinu proizvoda: ");
                int kolicina = sc.nextInt();
                //nextInt zajebava s enterom
                sc.nextLine();

                //kreira objekt i doda u listu proizvodi
                proizvodi.add(new Proizvod(naziv, cijena, kolicina));

            } catch (Exception e) {
                //Greške u tipu podatka ne prekida program
                System.out.println("Krivi tip podatka, pokušaj ponovno ili izađi sa 'stop'.");
                sc.nextLine();
            }

        } while(true);

        if(proizvodi.size()==0) {
            System.out.println("Niste unijeli niti jedan proizvod.");
        } else {
            //Izlistaj unešene proizvode toString metodom
            System.out.println("toString:");
            for (Proizvod proizvod : proizvodi) {
                System.out.println(proizvod);
            }

            //Izlistaj unešene proizvode dohvati metodom
            System.out.println("\n.dohvatiPodatke:");
            for (Proizvod proizvod : proizvodi) {
                System.out.println(proizvod.dohvatiPodatke());
            }
        }


    }
}
