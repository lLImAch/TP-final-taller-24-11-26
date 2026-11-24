package EstructuraTP.modelo;

public class B_TrazadoFormal extends Barrio {
private int CEPM;
private double PAC;
	public B_TrazadoFormal(String nombre, double superficie, int CEPM, double PAC) {
		super(nombre, superficie);
		this.CEPM = CEPM;
		this.PAC = PAC;
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

	public int getCEPM() {
		return CEPM;
	}

	public void setCEPM(int cEPM) {
		CEPM = cEPM;
	}

	public double getPAC() {
		return PAC;
	}

	public void setPAC(double pAC) {
		PAC = pAC;
	}

}
