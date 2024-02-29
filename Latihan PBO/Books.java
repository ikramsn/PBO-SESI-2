class Books {
  private String penulis;
  private String judul;
  private int harga;
  private int nomorPenerbit;

  public Books(String penulis, String judul, int harga, int nomorPenerbit) {
      this.penulis = penulis;
      this.judul = judul;
      this.harga = harga;
      this.nomorPenerbit = nomorPenerbit;
  }

  public int getHarga() {
      return harga;
  }
}
