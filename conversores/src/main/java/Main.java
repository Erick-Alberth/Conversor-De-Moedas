import conversorMedida.FuncaoMedida;
import conversorMoeda.FuncaoMoeda;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean continuar = true;
        while (continuar) { //loop
            String opcoes = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Medida"}, "Escolha").toString();

            String input = JOptionPane.showInputDialog("Insira um Valor");

            FuncaoMoeda funcaoMoeda = new FuncaoMoeda();
            FuncaoMedida funcaoMedida = new FuncaoMedida();
            if (input.matches("\\d+\\.?\\d*")) { //expressão regular para verificar se a entrada contém apenas números.
                switch (opcoes) {
                    case "Conversor de Moeda":
                        double transParaDouble = Double.parseDouble(input);
                        funcaoMoeda.Convertendo(transParaDouble);
                        break;

                    case "Conversor de Medida":
                        int pegaValor = Integer.parseInt(input);
                        funcaoMedida.Convertendo(pegaValor);
                        break;
                }

                int resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar?");

                if (resposta == JOptionPane.OK_OPTION) { //Se clicar em Ok
                    continuar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    continuar = false;
                }

                if (resposta == JOptionPane.CANCEL_OPTION) { //Se clicar em Cancelar
                    JOptionPane.showMessageDialog(null, "Programa Concluido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor Inválido");
            }
        }
    }
}
