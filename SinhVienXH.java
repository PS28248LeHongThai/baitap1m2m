package Day3;

class SinhVienXH extends SinhVien{
    private double GDCD;

    public SinhVienXH() {
    }
    
    public SinhVienXH(Double GDCD, String type, String name, String college, int age,double toan) {
        super(type, name, college, age, toan);
        this.GDCD = GDCD;
        super.setAvg((this.GDCD * 2 + super.getToan())/3);
    }  

    public double getGDCD() {
        return GDCD;
    }

    public void setGDCD(double GDCD) {
        this.GDCD = GDCD;
    }
    
    
//@Override
//public double getDTB(){
//    return (this.GDCD * 2 + super.getToan())/3;
//    
//}
}
