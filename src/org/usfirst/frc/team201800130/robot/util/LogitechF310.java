package org.usfirst.frc.team201800130.robot.util;

import edu.wpi.first.wpilibj.Joystick;

public class LogitechF310 {
	public static final int a = 1;
	public static final int b = 2;
	public static final int y = 4;
	public static final int x = 3;
	public static final int back = 7;
	public static final int start = 8;
	public static final int leftBumper = 5;
	public static final int rightBumper = 6;
	public static final int leftStickButton = 9;
	public static final int rightStickButton = 10;
	public static final int leftTrigger = 11;
	public static final int rightTrigger = 12;
	
	private Joystick joystick;
	
	public LogitechF310(int portNum) {
		this.joystick = new Joystick(portNum);
	}
	
	public double leftStickX(){
		return this.joystick.getRawAxis(0);
	}
	public double rightStickX() {
		return this.joystick.getRawAxis(4);
	}
	public double leftStickY() {
		return -this.joystick.getRawAxis(1);
	}
	public double rightStickY() {
		return -this.joystick.getRawAxis(5);
	}
	public double leftTrigger() {
		return this.joystick.getRawAxis(2);
	}
	public double rightTrigger() {
		return this.joystick.getRawAxis(3);
	}
	public boolean a() {
		return this.joystick.getRawButton(a);
	}
	public boolean b() {
		return this.joystick.getRawButton(b);
	}
	public boolean x() {
		return this.joystick.getRawButton(x);
	}
	public boolean y() {
		return this.joystick.getRawButton(y);
	}
	public boolean leftStickButton() {
		return this.joystick.getRawButton(leftStickButton);
	}
	public boolean rightStickButton() {
		return this.joystick.getRawButton(rightStickButton);
	}
	public boolean leftBumper() {
		return this.joystick.getRawButton(leftBumper);
	}
	public boolean rightBumper() {
		return this.joystick.getRawButton(rightBumper);
	}
	public boolean start() {
		return this.joystick.getRawButton(start);
	}
	public boolean back() {
		return this.joystick.getRawButton(back);
	}
}
