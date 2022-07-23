
public class Monkey extends RescueAnimal {
	
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	public Monkey(String name, String species, String tailLength, String height, String bodyLength, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setSpecies(species);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
	}
	// Accessor Method
	 public String getSpecies() {
	        return species;
	    }
	 public String getTailLength() {
	        return tailLength;
	    }
	 public String getHeight() {
	        return height;
	    }
	 public String getBodyLength() {
	        return bodyLength;
	    }

	    // Mutator Method
	 public void setSpecies(String monkeySpecies) {
	        species = monkeySpecies;
	    }
	 public void setTailLength(String tLength) {
	        tailLength = tLength;
	    }
	 public void setHeight(String monkeyHeight) {
	        height = monkeyHeight;
	    }
	 public void setBodyLength(String bLength) {
	        bodyLength = bLength;
	    }

}
