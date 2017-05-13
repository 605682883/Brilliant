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

public class MOV_A8_484 extends ParseSupport {

	public static final MOV_A8_484 INSTANCE = new MOV_A8_484();

	@Override
	public String parse(int data) {

		int type = getShiftInt(data, 25, 1);
		if (type == 0b0)
			return super.parse(data);
		return EncodingT3(data);
	}

	private String EncodingT3(int data) {

		StringBuilder sb = new StringBuilder("MOVW");
		sb.append(" ");
		int Rd = getShiftInt(data, 8, 4);
		int imm16 = getShiftInt(data, 16, 4) << 12
				| getShiftInt(data, 26, 1) << 11
				| getShiftInt(data, 12, 3) << 8 | getShiftInt(data, 0, 8);

		sb.append(parseRegister(Rd));
		sb.append(" , #");
		sb.append(imm16);

		return sb.toString();
	}

	@Override
	protected String getOpCode(int data) {
		return "MOV";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 8, 4);
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