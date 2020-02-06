package spcurrent;

public class Spcurrent{
    public int Sp_input(int beforesp,int spused)/*spused = block dodge skill*/{
        int currentsp = beforesp - spused;
        return currentsp;
    }
}
//sp ปัจจุบันจากการใช้ block dodge skill 