package Hpcurrent;

public class hpcurrent{
    public int hpsec(int beforehp,int damaged){
        int currenthp = beforehp - damaged;
        if(currenthp <= 0){
            return 0;
        }
        else{
            return currenthp;
        }
    }
}
//HP ปัจจุบัน