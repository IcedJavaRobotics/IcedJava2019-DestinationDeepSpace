/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WristMoveDownPIDCommand extends Command {

  //private DigitalInput lowerSwitch;

  public WristMoveDownPIDCommand() {
    requires(Robot.shooterWristPIDSubsystem);
    //lowerSwitch = new DigitalInput(8);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    Robot.shooterWristPIDSubsystem.enable();
    Robot.shooterWristPIDSubsystem.setSetpoint(256);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.shooterWristPIDSubsystem.onTarget();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.shooterWristPIDSubsystem.disable();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.shooterWristPIDSubsystem.disable();
  }
}
