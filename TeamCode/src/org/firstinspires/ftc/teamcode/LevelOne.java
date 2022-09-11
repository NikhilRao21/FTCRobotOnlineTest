package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name = "LevelOne", group = "thing")
public class LevelOne extends LinearOpMode {

    public void y() {
        boolean YPress = gamepad1.y;
        telemetry.addLine("Click the y button as fast as you can when it says go!");
        try {
            wait(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ElapsedTime reaction = new ElapsedTime();
        telemetry.addLine("go!");
        while (YPress = false) {
            telemetry.addLine("Press the button! The timer is counting!");

        }
        double finishedtimey = reaction.milliseconds();
        reaction.reset();
        telemetry.addLine("You took" + finishedtimey + "milliseconds to click the button. Try improving your time!");
    }

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addLine("RULES: Before beginning, the robot");
        telemetry.addLine("will show you the combination of buttons ");
        telemetry.addLine("to press, and then say go.");
        telemetry.addLine("The combination of buttons");
        telemetry.addLine("each time me be same or different.");
        telemetry.addLine("Click the buttons as fast as possible.");
        telemetry.addLine(" The robot will show you your reaction time.");
        telemetry.addLine("Click Start on the Driver Station to begin!");

        waitForStart();

        while(opModeIsActive()) {

            telemetry.addLine("Let's Begin! The game will start in 5 seconds!");
            try {
                wait(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (gamepad1.x = false) {
                telemetry.addLine("The game is starting now! Press the x button to begin");

            }
            y();

            idle();
        }

    }

}

