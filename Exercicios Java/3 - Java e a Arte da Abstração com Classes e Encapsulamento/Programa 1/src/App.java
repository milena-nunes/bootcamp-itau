public class App {
    public static void main(String[] args) throws Exception { 
        Menu menu = new Menu();
        while (!menu.getOpcao().equalsIgnoreCase("Sair")) {
            menu.menuOn();
        }
    }
}
