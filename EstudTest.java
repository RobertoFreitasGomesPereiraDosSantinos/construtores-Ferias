package costrutoresEsobrecarga;

public class EstudTest {
    public static void main(String... args) {
        Estud est = new Estud("41344", "roberto", new double[]{7.5,8.6,9,8.5});
        Estud est2 = new Estud();
        est.OutPut();
        est2.setNom("paulatejano");
        est2.setMtr("89786");
        est2.setNts(9,8,8.5,9);
        est2.OutPut();
    }
}
