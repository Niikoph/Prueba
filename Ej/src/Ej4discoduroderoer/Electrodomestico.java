package Ej4discoduroderoer;

public class Electrodomestico {
 //public tdo
    //default solo si esta ene l paquete
    //protected tanto si esta en el paquete como si es hija y esta en otro paquete
    //private no se puede heredar directamente


    private final static float PRECIOBASE=100.0f;
    private final static String COLOR="blanco";
    private final static char CONSUMO='F';
    private final static float PESO=5.0f;

    protected float precioBase=PRECIOBASE;
    protected String color=COLOR;
    protected char consumo=CONSUMO;
    protected float peso=PESO;

    public Electrodomestico(){}

    public Electrodomestico(float preciobase,float peso){
        this.precioBase=preciobase;
        this.peso=peso;
    }

    public Electrodomestico(float precioBase, String color, char consumo, float peso) {
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public float getPeso() {
        return peso;
    }

    private boolean comprobarConsumoEnergetico(char letra) {
        if(this.consumo!='A' && this.consumo!='B' && this.consumo!='C'&& this.consumo!='D' && this.consumo!='E' && this.consumo!='F'){
            this.consumo=CONSUMO;
            return false;
        }else {
            this.consumo=letra;
            return true;
        }
    }

    private boolean comprobarColor(String color) {
        if(this.color!="blanco" && this.color!="negro" && this.color!="rojo" && this.color!="azul" && this.color!="gris") {
            this.color=COLOR;
            return false;
        }else {
            this.color=color;
            return true;
        }
    }

    public float precioFinal() {
        float preciofinal=0.0f;
        switch(this.consumo) {
            case 'A':preciofinal+=100;
                break;
            case 'B':preciofinal+=80;
                break;
            case 'C':preciofinal+=60;
                break;
            case 'D':preciofinal+=50;
                break;
            case 'E':preciofinal+=30;
                break;
            case 'F':preciofinal+=10;
                break;
        }
        if(this.peso>=0 && this.peso<20) { preciofinal+=10; }
        else if(this.peso>=20 && this.peso<50) { preciofinal+=50; }
        else if(this.peso>=50 && this.peso<80) { preciofinal+=100; }
        else if(this.peso>=80) { preciofinal+=80; }
        return preciofinal;
    }





}