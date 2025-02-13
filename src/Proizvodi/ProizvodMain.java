package Proizvodi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProizvodMain {
    public static void main(String[] args) {
        List<Proizvod> proizvodi = new ArrayList<Proizvod>();

        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Unesi naziv proizvoda: ");
                String naziv = sc.nextLine();

                if(naziv.equals("stop")) {
                    break;
                }

                System.out.println("Unesite cijenu proizvoda: ");
                double cijena = sc.nextDouble();

                System.out.println("Unesite količinu proizvoda: ");
                int kolicina = sc.nextInt();
                sc.nextLine();

                proizvodi.add(new Proizvod(naziv, cijena, kolicina));

            } catch (Exception e) {
                System.out.println("Krivi tip podatka, pokušaj ponovno ili izađi sa 'stop'.");
                sc.nextLine();
            }

        } while(true);

        for (Proizvod proizvod : proizvodi) {
            System.out.println(proizvod);
        }
    }
}
