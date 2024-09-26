import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        ListaDoble ld = new ListaDoble();

        boolean salir = true;
        while(salir){
            System.out.println("1. insertar un número");
            System.out.println("2. Imprimir cola");
            System.out.println("3. imprimir pila");
            System.out.println("4. Salir");
            System.out.print("Digite una opción: ");
            String opc = leer.next();

            switch (opc) {
                case "1":
                    System.out.print("Digita un número: ");
                    int num = leer.nextInt();
                    ld.insertarFinal(num);
                    break;
                
                case "2":
                    System.out.println("Imprimiendo cola");
                    ld.imprimirCola();
                    break;
                
                case "3":
                    System.out.println("imprimiendo pila");
                    ld.imprimirPila();
                    break;
                case "4":
                    salir = false;
                default:
                    System.out.println("Opción incorrecta!");
                    break;
            }
            System.out.println();
        }
    }
}
