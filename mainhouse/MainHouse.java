/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainhouse;

import javax.swing.JOptionPane;
/**
 *
 * @author Computador
 */
public class MainHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        boolean sair = false;
        
        house c1 = new house();
     
        c1.setNum(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa")));
        c1.setCor(JOptionPane.showInputDialog("Digite a cor da casa"));
        c1.setQttDoor(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas")));
        
        while(sair == false){
           menu = Integer.parseInt(JOptionPane.showInputDialog("Bem Vindo ao Menu:\n\n1 - Abrir a Casa\n2 - Fechar a Casa\n3 - Entrar na casa\n4 - Pintar a Casa\n5 - Adicionar Portas na casa\n6 - Status"));
            switch(menu){       
                case 1:
                    c1.AbrirCasa();
                    break;
                case 2:
                    c1.FecharCasa();
                    break;
                case 3:
                    c1.Entrar();
                    break;
                case 4:
                    c1.PintarCasa();
                    break;
                case 5:
                    sair = true;
                    break;
                case 6:
                    c1.addPortas();
                    break;
                default: JOptionPane.showMessageDialog(null, "comando invalido");
    }
    
}
}
}