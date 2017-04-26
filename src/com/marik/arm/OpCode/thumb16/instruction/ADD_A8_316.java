/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;
import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class ADD_A8_316 extends ParseSupport {

	public static final ADD_A8_316 INSTANCE = new ADD_A8_316();

	@Override
	public String parse(int data) {

		if (getShiftInt(data, 11, 5) == 0b10101)
			return EncodingT1(data);
		if (getShiftInt(data, 7, 9) == 0b101100000)
			return EncodingT2(data);

		return error(data);
	}

	private String EncodingT2(int data) {
		int imm7 = getShiftInt(data, 0, 7);

		StringBuilder sb = new StringBuilder("ADD SP , SP , #");
		sb.append(zeroExtend(imm7, 2));
		return sb.toString();
	}

	private String EncodingT1(int data) {
		int Rd = getShiftInt(data, 8, 3);
		int imm8 = getShiftInt(data, 0, 8);

		StringBuilder sb = new StringBuilder("ADD ");
		sb.append(parseRegister(Rd)).append(" , SP , #");

		sb.append(zeroExtend(imm8, 2));

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

	@Override
	public void performExecuteCommand(int data) {
	}

}
