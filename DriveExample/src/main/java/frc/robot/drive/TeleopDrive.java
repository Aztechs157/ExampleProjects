// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;

public class TeleopDrive extends CommandBase {
    private Drive drive;
    private Joystick joystick;

    /** Creates a new TeleopDrive. */
    public TeleopDrive(Drive drive, Joystick joystick) {
        this.drive = drive;
        this.joystick = joystick;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(drive);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double leftSpeed = -joystick.getRawAxis(1);
        double rightSpeed = -joystick.getRawAxis(5);

        drive.setRightSpeed(rightSpeed * Constants.TELEOP_DRIVE_SPEED);
        drive.setLeftSpeed(leftSpeed * Constants.TELEOP_DRIVE_SPEED);
    }

}
