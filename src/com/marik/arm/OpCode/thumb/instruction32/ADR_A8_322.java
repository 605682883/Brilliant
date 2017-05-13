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

public class ADR_A8_322 extends ParseSupport {

	public static final ADR_A8_322 INSTANCE = new ADR_A8_322();

	@Override
	public String parse(int data) {

		int type = getShiftInt(data, 21, 5);
		if (type == 0b10101)
			return EncodingT2(data);

		if (type == 0b10000)
			return EncodingT3(data);

		return error(data);
	}

	private String EncodingT3(int data) {
		int Rd = getShiftInt(data, 8, 4);
		int imm12 = getShiftInt(data, 26, 1) << 11
				| getShiftInt(data, 12, 3) << 8 | getShiftInt(data, 0, 8);
		StringBuilder sb = new StringBuilder("ADR.W ");
		sb.append(parseRegister(Rd));
		sb.append(" , #");
		sb.append(imm12);

		return sb.toString();
	}

	private String EncodingT2(int data) {

		int Rd = getShiftInt(data, 8, 4);
		int imm12 = getShiftInt(data, 26, 1) << 11
				| getShiftInt(data, 12, 3) << 8 | getShiftInt(data, 0, 8);
		StringBuilder sb = new StringBuilder("ADR.W ");
		sb.append(parseRegister(Rd));
		sb.append(" , #-");
		sb.append(imm12);

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}