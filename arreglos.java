import java.util.Scanner; 

public class arreglos {
    public static double calcularPromedio(double[] n){
        double resultado = 0;
        
        for(int i = 0; i<n.length; i++){
            resultado+=n[i];
        }

        resultado = resultado/5.0;
        return resultado;
    }

    public static void main(String args[]){
        Scanner lector=new Scanner(System.in);
        
        int cantidaddeNotas = 5;
        double [] notas = new double[cantidaddeNotas];

        System.out.println("Ingrese las notas de Juan ");

        for (int i = 0;i<cantidaddeNotas;i++){
            System.out.println("Ingrese la nota numero "+ (i+1));
            double nota = lector.nextDouble();
            notas[i] = nota;
        }

        double prom = calcularPromedio(notas);
        System.out.println("Este es el promedio: " +prom);

    }
}
