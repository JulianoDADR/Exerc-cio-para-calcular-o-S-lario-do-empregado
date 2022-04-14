package Entrada;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nr;
        int h;
        double s;
        double r;
        
        System.out.println("Digite o numero de matrícula?");
        nr = sc.next();
        
        System.out.println("Digite o numero de horas trabalhadas:");
        h = sc.nextInt();

        System.out.println("Digite o valor das suas horas trabalhada:");
        s = sc.nextDouble();

        r = s * h;

        System.out.println(nr+" receberá "+r);

        sc.close();

    }

}