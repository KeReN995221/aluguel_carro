package application;

import model.entites.CarRental;
import model.entites.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = keyboard.nextLine();
        System.out.println("Retirada (dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(keyboard.nextLine(), fmt);

        System.out.println("Retorno (dd/MM/yyyy): ");
        LocalDateTime finish = LocalDateTime.parse(keyboard.nextLine(), fmt);

        CarRental newCarRental = new CarRental(start, finish, new Vehicle(carModel));

        keyboard.close();
    }
}
