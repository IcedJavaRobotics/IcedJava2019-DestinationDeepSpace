/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.RobotMap;
import frc.robot.commands.PIDCallPotentiometerCommand;

/**
 * Add your docs here.
 */

 
public class ShooterWristPIDSubsystem extends PIDSubsystem {

   private Spark shooterWrist;
   private Potentiometer pot;
   private double degrees;
  //private DigitalInput upperSwitch, lowerSwitch;
  

  public ShooterWristPIDSubsystem() {
    
    // Intert a subsystem name and PID values here
    super("ShooterWristPIDSubsystem", .01, 0, 0);
    shooterWrist = new Spark(RobotMap.SHOOTER_WRIST);
    setAbsoluteTolerance(2);
    getPIDController().setContinuous(false);
    getPIDController().setInputRange(104, 256 );
    getPIDController().setOutputRange(-1, 1 );
    getPIDController().setName("ShooterWristPIDSubsystem");
    LiveWindow.add(getPIDController());

    //shooterWrist = new Spark(RobotMap.SHOOTER_WRIST);
    AnalogInput ai = new AnalogInput(2);
    pot = new AnalogPotentiometer(ai, 270, 0);
    disable();
    //upperSwitch = new DigitalInput(9);
    //lowerSwitch = new DigitalIsnput(8);
    // Use these to get going:
    // setSetpoint() - Sets where the PID controller should move the system
    // to
    // enable() - Enables the PID controller.
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  protected double returnPIDInput() {
    // Return your input value for the PID loop
    // e.g. a sensor, like a potentiometer:
    // yourPot.getAverageVoltage() / kYourMaxVoltage;
    return pot.get();
  }

  @Override
  protected void usePIDOutput(double output) {

    shooterWrist.set(output);

    // Use output to drive your system, like a motor
    // e.g. yourMotor.set(output);
  }

  public void WristMoveUp() {
    /** if(upperSwitch.get()){
      shooterWrist.set(RobotMap.WRIST_STOP);
    }
    else if(!upperSwitch.get()){
      shooterWrist.set(RobotMap.WRIST_SPEED);
    }*/
    shooterWrist.set(RobotMap.WRIST_SPEED);
  }

  public void WristMoveDown() {
    /** if(lowerSwitch.get()){
      shooterWrist.set(RobotMap.WRIST_STOP);
    }
    else if(!lowerSwitch.get()){
      shooterWrist.set(-RobotMap.WRIST_SPEED);
    }*/
    shooterWrist.set(-RobotMap.WRIST_SPEED);
  }

  public void WristStop() {
    shooterWrist.set(0);
  }

  public void CallPotentiometer(){
    degrees = pot.get();
    System.out.println(degrees);
  }

  public double GetPotentiometerValue() {
    return pot.get();
  }

}
