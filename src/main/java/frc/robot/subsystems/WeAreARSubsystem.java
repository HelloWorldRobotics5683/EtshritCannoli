/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.CannonMap;

/**
 * Add your docs here.
 */
public class WeAreARSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private static Solenoid outerLeft = new Solenoid(CannonMap.OL);

  private static Solenoid innerLeft = new Solenoid(CannonMap.IL);

  private static Solenoid innerRight = new Solenoid(CannonMap.IR);

  private static Solenoid outerRight = new Solenoid(CannonMap.OR);

 /* public static Solenoid whowhatnow(int portNumber) {
    if(portNumber == CannonMap.OL) {
      return outerLeft;
    } else if(portNumber == CannonMap.IL) {
      return innerLeft;
    } else if(portNumber == CannonMap.IR) {
      return innerRight;
    } else {
      return outerRight;
    }
    
  }
  */
  // took out static modifier here
  public void shootA(int n){
    if(n == 0) {
      outerLeft.setPulseDuration(0.1);
      outerLeft.startPulse();
    } else {
      System.out.println("Buttons are functional");
    }
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
