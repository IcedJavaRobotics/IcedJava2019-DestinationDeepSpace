/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.commands.PIDCallPotentiometerCommand;
//import frc.robot.commands.CallPotentiometerCommand;
import frc.robot.commands.ServoSpinCommand;
import frc.robot.commands.ShiftDownCommand;
import frc.robot.commands.ShiftUpCommand;
import frc.robot.commands.ShootCommand;
import frc.robot.commands.ShooterSuckCommand;
import frc.robot.commands.SuctionOffCommand;
import frc.robot.commands.SuctionOnCommand;
import frc.robot.commands.SuctionPistonDownCommand;
import frc.robot.commands.SuctionPistonUpCommand;
//import frc.robot.commands.WristMoveDownCommand;
import frc.robot.commands.WristMoveDownPIDCommand;
//import frc.robot.commands.WristMoveUpCommand;
//import frc.robot.commands.WristShootCargoCommandPIDCommand;
//import frc.robot.commands.WristTestCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public XboxController controller;
  public Joystick shooterStick;

  public OI() {
	
	shooterStick = new Joystick(RobotMap.SHOOTER_STICK);
	controller = new XboxController(RobotMap.CONTROLLER);

	setButtonWhileHeld(shooterStick, 11, new PIDCallPotentiometerCommand());
	setButtonWhenPressed(controller, 5, new ShiftDownCommand());
	setButtonWhenPressed(controller, 6, new ShiftUpCommand());
	setButtonWhileHeld(shooterStick, 2, new ShootCommand());
	setButtonWhileHeld(shooterStick, 6, new ServoSpinCommand());
	setButtonWhileHeld(shooterStick, 1, new ShooterSuckCommand());
	//setButtonWhileHeld(shooterStick, 3, new WristTestCommand());
	//setButtonWhenPressed(controller, 2, new SuctionOnCommand());
	//setButtonWhenPressed(controller, 3, new SuctionOffCommand());
	//setButtonWhenPressed(controller, 1, new SuctionPistonDownCommand());
	//setButtonWhenPressed(controller, 4, new SuctionPistonUpCommand());
	//setButtonWhileHeld(shooterStick, 3, new WristMoveUpCommand());
	//setButtonWhileHeld(shooterStick, 5, new WristMoveDownCommand());
	//setButtonWhenPressed(shooterStick, 3, new WristShootCargoCommandPIDCommand());
	setButtonWhenPressed(shooterStick, 5, new WristMoveDownPIDCommand());
  } 


  private double deadZoneMod(double val) {
		if (Math.abs(val) <= RobotMap.JOYSTICK_DEADZONE) {
			return 0;
		} else {
			return val;
		}
	}
	
	public double getControllerRightX() {
		if (!(controller == null)) {
			return deadZoneMod(controller.getX(Hand.kRight));
		} else {
			return 0;
		}
	}

	public double getControllerLeftX() {
		if (!(controller == null)) {
			return deadZoneMod(controller.getX(Hand.kLeft));
		} else {
			return 0;
		}
	}
	
	public double getControllerRightY() {
		if (!(controller == null)) {
			return deadZoneMod(controller.getY(Hand.kRight));
		} else {
			return 0;
		}
	}
	
	public double getControllerLeftY() {
		if (!(controller == null)) {
			return deadZoneMod(controller.getY(Hand.kLeft));
		} else {
			return 0;
    }
  } 

  private void setButtonWhenPressed(XboxController joystick, int button, Command command) {
		new JoystickButton(controller, button).whenPressed(command);
	} 
	
	private void setButtonWhileHeld(XboxController joystick, int button, Command command) {
		new JoystickButton(controller, button).whileHeld(command);
	}
	
	private void setButtonWhenPressed(Joystick joystick, int button, Command command) {
		new JoystickButton(shooterStick, button).whenPressed(command);
	}
	
	private void setButtonWhileHeld(Joystick joystick, int button, Command command) {
		new JoystickButton(shooterStick, button).whileHeld(command);
	}
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}