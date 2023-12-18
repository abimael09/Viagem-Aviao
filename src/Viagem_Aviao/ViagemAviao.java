package Viagem_Aviao;

import javax.swing.JOptionPane;

public class ViagemAviao {

    // Projeto treino em desenvovilmento...
    public static void main(String[] args) {
        
        Aviao obj = new Aviao();
        
        obj.prefixo = "Avião: Boeing 787 Avianca";
        obj.informePrefixo();
        obj.quantLugares = 200;
        obj.ComprarAssento();

        // [...]
    }  
}
