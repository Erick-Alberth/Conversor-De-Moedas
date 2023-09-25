package conversorMoeda;/*Math.round: retorna o valor de um número arredondado para o inteiro mais próximo*/


import javax.swing.*;

import static java.lang.Math.*;

public class ConvertorMoeda {

    public void RealADolar (double valor) {
        double moedaDolar = valor / 4.92;
        moedaDolar = (double) round(moedaDolar * 100d) / 100; //Colocando para double no final do arredondamento.
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + "doláres"); //Recebe uma mensagem
    }


    public void RealAEuro (double valor){
        double moedaEuro = valor / 5.25;
        moedaEuro = (double) round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + "euros");
    }

    public void RealALibrasEsterlinas ( double valor){
        double moedaLibrasEsterlinas = valor / 6.02;
        moedaLibrasEsterlinas = (double) round(moedaLibrasEsterlinas * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibrasEsterlinas + "libras esterlinas");
    }

    public void RealAPesoArgentino ( double valor){
        double moedaPesoArgentino = valor / 0.014;
        moedaPesoArgentino = (double) round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "pesos argentinos");
    }

    public void RealAPesoChileno ( double valor){
        double moedaEuro = valor / 0.0056;
        moedaEuro = (double) round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + "pesos chilenos");
    }











}
