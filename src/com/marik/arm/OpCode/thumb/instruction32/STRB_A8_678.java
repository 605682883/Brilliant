/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb.instruction32;

import com.marik.arm.OpCode.CondFactory;
import com.marik.arm.OpCode.arm.instructionSet.factory.TypeFactory;
import com.marik.arm.OpCode.thumb.instruction32.support.ParseSupport;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;

public class STRB_A8_678 extends ParseSupport {

	public static final STRB_A8_678 INSTANCE = new STRB_A8_678();

	@Override
	public String parse(int data) {
		int type = getShiftInt(data, 23, 1);

		if (type == 0b1)
			return EncodingT2(data);
		else
			return EncodingT3(data);
	}

	private String EncodingT3(int data) {
		StringBuilder sb = new StringBuilder("STRB.W ");

		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int imm8 = getShiftInt(data, 0, 8);

		boolean index = getShiftInt(data, 10, 1) == 1;
		boolean add = getShiftInt(data, 9, 1) == 1;
		boolean wback = getShiftInt(data, 8, 1) == 1;

		sb.append(parseRegister(Rt)).append(" , [");
		sb.append(parseRegister(Rn));

		if (!index)
			sb.append("] , ");
		else
			sb.append(" , ");

		if (!add)
			sb.append("-");

		sb.append("#");
		sb.append(imm8);

		if (index)
			sb.append("]");

		if (wback)
			sb.append("!");

		return sb.toString();
	}

	private String EncodingT2(int data) {

		StringBuilder sb = new StringBuilder("STRB.W ");

		int Rt = getShiftInt(data, 12, 4);
		int Rn = getShiftInt(data, 16, 4);
		int imm12 = getShiftInt(data, 0, 12);
		sb.append(parseRegister(Rt));
		sb.append(" , [");
		sb.append(parseRegister(Rn));
		sb.append(" , #");
		sb.append(imm12);
		sb.append("]");

		return sb.toString();
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}