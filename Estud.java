package costrutoresEsobrecarga;

public class Estud {
    
    private String mtr;
    private String nom;
    private double[] nts;

    public Estud() {}
    public Estud(String mtr, String nom, double[] nts) {
        this.mtr = mtr;
        this.nom = nom;
        this.nts = nts;
    }

    public void setMtr(String mtr) {
        this.mtr = mtr;
    }
    public String getMtr() {
        return this.mtr;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
    public void setNts(double... nts) {
        this.nts = nts;
    }
    public double[] getNts() {
        return this.nts;
    }
    public void OutPut() {
        System.out.println(this.mtr);
        System.out.println(this.nom);
        for (double nt : nts) {
            System.out.println(nt);
        }
    }

}
