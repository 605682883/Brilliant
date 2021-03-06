package brilliant.arm.OpCode.arm.instructionSet;

import static brilliant.arm.OpCode.factory.OpUtil.assert0;
import static brilliant.arm.OpCode.factory.OpUtil.assert1;
import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.arm.instruction.MLA_A8_480;
import brilliant.arm.OpCode.arm.instruction.MLS_A8_482;
import brilliant.arm.OpCode.arm.instruction.MUL_A8_502;
import brilliant.arm.OpCode.arm.instruction.SMLAL_A8_624;
import brilliant.arm.OpCode.arm.instruction.SMULL_A8_646;
import brilliant.arm.OpCode.arm.instruction.UMAAL_A8_774;
import brilliant.arm.OpCode.arm.instruction.UMLAL_A8_776;
import brilliant.arm.OpCode.arm.instruction.UMULL_A8_778;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;

@SuppressWarnings("deprecation")
public class MultiplyAndMultiplyAccumulate_A5_202 {
	public static ParseSupport parse(int data) {

		int op = getShiftInt(data, 20, 4);

		if (assert0(op, 1, 2, 3))
			return MUL_A8_502.INSTANCE;

		if (assert0(op, 2, 3) && assert1(op, 1))
			return MLA_A8_480.INSTANCE;

		switch (op) {
		case 0b0100:
			return UMAAL_A8_774.INSTANCE;
		case 0b0110:
			return MLS_A8_482.INSTANCE;
		}

		if (assert0(op, 1, 2) && assert1(op, 3))
			return UMULL_A8_778.INSTANCE;

		if (assert0(op, 2) && assert1(op, 1, 3))
			return UMLAL_A8_776.INSTANCE;

		if (assert0(op, 1) && assert1(op, 2, 3))
			return SMULL_A8_646.INSTANCE;

		if (assert1(op, 1, 2, 3))
			return SMLAL_A8_624.INSTANCE;

		throw new IllegalArgumentException("Unable to decode instruction "
				+ Integer.toBinaryString(data));
	}
}
