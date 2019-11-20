   /*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.UserDriveCommand;

/**
 * Add your docs here.
 */
public class DriveTrainSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Spark left1,  left3, right1, right3;
  //private Encoder leftEnc, rightEnc;

  public DriveTrainSubsystem() {
		left1 = new Spark(RobotMap.FRONT_LEFT_SPARK);
		//left2 = new Spark(RobotMap.CENTER_LEFT_SPARK);
		left3 = new Spark(RobotMap.BACK_LEFT_SPARK);
		right1 = new Spark(RobotMap.FRONT_RIGHT_SPARK);
		//right2 = new Spark(RobotMap.CENTER_RIGHT_SPARK);
    right3 = new Spark(RobotMap.BACK_RIGHT_SPARK);

    //leftEnc = new Encoder(RobotMap.DRIVE_LEFT_ENCODER[0], RobotMap.DRIVE_LEFT_ENCODER[1], true, EncodingType.k4X);
		//rightEnc = new Encoder(RobotMap.DRIVE_RIGHT_ENCODER[0], RobotMap.DRIVE_RIGHT_ENCODER[1], true, EncodingType.k4X);

    //leftEnc.setDistancePerPulse(RobotMap.DISTANCE_PER_PULSE);
		//leftEnc.setPIDSourceType(PIDSourceType.kDisplacement);
		//rightEnc.setDistancePerPulse(RobotMap.DISTANCE_PER_PULSE);
		//rightEnc.setPIDSourceType(PIDSourceType.kDisplacement);

    //Deciding to invert motors or not
		right1.setInverted(false);
    //right2.setInverted(true);
		right3.setInverted(false);
		left1.setInverted(false);
		//left2.setInverted(false);
		left3.setInverted(false);
  }

  public void driveStraight(double speed) {
    moveLeftTrain(speed);
    moveRightTrain(-speed);
  }

  public void moveLeftTrain(double speed) {
    right1.set(speed);
    //right2.set(speed);
    right3.set(speed);
  }

  public void moveRightTrain(double speed) {
    left1.set(speed);
    //left2.set(speed);
    left3.set(speed);
  }

  public void tankDrive(double left, double right) {
    moveLeftTrain(left);
    moveRightTrain(right);
  }

  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new UserDriveCommand());

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
