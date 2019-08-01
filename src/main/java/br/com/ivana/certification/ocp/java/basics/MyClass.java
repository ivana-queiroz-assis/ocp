package br.com.ivana.certification.ocp.java.basics;


/**
 * javac MyClass.java to compile and
 * java MyClass HelloWorld
 */
public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}

