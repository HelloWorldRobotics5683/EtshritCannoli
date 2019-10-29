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

  private Solenoid OuterL = new Solenoid(CannonMap.OL);
  private Solenoid InnerL = new Solenoid(CannonMap.IL);
  private Solenoid InnerR = new Solenoid(CannonMap.IR);
  private Solenoid OuterR = new Solenoid(CannonMap.OR);

  //private Solenoid solenoid;


  //TODO: Check if these are the correct methods
  //Shoots outer left solen-boi
  public void shoot(boolean OL, boolean IL, boolean IR, boolean OR) {
    if(OL){
      OuterL.setPulseDuration(0.1);
      OuterL.startPulse();
      System.out.println("Fired outer left!");
    }
    if(IL) {
      InnerL.setPulseDuration(0.1);
      InnerL.startPulse();
      System.out.println("Fired inner left!");
    }
    if(IR) {
      InnerR.setPulseDuration(0.1);
      InnerR.startPulse();
      System.out.println("Fired inner right!");
    }
    if(OR) {
      OuterR.setPulseDuration(0.1);
      OuterR.startPulse();
      System.out.println("Fired outer right!");
    }
  /*  OuterL.set(false);
    InnerL.set(false);
    InnerR.set(false);
    OuterR.set(false);
    */
    
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
