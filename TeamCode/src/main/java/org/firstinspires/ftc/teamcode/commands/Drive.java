package org.firstinspires.ftc.robotcontroller.external.samples.commands;

import org.firstinspires.ftc.robotcontroller.external.samples.subsystems.Drivetrain;


public class Drive {

    private Drivetrain drivetrain;

    private double[] speeds;

    public drive(double drive, double strafe, double rotation, Drivetrain drivetrain) {
        this.drivetrain = drivetrain;

    }

    public void mecanumDrive(double drive, double strafe, double rotation) {
        double max = Math.max(Math.abs(drive) + Math.abs(strafe) + Math.abs(rotation), 1);

        speeds = {
                (drive + strafe + twist) / max,
                (drive - strafe + twist) / max,
                (drive - strafe - twist) / max,
                (drive + strafe - twist) / max
        };

        drivetrain.drive(speeds);
    }

}
