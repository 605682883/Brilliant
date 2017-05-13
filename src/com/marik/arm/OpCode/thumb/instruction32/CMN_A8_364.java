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

public class CMN_A8_364 extends ParseSupport {

	public static final CMN_A8_364 INSTANCE = new CMN_A8_364();

	@Override
	protected String getOpCode(int data) {
		return "CMN";
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