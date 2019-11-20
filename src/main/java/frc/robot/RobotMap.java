/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
public class RobotMap {

  //Drivetrain
	public static final int FRONT_LEFT_SPARK = 3;
	//public static final int CENTER_LEFT_SPARK =  3;
	public static final int BACK_LEFT_SPARK = 4;
	public static final int FRONT_RIGHT_SPARK = 2;
	//public static final int CENTER_RIGHT_SPARK = 0;
  public static final int BACK_RIGHT_SPARK = 1;
  //controllers
  public static final double JOYSTICK_DEADZONE = .2;
  public static final int CONTROLLER = 0;
  public static final int SHOOTER_STICK = 1;
  //encoders
  public static final int[] DRIVE_LEFT_ENCODER = { 1, 0 };
  public static final int[] DRIVE_RIGHT_ENCODER = { 2, 3 };
  public static final double WHEEL_DIAMETER = 6; // inches
	public static final double PULSES_PER_REVOLUTION = 2048;
	public static final double DISTANCE_PER_PULSE = Math.PI * WHEEL_DIAMETER / PULSES_PER_REVOLUTION;

  //Suction Piston
  public static final int[] SUCTION_SOLENOID_PORTS = { 0, 1 };
	public static final Value SUCTION_PISTON_OUT = Value.kForward;
  public static final Value SUCTION_PISTON_IN = Value.kReverse;
  //Suction Cups
  public static final int[] SUCTION_PORTS = { 2, 3 };
  public static final Value SUCTION_ON = Value.kForward;
  public static final Value SUCTION_OFF = Value.kReverse;

  //Shifters
  public static final int[] SHIFTER_SOLENOID_PORTS = { 4, 5 };
  public static final Value SHIFTER_UP = Value.kForward;
  public static final Value SHIFTER_DOWN = Value.kReverse;
  
  //Shooter
  public static final int SHOOTER_LEFT = 6;
  public static final int SHOOTER_RIGHT = 7;
  public static final double SPIN_IN = -1;
  public static final double LEVEL_ONE = .5;
  public static final double LEVEL_TWO = .75;
  public static final double LEVEL_THREE   = 1;
  public static final int SERVO = 9;
  public static final double SERVO_SPIN = 1;
  public static final double SERVO_STOP = .5;  
  public static final double INTAKE_SPEED = -.5;
  public static final double SHOOT_SPEED = .3;
  //wrist
  public static final int SHOOTER_WRIST = 0;
  public static final double WRIST_SPEED = .2;
  //public static final double WRIST_ONE = .25;
  //public static final double WRIST_TWO = .5;
  //public static final double WRIST_THREE = 1;
  public static final double WRIST_STOP = 0;
  public static final double POTENTIOMETER = 0;
  public Potentiometer pot;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
