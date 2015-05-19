/**
 * Created by Maudy on 19/05/2015.
 */
public class Lingkaran {
    int jari2;
    int diameter;

    public void cetakkelayar(){
        System.out.println("jari-jari:"+jari2);
        System.out.println("diameter:"+diameter);
    }

    public void ubahbangunan(int jariBaru,int diameterBaru){
        jari2=jariBaru;
        diameter=diameterBaru;
    }

    public double hitungluas(){
        double luas;
        luas=3.14*jari2*jari2;
        return luas;
    }

    public double hitungkeliling(){
        double keliling;
        keliling=3.14*diameter;
        return keliling;
    }
}
