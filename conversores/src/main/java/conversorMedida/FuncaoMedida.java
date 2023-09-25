package conversorMedida;

import javax.swing.*;

public class FuncaoMedida {

    ConversorMedida medida = new ConversorMedida();
    public void Convertendo (double valorRecebido) {
        String opcao = JOptionPane.showInputDialog(null, "Converter:", "Medidas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"De Km para Hm", "De Km para Dam", "De Km para M", "De Km para Dm", "De Km para Cm", "De Km para Mm",
                             "De Hm para Km", "De Hm para Dam", "De Hm para M", "De Hm para Dm", "De Hm para Cm", "De Hm para Mm",
                             "De Dam para Km", "De Dam para Hm", "De Dam para M", "De Dam para Dm", "De Dam para Cm", "De Dam para Mm",
                             "De M para Km", "De M para Hm", "De M para Dam", "De M para Dm", "De M para Cm", "De M para Mm",
                             "De Cm para Km", "De Cm para Hm", "De Cm para Dam", "De Cm para M", "De Cm para Dm", "De Cm para Mm",
                             "De Mm para Km", "De Mm para Hm", "De Mm para Dam", "De Mm para M", "De Mm para Dm", "De Mm para Cm"}, "Escolha:")
                .toString();

        switch (opcao) {
                case "De Km para Hm":
                    medida.KmParaHm(valorRecebido);
                break;

                case "De Km para Dam":
                    medida.KmParaDam(valorRecebido);
                break;

            case "De Km para M":
                    medida.KmParaM(valorRecebido);
                break;

            case "De Km para Dm":
                    medida.KmParaDm(valorRecebido);
                break;

            case "De Km para Cm":
                    medida.KmParaCm(valorRecebido);
                break;

            case "De Km para Mm":
                    medida.KmParaMm(valorRecebido);
                break;
//////////////////////////////////////////////////////////////////
            case "De Hm para Km":
                    medida.HmParaKm(valorRecebido);
                break;

            case "De Hm para Dam":
                    medida.HmParaDam(valorRecebido);
                break;

            case "De Hm para M":
                    medida.HmParaM(valorRecebido);
                break;

            case "De Hm para Dm":
                    medida.HmParaDm(valorRecebido);
                break;

            case "De Hm para Cm":
                    medida.HmParaCm(valorRecebido);
                break;

            case "De Hm para Mm":
                    medida.HmParaMm(valorRecebido);
                break;
//////////////////////////////////////////////////////////////////
            case "De Dam para Km":
                    medida.DamParaKm(valorRecebido);
                break;

            case "De Dam para Hm":
                    medida.DamParaHm(valorRecebido);
                break;

            case "De Dam para M":
                    medida.DamParaM(valorRecebido);
                break;

            case "De Dam para Dm":
                    medida.DamParaDm(valorRecebido);
                break;

            case "De Dam para Cm":
                    medida.DamParaCm(valorRecebido);
                break;

            case "De Dam para Mm":
                    medida.DamParaMm(valorRecebido);
                break;
//////////////////////////////////////////////////////////////////
            case "De M para Km":
                    medida.MParaKm(valorRecebido);
                break;

            case "De M para Hm":
                    medida.MParaHm(valorRecebido);
                break;

            case "De M para Dam":
                    medida.MParaDam(valorRecebido);
                break;

            case "De M para Dm":
                    medida.MParaDm(valorRecebido);
                break;

            case "De M para Cm":
                    medida.MParaCm(valorRecebido);
                break;

            case "De M para Mm":
                    medida.MParaMm(valorRecebido);
                break;
//////////////////////////////////////////////////////////////////
            case "De Dm para Km":
                    medida.DmParaKm(valorRecebido);
                break;

            case "De Dm para Hm":
                    medida.DmParaHm(valorRecebido);
                break;

            case "De Dm para Dam":
                    medida.DmParaDam(valorRecebido);
                break;

            case "De Dm para M":
                    medida.DmParaM(valorRecebido);
                break;

            case "De Dm para Cm":
                    medida.DmParaCm(valorRecebido);
                break;

            case "De Dm para Mm":
                    medida.DmParaMm(valorRecebido);
                break;
//////////////////////////////////////////////////////////////////
            case "De Cm para Km":
                    medida.CmParaKm(valorRecebido);
                break;

            case "De Cm para Hm":
                    medida.CmParaHm(valorRecebido);
                break;

            case "De Cm para Dam":
                    medida.CmParaDam(valorRecebido);
                break;

            case "De Cm para M":
                    medida.CmParaM(valorRecebido);
                break;

            case "De Cm para Dm":
                    medida.CmParaDm(valorRecebido);
                break;

            case "De Cm para Mm":
                    medida.CmParaMm(valorRecebido);
                break;
//////////////////////////////////////////////////////////////////
            case "De Mm para Km":
                    medida.MmParaKm(valorRecebido);
                break;

            case "De Mm para Hm":
                    medida.MmParaHm(valorRecebido);
                break;

            case "De Mm para Dam":
                    medida.MmParaDam(valorRecebido);
                break;

            case "De Mm para M":
                    medida.MmParaM(valorRecebido);
                break;

            case "De Mm para Dm":
                    medida.MmParaDm(valorRecebido);
                break;

            case "De Mm para Cm":
                    medida.MmParaCm(valorRecebido);
                break;


        }
    }

}
