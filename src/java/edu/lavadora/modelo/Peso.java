package edu.lavadora.modelo;

public class Peso {

    private int peso = 0;
    private String agua = "";
    private String nivel = "";

    public Peso() {
    }

    public void Nivel() {

        if (this.peso > 30) {
            this.nivel = "Demasiado Peso, disminuya cantidad de ropa";
        } else if (this.peso >= 22 && this.peso < 30) {
            this.nivel = "Nivel Máximo";
        } else if (this.peso >= 15 && this.peso < 22) {
            this.nivel = "Nivel Alto";
        } else if (this.peso >= 8 && this.peso < 15) {
            this.nivel = "Nivel Medio";
        } else if (this.peso < 8) {
            this.nivel = "Nivel Mínimo";
        }
    }
    
    public void Agua() {

        if (this.peso > 30) {
            this.agua = "Demasiado Peso, disminuya cantidad de ropa";
        } else if (this.peso >= 22 && this.peso < 30) {
            this.agua = "Necesita aprox. 100 Litros";
        } else if (this.peso >= 15 && this.peso < 22) {
            this.agua = "Necesita aprox. 75 Litros";
        } else if (this.peso >= 8 && this.peso < 15) {
            this.agua = "Necesita aprox. 50 Litros";
        } else if (this.peso < 8) {
            this.agua = "Necesita aprox. 25 Litros";
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
    
    
}
