public class Fogao {
    private String marca;
    private int quantidadeBocas;
    private boolean forno;

    // Construtor padrão
    public Fogao() {
        this.marca = "Brastemp";
        this.quantidadeBocas = 5;
        this.forno = false;
    }

    // Construtor com parâmetros
    public Fogao(String marca, int quantidadeBocas, boolean forno) {
        this.marca = marca;
        this.quantidadeBocas = quantidadeBocas;
        this.forno = forno;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public void setQuantidadeBocas(int quantidadeBocas) {
        this.quantidadeBocas = quantidadeBocas;
    }

    public boolean isForno() {
        return forno;
    }

    public void setForno(boolean forno) {
        this.forno = forno;
    }

    // Método para exibir informações do fogão
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade de Bocas: " + quantidadeBocas);
        System.out.println("Forno: " + (forno ? "Sim" : "Não"));
    }

    // Método toString para retornar as informações como uma string
    @Override
    public String toString() {
        return "Fogao [Marca=" + marca + ", Quantidade de Bocas=" + quantidadeBocas + ", Forno=" + (forno ? "Sim" : "Não") + "]";
    }
}

// Classe principal para testar o Fogao
class Main {
    public static void main(String[] args) {
        // Criando um fogão com o construtor padrão
        Fogao fogao1 = new Fogao();
        fogao1.exibirInformacoes(); // Exibe as informações do fogão padrão

        System.out.println();

        // Criando um fogão com o construtor parametrizado
        Fogao fogao2 = new Fogao("Electrolux", 4, true);
        System.out.println(fogao2); // Usa o método toString para exibir as informações
    }
}
