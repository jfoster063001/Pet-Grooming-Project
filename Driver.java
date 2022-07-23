import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	// Instance variables (if needed)
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	
	

	public static void main(String[] args) {
		initializeDogList();
		initializeMonkeyList();
		displayMenu();
		


	}

	// This method prints the menu options
	public static void displayMenu() {
		Scanner scnr = new Scanner(System.in);
		String userInput= "none";
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[q] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");
		
		userInput = scnr.next();
		switch (userInput) {
		case "1":
			intakeNewDog(scnr);
			break;
		case "2":
			intakeNewMonkey(scnr);
			break;
		case "3":
			reserveAnimal(scnr);
			break;
		case "4":
		case "5":
		case "6":
			printAnimals(userInput);
			break;
		case "q":
			System.out.print("Have a good day!");
			System.exit(0);
			break;

		default:
			System.out.print("Invalid input.");
			displayMenu();
			break;
	}
	}


	// Adds dogs to a list for testing
	public static void initializeDogList() {
		Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
		Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
		Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
		Dog dog4 = new Dog("Ripper", "Rotwiler", "Male", "6", "45.6", "05-19-2018", "Canada", "in service", false, "Canada");
		Dog dog5 = new Dog("Kip", "Corgi", "female", "2", "28", "09-22-2021", "Canada", "in service", false, "Canada");

		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
	}


	// Adds monkeys to a list for testing
	//Optional for testing
	public static void initializeMonkeyList() {
		Monkey monkey1 = new Monkey("Dot", "Capuchin", "5", "10", "15","male","12","25.6", "05-12-2019", "United States", "intake", false, "United States");
		Monkey monkey2 = new Monkey("Batman", "Guenon", "8", "22", "20","female","10","30.6", "01-18-2022", "Canada", "in service", false, "Canada");
		Monkey monkey3 = new Monkey("Squanch", "Squirrel monkey", "10", "10", "11","male","9","19.3", "12-12-2015", "Canada", "Phase I", true, "Canada");
		Monkey monkey4 = new Monkey("Peel", "Squirrel monkey", "10", "10", "11","male","9","19.3", "12-12-2015", "United States", "Phase I", false, "Canada");

		monkeyList.add(monkey1);
		monkeyList.add(monkey2);
		monkeyList.add(monkey3);
		monkeyList.add(monkey4);

	}


	// Complete the intakeNewDog method
	// The input validation to check that the dog is not already in the list
	// is done for you
	public static void intakeNewDog(Scanner scanner) {
		
		System.out.println("What is the Dogs's name?");
		String name = scanner.nextLine();
		name = scanner.nextLine();

		//this compares the new dog to dogs already on the list

		for(int i=0;i<dogList.size();++i) {
			Dog currentDog = dogList.get(i);
			System.out.print(currentDog.getName());
			System.out.println(" "+name);
			System.out.println(dogList.size());
			if(currentDog.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis dog is already in our system\n\n");
				displayMenu(); //returns to menu
			}
		}
			
				//this gets all dog attributes
				
				System.out.println("What is the dog's breed?");
				String breed = scanner.nextLine();

				System.out.println("What is the dog's gender?");
				String gender = scanner.nextLine();

				System.out.println("What is the dog's age?");
				String age = scanner.nextLine();

				System.out.println("What is the dog's weight?");
				String weight = scanner.nextLine();

				System.out.println("When was the dog acquired?");
				String date = scanner.nextLine();

				System.out.println("Where was the dog acquired?");
				String location = scanner.nextLine();

				Dog dog = new Dog(name, breed, gender, age, weight, date, location, "intake", false, location);
				dogList.add(dog);
				System.out.println("New Dog has been added.");

				displayMenu();

			
		}

	



	// this intakes a new monkey
	public static void intakeNewMonkey(Scanner scanner) {
		String[] acceptedMonkeys = new String[]{"capuchin", "guenon", "macaque", "marmoset", "squirrel monkey", "tamarin"};
		//this is the list of monkeys to compare to
		List<String> acceptedMonkeySpeciesList = new ArrayList<>(Arrays.asList(acceptedMonkeys));

		System.out.println("What is the Monkeys's name?");
		String name = scanner.nextLine();
		name = scanner.nextLine();


		for(int i=0;i<monkeyList.size();++i) {
			Monkey currentMonkey = monkeyList.get(i);
			if(currentMonkey.getName().equalsIgnoreCase(name)) {
				System.out.println("\nThis monkey is already in our system\n\n");
				displayMenu(); //returns to menu
			}
		}
			
				// this compares the species of monkeys to our list and only lets correct species add new monkeys
				System.out.println("What is the monkey's species?");
				String species = scanner.nextLine();
				species = species.toLowerCase();

				if(acceptedMonkeySpeciesList.contains(species) == false) {
					System.out.print("Sorry we dont accept this type of monkey.");
					displayMenu();
				}
				// this gets the input for all the monkey attributes
				System.out.println("What is the monkey's tail length?");
				String tlength = scanner.nextLine();

				System.out.println("What is the monkey's height?");
				String height = scanner.nextLine();

				System.out.println("What is the monkey's body length?");
				String blength = scanner.nextLine();

				System.out.println("What is the monkey's gender?");
				String gender = scanner.nextLine();

				System.out.println("What is the monkey's age?");
				String age = scanner.nextLine();

				System.out.println("What is the monkey's weight?");
				String weight = scanner.nextLine();

				System.out.println("When was the monkey acquired?");
				String date = scanner.nextLine();

				System.out.println("Where was the monkey acquired?");
				String location = scanner.nextLine();

				
				Monkey monkey = new Monkey( name, species, tlength, height, blength, gender, age, weight, date, location, "intake", false, location);
				monkeyList.add(monkey);
				System.out.println("New Dog has been added.");
				System.out.println("\nNew Monkey has been added.\n\n");


				displayMenu();//returns to menu
			
		
	}

	// Complete reserve Animal
	// You will need to find the animal by animal type and in service country
	public static void reserveAnimal(Scanner scanner) {
		scanner.nextLine();
		String animalType = "none";
		int i = 0;

		System.out.println("What type of Animal do you want?");
		animalType = scanner.nextLine();

		if(!(animalType.equalsIgnoreCase("monkey") || animalType.equalsIgnoreCase("dog"))) {
			System.out.println("Sorry we dont have that animal type.");
			displayMenu();
		}

		System.out.println("What country of service animal do you want?");
		String countryOrigin = scanner.nextLine();

		if(!(countryOrigin.equalsIgnoreCase("united states") || countryOrigin.equalsIgnoreCase("Canada"))) {
			System.out.println("Sorry we dont have animals in that Country.");
			displayMenu();
		}

		if (animalType.equalsIgnoreCase("monkey")){
			for(i=0;i<(monkeyList.size());++i) {
				Monkey currentMonkey = monkeyList.get(i);
				if(currentMonkey.getInServiceLocation().equalsIgnoreCase(countryOrigin) && (currentMonkey.getReserved() == false)) {
					System.out.println("\n"+ currentMonkey.getName() +" is reserved.\n");
					currentMonkey.setReserved(true);
					displayMenu(); //returns to menu
				}
				
			}
			System.out.println("\nSorry no monkeys available in "+ countryOrigin + "\n");
			displayMenu(); //returns to menu
		}
		if (animalType.equalsIgnoreCase("Dog")){
			for(i=0;i<dogList.size();++i) {
				Dog currentDog = dogList.get(i);
				if(currentDog.getInServiceLocation().equalsIgnoreCase(countryOrigin) && (currentDog.getReserved()== false)) {
					System.out.println("\n "+ currentDog.getName() +" is reserved.\n");
					currentDog.setReserved(true);
					displayMenu(); //returns to menu
				}
				
			}
			System.out.println("\nSorry no dogs available in "+ countryOrigin + ".\n");
			displayMenu(); //returns to menu
		}

	}

	// Complete printAnimals
	// Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
	// The printAnimals() method has three different outputs
	// based on the listType parameter
	// dog - prints the list of dogs
	// monkey - prints the list of monkeys
	// available - prints a combined list of all animals that are
	// fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
	public static void printAnimals(String userInput) {
		int i =0;



		// this prints out the list of dogs
		if (userInput.equalsIgnoreCase("4")) {
			for(i=0;i<dogList.size();++i) {
				Dog currentDog = dogList.get(i);
				System.out.println(currentDog.getName() +", "+ currentDog.getTrainingStatus() +", "+ currentDog.getAcquisitionLocation() +", "+ currentDog.getReserved());
			}
		}
		// this print out the list of monkeys
		if (userInput.equalsIgnoreCase("5")) {
			for(i=0;i<(monkeyList.size());++i) {
				Monkey currentMonkey = monkeyList.get(i);
				System.out.println(currentMonkey.getName() +", "+ currentMonkey.getTrainingStatus() +", "+ currentMonkey.getAcquisitionLocation() +", "+ currentMonkey.getReserved());


			}
		}
		// this prints out all available animals
		if (userInput.equalsIgnoreCase("6")) {
            for(Dog dog: dogList) {
                if((dog.getReserved() == false) && (dog.getTrainingStatus().equalsIgnoreCase("in service"))) {
                    System.out.println(dog.getName() +", "+ dog.getTrainingStatus() +", " + dog.getReserved());

                }
			}
		

		if (userInput.equalsIgnoreCase("6")) {
            for(Monkey monkey: monkeyList) {
                if((monkey.getReserved() == false) && (monkey.getTrainingStatus().equalsIgnoreCase("in service"))) {
                    System.out.println(monkey.getName()+", " + monkey.getTrainingStatus() +", "+ monkey.getReserved());

                }

			}
		}
		}
		displayMenu();
	}

}
