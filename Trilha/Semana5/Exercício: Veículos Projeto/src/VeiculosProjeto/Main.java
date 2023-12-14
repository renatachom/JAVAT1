package VeiculosProjeto;

//Main.java
public class Main {
 public static void main(String[] args) {
     Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 4);
     Caminhao meuCaminhao = new Caminhao("Scania", "R500", 2022, 6, 25.0);

     meuCarro.exibirInformacoes();
     System.out.println("------------------");
     meuCaminhao.exibirInformacoes();
 }
}
