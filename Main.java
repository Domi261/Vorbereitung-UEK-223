public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto("Mercedes", "Schwarz", 250, 180000);
        a1.fahren();
        a1.hupen();

        System.out.println("Hersteller: " + a1.getHersteller());
        System.out.println("Autofarbe: " + a1.getAutofarbe());
        System.out.println("PS: " + a1.getPs());
        System.out.println("Preis: " + a1.getPreis());

        Auto a2 = new Auto("Lamborghini", "Gelb", 300, 250000);
        a2.fahren();
        a2.hupen();

        System.out.println("Hersteller: " + a2.getHersteller());
        System.out.println("Autofarbe: " + a2.getAutofarbe());
        System.out.println("PS: " + a2.getPs());
        System.out.println("Preis: " + a2.getPreis());

        // Zugriff auf den Zähler
        System.out.println("Es sind aktuell " + Auto.getZaehler() + " Autos im Bestand.");
    }
}
