/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5830.robot.commands;

import org.usfirst.frc.team5830.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class VacuumToggle extends InstantCommand {

  public VacuumToggle() {
    super();
    requires(Robot.VACUUM);
  }

  @Override
  protected void initialize() {
    if(!Robot.isVacuumRunning){
      Robot.VACUUM.suck();
    } else {
      Robot.VACUUM.stop();
    }
  }
}