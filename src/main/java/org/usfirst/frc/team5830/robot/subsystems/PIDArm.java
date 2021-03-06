package org.usfirst.frc.team5830.robot.subsystems;

import org.usfirst.frc.team5830.robot.RobotMap;
import org.usfirst.frc.team5830.robot.Constants;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 * 
 * @author Hunter P.
 *
 */
public class PIDArm extends PIDSubsystem {

    public PIDArm() {
    	super("ArmPID", 0.003, 0.0, 0.0);
    	setOutputRange(Constants.maxArmSpeedDown, Constants.maxArmSpeedUp);
    }

    public void initDefaultCommand() {}

    protected double returnPIDInput() {
    	return RobotMap.armEncoder.getDistance();
    }

    protected void usePIDOutput(double output) {
    	RobotMap.arm.set(-output);
    }
}
