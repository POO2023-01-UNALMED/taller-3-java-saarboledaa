package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		++TV.numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}

	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if (this.estado == true) {
			if (this.canal < 120) {
				++this.canal;
			}
		}
	}
	
	public void canalDown() {
		if (this.estado == true) {
			if (this.canal > 0) {
				--this.canal;
			}
		}
	}

	public void volumenUp() {
		if (this.estado == true) {
			if (this.volumen < 7) {
				++this.volumen;
			}
		}
	}
	
	public void volumenDown() {
		if (this.estado == true) {
			if (this.volumen > 0) {
				--this.volumen;
			}
		}
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (this.estado == true) {
			if (canal <= 120 && canal >= 0) {
				this.canal = canal;
			}
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
}
