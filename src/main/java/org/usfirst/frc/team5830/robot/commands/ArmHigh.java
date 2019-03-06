package org.usfirst.frc.team5830.robot.commands;

import org.usfirst.frc.team5830.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ArmHigh extends Command {
  public ArmHigh() {
    requires(Robot.ARM);
    }

  // Called just before this Command runs the first time
  @Override
  protected void execute() {
    SmartDashboard.putString(" Arm Status", "Arm High");
    if (Robot.isCargo) {
    Robot.ARM.setSetpoint(850);
    Robot.MANIPULATOR.setSetpoint(400);
    Robot.CYLINDERMANIPULATOR.out();
      Robot.isPistonManipulatorExtended = true;
    Robot.ARM.enable();}
    else {  //assumes it is hatchpanel 
      Robot.ARM.setSetpoint(850);
      Robot.MANIPULATOR.setSetpoint(600);
      Robot.CYLINDERMANIPULATOR.out();
      Robot.isPistonManipulatorExtended = true;
      Robot.ARM.enable();}

    }

  

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Math.abs (Robot.ARM.getSetpoint() - Robot.ARM.getPosition()) < 250 &&
Math.abs (Robot.MANIPULATOR.getSetpoint() - Robot.MANIPULATOR.getPosition()) < 250;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    SmartDashboard.putString("Status", "Teleop Driving");
  }
}

  