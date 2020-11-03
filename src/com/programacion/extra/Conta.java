package com.programacion.extra;

public class Conta {
    // Atributos
    private String ncliente;
    private String nconta;
    private double tp;
    private double saldo;
    // Constructor por defecto
    public Conta (){

    }
    // Constructor con todos os parametros
    public Conta (String ncl, String nc, double tp,double s){
        ncliente=ncl;
        nconta=nc;
        this.tp=tp;
        saldo=s;
    }
    // Metdos setters y getters
    public void setNcliente(String ncl){
        ncliente=ncl;
    }
    public String getNcliente (){
        return ncliente;

    }
    public void setNconta(String nc){
        nconta=nc;

    }
    public String getNconta(){
        return nconta;
    }
    public void setTipoInteres (double tp){
        this.tp=tp;
    }
    public double getTipoInteres (){
        return tp;
    }
    public void setSaldo (double s){
        saldo=s;
    }
    public double getSaldo (){
        return saldo;
    }
    //Metdos de ingreso e reintegro
    public double ingreso(double valor){
        saldo=saldo+valor;
        System.out.println("O valor ingresado é : "+valor+ "\nO saldo actual é : "+saldo);
        return valor;
    }
    public double reintegro(double valor){
        saldo =saldo-valor;
        System.out.println("O valor do reintegro é : "+valor+ "\nO saldo actual é : "+saldo);
        return valor;
    }
}
