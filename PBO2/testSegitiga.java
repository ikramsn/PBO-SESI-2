public class testSegitiga {
    
    public static void main(String[] args) {
        segitiga luasSegitiga = new segitiga();

        luasSegitiga.setALas(2);
        luasSegitiga.setTinggi(5);
        luasSegitiga.setLuas();

        segitiga kelilingSegitiga = new segitiga();

        kelilingSegitiga.setALas(5);
        kelilingSegitiga.setTinggi(5);
        kelilingSegitiga.setSisi(5);
        kelilingSegitiga.setKeliling();
    }
}
