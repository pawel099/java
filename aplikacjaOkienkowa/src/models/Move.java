package models;

public class Move {

 protected String tytul;
 protected int year;
 protected String kategoria;
 protected int length;

     public Move (String tytul,String kategoria, Integer year ,Integer length) {

           this.tytul= tytul;
           this.year = year;
           this.kategoria = kategoria;
           this.length = length;

     }


    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
