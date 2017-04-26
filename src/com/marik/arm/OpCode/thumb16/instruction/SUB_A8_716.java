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

public class SUB_A8_716 extends ParseSupport {

	public static final SUB_A8_716 INSTANCE = new SUB_A8_716();

	@Override
	protected String getOpCode() {
		return "SUB";
	}

	@Override
	protected String getRn(int data) {
		return "SP";
	}

	@Override
	protected String getRm(int data) {
		return "SP , #" + (zeroExtend(getShiftInt(data, 0, 7), 2));
	}

	@Override
	public void performExecuteCommand(int data) {
	}
}
