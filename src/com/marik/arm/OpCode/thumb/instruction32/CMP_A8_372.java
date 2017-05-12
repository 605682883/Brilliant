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

public class CMP_A8_372 extends ParseSupport {

	public static final CMP_A8_372 INSTANCE = new CMP_A8_372();

	@Override
	protected String getOpCode(int data) {
		return "CMP.W";
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