package circle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double raio, xponto, yponto, xcirc, ycirc, area, perimetro, calculo, quadrado;
        
        System.out.println("Informe aqui o valor X do centro do cículo: ");
        xcirc = input.nextDouble();
        
        System.out.println("Informe aqui o valor Y do centro do cículo: ");
        ycirc = input.nextDouble();
        
        System.out.println("Informe aqui o raio: ");
        raio = input.nextDouble();
        
        System.out.println("Informe aqui o valor X  do ponto: ");
        xponto = input.nextDouble();
        
        System.out.println("Informe aqui o valor Y do ponto: ");
        yponto = input.nextDouble();
        
        area = 3.14 * (raio * raio);
        perimetro = 6.28 * raio;
        calculo = ((xponto - xcirc) * (xponto - xcirc)) + ((yponto - ycirc) * (yponto - ycirc));
        quadrado = raio * raio;
        
    
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
            
        if (calculo == quadrado){
            System.out.println("O ponto PERTENCE a circunferencia");
        }
         if (calculo >= quadrado){
            System.out.println("O ponto esta EXTERNO a circunferencia");
        }
          if (calculo <= quadrado){
            System.out.println("O ponto esta INTERNO a circunferencia");
        }
        
        
      
    }
    
}