package Builder;

public class Main {
    public static void main(String[] args) {
        Computador computadorBasico = new ComputadorBuilder()
                .setProcessador("Intel Core i3")
                .setMemoriaRAM("8GB")
                .setArmazenamento("256GB SSD")
                .setSistemaOperacional("Windows 11")
                .build();

        Computador computadorGamer = new ComputadorBuilder()
                .setProcessador("Intel Core i7")
                .setMemoriaRAM("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaVideo("NVIDIA RTX 4060")
                .setSistemaOperacional("Windows 11")
                .build();

        System.out.println("===== COMPUTADOR BÁSICO =====");
        computadorBasico.ExibirDados();
        System.out.println("\n===== COMPUTADOR GAMER =====");
        computadorGamer.ExibirDados();
    }
}