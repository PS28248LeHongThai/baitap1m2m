package Day3;

class SinhVienXH extends SinhVien{
    private Double Toan;
    private Double GDCD;

    public SinhVienXH() {
    }
    
    public SinhVienXH(Double Toan, Double GDCD, String type, String name, String college, int age) {
        super(type, name, college, age);
        this.Toan = Toan;
        this.GDCD = GDCD;
    }    
    
@Override
public double getDTB(){
    return (GDCD * 2 + Toan)/3;
}
}
