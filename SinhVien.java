package Day3;

abstract class SinhVien {
    
    private String type;
    private String name;
    private String college;
    private int age;

    public SinhVien() {
    }
    
    public SinhVien(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNational() {
        return "Viet Nam";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SinhVien(String type, String name, String college, int age) {
        this.type = type;
        this.name = name;
        this.college = college;
        this.age = age;
    }
    
    public abstract double getDTB();
    public String getHocLuc(){
        double DTB = getDTB();
        if(DTB>5){
            return "Pass";
        }else{
            return "Not Pass";
        }
    }
 }



