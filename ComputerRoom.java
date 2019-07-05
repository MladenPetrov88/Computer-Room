import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hoursSpend = Integer.parseInt(scanner.nextLine());
        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        double price = 0;
        if (month.equals("march") || month.equals("april") || month.equals("may")){
            if (dayTime.equals("day")) {
                price = 10.50;
            } else if (dayTime.equals("night")) {
                price = 8.40;
            }

            }

        if (month.equals("june") || month.equals("july") || month.equals("august")){
            if (dayTime.equals("day")) {
                price = 12.60;
            } else if (dayTime.equals("night")) {
                price = 10.20;
            }
        }

        if (peopleInGroup >=4) {
            price = price - price * 0.1;
        }
        if (hoursSpend >= 5) {
            price = price - price * 0.50;
        }

        double totalPrice = price * hoursSpend * peopleInGroup;
        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);
    }
}
