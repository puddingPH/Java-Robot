package com.zjl.FirstOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DemoOne {
	public static void main(String[] args){
		try {
			Robot robot = new Robot();
			// 定义5秒的延迟以便你打开编辑器
			// Robot 开始写
			robot.delay(5000);
			for(int i=0;i<10;i++){
			robot.keyPress(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_SPACE);	
			robot.keyPress(KeyEvent.VK_ENTER);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}