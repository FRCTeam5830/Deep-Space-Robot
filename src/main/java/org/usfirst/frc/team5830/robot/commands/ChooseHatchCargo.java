/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5830.robot.commands;

import org.usfirst.frc.team5830.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 * Add your docs here.
 */
public class ChooseHatchCargo extends InstantCommand {
  /**
   * Add your docs here.
   */
  public ChooseHatchCargo() {
    super();
  }

  @Override
  protected void initialize() {
    if(Robot.isCargo){
      Robot.isCargo = false;
      //TODO Place LED feedback here
    }
    else{
      Robot.isCargo = true;
      //TODO Place LED feedback here
    }
  }

}
