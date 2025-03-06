import java.util.Scanner;

public class ingreso {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("*** Welcome ***");
        System.out.println("Seconds ");
        int seconds = lector.nextInt();
        
        int minutes = seconds/60;
        int secondsR = seconds%60;
        
        System.out.println("In " + seconds + "s are: " + minutes + " minutes and " + secondsR + " Seconds " );
        
    }
}

//nextInt() = leer enteros
//nextLine() = leer Strings 
//next().charAt(0) = leer un solo caracter 
// 