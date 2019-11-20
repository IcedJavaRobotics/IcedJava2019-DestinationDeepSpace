/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ShifterSubsystem extends Subsystem {

  private DoubleSolenoid shifter;

  public ShifterSubsystem() {

    shifter = new DoubleSolenoid(RobotMap.SHIFTER_SOLENOID_PORTS[0], RobotMap.SHIFTER_SOLENOID_PORTS[1]);

  }

  
  public void ShiftDown(){
    shifter.set(RobotMap.SHIFTER_DOWN);
  }

  public void ShiftUp(){
    shifter.set(RobotMap.SHIFTER_UP);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
