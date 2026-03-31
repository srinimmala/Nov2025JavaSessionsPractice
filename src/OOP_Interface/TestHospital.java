package OOP_Interface;

public class TestHospital {
	
	static void main(String[] args) {
	
	
	FortisHospital fh = new FortisHospital();
	fh.pediaServices();
	fh.cardioServices();
	fh.physioServices();
	fh.neuroServices();
	fh.oncologyServices();
	fh.ENTServices();
	fh.gynecServices();
	fh.medicalTraining();
	fh.OPTServices();
	fh.medicalNews();//Individual
	fh.medicalRnD();//Individual
	fh.emergencyService();//Common
	fh.covidVaccination();//WHO
	
	System.out.println(USMedical.min_fee);
	System.out.println(FortisHospital.min_fee);
	
	USMedical.billing();
	fh.training();		
	
	
	System.out.println("-------------");
	
	
	//Top casting: child class object can be referred by parent interface ref variable.
	
	USMedical us = new FortisHospital();
	us.pediaServices();
	us.cardioServices();
	us.physioServices();
	us.emergencyService();
	us.covidVaccination();
	us.training();
	
	System.out.println("-------------");

	
	UKMedical uk = new FortisHospital();
	uk.ENTServices();
	uk.neuroServices();
	uk.emergencyService();
	uk.covidVaccination();
	

	System.out.println("-------------");

	
	IndianMedical in = new FortisHospital();
	in.oncologyServices();
	in.gynecServices();
	in.emergencyService();
	in.covidVaccination();
	
	System.out.println("-------------");

	
	
	//Down casting: NA
	
	
	
	
	
	
	

}

}
