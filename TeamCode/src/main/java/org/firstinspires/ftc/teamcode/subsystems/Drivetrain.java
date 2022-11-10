package org.firstinspires.ftc.robotcontroller.external.samples.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Drivetrain {

    private DcMotor front_left = null;
    private DcMotor front_right = null;
    private DcMotor back_right = null;
    private DcMotor back_left = null;

    private double[] speeds;

    private HardwareMap hardwareMap;

    public Drivetrain(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;

        // Setting motor ID's
        front_left = hardwareMap.get(DcMotor.class, "Front Left");
        front_right = hardwareMap.get(DcMotor.class, "Front Right");
        back_left = hardwareMap.get(DcMotor.class, "Back Left");
        back_right = hardwareMap.get(DcMotor.class, "Back Right");

        // Setting directions
        back_left.setDirection(DcMotor.Direction.REVERSE);
        back_right.setDirection(DcMotor.Direction.FORWARD);
        front_left.setDirection(DcMotor.Direction.REVERSE);
        front_right.setDirection(DcMotor.Direction.FORWARD);
    }

    // Drive method to set the drive speeds of each motor
    public void drive(double[] speeds) {
        front_left.setPower(speeds[0]);
        back_left.setPower(speeds[1]);
        front_right.setPower(speeds[2]);
        back_right.setPower(speeds[3]);
    }

    // Stop method to stop each motor
    public void stop() {
        front_left.setPower(0);
        back_left.setPower(0);
        front_right.setPower(0);
        back_right.setPower(0);
    }


}

