package conversorMoeda;

import javax.swing.*;

public class FuncaoMoeda {

    ConvertorMoeda moeda = new ConvertorMoeda();
    public void Convertendo(double valorRecebido){
        String opcao = JOptionPane.showInputDialog(null, "Converter:", "Moedas", JOptionPane.PLAIN_MESSAGE, null,
            new Object[]{"De Real para Dólar", "De Real para Euro", "Real para Libras Esterlinas", "De Real para Peso Argentino", "De Real para Peso Chileno"}, "Escolha")
            .toString();

        switch (opcao) {
            case "De Real para Dólar":
                moeda.RealADolar(valorRecebido);
                break;
            case "De Real para Euro":
                moeda.RealAEuro(valorRecebido);
                break;
            case "Real para Libras Esterlinas":
                moeda.RealALibrasEsterlinas(valorRecebido);
                break;
            case "De Real para Peso Argentino":
                moeda.RealAPesoArgentino(valorRecebido);
                break;
            case "De Real para Peso Chileno":
                moeda.RealAPesoChileno(valorRecebido);
                break;
        }
    }
}
