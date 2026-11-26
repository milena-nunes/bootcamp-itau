import java.util.Scanner;

public class Emploee {
    private String name;
    private String email;
    private String password;
    private boolean loggedIn = false;

     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        setEmail(email);
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        setPassword(password);
        setLoggedIn(true);
        scanner.close();
        System.out.println("Login successful for: " + getName());
    }

    public void logout() {
        setLoggedIn(false);
        System.out.println("Logout successful for: " + getName());
    }

    public void changeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("O que deseja alterar? \n" + 
                        "1 - Nome\n " + 
                        "2 - Email\n");
        String choice = scanner.nextLine();
        if (choice.equals("1") || choice.equalsIgnoreCase("Nome")){
            System.out.println("Qual seu novo nome");
            String newName = scanner.nextLine();
            setName(newName);
            System.out.println("Nome mudado para " + getName());
        } else if (choice.equals("2") || choice.equalsIgnoreCase("Email")){
            System.out.println("Qual seu novo email");
            String newEmail = scanner.nextLine();
            setEmail(newEmail);
            System.out.println("Email mudado para " + getEmail());
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }

    public void changePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua nova senha");
        String newPassword = scanner.nextLine();
        setPassword(newPassword);
        System.out.println("Password changed for " + getPassword());
        scanner.close();
    }
    
}
