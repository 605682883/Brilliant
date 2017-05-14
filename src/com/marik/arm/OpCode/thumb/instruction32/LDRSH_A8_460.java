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

public class LDRSH_A8_460 extends ParseSupport {

	public static final LDRSH_A8_460 INSTANCE = new LDRSH_A8_460();

	@Override
	protected String getOpCode(int data) {
		return "LDRSH";
	}
	@Override
	protected int getRd(int data) {
		return -1;
	}
	@Override
	protected int getRn(int data) {
		return -1;
	}
	@Override
	protected int getRm(int data) {
		return -1;
	}
	@Override
	protected int getS(int data) {
		return -1;
	}
	@Override
	protected int getType(int data) {
		return -1;
	}
	@Override
	protected int getShift(int data) {
		return 0;
	}
	@Override
	public void performExecuteCommand(int data) {
	}

}