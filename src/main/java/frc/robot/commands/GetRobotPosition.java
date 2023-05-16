// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.AprilTagCamera;


public class GetRobotPosition extends CommandBase {
  AprilTagCamera camera;
  Pose2d robotposition;
  /** Gets Robot position using the april tag camera */
  public GetRobotPosition(AprilTagCamera camera) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.camera = camera;
   
    addRequirements(camera);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    camera.getAprTag();
    robotposition = camera.getRobotPosition();
    //SmartDashboard.putString("Robot Positon", robotposition.toString());
    System.out.println("Robot pos from Apr Tag:"+robotposition.toString());
    // TODO: do something useful with the info
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
