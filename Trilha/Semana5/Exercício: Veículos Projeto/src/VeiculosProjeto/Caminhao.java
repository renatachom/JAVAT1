package VeiculosProjeto;

//Caminhao.java
public class Caminhao extends Veiculo {
 private int numEixos;
 private double capacidadeMaxima;

 public Caminhao(String marca, String modelo, int ano, int numEixos, double capacidadeMaxima) {
     super(marca, modelo, ano);
     this.numEixos = numEixos;
     this.capacidadeMaxima = capacidadeMaxima;
 }

 public Caminhao(String marca, String modelo, int ano, int numEixos) {
     super(marca, modelo, ano);
     this.numEixos = numEixos;
     this.capacidadeMaxima = 0.0;
 }

 @Override
 public void exibirInformacoes() {
     super.exibirInformacoes();
     System.out.println("Número de Eixos: " + numEixos);

     if (capacidadeMaxima > 0.0) {
         System.out.println("Capacidade Máxima: " + capacidadeMaxima + " toneladas");
     } else {
         System.out.println("Capacidade Máxima: Não especificada");
     }
 }
}
