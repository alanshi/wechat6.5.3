package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class ei extends aqx {
    public int hNS;
    public String meZ;
    public int mfa;
    public int mfb;
    public int mfc;
    public int mfd;
    public int mfh;
    public String mfo;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            if (this.meZ != null) {
                aVar.e(2, this.meZ);
            }
            aVar.dV(3, this.mfb);
            aVar.dV(4, this.mfc);
            aVar.dV(5, this.hNS);
            if (this.mfo != null) {
                aVar.e(6, this.mfo);
            }
            aVar.dV(7, this.mfh);
            aVar.dV(8, this.mfd);
            aVar.dV(9, this.mfa);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.meZ != null) {
                r0 += a.a.a.b.b.a.f(2, this.meZ);
            }
            r0 = ((r0 + a.a.a.a.dS(3, this.mfb)) + a.a.a.a.dS(4, this.mfc)) + a.a.a.a.dS(5, this.hNS);
            if (this.mfo != null) {
                r0 += a.a.a.b.b.a.f(6, this.mfo);
            }
            return ((r0 + a.a.a.a.dS(7, this.mfh)) + a.a.a.a.dS(8, this.mfd)) + a.a.a.a.dS(9, this.mfa);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ei eiVar = (ei) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        com.tencent.mm.ba.a eoVar = new eo();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = eoVar.a(aVar4, eoVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        eiVar.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    eiVar.meZ = aVar3.pMj.readString();
                    return 0;
                case 3:
                    eiVar.mfb = aVar3.pMj.mH();
                    return 0;
                case 4:
                    eiVar.mfc = aVar3.pMj.mH();
                    return 0;
                case 5:
                    eiVar.hNS = aVar3.pMj.mH();
                    return 0;
                case 6:
                    eiVar.mfo = aVar3.pMj.readString();
                    return 0;
                case 7:
                    eiVar.mfh = aVar3.pMj.mH();
                    return 0;
                case 8:
                    eiVar.mfd = aVar3.pMj.mH();
                    return 0;
                case 9:
                    eiVar.mfa = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
