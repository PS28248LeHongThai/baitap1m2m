package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

    ArrayList<SinhVien> list = new ArrayList<>(); 
    Scanner scan = new Scanner(System.in);
    public void addStudents() {
        do {
            System.out.print("Nhap ten sinh vien: ");
            String name = scan.nextLine();
            if (name == null || name.equalsIgnoreCase("")) {
                System.out.println("Hay nhap ho ten: ");
                break;
            }
            System.out.print("Nhap tuoi: ");
            int age = scan.nextInt();
            scan.nextLine();
            System.out.print("Truong dang hoc: ");
            String college = scan.nextLine();
            System.out.print("Nhap diem Toan: ");
            double toan = scan.nextDouble();
            scan.nextLine();
            System.out.print("Nhap khoi (TN/XH): ");
            String type = scan.nextLine();
            if (type.equalsIgnoreCase("TN")) {
                System.out.print("Nhap diem Hoa: ");
                double Hoa = scan.nextDouble();
                scan.nextLine();
                SinhVien newSV = new SinhVienTN(Hoa, type, name, college, age, toan);
                list.add(newSV);
            } else {                
                System.out.print("Nhap diem GDCD: ");
                double GDCD = scan.nextDouble();
                scan.nextLine();
                SinhVien newSV = new SinhVienXH(GDCD, type, name, college, age, toan);
                list.add(newSV);
            }
        } while (true);
    }

    private void exportStudent(SinhVien sv) {
        System.out.println("Ho va Ten: " + sv.getName());
        System.out.println("Tuoi: " + sv.getAge());
        System.out.println("Truong dang hoc: " + sv.getCollege());
        System.out.println("Quoc tich: " + sv.getNational());
        System.out.println("Khoi: " + sv.getType());
        System.out.println("DiemTB: " + sv.getDTB());
        System.out.println("Ket qua: " + sv.getHocLuc());

    }

    public void export() {
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien sv : list) {
            exportStudent(sv);
        }
    }

    public void searchAge() {
        int minAge;
        System.out.print("Xin moi nhap tuoi: ");
        minAge = scan.nextInt();
        scan.nextLine();
        System.out.println("Danh sach Sinh Vien lon hon " + minAge + " tuoi la: ");
        for (SinhVien sv : list) {
            if (minAge < sv.getAge()) {
                exportStudent(sv);
            }
        }
    }

    public void searchType() {
        String newType;
        System.out.print("Nhap khoi can tim: ");
        newType = scan.nextLine();
        if (newType.equalsIgnoreCase("TN")) {
            System.out.println("Danh sach sinh vien khoi TN: ");
            for (SinhVien sv : list) {
                if (sv.getType().equalsIgnoreCase("TN")) {
                    exportStudent(sv);
                }
            }
        } else if (newType.equalsIgnoreCase("XH")) {
            System.out.println("Danh sach sinh vien khoi XH: ");
            for (SinhVien sv : list) {
                if (sv.getType().equalsIgnoreCase("XH")) {
                    exportStudent(sv);
                }
            }
        }
    }

    public void searchName() {
        System.out.print("Nhap ten sinh vien can tim: ");
        String name = scan.nextLine();
        System.out.println("Ket qua tim kiem: ");
        for (SinhVien sv : list) {
            if (sv.getName().equalsIgnoreCase(name)) {
                exportStudent(sv);
            }
        }
    }

    public void searchDTB() {
        double minDTB;
        System.out.print("Xin moi nhap DTB: ");
        minDTB = scan.nextDouble();
        System.out.println("Danh sach Sinh Vien co diem lon hon " + minDTB + " la: ");
        for (SinhVien sv : list) {
            if (minDTB < sv.getDTB()) {
                exportStudent(sv);
            }
        }
    }

    public void menu() {
        int chose;
        
        do {
            System.out.println("MENU");
            System.out.println("0.Nhap thong tin danh sach sinh vien");
            System.out.println("1.Xuat thong tin danh sach sinh vien");
            System.out.println("2.Tim sinh vien co tuoi tren n");
            System.out.println("3.Tim sinh vien theo khoi");
            System.out.println("4.Tim sinh vien theo ten");
            System.out.println("5.Tim sinh vien co DTB lon hon Diem Chuan");
            System.out.print("Moi ban chon chuong trinh muon thuc hien: ");
            chose = scan.nextInt();
            scan.nextLine();
            switch (chose) {
                case 0:
                    System.out.println("Nhap thong tin sinh vien");
                    addStudents();
                    break;
                case 1:
                    System.out.println("Xuat thong tin danh sach sinh vien");
                    export();
                    break;
                case 2:
                    System.out.println("Tim sinh vien co tuoi tren n");
                    searchAge();
                    break;
                case 3:
                    System.out.println("Tim sinh vien theo khoi");
                    searchType();
                    break;
                case 4:
                    System.out.println("Tim sinh vien theo ten");
                    searchName();
                    break;
                case 5:
                    System.out.println("Tim sinh vien co DTB lon hon Diem Chuan");
                    searchDTB();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Chi chon tu 1 - 6 !!");
            }
        } while (chose != 6);

    }

}