package SistemaTransporteViario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void salvarVeiculo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("veiculos.csv", true))) {
            writer.println(placa + "," + modelo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Veiculo> carregarVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("veiculos.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 2) {
                    Veiculo veiculo = new Veiculo(partes[0], partes[1]);
                    veiculos.add(veiculo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return veiculos;
    }
}
