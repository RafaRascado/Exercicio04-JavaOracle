import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    // Scanner teclado = new Scanner(System.in);
    
    // System.out.println("Informe a temperatura");
    // double tempFaren = teclado.nextDouble();

    // double celsius = (tempFaren - 32) * 5/9;
    // System.out.println(celsius);

    // System.out.println("Informe os dois lados do triângulo");

    // double ladoA = teclado.nextDouble();
    // double ladoB = teclado.nextDouble();

    // ladoA = Math.pow(ladoA, 2);
    // ladoB = Math.pow(ladoB, 2);

    // double ladoC = ladoA + ladoB;

    // System.out.println(ladoC);

    ComputeMethods compu = new ComputeMethods();

   compu.fToC(100.41);
   compu.hypotenuse(3, 3);
   compu.roll();
  compu.exibirNome();
  }
}