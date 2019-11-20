/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ShooterShootSubsystem extends Subsystem {

  private Spark shooterLeft, shooterRight;
  
  public ShooterShootSubsystem () {
    shooterLeft = new Spark(RobotMap.SHOOTER_LEFT);
    shooterRight = new Spark(RobotMap.SHOOTER_RIGHT);

    shooterLeft.setInverted(false);
    shooterRight.setInverted(false);
  }

  public void spinIn() {
    shooterLeft.set(RobotMap.SPIN_IN);
    shooterRight.set(RobotMap.SPIN_IN);
  }

  public void LevelOne() {
    shooterLeft.set(RobotMap.LEVEL_ONE);
    shooterRight.set(RobotMap.LEVEL_ONE);
  }

  public void LevelTwo() {
    shooterLeft.set(RobotMap.LEVEL_TWO);
    shooterRight.set(RobotMap.LEVEL_TWO);
  }
  
  public void LevelThree() {
    shooterLeft.set(RobotMap.LEVEL_THREE);
    shooterRight.set(RobotMap.LEVEL_THREE);
  } 

  public void shoot() {
    shooterLeft.set(RobotMap.SHOOT_SPEED);
    shooterRight.set(RobotMap.SHOOT_SPEED);
  }

  public void Suck() {
    shooterLeft.set(RobotMap.INTAKE_SPEED);
    shooterRight.set(RobotMap.INTAKE_SPEED);
  }

  public void StopShoot() {
    shooterLeft.set(0);
    shooterRight.set(0);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
