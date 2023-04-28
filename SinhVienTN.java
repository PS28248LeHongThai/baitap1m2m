package Day3;

class SinhVienTN extends SinhVien{
   private Double Toan;
   private Double Hoa;

    public SinhVienTN() {
    }

    public SinhVienTN(Double Toan, Double Hoa, String type, String name, String college, int age) {
        super(type, name, college, age);
        this.Toan = Toan;
        this.Hoa = Hoa;
    }    
   
    @Override
    public double getDTB(){
        return (Hoa + Toan)/2;
    }
}
