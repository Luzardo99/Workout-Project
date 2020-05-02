
import java.util.*;
import java.io.*;

public class WorkoutCreator{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int choice;
		int muscleNum = 0;
		int muscleChoiceNum;
		
		int[] muscles = new int[50];
		
		//Muscle choices for user
		ArrayList<String> muscleChoice = new ArrayList<String>();
		muscleChoice.add("1 - Enter 1 for Arms");
		muscleChoice.add("2 - Enter 2 for Back");
		muscleChoice.add("3 - Enter 3 for Chest");
		muscleChoice.add("4 - Enter 4 for Legs");
		muscleChoice.add("5 - Enter 5 for Shoulder");
		

		
		Scanner input = new Scanner(System.in);
		//Ask user what he wants to do in the program
		System.out.println("Welcome To The Workout Creator");
		System.out.println("-------------------------------");
		System.out.println("Home Menu");
		System.out.println("1 - Enter 1 to create workout");
		System.out.println("2 - Enter 2 to track your past progress");
		System.out.println("0 - Enter 0 to quit program");
		
		 System.out.printf("Enter choice: ");
		 choice = input.nextInt();
	
		 switch(choice){
		 	//Case 1: Create A Workout
			 case 1:
			 	System.out.printf("Enter how many muscles would you like to hit: ");
             	muscleNum = input.nextInt();
            
             	for(int i = 0; i< muscleNum; i++) {
            	 
            		int muscleInputCount = 5;
            	
            		for(int j = 0; j< muscleInputCount;j++) {
            			System.out.println(muscleChoice.get(j));
            		}
            	
           	 		System.out.printf("Enter choice: ");
           	 		muscleChoiceNum = input.nextInt();
             
           	 		muscles[i] = muscleChoiceNum;         	 	
				}

				Workout workout1 = new Workout(muscleNum, muscles);
				workout1.createWorkout();
				break;
			//Case 2: Track Progress
			case 2:
				File rFile = new File("src/WorkoutProgress.txt");
				Map <String,Integer> hm =  new LinkedHashMap <String,Integer>();
				Scanner inputFile = new Scanner(rFile);
				while(rFile.exists() && inputFile.hasNext()){ 
					hm.put(inputFile.next().toLowerCase(), Integer.parseInt(inputFile.next()));
				}

				int exec;
				do{
					String exercise;
					int weight;
					Scanner UserInput = new Scanner(System.in);
					System.out.println("What workout would you like to update?");
					exercise = UserInput.nextLine().replaceAll("\\s", "").toLowerCase();
					System.out.println("How much weight did you do?");
					weight = UserInput.nextInt();
					UserInput.nextLine();

					int oldWeight = hm.put(exercise, weight);
					int diff = weight - oldWeight;

					System.out.println("The weight increased by " + diff + " pounds.");

					System.out.println("Any other workout you want to update? Enter negative number if no.");
					exec = UserInput.nextInt();
					UserInput.nextLine();
				}while(exec >= 0);

				PrintWriter outFile = new PrintWriter(new FileOutputStream("WorkoutProgress.txt", false));
				hm.forEach((key, value) -> outFile.println(key + "\t" + value + "\n"));

				inputFile.close();
				outFile.close();
				break;
			//Case 0: Exit program
			case 0:
				System.out.println("Thank You For Using Workout Creator!");
				System.exit(0);
			//Default case: wrong input
			default:
				System.out.println("Wrong Input! Please Input Either 1,2 or 0");

		 }
		 System.out.println("------------------------------------");
		 System.out.println("Thank You For Using Workout Creator!");
         
		
	
	}
}