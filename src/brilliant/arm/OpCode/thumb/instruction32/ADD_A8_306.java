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

public class ADD_A8_306 extends ParseSupport {

	public static final ADD_A8_306 INSTANCE = new ADD_A8_306();
	
	@Override
	public String parse(int data) {
		int type = getShiftInt(data, 25, 1);
		if (type == 0b0)
			return super.parse(data);
		return EncodingT4(data);
	}

	private String EncodingT4(int data) {

		StringBuilder sb = new StringBuilder("ADDW");
		sb.append(" ");
		int Rd = getShiftInt(data, 8, 4);
		int Rn = getShiftInt(data, 16, 4);
		int imm12 = getShiftInt(data, 26, 1) << 11
				| getShiftInt(data, 12, 3) << 8 | getShiftInt(data, 0, 8);

		sb.append(parseRegister(Rd));
		sb.append(" , ");
		sb.append(parseRegister(Rn));

		sb.append(" , #");
		sb.append(imm12);

		return sb.toString();
	}

	@Override
	protected String getOpCode(int data) {
		return "ADD";
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
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	protected int getShift(int data) {
		return thumbExpandImm(getShiftInt(data, 26, 1) << 11
				| getShiftInt(data, 12, 3) << 8 | getShiftInt(data, 0, 8));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}