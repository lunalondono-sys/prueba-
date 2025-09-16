public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es PAR");
        } else {
            System.out.println(numero + " es IMPAR");
        }

        sc.close();
    }
}


public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i += 5) {
            System.out.println(i);
        }
    }
}


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es PAR");
        } else {
            System.out.println(numero + " es IMPAR");
        }

        
        System.out.println("Números del 1 al 100 de 5 en 5:");
        for (int i = 1; i <= 100; i += 5) {
            System.out.println(i);
        }

        sc.close();
    }
}


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad en años: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 5) {
            System.out.println("Etapa: Primera infancia");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("Etapa: Infancia");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Etapa: Adolescencia");
        } else if (edad >= 18 && edad <= 26) {
            System.out.println("Etapa: Juventud");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("Etapa: Adultez");
        } else if (edad >= 60) {
            System.out.println("Etapa: Vejez");
        } else {
            System.out.println("Edad inválida");
        }

        sc.close();
    }
}

 
