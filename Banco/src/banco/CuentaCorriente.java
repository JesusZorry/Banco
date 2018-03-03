/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author User
 */
public class CuentaCorriente {
    private Cliente Titular;
    private int nroCuenta;
    private double Saldo;
   

    public CuentaCorriente(Cliente Titular,int nroCuenta){
        this.Titular=Titular;
        this.nroCuenta=nroCuenta;
    }
    public CuentaCorriente(Cliente Titular,int nroCuenta,double Saldo){
        this.Titular = Titular;
        this.nroCuenta = nroCuenta;
        this.Saldo = Saldo;
    
    }
    public Cliente getTitular() {
        return Titular;
    }

    public void setTitular(Cliente Titular) {
        this.Titular = Titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public void depositar(double Molto){
        if (Molto > 0 ){
           System.out.println("Su saldo es de: " + this.Saldo);
            this.Saldo += Molto;
            System.out.println("Su nuevo saldo es de : " + this.Saldo);
        }
        else {
           System.out.println("Monto no apto para el deposito");
        }
    }
    public void extraer(double Molto){
        if (Molto > 0 ){
        System.out.println("Su saldo es de: " + this.Saldo);
        this.Saldo -= Molto;
        System.out.println("Su nuevo saldo es de : " + this.Saldo);
        }
        else {
           System.out.println("Monto no apto para el deposito");
        }
    }
    public void mostrarPP(){
        System.out.println("El titular de la cuenta es : ");
        System.out.println("Nombre: " + this.Titular.getNombre());
        System.out.println("Apellido: "+ this.Titular.getApellido());
        System.out.println("Edad: "+ this.Titular.getEdad());
        System.out.println("El Número de Cuenta: " + this.nroCuenta);
        System.out.println("El Saldo de la Cuenta: $" + this.Saldo);
    
    }
    public boolean comparar(CuentaCorriente c2){
        if (this.nroCuenta == c2.nroCuenta){
            return true;
        }
        return false;
    }
}
