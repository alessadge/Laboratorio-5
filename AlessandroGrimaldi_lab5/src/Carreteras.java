/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adgri_001
 */
public class Carreteras {
    private int numero;
    private int distancia;
    private Lugares inicio;
    private Lugares finaliza;

    public Carreteras() {
    }

    public Carreteras(int numero, int distancia, Lugares inicio, Lugares finaliza) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.finaliza = finaliza;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Lugares getInicio() {
        return inicio;
    }

    public void setInicio(Lugares inicio) {
        this.inicio = inicio;
    }

    public Lugares getFinaliza() {
        return finaliza;
    }

    public void setFinaliza(Lugares finaliza) {
        this.finaliza = finaliza;
    }

    @Override
    public String toString() {
        return "Carreteras{" + "numero=" + numero + ", distancia=" + distancia + ", inicio=" + inicio + ", finaliza=" + finaliza + '}';
    }
    
}
