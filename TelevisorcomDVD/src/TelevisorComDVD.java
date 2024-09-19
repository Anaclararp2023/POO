
public class TelevisorComDVD extends Televisor {
    
    // Construtor padrão
    public TelevisorComDVD() {
        super("PHILCO", 20, "Brastemp"); // Chama o construtor da classe pai
    }

    public String eject() {
        return "Eject ativado";
    }

    public String play() {
        return "Função Play ativada";
    }

    public String stop() {
        return "Função Stop ativada";
    }

    public String pause() {
        return "Função Pause ativada";
    }
}
