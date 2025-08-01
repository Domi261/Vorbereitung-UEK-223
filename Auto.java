public class Auto {

    private String hersteller;
    private String autofarbe;
    private int ps;
    private int preis;

    static private int zaehler = 0;

    public Auto(String hersteller, String autofarbe, int ps, int preis) {
        this.hersteller = hersteller;
        this.autofarbe = autofarbe;
        this.ps = ps;
        this.preis = preis;

        Auto.zaehler++;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getAutofarbe() {
        return autofarbe;
    }

    public void setAutofarbe(String autofarbe) {
        this.autofarbe = autofarbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {

        if (ps > 0) {

            this.ps = ps;

        } else {

            System.out.println("Hierbei handelt es sich um eine ungültige PS Angabe");
        }

    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {

        if (preis > 0) {

            this.preis = preis;

        } else {

            System.out.println("Hierbei handelt es sich um eine ungültige PS Angabe");
        }

    }

    public static int getZaehler() {
        return zaehler;
    }

    public void fahren() {
        System.out.println("Das Auto fährt");
    }

    public void hupen() {
        System.out.println("Das Auto hupt");
    }

}
