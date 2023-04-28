package Day3;

class SinhVienTN extends SinhVien{
   private double Hoa;

    public SinhVienTN() {
    }

    public SinhVienTN(Double Hoa, String type, String name, String college, int age, double toan) {
        super(type, name, college, age, toan);
        this.Hoa = Hoa;
        super.setAvg((this.Hoa + super.getToan())/2);
    }    

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }
   
//    @Override
//    public double getDTB(){
//        return (this.Hoa + super.getToan())/2;
//    }
}
