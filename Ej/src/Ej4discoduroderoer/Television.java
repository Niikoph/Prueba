package Ej4discoduroderoer;

public class Television extends Electrodomestico {
    private int resolucion=20;
	private boolean sintonizador=false;
	
	
	public Television() {
		super(); //No pasa nada si se pone, por que lo pone la maquina por dentro
	}
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}


	public Television(float peso, float preciobase) {
		this.precioBase=preciobase;
		this.peso=peso;
	}	
	
	
	public Television(int resolucion, boolean sintonizador, float preciobase, String color, char consumoenergetico, float peso) {
		this.color=color;
		this.resolucion=resolucion;
		this.consumo=consumo;
		this.sintonizador=sintonizador;
		this.precioBase=preciobase;
		this.peso=peso;
		
	
			
			
		
	}
 }

