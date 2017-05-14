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

public class LDRSHT_A8_464 extends ParseSupport {

	public static final LDRSHT_A8_464 INSTANCE = new LDRSHT_A8_464();

	@Override
	protected String getOpCode(int data) {
		return "LDRSHT";
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