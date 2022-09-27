import java.util.Scanner;

public class Main {

    private final static int Sueldo = 800000;
    private static String nu1,au1,nu2,au2,nu3,au3,nu4,au4,nu5,au5;
    private static int hu1,hu2,hu3,hu4,hu5;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A continuacion registraremos los siguientes datos a 5 personas, para asi mostrar su sueldo:");
        System.out.println("*Nombre");
        System.out.println("*Apellido");
        System.out.println("*Horas trabajadas");
        System.out.println("Hola usuario uno, digite su nombre.");
        nu1 = input.nextLine();
        System.out.println("ahora usuario uno, su apellido.");
        au1 = input.nextLine();
        System.out.println("Ahora usuario uno cuantas horas ha trabajado.");
        hu1 = input.nextInt();
        System.out.println("Usuari@ " +nu1+" "+au1+ " su sueldo es de: " +Sueldo);

        System.out.println("Hola usuario dos, digite su nombre.");
        nu2 = input.nextLine();
        System.out.println("ahora usuario dos, su apellido.");
        au2 = input.nextLine();
        System.out.println("Ahora usuario uno cuantas horas ha trabajado.");
        hu2 = input.nextInt();
        System.out.println("Usuari@ " +nu2+" "+au2+ " su sueldo es de: " +Sueldo);

        System.out.println("Hola usuario tres, digite su nombre.");
        nu3 = input.nextLine();
        System.out.println("ahora usuario tres, su apellido.");
        au3 = input.nextLine();
        System.out.println("Ahora usuario uno cuantas horas ha trabajado.");
        hu3 = input.nextInt();
        System.out.println("Usuari@ " +nu3 +" "+au3+ " su sueldo es de: " +Sueldo);

        System.out.println("Hola usuario tres, digite su nombre.");
        nu4 = input.nextLine();
        System.out.println("ahora usuario tres, su apellido.");
        au4 = input.nextLine();
        System.out.println("Ahora usuario uno cuantas horas ha trabajado.");
        hu4 = input.nextInt();
        System.out.println("Usuari@ " +nu4+" "+au4+ " su sueldo es de: " +Sueldo);

        System.out.println("Hola usuario tres, digite su nombre.");
        nu5 = input.nextLine();
        System.out.println("ahora usuario tres, su apellido.");
        au5= input.nextLine();
        System.out.println("Ahora usuario uno cuantas horas ha trabajado.");
        hu5 = input.nextInt();
        System.out.println("Usuari@ " +nu5+" "+au5+ " su sueldo es de: " +Sueldo);

    }

}
