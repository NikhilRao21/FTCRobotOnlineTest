package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class YourClassName extends LinearOpMode {
    // Variable Declaration Code

    // Helper Function Code

    @Override
    public void runOpMode() throws InterruptedException {

        telemetry.addLine("Init");

        waitForStart();

        while (opModeIsActive()) {

            // Main Loop Code
            telemetry.addLine("Stary");

            idle();
        }

        // Termination Code
        telemetry.addLine("end");
    }
}
