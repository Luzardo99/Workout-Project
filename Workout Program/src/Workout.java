import java.util.ArrayList;

public class Workout{
	
	public int muscleNum;
	public int[] muscles;
	
	public ArrayList<String> Arms = new ArrayList<String>();
	public ArrayList<String> Back = new ArrayList<String>();
	public ArrayList<String> Chest = new ArrayList<String>();
	public ArrayList<String> Legs = new ArrayList<String>();
	public ArrayList<String> Shoulder = new ArrayList<String>();
	
	public Workout(int muscleNum, int[] muscles) {
		this.muscleNum = muscleNum;
		this.muscles = muscles;
		//Most efficient arm exercises
		Arms.add("	Bicep Curls - 3 Sets of 6-8 reps");
		Arms.add("	Preacher Curls - 3 Sets of 6-8 reps");
		Arms.add("	Tricep Curls - 3 Sets of 6-8 reps");
		Arms.add("	Skullcrushers - 3 Sets of 6-8 reps");
		//Most efficient back exercises
		Back.add("	Lat Pull-Down -  4 sets of 6-10 reps");
		Back.add("	Dumbbell Rows - 3 sets of 6-10 reps");
		Back.add("	Pull-ups - 4 sets of 6-12 reps");
		Back.add("	Chest Supported Rows - 4 sets of 6-10 reps");
		//Most efficient chest exercises
		Chest.add("	Bench Press - 3 sets of 6-10 reps");
		Chest.add("	Cable Crossover - 3 sets of 10+ reps");
		Chest.add("	Incline Dumbbell Press - 3 sets of 6-10 reps");
		Chest.add("	Dips - 3 sets of 8-12 reps");
		//Most efficient leg exercises
		Legs.add("	Squat - 3 sets of 6-10 reps");
		Legs.add("	Leg Curl - 3-4 sets of 10+ reps");
		Legs.add("	Leg Extensions - 3-4 sets of 1+0 reps");
		Legs.add("	Seated Calf Raise - 3-4 sets of 1+0 reps");
		////Most efficient shoulder exercises
		Shoulder.add("	Seated Dumbbell Press -  3-4 sets of 6-10 reps");
		Shoulder.add("	Dumbbell Front Raise -  4 sets of 6-10 reps");
		Shoulder.add("	Dumbbell Lateral Raise - 4 sets (2 sets 6-10 reps , 2 sets 12-15 reps)");
		Shoulder.add("	Standing Overhead Press - 3-4 sets of 6-10 reps");
		
		
	}
	public int getWorkoutNum() {
		return muscleNum;
	}
	
	//Function uses object and its variables to create a workout based on user inputs
	public void createWorkout(){
		
		ArrayList<String> workout = new ArrayList<String>();
		
		String arrName = "";
		
		int count = 0;
		
		for(int i = 0; i < muscleNum; i++) {
			
			if(muscles[i] == 1) {
				workout.add("Arm Exercises-------");
				for(int a = 0; a < 4; a++) {
					workout.add(Arms.get(a));
				}
			}else if(muscles[i] == 2) {
				workout.add("Back Exercises-------");
				for(int b = 0; b < 4; b++) {
					workout.add(Back.get(b));
				}
			}else if(muscles[i] == 3){
				workout.add("Chest Exercises-------");
				for(int c = 0; c < 4; c++) {
					workout.add(Chest.get(c));
				}
			}else if(muscles[i] == 4) {
				workout.add("Leg Exercises-------");
				for(int d = 0; d < 4; d++) {
					workout.add(Legs.get(d));
				}
			}else if(muscles[i] == 5) {
				workout.add("Shoulder Exercises-------");
				for(int e = 0; e < 4; e++) {
					workout.add(Legs.get(e));
				}
			}else {
				System.out.println("Wrong Input! Please input number from 1-5");
			}
			
		}
		
		System.out.println("---------------------------");
		System.out.println("Workout Created");
		System.out.println("---------------------------");
		
		for(int j = 0; j < workout.size(); j++) {
			System.out.println(workout.get(j));
		}
		
		
	}
	
	
	
	
	
}