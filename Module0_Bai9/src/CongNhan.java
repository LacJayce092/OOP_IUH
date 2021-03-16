import java.lang.management.MemoryType;

public class CongNhan {
    private int maCN , mSoSP;
    private String mHo , mTen;

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        if(mSoSP > 0)
        this.mSoSP = mSoSP;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public CongNhan() {
    }

    public CongNhan(int maCN, String mHo, String mTen , int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }
    public double tinhLuong(){
        double luong = 0 ;
        if(mSoSP > 0  && mSoSP < 200)
            luong = mSoSP * 0.5;
        if(mSoSP >= 200  && mSoSP < 400)
            luong = mSoSP * 0.55;
        if(mSoSP >= 400  && mSoSP < 600)
            luong = mSoSP * 0.6;
        if(mSoSP >= 6000)
            luong = mSoSP * 0.65;
        return luong;
    }
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s %-15s",
                maCN , mHo , mTen , mSoSP , tinhLuong());
    }


}
