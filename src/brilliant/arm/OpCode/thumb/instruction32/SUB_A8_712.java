/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction32;

import brilliant.arm.OpCode.thumb.instruction32.support.ParseSupport;
import static brilliant.arm.OpCode.OpUtil.*;
import static brilliant.elf.vm.OS.*;
import static brilliant.elf.vm.Register.*;

public class SUB_A8_712 extends ParseSupport {

	public static final SUB_A8_712 INSTANCE = new SUB_A8_712();

	@Override
	protected String getOpCode(int data) {
		return "SUB";
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
	protected int getType(int data) {
		return getShiftInt(data, 4, 2);
	}

	@Override
	protected int getShift(int data) {
		int imm3 = getShiftInt(data, 12, 3);
		int imm2 = getShiftInt(data, 6, 2);
		return imm3 << 2 | imm2;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}