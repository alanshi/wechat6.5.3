package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class vs extends aqp {
    public int maG;
    public are mcz;
    public int mfK;
    public int myg;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mcz == null) {
                throw new b("Not all required fields were included: ReqBuf");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mcz != null) {
                aVar.dX(2, this.mcz.aHr());
                this.mcz.a(aVar);
            }
            aVar.dV(3, this.mfK);
            aVar.dV(4, this.maG);
            aVar.dV(5, this.myg);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mcz != null) {
                r0 += a.a.a.a.dU(2, this.mcz.aHr());
            }
            return ((r0 + a.a.a.a.dS(3, this.mfK)) + a.a.a.a.dS(4, this.maG)) + a.a.a.a.dS(5, this.myg);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mcz != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ReqBuf");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            vs vsVar = (vs) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        vsVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        are com_tencent_mm_protocal_c_are = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_are.a(aVar4, com_tencent_mm_protocal_c_are, aqp.a(aVar4))) {
                        }
                        vsVar.mcz = com_tencent_mm_protocal_c_are;
                    }
                    return 0;
                case 3:
                    vsVar.mfK = aVar3.pMj.mH();
                    return 0;
                case 4:
                    vsVar.maG = aVar3.pMj.mH();
                    return 0;
                case 5:
                    vsVar.myg = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
