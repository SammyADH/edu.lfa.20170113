
package edu.lfa.dao;

import java.util.ArrayList;
import java.util.List;

public class Enroll_Const {
    private int stdId,crsId;

    public Enroll_Const() {
    }

    public Enroll_Const(int stdId, int crsId) {
        this.stdId = stdId;
        this.crsId = crsId;
    }
    
    private static List<SArraylist> slist = new ArrayList<>();
    private static List<CArraylist> clist = new ArrayList<>();
    
    public boolean Check_Status(){
        for(SArraylist var1 : slist){
            for(CArraylist var2 : clist){
                if(stdId==var1.getId()&&crsId==var2.getId()){
                    return true;
                }
            }
        }return false;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public void setCrsId(int crsId) {
        this.crsId = crsId;
    }
          
}
