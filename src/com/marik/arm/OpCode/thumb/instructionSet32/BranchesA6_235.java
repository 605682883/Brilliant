package com.marik.arm.OpCode.thumb.instructionSet32;

import com.marik.arm.OpCode.thumb.instruction32.support.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

class BranchesA6_235 {
	public static ParseSupport parse(int data) {
		
		int op1 = getShiftInt(data, 12, 3);
		int imm8 = getShiftInt(data, 0, 8);
		int op = getShiftInt(data, 20, 7);
		int op2 = getShiftInt(data, 8, 4);
		
		
		
		throw new IllegalArgumentException("Unable to decode instruction "
				+ Integer.toBinaryString(data));
	}
}
