package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name = "LevelOne", group = "thing")
public class LevelOne extends LinearOpMode {



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
        telemetry.update();

        waitForStart();



        if(!gamepad1.x) {
            telemetry.addLine("The game is starting now! Press the x button to begin");
            telemetry.update();

        }
        telemetry.addLine("Click the y button as fast as you can when it says go!");
        telemetry.update();
        sleep(2000);
        telemetry.addLine("go!");
        telemetry.update();
        ElapsedTime reaction = new ElapsedTime();
        while(!gamepad1.y) {
            telemetry.update();

        }

        double finishedtimey = reaction.milliseconds();
        reaction.reset();
        telemetry.addLine("You took" + finishedtimey + "milliseconds to click the button. Try improving your time!");
        telemetry.update();
        sleep(2000);



    }

}

