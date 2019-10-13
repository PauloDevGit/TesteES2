package WorldTime;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //Introduzir o pais
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um pais:");
        String country = scanner.next();

        //Uso da classe WorldTime para usar o método getTimeCountry
        /**
         * Qualquer coisa
         */
        WorldTime time = new WorldTime();
        time.getTimeByCountry(country);

    }

}
