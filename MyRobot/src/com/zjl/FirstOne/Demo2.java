package com.zjl.FirstOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public void dosomething() {
	   //使用map 将控制键盘的常量存起来，好方便取用。
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0x30);//键盘的0
		map.put(1, 0x31);//键盘的1
		map.put(2, 0x32);
		map.put(3, 0x33);
		map.put(4, 0x34);
		map.put(5, 0x35);
		map.put(6, 0x36);
		map.put(7, 0x37);
		map.put(8, 0x38);
		map.put(9, 0x39);

		try {
			Robot robot = new Robot();
			robot.delay(5000);//延迟5秒供你打开编辑器
			
			//让机器从0数到999
			for (int i = 0; i < 1000; i++) {
				// 个位数的处理
				if (i <= 9) {
					robot.keyPress(map.get(i));
					robot.keyPress(KeyEvent.VK_ENTER);
				}
				// 两位数的处理
				if (i > 9 && i <= 99) {
					int a = i / 10;// 十位
					int b = i % 10;// 个位
					robot.keyPress(map.get(a));
					robot.keyPress(map.get(b));
					robot.keyPress(KeyEvent.VK_ENTER);
				}
				// 三位数的处理
				if (i > 99 && i <= 999) {
					int a = i / 100;// 百位
					int b = (i % 100) / 10;// 十位
					int c = i % 10;// 个位
					robot.keyPress(map.get(a));
					robot.keyPress(map.get(b));
					robot.keyPress(map.get(c));
					robot.keyPress(KeyEvent.VK_ENTER);
				}
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		demo.dosomething();

	}
}
