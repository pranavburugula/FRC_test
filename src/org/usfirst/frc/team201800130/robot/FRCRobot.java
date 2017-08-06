package org.usfirst.frc.team201800130.robot;

import org.usfirst.frc.team201800130.robot.drivesys.DriveSystem;
import org.usfirst.frc.team201800130.robot.navigation.Navigation;
import org.usfirst.frc.team201800130.robot.subsystems.Subsystem;
import org.usfirst.frc.team201800130.robot.util.BackgroundTasks;
import org.usfirst.frc.team201800130.robot.util.Instrumentation;
import org.usfirst.frc.team201800130.robot.util.JsonReaders.JsonReader;

public class FRCRobot {
	public Robot robot;
	public String autoOrTeleop;
	public DriverStationImpl driverStationImpl;
	public DriveSystem driveSystem=null;
	public Navigation navigaiton=null;
	private Subsystem[] subsystemsArr;
	public AutonomousCmds autonomousCmds;
	public Instrumentation instrumentation;
	public BackgroundTasks backgroundTasks;
	public boolean printDebugMsg=false;
	
	public FRCRobot(Robot robot, String robotName, String autoOrTeleop,
			JsonReader opmodeCfg) {
		this.driverStationImpl = new DriverStationImpl(this);
	}
}
