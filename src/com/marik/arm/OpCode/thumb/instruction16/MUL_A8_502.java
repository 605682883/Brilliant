/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb.instruction16;

import static com.marik.arm.OpCode.OpUtil.getShiftInt;
import static com.marik.arm.OpCode.OpUtil.parseRegister;

import com.marik.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class MUL_A8_502 extends ParseSupport {

	public static final MUL_A8_502 INSTANCE = new MUL_A8_502();

	@Override
	protected String getOpCode(int data) {
		return "MULS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return parseRegister(getShiftInt(data, 3, 3));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}