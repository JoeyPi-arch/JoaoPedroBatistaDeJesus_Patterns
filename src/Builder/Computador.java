package Builder;

public class Computador {
    public String processador;
    public String memoriaRAM;
    public String armazenamento;
    public String placaVideo;
    public String sistemaOperacional;

    public Computador(String processador, String memoriaRAM, String armazenamento,
                      String placaVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaVideo = placaVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ExibirDados(){
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Placa de vídeo: " + placaVideo);
        System.out.println("Sistema operacional: " + sistemaOperacional);
    }
}
