/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.CannonMap;
import frc.robot.commands.DifferentialDriveCommand;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.SpeedControllerGroup;


/**
 * Add your docs here.
 */
public class EtshritTrainSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static VictorSP frontL = new VictorSP(CannonMap.FL);
  public static VictorSP frontR = new VictorSP(CannonMap.FR);
  public static VictorSP rearL = new VictorSP(CannonMap.RL);
  public static VictorSP rearR = new VictorSP(CannonMap.RR);


  public static SpeedControllerGroup rightCannoli = new SpeedControllerGroup(frontR, rearR);
  public static SpeedControllerGroup leftCannoli = new SpeedControllerGroup(frontL, rearL);

  public static DifferentialDrive DD = new DifferentialDrive(leftCannoli, rightCannoli);


  public void DifferentialDriveGeneric(double x, double y){
    DD.tankDrive(x, y);
    DD.setSafetyEnabled(false); 
  }

  public void feed() {
    
    }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DifferentialDriveCommand());
  }
}
