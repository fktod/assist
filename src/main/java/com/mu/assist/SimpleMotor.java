package com.mu.assist;

import java.awt.*;

public class SimpleMotor {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        //设置Robot产生一个动作后的休眠时间,否则执行过快
        robot.setAutoDelay(100);
        while(true){
            System.out.println("===进入循环===");
            System.out.println("第一次按键");
            robot.keyPress(71);
            robot.keyRelease(71);
            Double playTime = 4*60 + Math.random()*30;
            System.out.println("挂机时长 "+playTime.intValue() +" 秒");
            Thread.sleep(playTime.intValue()*1000);
            System.out.println("第二次按键");
            robot.keyPress(83);
            robot.keyRelease(83);
            Thread.sleep(1000);
            System.out.println("===退出循环===");
        }
    }
}
