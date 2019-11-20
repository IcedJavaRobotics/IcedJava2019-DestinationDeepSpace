/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
/** 
public class DigitalOutputSubsystem extends Subsystem {
  private DigitalOutput limitSwitch;
  private Spark wrist;

  public DigitalOutputSubsystem() {
    limitSwitch = new DigitalOutput(8);
    wrist = new Spark(RobotMap.SHOOTER_WRIST);
  }

  public void WristMoveUp() {
    if(!limitSwitch.get()) {
        wrist.set(RobotMap.WRIST_SPEED);
        System.out.println(limitSwitch.get());
    }
    else if(limitSwitch.get()) {
      wrist.set(RobotMap.WRIST_STOP);
      System.out.println(limitSwitch.get());
    }
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}*/
