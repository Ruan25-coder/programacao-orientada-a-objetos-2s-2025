public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 500, 4, 2.5f); 
        SistemaOperacional so = new SistemaOperacional(pc);

        Programa prog1 = new Programa(8, 100, 2, 10000);   
        Programa prog2 = new Programa(4, 600, 1, 5000);    
        Programa prog3 = new Programa(32, 200, 2, 20000);  

        System.out.println("\n--- Teste 1 ---");
        so.executarPrograma(prog1);

        System.out.println("\n--- Teste 2 ---");
        so.executarPrograma(prog2);

        System.out.println("\n--- Teste 3 ---");
        so.executarPrograma(prog3);
    }
}
