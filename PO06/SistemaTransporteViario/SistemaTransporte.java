package SistemaTransporteViario;

import java.util.Date;
import java.util.List;

public class SistemaTransporte {
    public static void main(String[] args) {
        // Carregar dados ao iniciar o programa
        List<Veiculo> veiculos = Veiculo.carregarVeiculos();
        List<Motorista> motoristas = Motorista.carregarMotoristas();
        List<Cobrador> cobradores = Cobrador.carregarCobradores();
        List<PontoDeParada> pontosDeParada = PontoDeParada.carregarPontosDeParada();
        List<Trecho> trechos = Trecho.carregarTrechos(pontosDeParada);
        List<Trajeto> trajetos = Trajeto.carregarTrajetos(pontosDeParada);
        List<Jornada> jornadas = Jornada.carregarJornadas(motoristas, cobradores, veiculos, trajetos);
        List<Passageiro> passageiros = Passageiro.carregarPassageiros();
        List<PassageiroEmbarque> passageirosEmbarque = PassageiroEmbarque.carregarPassageirosEmbarque(passageiros, pontosDeParada);

        // Exemplo de utilização das classes
        Veiculo veiculo = new Veiculo("ABC123", "Ônibus Modelo X");
        veiculos.add(veiculo);
        veiculo.salvarVeiculo();

        Motorista motorista = new Motorista("João Silva", "123456");
        motoristas.add(motorista);
        motorista.salvarMotorista();

        Cobrador cobrador = new Cobrador("Maria Oliveira");
        cobradores.add(cobrador);
        cobrador.salvarCobrador();

        Passageiro passageiro = new Passageiro("Carlos Santos", "CartaoEstudante");
        passageiros.add(passageiro);
        passageiro.salvarPassageiro();

        PontoDeParada pontoDeParada = new PontoDeParada("Ponto A");
        pontosDeParada.add(pontoDeParada);
        pontoDeParada.salvarPontoDeParada();

        Trecho trecho = new Trecho(pontoDeParada, pontoDeParada, 30);
        trechos.add(trecho);
        trecho.salvarTrecho();

        Trajeto trajeto = new Trajeto(trechos);
        trajetos.add(trajeto);
        trajeto.salvarTrajeto();

        Date inicio = new Date();
        Date fim = new Date();
        Jornada jornada = new Jornada(motorista, cobrador, veiculo, trajeto, inicio, fim);
        jornadas.add(jornada);
        jornada.salvarJornada();

        PassageiroEmbarque passageiroEmbarque = new PassageiroEmbarque(passageiro, pontoDeParada.getNome(), passageiro.getTipoCartao(), new Date());
        passageirosEmbarque.add(passageiroEmbarque);
        passageiroEmbarque.salvarPassageiroEmbarque();

        // Exibir informações (pode ser substituído por lógica de apresentação de interface gráfica ou console)
        System.out.println("Sistema de Transporte Viário");
        System.out.println("======================================");
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Motorista: " + motorista.getNome());
        System.out.println("Cobrador: " + cobrador.getNome());
        System.out.println(trajeto);
        System.out.println("Jornada Início: " + inicio);
        System.out.println("Jornada Fim: " + fim);
        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Ponto de Parada: " + pontoDeParada.getNome());
        System.out.println("Passageiro Embarque: " + passageiroEmbarque.getPontoEmbarque());
    }
}
