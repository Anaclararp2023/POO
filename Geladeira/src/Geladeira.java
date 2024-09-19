public class Geladeira {
    private String marca;
    private int capacidadeLitros;
    private boolean frostFree;

    // Construtor padrão
    public Geladeira() {
        this.marca = "Samsung";
        this.capacidadeLitros = 500;
        this.frostFree = false;
    }

    // Construtor com parâmetros
    public Geladeira(String marca, int capacidadeLitros, boolean frostFree) {
        this.marca = marca;
        this.capacidadeLitros = capacidadeLitros;
        this.frostFree = frostFree;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public boolean isFrostFree() {
        return frostFree;
    }

    public void setFrostFree(boolean frostFree) {
        this.frostFree = frostFree;
    }

    // Método para exibir informações da geladeira
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Capacidade: " + capacidadeLitros + " litros");
        System.out.println("Frost Free: " + (frostFree ? "Sim" : "Não"));
    }

    // Método toString para retornar as informações como uma string
    @Override
    public String toString() {
        return "Geladeira [Marca=" + marca + ", Capacidade=" + capacidadeLitros + " litros, Frost Free=" + (frostFree ? "Sim" : "Não") + "]";
    }
}

// Classe principal para testar a Geladeira
class Main {
    public static void main(String[] args) {
        // Criando uma geladeira com o construtor padrão
        Geladeira geladeira1 = new Geladeira();
        geladeira1.exibirInformacoes(); // Exibe as informações da geladeira padrão

        System.out.println();

        // Criando uma geladeira com o construtor parametrizado
        Geladeira geladeira2 = new Geladeira("Brastemp", 350, true);
        System.out.println(geladeira2); // Usa o método toString para exibir as informações
    }
}
