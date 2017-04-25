/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

public class MOV_A8_486 extends ParseSupport {

	public static final MOV_A8_486 INSTANCE = new MOV_A8_486();

	@Override
	public String parse(int data) {

		int head = getShiftInt(data, 8, 8);
		if (head == 0b01000110)
			return EncodingT1(data);

		head = getShiftInt(data, 6, 10);
		if (head == 0b0000000000)
			return EncodingT2(data);

		return error(data);
	}

	private String EncodingT1(int data) {
		int D = getShiftInt(data, 7, 1);
		int Rm = getShiftInt(data, 3, 4);
		int Rd = getShiftInt(data, 0, 3);

		Rd = D << 3 | Rd;
		StringBuilder sb = new StringBuilder("MOV ");
		sb.append(parseRegister(Rd)).append(" , ").append(parseRegister(Rm));

		if (Rd == Rm)
			sb.append("  (NOP)");

		return sb.toString();
	}

	private String EncodingT2(int data) {
		int Rm = getShiftInt(data, 3, 3);
		int Rd = getShiftInt(data, 0, 3);
		StringBuilder sb = new StringBuilder("MOV ");
		sb.append(parseRegister(Rd)).append(" , ").append(parseRegister(Rm));

		if (Rd == Rm)
			sb.append("  (NOP)");

		return sb.toString();
	}

	@Override
	protected String getOpCode() {
		return null;
	}

	@Override
	protected String getRn(int data) {
		return null;
	}

	@Override
	protected String getRm(int data) {
		return null;
	}

}