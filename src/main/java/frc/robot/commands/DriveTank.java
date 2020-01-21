package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class DriveTank extends CommandBase {

  private XboxController xbox = new XboxController(0);
  
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public DriveTank(){
    // Use addRequirements() here to declare subsystem dependencies.
    //addRequirements(Robot.m_drivetrain);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      //double leftSpeed = Robot.m_robotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_LEFT_AXIS);
      //double rightSpeed = Robot.m_robotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_RIGHT_AXIS);
      //Robot.m_drivetrain.tankDrive(leftSpeed, rightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //Robot.m_drivetrain.tankDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}