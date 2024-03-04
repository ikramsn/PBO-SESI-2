public class segitiga {

    private double alas;
    private double tinggi;
    private double sisi;

    public void setALas ( double alas){
        this.alas = alas;
    }

    public void setTinggi ( double tinggi){
        this.tinggi = tinggi;
    }

    public void setSisi ( double sisi){
        this.sisi = sisi;
    }


    public void setLuas ( ){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah : " + luas);
    }

    public void setKeliling ( ){
        double keliling = alas +tinggi + sisi;
        System.out.println("keliling segitiga adalah : " + keliling);
    }

}