/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb.instruction32;

import com.marik.arm.OpCode.thumb.instruction32.support.ParseSupport;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;

public class TEQ_A8_738 extends ParseSupport {

	public static final TEQ_A8_738 INSTANCE = new TEQ_A8_738();

	@Override
	protected String getOpCode(int data) {
		return "TEQ";
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getShift(int data) {
		return thumbExpandImm(getShiftInt(data, 26, 1) << 11
				| getShiftInt(data, 12, 3) << 8 | getShiftInt(data, 0, 8));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}