package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp
public class LevelOne extends OpMode {
    public String thing = "d";
    public void init() {
        telemetry.addLine("RULES: Before beginning, the robot will show you the combination of buttons to press, and then say go. The combination of buttons each time me be same or different. Click Start on the Driver Station to begin!");
        telemetry.addLine("Click the buttons as fast as possible. The robot will show you your reaction time.");
    }
    public void init_loop() {
    telemetry.addLine("Click Start Again!");
    }

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

    public void start () {
        telemetry.addLine("Let's Begin! The game will start in 5 seconds!");
        try {
            wait(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (gamepad1.x = false) {
            telemetry.addLine("The game is starting now! Press the x button to begin");
            break;
        }
        y();
        }
    public void loop () {
    }


}
