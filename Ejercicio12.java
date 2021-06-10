import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contadorF = 0;
        int sumarAlturaF = 0;
        int contadorM = 0;
        int sumarAlturaM = 0;
        int sumaEdades = 0;
        int contadorEdades = 0;
        int altura;
        int edad;
        String sexo;

        do {
            System.out.println("");
            System.out.println("INFORMACION: Para salir ingrese una altura negativa");

            System.out.println("Ingrese altura");
            altura = entrada.nextInt();

            if(altura < 0){
                System.out.println("Adios");
                break;
            }

            System.out.println("ingrese edad");
            edad = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese sexo f = femenino ó  m = masculino");
            sexo = entrada.nextLine();

            //Registro de Datos
            if (sexo.equals("f")) {
                contadorF++;
                sumarAlturaF = sumarAlturaF + altura;
            } else if(sexo.equals("m")){
                contadorM++;
                sumarAlturaM = sumarAlturaM + altura;
            }
            contadorEdades++;
            sumaEdades = sumaEdades + edad;
        } while (true);

        int promedioAF = (sumarAlturaF/ contadorF);
        int promedioAM = (sumarAlturaM/ contadorM);
        int promedioEdades = (sumaEdades/ contadorEdades);

        System.out.println("El promedio Alturas Femeninas es: " + promedioAF);
        System.out.println("El promedio Alturas Masculinas es: " + promedioAM);
        System.out.println("El promedio de edades : " + sumaEdades/ contadorEdades);


    }
}