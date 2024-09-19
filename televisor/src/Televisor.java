public class Televisor {
    private String marca;
    private String modelo;
    private int tamanho; // Em polegadas, mas como int, deve ser um valor numérico
    private boolean ligado;

    // Construtor padrão
    public Televisor() {
        this.marca = "Samsung";
        this.modelo = "QLED";
        this.tamanho = 50;
        this.ligado = false;
    }

    // Construtor com parâmetros
    public Televisor(String modelo, int tamanho, String marca) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.ligado = false;
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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanho + " polegadas");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }
}
