/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
// import edu.wpi.first.wpilibj.Solenoid;


public class WeAreARCommand extends Command {

 // private int solenoid;
  private boolean shootOL;
  private boolean shootIL;
  private boolean shootIR;
  private boolean shootOR;
  
  public WeAreARCommand(boolean OL, boolean IL, boolean IR, boolean OR) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.pn);
   
    // Booleans that are true if firing the related solenoid.
    shootOL = OL; 
    shootIL = IL;
    shootIR = IR;
    shootOR = OR;

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.pn.shoot(shootOL, shootIL, shootIR, shootOR);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
