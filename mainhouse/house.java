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
public class house {
    private String cor;
   private int num;
   private int qttDoor;
   private boolean open;
   private boolean close;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getQttDoor() {
        return qttDoor;
    }

    public void setQttDoor(int qttDoor) {
        this.qttDoor = qttDoor;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }
   
    public void AbrirCasa(){
        if(this.isOpen() == true){
            JOptionPane.showMessageDialog(null, "A casa ja está aberta ");
        }
        else{
            this.setOpen(true);
            JOptionPane.showMessageDialog(null, "A casa foi aberta ");
        }
    }
    public void FecharCasa(){
        if(this.isClose() == true){
            JOptionPane.showMessageDialog(null, "A casa ja está fechada");
        }
        else{
            this.setClose(true);
            JOptionPane.showMessageDialog(null, "A casa foi fechada");
        }
    }
    public void PintarCasa(){
        this.setCor(JOptionPane.showInputDialog("Digite a cor que deseja pintar a casa"));
        JOptionPane.showMessageDialog(null, "A casa foi pintada de "+getCor());
        
    }
    public void Entrar(){
        if(this.isOpen() == true){
            JOptionPane.showMessageDialog(null, "Você já está dentro de casa");
        } else {
            if (this.isClose() == true) {
                JOptionPane.showMessageDialog(null, "Bem vindo");
                setClose(true);
            } else{
                JOptionPane.showMessageDialog(null, "A porta está fechada");
            }
        }
    }
    
    public void addPortas(){
        this.setQttDoor(qttDoor += Integer.parseInt(JOptionPane.showInputDialog("quantas portas quer adicionar a casa?")));
        JOptionPane.showMessageDialog(null, "Agora a casa possui "+qttDoor+ "Porta");
    }
    
    public house(){
    this.open = false;
    this.close = false;
}
}

