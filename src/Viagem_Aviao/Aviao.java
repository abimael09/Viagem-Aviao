package Viagem_Aviao;

import javax.swing.*;

public class Aviao {
    
    String prefixo, hrdeChegada, hrdePartida;
    int quantLugares, Assento;
    
    public void informePrefixo() {
        
        JOptionPane.showMessageDialog(null, prefixo);
    }
    
    public void ComprarAssento() {
        
        if (quantLugares == 0 || Assento > quantLugares) {
            JOptionPane.showMessageDialog(null, "Não existe lugares disponíveis");
        }else{
            Assento = Integer.parseInt(JOptionPane.showInputDialog("Informe a quant. de Assentos"));
            JOptionPane.showMessageDialog(null, "Compra efetuada com Sucesso!\nTotal: "+Assento+" Assentos");
        }
    }
    
    public void estaNoPatio() {
        
        // [...]
    }
}
