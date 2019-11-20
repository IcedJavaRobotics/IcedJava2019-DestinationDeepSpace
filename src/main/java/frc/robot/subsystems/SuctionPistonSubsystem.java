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
public class SuctionPistonSubsystem extends Subsystem {

private DoubleSolenoid suctionPiston;

  public SuctionPistonSubsystem() {


  suctionPiston = new DoubleSolenoid(RobotMap.SUCTION_SOLENOID_PORTS[0], RobotMap.SUCTION_SOLENOID_PORTS[1]);
  suctionPiston.set(RobotMap.SUCTION_PISTON_IN);
  

  }
	
	public void SuctionDown() {
    suctionPiston.set(RobotMap.SUCTION_PISTON_OUT);
    
	}
	
	public void SuctionUp() {
		suctionPiston.set(RobotMap.SUCTION_PISTON_IN);
	}
	
	public Value ShiftedState() {
		return suctionPiston.get();
	}
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
