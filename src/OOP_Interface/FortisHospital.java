package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	//static int min_fee = 50;
	
	
	//US, UK, IN
	@Override
	public void emergencyService() {
		System.out.println("FH -- emergencyService");
	}

	// US
	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	// UK
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	// India
	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	// Individual:

	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	public void OPTServices() {
		System.out.println("FH -- OPTServices");
	}

	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
	}
	
	//method hiding
	public static void billing() {
		System.out.println("FH -- billing");
	}
	
	//default ---> public
	@Override
	public void training() {
		System.out.println("FH -- training");
	}
	
	

}
