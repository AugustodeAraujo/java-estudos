public class App {
    public static void main(String[] args) throws Exception {

        int idade = 27;
        String nome = "Augusto";
        boolean humano = false;

        if (idade >= 25 && humano == true) {
            System.out.println(nome + ", você está com " + idade + " anos é um humano!");
        } else {
            System.out.println("Você é um humano, "
            + "não é mesmo?");
        }
        
    }
}
