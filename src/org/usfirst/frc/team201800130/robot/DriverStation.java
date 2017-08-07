package org.usfirst.frc.team201800130.robot;

import org.usfirst.frc.team201800130.robot.drivesystem.DriveSystem;
import org.usfirst.frc.team201800130.robot.util.LogitechF310;

public class DriverStation {
	public LogitechF310 gamepad1 = null;
	public LogitechF310 gamepad2 = null;
	DriveSystem driveSys=null;
	
	public DriverStation(int numGamepads, DriveSystem driveSys) {
		this.gamepad1 = new LogitechF310(0);
		if(numGamepads==2) {
			this.gamepad2 = new LogitechF310(1);
		}
		this.driveSys = driveSys;
	}
	
	public void runTeleOp() {
		driveSys.drive(gamepad1.leftStickY(), gamepad1.rightStickX());
	}
}
