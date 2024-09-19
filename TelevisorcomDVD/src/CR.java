
public class CR {
    public static void main(String[] args) {
        // Criando um televisor com o construtor padrão
        Televisor tv1 = new Televisor();
        // Criando um televisor com o construtor parametrizado
        Televisor tv2 = new Televisor("Gradiente", 10, "10 polegadas");

        // Criando um televisor com DVD
        TelevisorComDVD tvdvd1 = new TelevisorComDVD();

        // Exibindo informações
        System.out.println("O objeto tv1 é " + tv1.getModelo());
        System.out.println("O objeto tv2 é " + tv2.getModelo());
        System.out.println("O objeto tvdvd1 é " + tvdvd1.getModelo());
        System.out.println(" " + tvdvd1.eject());
        System.out.println(" " + tvdvd1.stop());
        System.out.println(" " + tvdvd1.play());
        System.out.println(" " + tvdvd1.pause());
    }
}
