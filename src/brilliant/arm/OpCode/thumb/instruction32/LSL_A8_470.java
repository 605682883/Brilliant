/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;
import static brilliant.elf.vm.OS.*;
import static brilliant.elf.vm.Register.*;
import static brilliant.arm.OpCode.OpUtil.*;

public class LSL_A8_470 extends ParseSupport {

	public static final LSL_A8_470 INSTANCE = new LSL_A8_470();

	@Override
	protected String getOpCode(int data) {
		return "LSL";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}