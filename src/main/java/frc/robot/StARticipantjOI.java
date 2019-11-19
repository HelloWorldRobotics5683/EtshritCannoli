/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
//import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class StARticipantjOI {
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

  // Constructing new joyox controller, buttons, and button groups
    public static Joystick joy = new Joystick(0);

    JoystickButton b1;
    JoystickButton b2;
    JoystickButton b3;
    JoystickButton b4;
    JoystickButton b5;
    JoystickButton b6;
    JoystickButton b7;
    JoystickButton b8;
    JoystickButton b9;
    JoystickButton b10;
    JoystickButton b11;
    JoystickButton b12;




    public StARticipantjOI() {
    // Initializing buttons and button groups
        b1 = new JoystickButton(joy, 1);
        b2 = new JoystickButton(joy, 2);
        b3 = new JoystickButton(joy, 3);
        b4 = new JoystickButton(joy, 4);
        b5 = new JoystickButton(joy, 5);
        b6 = new JoystickButton(joy, 6);
        b7 = new JoystickButton(joy, 7);
        b8 = new JoystickButton(joy, 8);
        b9 = new JoystickButton(joy, 9);
        b10 = new JoystickButton(joy, 10);
        b11 = new JoystickButton(joy, 11);
        b12 = new JoystickButton(joy, 12);


        //                               OL     IL      IR      OR
        b5.whenActive(new WeAreARCommand(true, false, false ,false));
        b3.whenActive(new WeAreARCommand(false, true, false, false));
        b4.whenActive(new WeAreARCommand(false, false, true, false));
        b6.whenActive(new WeAreARCommand(false, false, false, true));
        // No morgan u chaotic beast pls no don't do it lmao
        // sorry sephora it's happening
        b2.whenActive(new WeAreARCommand(true, true, true, true));
    }

    
    public Double PastaY(){
        return joy.getY();
    }

    public Double RotiniZ(){
        return joy.getTwist();
    }

    public Double Throttle() {
        joy.setThrottleChannel(3);
        return joy.getThrottle();
    }
}


