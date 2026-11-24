package EstructuraTP.modelo;

public class B_ComplejosHabitacionales extends Barrio{
private int CTMC;
private boolean CAMA;
	public B_ComplejosHabitacionales(String nombre, double superficie, int CTMC, boolean CAMA) {
		super(nombre, superficie);
		this.CTMC = CTMC;
		this.CAMA  = CAMA;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double densidadPoblacional() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean criticidadHabitacional() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getCTMC() {
		return CTMC;
	}

	public void setCTMC(int cTMC) {
		CTMC = cTMC;
	}

	public boolean isCAMA() {
		return CAMA;
	}

	public void setCAMA(boolean cAMA) {
		CAMA = cAMA;
	}

}
