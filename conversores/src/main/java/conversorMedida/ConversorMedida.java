package conversorMedida;
import javax.swing.*;
public class ConversorMedida extends FormatacaoMedida {

    public void KmParaHm (double valor) {
        double conversao = valor * 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "km será " + resultado + "hm"); //Recebe uma mensagem
    }

    public void KmParaDam (double valor) {
        double conversao = valor * (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "km será " + resultado + "dam"); //Recebe uma mensagem
    }

    public void KmParaM (double valor) {
        double conversao = valor * (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "km será " + resultado + "m"); //Recebe uma mensagem
    }

    public void KmParaDm (double valor) {
        double conversao = valor * (10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "km será " + resultado + "dm"); //Recebe uma mensagem
    }

    public void KmParaCm (double valor) {
        double conversao = valor * (10*10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "km será " + resultado + "cm"); //Recebe uma mensagem
    }

    public void KmParaMm (double valor) {
        double conversao = valor * (10*10*10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "km será " + resultado + "mm"); //Recebe uma mensagem
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public void HmParaKm (double valor) {
        double conversao = valor / 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "hm será " + resultado + "km"); //Recebe uma mensagem
    }

    public void HmParaDam (double valor) {
        double conversao = valor * 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "hm será " + resultado + "dam"); //Recebe uma mensagem
    }

    public void HmParaM (double valor) {
        double conversao = valor * (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "hm será " + resultado + "m"); //Recebe uma mensagem
    }

    public void HmParaDm (double valor) {
            double conversao = valor * (10*10*10);
            String resultado = getFormatar(conversao);
            JOptionPane.showMessageDialog(null, valor + "hm será " + resultado + "dm"); //Recebe uma mensagem
    }

    public void HmParaCm (double valor) {
        double conversao = valor * (10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "hm será " + resultado + "cm"); //Recebe uma mensagem
    }

    public void HmParaMm (double valor) {
        double conversao = valor * (10*10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "hm será " + resultado + "mm"); //Recebe uma mensagem
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DamParaKm (double valor) {
        double conversao = valor / (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dam será " + resultado + "km"); //Recebe uma mensagem
    }

    public void DamParaHm (double valor) {
        double conversao = valor / 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dam será " + resultado + "hm"); //Recebe uma mensagem
    }

    public void DamParaM (double valor) {
        double conversao = valor * 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dam será " + resultado + "m"); //Recebe uma mensagem
    }

    public void DamParaDm (double valor) {
        double conversao = valor * (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dam será " + resultado + "dm"); //Recebe uma mensagem
    }

    public void DamParaCm (double valor) {
        double conversao = valor * (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dam será " + resultado + "cm"); //Recebe uma mensagem
    }

    public void DamParaMm (double valor) {
        double conversao = valor * (10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dam será " + resultado + "mm"); //Recebe uma mensagem
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void MParaKm (double valor) {
        double conversao = valor / (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "m será " + resultado + "km"); //Recebe uma mensagem
    }

    public void MParaHm (double valor) {
        double conversao = valor / (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "m será " + resultado + "hm"); //Recebe uma mensagem
    }


    public void MParaDam (double valor) {
        double conversao = valor / 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "m será " + resultado + "dam"); //Recebe uma mensagem
    }

    public void MParaDm (double valor) {
        double conversao = valor * 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "m será " + resultado + "dm"); //Recebe uma mensagem
    }

    public void MParaCm (double valor) {
        double conversao = valor * (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "m será " + resultado + "cm"); //Recebe uma mensagem
    }

    public void MParaMm (double valor) {
        double conversao = valor * (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "m será " + resultado + "mm"); //Recebe uma mensagem
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DmParaKm (double valor) {
        double conversao = valor / (10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dm será " + resultado + "km"); //Recebe uma mensagem
    }

    public void DmParaHm (double valor) {
        double conversao = valor / (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dm será " + resultado + "hm"); //Recebe uma mensagem
    }

    public void DmParaDam (double valor) {
        double conversao = valor / (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dm será " + resultado + "dam"); //Recebe uma mensagem
    }

    public void DmParaM (double valor) {
        double conversao = valor / 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dm será " + resultado + "m"); //Recebe uma mensagem
    }

    public void DmParaCm (double valor) {
        double conversao = valor * 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dm será " + resultado + "dm"); //Recebe uma mensagem
    }

    public void DmParaMm (double valor) {
        double conversao = valor * (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "dm será " + resultado + "mm"); //Recebe uma mensagem
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void CmParaKm (double valor) {
        double conversao = valor / (10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "cm será " + resultado + "mm"); //Recebe uma mensagem
    }

    public void CmParaHm (double valor) {
        double conversao = valor / (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "cm será " + resultado + "mm"); //Recebe uma mensagem
    }

    public void CmParaDam (double valor) {
        double conversao = valor / (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "cm será " + resultado + "mm"); //Recebe uma mensagem
    }

    public void CmParaM (double valor) {
        double conversao = valor / 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "cm será " + resultado + "mm"); //Recebe uma mensagem
    }

    public void CmParaDm (double valor) {
        double conversao = valor * 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "cm será " + resultado + "mm"); //Recebe uma mensagem
    }

    public void CmParaMm (double valor) {
        double conversao = valor * (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "cm será " + resultado + "mm"); //Recebe uma mensagem
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void MmParaKm (double valor) {
        double conversao = valor / (10*10*10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "mm será " + resultado + "km"); //Recebe uma mensagem
    }

    public void MmParaHm (double valor) {
        double conversao = valor / (10*10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "mm será " + resultado + "hm"); //Recebe uma mensagem
    }

    public void MmParaDam (double valor) {
        double conversao = valor / (10*10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "mm será " + resultado + "dam"); //Recebe uma mensagem
    }

    public void MmParaM (double valor) {
        double conversao = valor / (10*10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "mm será " + resultado + "m"); //Recebe uma mensagem
    }

    public void MmParaDm (double valor) {
        double conversao = valor / (10*10);
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "mm será " + resultado + "dm"); //Recebe uma mensagem
    }

    public void MmParaCm (double valor) {
        double conversao = valor / 10;
        String resultado = getFormatar(conversao);
        JOptionPane.showMessageDialog(null, valor + "mm será " + resultado + "cm"); //Recebe uma mensagem
    }
}
