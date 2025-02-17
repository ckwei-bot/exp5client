package LookupTable;

import java.math.BigInteger;

public abstract class LookupTableAgent {
    protected int nRows, nCols;
    protected int nRIBits, nCIBits, nBits;

    protected boolean extCase = false;

    public abstract BigInteger[] execute(BigInteger[] riBitLabels, BigInteger[] ciBitLabels);
}