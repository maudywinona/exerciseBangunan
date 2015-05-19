/**
 * Created by Maudy on 19/05/2015.
 */
public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran bangun= new Lingkaran();
        bangun.jari2=15;
        bangun.diameter=30;
        bangun.cetakkelayar();

        System.out.println("luas:"+bangun.hitungluas());
        System.out.println("keliling:"+bangun.hitungkeliling());
    }

}
