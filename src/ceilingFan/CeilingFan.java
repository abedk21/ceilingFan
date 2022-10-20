package ceilingFan;

public class CeilingFan {
	private Speed speed = Speed.OFF;
	private Direction direction = Direction.CLOCKWISE;
	
	//this cord is for changing the fan speed setting
	public void pullCord1() {
		switch(speed) {
		  case OFF:
		    speed = Speed.SPEED1;
		    break;
		  case SPEED1:
			  speed = Speed.SPEED2;
		    break;
		  case SPEED2:
			  speed = Speed.SPEED3;
		    break;
		  default:
			  speed = Speed.OFF;
		}
	}
	
	//this cord is for changing the fan direction
	public void pullCord2() {
		switch(direction) {
		  case CLOCKWISE:
		    direction = Direction.COUNTERCLOCKWISE;
		    break;
		  default:
			  direction = Direction.CLOCKWISE;
		}
	}
	
	public Speed getSpeed() {
		return speed;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public String toString() {
		return String.format("Ceiling Fan Speed Setting: %s, Ceiling Fan direction: %s", speed, direction);
	}
}

enum Speed {
	OFF,
	SPEED1,
	SPEED2,
	SPEED3
}

enum Direction {
	CLOCKWISE,
	COUNTERCLOCKWISE
}