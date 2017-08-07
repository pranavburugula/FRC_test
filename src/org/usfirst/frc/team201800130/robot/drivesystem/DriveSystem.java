package org.usfirst.frc.team201800130.robot.drivesystem;

import edu.wpi.first.wpilibj.RobotDrive;

public class DriveSystem {
	RobotDrive driveSys;
	
	public DriveSystem(int motorLPin, int motorRPin) {
		this.driveSys = new RobotDrive(motorLPin, motorRPin);
	}
	
	public void drive(double speed, double direction) {
		driveSys.arcadeDrive(speed, direction);
	}
}
