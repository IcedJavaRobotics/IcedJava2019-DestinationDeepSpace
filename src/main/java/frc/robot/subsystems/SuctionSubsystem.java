/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class SuctionSubsystem extends Subsystem {

private DoubleSolenoid suctionCup;

  public SuctionSubsystem() {

    suctionCup = new DoubleSolenoid(RobotMap.SUCTION_PORTS[0], RobotMap.SUCTION_PORTS[1]);
    suctionCup.set(RobotMap.SUCTION_OFF);

  }

  public void SuctionOff() {
    suctionCup.set(RobotMap.SUCTION_OFF);
  }

  public void SuctionOn() {
    suctionCup.set(RobotMap.SUCTION_ON);
  } 

  public Value SuctionState() {
    return suctionCup.get();
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
