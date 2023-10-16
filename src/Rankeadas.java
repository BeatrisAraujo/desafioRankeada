import java.util.Scanner;

public class Rankeadas {
    public static void main(String[] args) {
        int vitorias;
        int derrotas;
        String nivel;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de vitórias: ");
        vitorias = leitor.nextInt();
        System.out.print("Digite o número de derrotas: ");
        derrotas = leitor.nextInt();

        nivel = calcularNivel(vitorias - derrotas);

        System.out.println("O herói tem saldo de vitórias: " + (vitorias - derrotas) + " e está no nível: " + nivel);
    }
    public static String calcularNivel(int rankeadas) {
        if (rankeadas <= 10) {
            return "Ferro";
        } 
        else if (rankeadas >= 11 && rankeadas <= 20) {
            return "Bronze";
        } 
        else if (rankeadas >= 21 && rankeadas <= 50) {
            return "Prata";
        } 
        else if (rankeadas >= 51 && rankeadas <= 80) {
            return "Ouro";
        } 
        else if (rankeadas >= 81 && rankeadas <= 90) {
            return "Diamante";
        } 
        else if (rankeadas >= 91 && rankeadas <= 100) {
            return "Lendário";
        } 
        else {
            return "Imortal";
        }
    }
}
