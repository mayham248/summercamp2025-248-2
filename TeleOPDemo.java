package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Demo TeleOP")
public class TeleOPDemo extends LinearOpMode {
    HardwareDemo robot = HardwareDemo.getinstance();
public void runOpMode(){
    robot.init(hardwareMap);

    telemetry.addData("Status", "Hello Drivers!");
    telemetry.update();


    boolean pressingX = false;

    waitForStart();
    while(opModeIsActive()){
        double movement = -gamepad1.left_stick_x;
        double turning = gamepad1.right_stick_y;

        double left = movement + turning;
        double right = movement - turning;

        double max = Math.max(Math.abs(left), Math.abs(right));
        if (max > 1.0){
            left /= max;
            right /= max;
        }
        robot.left.setPower(left);
        robot.right.setPower(right);

        if (gamepad2.x && !pressingX){
            //Move arm
            pressingX = true;
        } else if (!gamepad2.x && !pressingX){
        }
    }
        if (gamepad2.right_stick_x > .1);{

        }
        if (gamepad2.right_trigger > .1){
    }

}
}
