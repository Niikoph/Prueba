package Ej4discoduroderoer;

public class Lavadora extends Electrodomestico{
    private final static float CARGA=5.0f;
    private float carga=CARGA;
    public Lavadora() {}
    public Lavadora(float preciobase,float peso) {
        // super(preciobase,peso);
        this.precioBase=preciobase;
        this.peso=peso;
    }
    public Lavadora(float precioBase, String color, char consumo, float peso,float carga)
    {
        super(precioBase,color,consumo,peso);
        this.carga=carga;
    }

    public float getCarga() {
        return this.carga;
    }

    public float precioFinal() {
        float precioFinal= super.precioFinal();
        if(this.carga>30) {
            precioFinal+=50;
        }
        return precioFinal;
    }

}
