/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.OpUtil.getShiftInt;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;

public class SUB_A8_712 extends ParseSupport {

	public static final SUB_A8_712 INSTANCE = new SUB_A8_712();

	@Override
	protected String getOpCode(int data) {
		return "SUB";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
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
		return getShiftInt(data, 5, 2);
	}

	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 7, 5);
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}