public class Automovel {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor padrão da classe Automovel
    public Automovel() {
        this.marca = "Toyota";
        this.modelo = "Corolla";
        this.ano = 1996;
    }

    // Construtor com parâmetros
    public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir informações do automóvel
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // Método toString para retornar as informações como uma string
    @Override
    public String toString() {
        return "Automovel [Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + ano + "]";
    }


// Classe principal para testar o Automovel
    public static void main(String[] args) {
        // Criando um automóvel com o construtor padrão
        Automovel automovel1 = new Automovel();
        automovel1.exibirInformacoes(); // Exibe as informações do automóvel padrão

        System.out.println();

        // Criando um automóvel com o construtor parametrizado
        Automovel automovel2 = new Automovel("Honda", "Civic", 2020);
        System.out.println(automovel2); // Usa o método toString para exibir as informações
    }
}
