// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drive extends SubsystemBase {
    // This is where we will pick up on Friday. We need to add the vendor library
    // for cansparkmax
    private CANSparkMax left = new CANSparkMax(Constants.LEFT_MOTOR_ID, MotorType.kBrushless);
    private CANSparkMax right = new CANSparkMax(Constants.RIGHT_MOTOR_ID, MotorType.kBrushless);

    /** Creates a new Drive. */
    public Drive() {
        left.setInverted(true);
        right.setInverted(false);
    }

    public void setLeftSpeed(double speed) {
        left.set(speed);
    }

    public void setRightSpeed(double speed) {
        right.set(speed);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
