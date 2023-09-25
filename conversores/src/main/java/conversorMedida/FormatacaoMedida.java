package conversorMedida;

import java.text.DecimalFormat;

public class FormatacaoMedida {
    public String getFormatar(double valor) {
        String valorFormatado = new DecimalFormat("0.##E00").format(valor); //Em notação cientifica
        return valorFormatado;
    }
}
