/**
 * Created by Maudy on 19/05/2015.
 */
public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga bangun= new Segitiga();
        bangun.alas=5;
        bangun.tinggi=15;
        bangun.sisimiring=20;
        bangun.cetakkelayar();

        System.out.println("Luas:"+bangun.hitungluas());
        System.out.println("Keliling:"+bangun.hitungkeliling());
    }

}
