package EstructuraTP.modelo;

public class B_UrbanizacionPlanificada extends Barrio{
private int NLILCABA;
private boolean CFRAP;
	public B_UrbanizacionPlanificada(String nombre, double superficie, int NLILCABA, boolean CFRAP) {
		super(nombre, superficie);
		this.NLILCABA = NLILCABA;
		this.CFRAP = CFRAP;
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

	public boolean isCFRAP() {
		return CFRAP;
	}

	public void setCFRAP(boolean cFRAP) {
		CFRAP = cFRAP;
	}

	public int getNLILCABA() {
		return NLILCABA;
	}

	public void setNLILCABA(int nLILCABA) {
		NLILCABA = nLILCABA;
	}

}
