/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
// import edu.wpi.first.wpilibj.Solenoid;


public class WeAreARCommand extends Command {

//created int variable
  private int solenoid;
  public WeAreARCommand(int solenoidPort) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.pn);
    //assigned int value to variable
    solenoid = solenoidPort;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //used int value to shoot
    Robot.pn.shootA(solenoid);
    System.out.println("Fired Solenoid!:"+ solenoid);
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
