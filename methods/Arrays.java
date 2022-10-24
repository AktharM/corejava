public class ArraysDescending {
 
	 public static void main(String[]args) {
		 
		 int nums[] = new int[5];
		 nums[0] = 7654321 ;
		 nums[1] = 654321 ;
		 nums[2] = 54321 ;
		 nums[3] = 4321 ;
		 nums[4] = 321 ;
		 
		 System.out.println("Descending Order");
		 System.out.println(Arrays.toString(nums));
	 }	 
}



public class ArraysAscending {
	 
	public static void main(String[]args) {
		
		int nums[] = new int[5];
		nums[0] =123 ;
		nums[1] = 1234 ;
		nums[2] = 12345 ;
		nums[3] = 123456 ;
		nums[4] = 1234567 ;
		
		System.out.println("Ascending Order");
		System.out.println(Arrays.toString(nums));		
	}
}



public class Hospital {
       // datatype variableNames[] ={value};
	   
	   // datatype variableNames[10];
	
	 String patientNames[] = new String[6];
	 int index;
	 
	 
	 public boolean savePatientNames(String patientName) {
		
		 
		 System.out.println("inside savePatientNames ");
		if(patientName !=null && patientNames.length >index) { 
			 //patientName[0]= "" ;
			 patientNames[index++] = patientName;
			 return true;
		}
		else {
			System.out.println("patient name is full ... Bed illa");
		}
		System.out.println("end of savePatientNames");
	    
		return false;
	 }
		public void getPatientNames() {
			     System.out.println("List of all the patient");
			for(int i =0; i<patientNames.length  ; i++) {
			      System.out.println(patientNames[i]);
		}
		 
	 }
	public boolean updatePatientNames(String oldPatientName , String newPatientName) {
		
		  System.out.println("inside updatePatientNames");
		  for(int i=0 ; i<patientNames.length; i++) {
			  
			  if(patientNames[i] == oldPatientName) {

				  patientNames[i] = newPatientName ;
				  return true ;
		  }
	}
    return false ;     
}
}





public class HospitalTester {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		hospital.savePatientNames("Ganesh");
		hospital.savePatientNames("Ganesha");
		hospital.savePatientNames("Ganeshi");
		hospital.savePatientNames("Guna");
		hospital.savePatientNames("Dasappa");
		hospital.savePatientNames("yellamma");
		hospital.savePatientNames("Tiger");
        hospital.getPatientNames();
		

	}

}