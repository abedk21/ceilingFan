package ceilingFan;

public class Test {

	public static void main(String[] args) {
		
		//Create Ceiling Fan (Speed Setting should be OFF and direction should be clockwise)
		CeilingFan fan = new CeilingFan();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.OFF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.CLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord to change speed setting (Speed Setting should be SPEED1 and direction should be clockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.SPEED1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.CLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord again to change speed setting (Speed Setting should be SPEED2 and direction should be clockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.SPEED2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.CLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord again to change speed setting (Speed Setting should be SPEED3 and direction should be clockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.SPEED3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.CLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord again to change speed setting (Speed Setting should be OFF and direction should be clockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.OFF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.CLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling second cord to change direction (Speed Setting should be OFF and direction should be counterclockwise)
		fan.pullCord2();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.OFF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.COUNTERCLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord to change speed setting with new direction (Speed Setting should be SPEED1 and direction should be counterclockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.SPEED1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.COUNTERCLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord again to change speed setting with new direction (Speed Setting should be SPEED2 and direction should be counterclockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.SPEED2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.COUNTERCLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord again to change speed setting with new direction (Speed Setting should be SPEED3 and direction should be counterclockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.SPEED3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.COUNTERCLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling first cord again to change speed setting with new direction (Speed Setting should be OFF and direction should be counterclockwise)
		fan.pullCord1();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.OFF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.COUNTERCLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
		
		//Pulling second cord again to change direction (Speed Setting should be OFF and direction should be clockwise)
		fan.pullCord2();
		
		try {
			checkSpeed(fan.getSpeed(), Speed.OFF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			checkDirection(fan.getDirection(), Direction.CLOCKWISE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(fan);
	}

	private static void checkSpeed(Speed speed1, Speed speed2) throws Exception{
		if(speed1 != speed2) throw new Exception(String.format("Wrong speed setting! Speed setting should be: %s", speed2));	
	}
	
	private static void checkDirection(Direction direction1, Direction direction2) throws Exception{
		if(direction1 != direction2) throw new Exception(String.format("Wrong direction! Direction should be: %s", direction2));	
	}

}
