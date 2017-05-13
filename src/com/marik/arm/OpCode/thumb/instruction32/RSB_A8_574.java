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

public class RSB_A8_574 extends ParseSupport {

	public static final RSB_A8_574 INSTANCE = new RSB_A8_574();

	@Override
	protected String getOpCode(int data) {
		return "RSB";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
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