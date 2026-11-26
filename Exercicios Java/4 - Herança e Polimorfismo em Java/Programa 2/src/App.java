import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Emploee employee = new Emploee();
        Emploee manager = new Manager();
        Emploee salesPerson = new SalesPerson();
        Emploee attendant = new Attendant();

        System.out.println("Welcome to the Employee Management System!");
        System.out.printf("O que deseja fazer? \n" + 
                        "1 - Login\n " + 
                        "2 - out\n" +
                        "3 - Alterar dados\n" + 
                        "4 - Alerar senha\n" +
                        "4 - Verificar status de login\n" + 
                        "5 - Exit\n");

        if (employee.isLoggedIn()) {
            System.out.println("User is logged in.");

        } else {
            System.out.println("User is out. Please log in.");

        }
    }
}
