/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

 package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 * Add your docs here.
 */
/** 
public class PotentiometerSubsytem extends Subsystem {

  private Potentiometer potentiometer;
  private double degrees;

  public PotentiometerSubsytem(){
    
    AnalogInput ai = new AnalogInput(0);

    potentiometer = new AnalogPotentiometer(ai, 270, 0);
    

  }

  public void CallPotentiometer(){
    degrees = potentiometer.get();
    System.out.println(degrees);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
*/