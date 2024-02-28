package VeiculosProjeto;

//Carro.java
public class Carro extends Veiculo {
 private int numPortas;

 public Carro(String marca, String modelo, int ano, int numPortas) {
     super(marca, modelo, ano);
     this.numPortas = numPortas;
 }

 @Override
 public void exibirInformacoes() {
     super.exibirInformacoes();
     System.out.println("Número de Portas: " + numPortas);
 }
}
