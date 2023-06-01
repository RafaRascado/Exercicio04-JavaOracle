import java.lang.*;
import java.util.*;

public class ComputeMethods{

  public void fToC(double degreesF){ 
    double tempC = (degreesF - 32) * 5 / 9;
    System.out.println(tempC);
  }
  
  public void hypotenuse (double a, double b){
    a = Math.pow(a, 2);
    b = Math.pow(b, 2);
    double c = a + b; 
    System.out.println(c);
  } 
  
  public void roll(){
    Random ran = new Random(); 
    int a = ran.nextInt(7);
    Random ranB = new Random();
    int b = ranB.nextInt(7);

    System.out.println(a + b);
  }

  public void exibirNome(){
    Scanner teclado = new Scanner(System.in); 
    System.out.println("Insira o primeiro nome");
    String primeiroNome = teclado.nextLine();
    System.out.println("Insira o segundo nome");
    String segundoNome = teclado.nextLine();

    segundoNome = segundoNome.replace(segundoNome, segundoNome + ",");
    
    System.out.println("Seu nome é: " + segundoNome + " " + primeiroNome.charAt(0) + ".");
  }

}