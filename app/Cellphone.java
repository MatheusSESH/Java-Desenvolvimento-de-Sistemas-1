package app;

import javax.swing.JOptionPane;

public class Cellphone{
    private String marca;
    private String modelo;
    private int produto=0;
    private String cor;
    private double valor= 0;
    private Cape capa = new Cape();
    private double valorTOTAL;

    public double getValorTOTAL() {
        return valorTOTAL;
    }

    public void setValorTOTAL(double valorTOTAL) {
        this.valorTOTAL = valorTOTAL;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cape getCape() {
        return capa;
    }

    public void setCapa(Cape capa) {
        this.capa = capa;
    }
    
    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public void brand(){
        int pro=0;
        JOptionPane.showMessageDialog(null, "Temos estoque apenas de Samsung e Apple");
        pro = Integer.parseInt(JOptionPane.showInputDialog("1 - Samsung\n2 - Apple"));
        switch(pro){
            case 1: samsung();
                break;
            case 2: apple();
                break;
            default: JOptionPane.showMessageDialog(null,"Infelizmente não temos esse produto no estoque");
                break;

        }
        
    }

    public void samsung(){
        int sam=0;
        sam = Integer.parseInt(JOptionPane.showInputDialog("1 - Galaxy Note 10\n2 - Galaxy S10\n3 - Galaxy A80"));
        switch(sam){
            case 1: 
                this.setModelo("Galaxy Note 10");
                this.setValor(3000.00);
                break;
            case 2: 
                this.setModelo("Galaxy S10");
                this.setValor(2700.00);
                break;
            case 3: 
                this.setModelo("Galaxy A80");
                this.setValor(1700.00);
                break;
            default:
                JOptionPane.showMessageDialog(null,"comando invalido");
                break;
        }
        this.setCor(JOptionPane.showInputDialog("Qual cor deseja o celular"));

        this.getCape().setCorlor(JOptionPane.showInputDialog("Qual cor deseja na capa?"));

    }

    public void apple(){
        int sam=0;
        sam = Integer.parseInt(JOptionPane.showInputDialog("1 - iPhone 11\n2 - iPhone 8\n3 - iPhone XR"));
        switch(sam){
            case 1: 
                this.setModelo("iPhone 11");
                this.setValor(3800.00);
                break;
            case 2: 
                this.setModelo("iPhone 8");
                this.setValor(2200.00);
                break;
            case 3: 
                this.setModelo("iPhone XR");
                this.setValor(2900.00);
                break;
            default:
                JOptionPane.showMessageDialog(null,"comando invalido");
                break;
        }
        this.setCor(JOptionPane.showInputDialog("Qual cor deseja o celular"));

        this.getCape().setCorlor(JOptionPane.showInputDialog("Qual cor deseja na capa?"));
        
        this.setValorTOTAL(this.getValor()+this.getCape().getPrice());
    }

    public void status(){
        JOptionPane.showMessageDialog(null,"Marca: "+this.getMarca()+"\nModelo: "+this.getModelo()+"\nCor do celular: "+this.getCor()+"\nTipo de capa: "+this.getCape().getMaterial()+"\nCor da capa: "+this.getCape().getColor()+"\nValor da capa:"+this.getCape().getPrice()+"\nValor do celular: "+this.getValor()+"\nValor total da compra: "+this.getValorTOTAL());
    }

}