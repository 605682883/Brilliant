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

public class UXTB16_16_A8_814 extends ParseSupport {

	public static final UXTB16_16_A8_814 INSTANCE = new UXTB16_16_A8_814();

	@Override
	protected String getOpCode(int data) {
		return "UXTB16";
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