package br.com.ivana.certification.ocp.java.basics;

public class Tester {
    int x = 10;

    public static void main(String[] args) {
        Tester test = new Tester();
        int x = 1;
        for (int y = 0; y < 3; y++) {
            x++;
        }
        System.out.println("x is: " + test.x);

    }
}
