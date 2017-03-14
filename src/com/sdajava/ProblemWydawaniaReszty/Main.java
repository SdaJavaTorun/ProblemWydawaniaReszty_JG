package com.sdajava.ProblemWydawaniaReszty;

public class Main {

    public int reszta;

    public Main (int reszta){
        this.reszta = reszta;
    }
    public void liczenie(){
        int [] tab = {200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (this.reszta > 0 ){
            if (this.reszta / tab[i] >= 1){
                int a = (int) this.reszta / tab[i];
                System.out.println("Nominał " + tab[i] + " x " + this.reszta / tab[i]);
                this.reszta = this.reszta - (a * tab[i]);

            }
            i++;
        }

    }
    public static void main(String[] args) {
        Main reszta = new Main(244);
        reszta.liczenie();
    }
}
