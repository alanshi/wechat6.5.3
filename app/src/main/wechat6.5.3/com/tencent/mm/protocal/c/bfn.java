package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.am;
import com.tencent.mm.plugin.appbrand.jsapi.an;
import com.tencent.mm.plugin.appbrand.jsapi.as;
import com.tencent.mm.plugin.appbrand.jsapi.bf;
import java.util.LinkedList;

public final class bfn extends aqx {
    public int mNZ;
    public bfo mZX;
    public int mZY;
    public int mZZ;
    public int meD;
    public LinkedList<beg> meE = new LinkedList();
    public int mqS;
    public long mqT;
    public int naX;
    public int nae;
    public LinkedList<bfp> naf = new LinkedList();
    public int nag;
    public int nah;
    public int nai;
    public int naj;
    public int nak;
    public int nal;
    public int nam;
    public int nan;
    public int nao;
    public int nap;
    public int naq;

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
            aVar.dV(2, this.mqS);
            aVar.dV(3, this.meD);
            aVar.d(4, 8, this.meE);
            aVar.C(5, this.mqT);
            aVar.dV(6, this.mNZ);
            if (this.mZX != null) {
                aVar.dX(7, this.mZX.aHr());
                this.mZX.a(aVar);
            }
            aVar.dV(8, this.nae);
            aVar.d(9, 8, this.naf);
            aVar.dV(10, this.nag);
            aVar.dV(11, this.nah);
            aVar.dV(12, this.nai);
            aVar.dV(13, this.naj);
            aVar.dV(14, this.naX);
            aVar.dV(15, this.nak);
            aVar.dV(16, this.nal);
            aVar.dV(17, this.mZY);
            aVar.dV(18, this.nam);
            aVar.dV(19, this.nan);
            aVar.dV(20, this.mZZ);
            aVar.dV(21, this.nao);
            aVar.dV(22, this.nap);
            aVar.dV(23, this.naq);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((((r0 + a.a.a.a.dS(2, this.mqS)) + a.a.a.a.dS(3, this.meD)) + a.a.a.a.c(4, 8, this.meE)) + a.a.a.a.B(5, this.mqT)) + a.a.a.a.dS(6, this.mNZ);
            if (this.mZX != null) {
                r0 += a.a.a.a.dU(7, this.mZX.aHr());
            }
            return (((((((((((((((r0 + a.a.a.a.dS(8, this.nae)) + a.a.a.a.c(9, 8, this.naf)) + a.a.a.a.dS(10, this.nag)) + a.a.a.a.dS(11, this.nah)) + a.a.a.a.dS(12, this.nai)) + a.a.a.a.dS(13, this.naj)) + a.a.a.a.dS(14, this.naX)) + a.a.a.a.dS(15, this.nak)) + a.a.a.a.dS(16, this.nal)) + a.a.a.a.dS(17, this.mZY)) + a.a.a.a.dS(18, this.nam)) + a.a.a.a.dS(19, this.nan)) + a.a.a.a.dS(20, this.mZZ)) + a.a.a.a.dS(21, this.nao)) + a.a.a.a.dS(22, this.nap)) + a.a.a.a.dS(23, this.naq);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.meE.clear();
            this.naf.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
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
            bfn com_tencent_mm_protocal_c_bfn = (bfn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bfn.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bfn.mqS = aVar3.pMj.mH();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bfn.meD = aVar3.pMj.mH();
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        beg com_tencent_mm_protocal_c_beg = new beg();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_beg.a(aVar4, com_tencent_mm_protocal_c_beg, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bfn.meE.add(com_tencent_mm_protocal_c_beg);
                    }
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_bfn.mqT = aVar3.pMj.mI();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_bfn.mNZ = aVar3.pMj.mH();
                    return 0;
                case 7:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        bfo com_tencent_mm_protocal_c_bfo = new bfo();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_bfo.a(aVar4, com_tencent_mm_protocal_c_bfo, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bfn.mZX = com_tencent_mm_protocal_c_bfo;
                    }
                    return 0;
                case 8:
                    com_tencent_mm_protocal_c_bfn.nae = aVar3.pMj.mH();
                    return 0;
                case 9:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        bfp com_tencent_mm_protocal_c_bfp = new bfp();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_bfp.a(aVar4, com_tencent_mm_protocal_c_bfp, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bfn.naf.add(com_tencent_mm_protocal_c_bfp);
                    }
                    return 0;
                case 10:
                    com_tencent_mm_protocal_c_bfn.nag = aVar3.pMj.mH();
                    return 0;
                case 11:
                    com_tencent_mm_protocal_c_bfn.nah = aVar3.pMj.mH();
                    return 0;
                case 12:
                    com_tencent_mm_protocal_c_bfn.nai = aVar3.pMj.mH();
                    return 0;
                case as.CTRL_INDEX /*13*/:
                    com_tencent_mm_protocal_c_bfn.naj = aVar3.pMj.mH();
                    return 0;
                case an.CTRL_INDEX /*14*/:
                    com_tencent_mm_protocal_c_bfn.naX = aVar3.pMj.mH();
                    return 0;
                case am.CTRL_INDEX /*15*/:
                    com_tencent_mm_protocal_c_bfn.nak = aVar3.pMj.mH();
                    return 0;
                case 16:
                    com_tencent_mm_protocal_c_bfn.nal = aVar3.pMj.mH();
                    return 0;
                case 17:
                    com_tencent_mm_protocal_c_bfn.mZY = aVar3.pMj.mH();
                    return 0;
                case 18:
                    com_tencent_mm_protocal_c_bfn.nam = aVar3.pMj.mH();
                    return 0;
                case 19:
                    com_tencent_mm_protocal_c_bfn.nan = aVar3.pMj.mH();
                    return 0;
                case 20:
                    com_tencent_mm_protocal_c_bfn.mZZ = aVar3.pMj.mH();
                    return 0;
                case 21:
                    com_tencent_mm_protocal_c_bfn.nao = aVar3.pMj.mH();
                    return 0;
                case bf.CTRL_INDEX /*22*/:
                    com_tencent_mm_protocal_c_bfn.nap = aVar3.pMj.mH();
                    return 0;
                case 23:
                    com_tencent_mm_protocal_c_bfn.naq = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
