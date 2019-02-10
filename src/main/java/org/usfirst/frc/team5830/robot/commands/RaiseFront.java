/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5830.robot.commands;

import org.usfirst.frc.team5830.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class RaiseFront extends InstantCommand {

  private boolean isExtended = false;

  public RaiseFront() {
    requires(Robot.CYLINDERFRONT);
  }

  @Override
  protected void execute() {
    if (isExtended){
      Robot.CYLINDERFRONT.in();
      isExtended = true;
      } else {
        Robot.CYLINDERFRONT.out();
        isExtended = false;
      }
      }
}
