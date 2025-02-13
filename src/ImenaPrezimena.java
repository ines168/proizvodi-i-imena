public class ImenaPrezimena {
    public static void main(String[] args) {
        //Kreirati petlju koja će uzimati imena i prezime i skombinirati ih u random imena.
        for(int i = 0; i< 10; i++) {
            System.out.println(randomImePrezime());
        }
    }

    public static String randomImePrezime() {
        String[] imena = {"mara", "pero", "saša", "vita"};
        String[] prezimena = {"marić", "perić", "šarić", "barić", "carić", "arić", "erić"};

        //Math.random za random index u imenima
        int indexIme = (int)(Math.random()*imena.length);

        //Math.random za random index u prezimenima
        int indexPrezime = (int)(Math.random()*prezimena.length);

        //ime na random indexu + prezime na random indexu
        String ime = imena[indexIme] + " " + prezimena[indexPrezime];
        return ime;
    }
}
