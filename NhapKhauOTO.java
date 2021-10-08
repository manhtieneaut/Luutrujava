
package test2;
import java.util.Scanner;


public abstract class NhapKhauOTO {
    //khai báo biến
    public String TenSaLon,TenHang,MaHang;
    public int SoLuong;
    public float DonGia,Thue;
    
    // constructor
    public NhapKhauOTO(){    
    }
    public NhapKhauOTO(String TenSaLon,String MaHang ,String TenHang, float DonGia,int SoLuong, float Thue){
        this.TenSaLon=TenSaLon;
        this.MaHang= MaHang;
        this.TenHang = TenHang;
        this.DonGia=DonGia;
        this.SoLuong=SoLuong;
        this.Thue=Thue;
    }
    //Nhap
    public void Nhap(){
        System.out.print("\n Nhap thong tin nhap khau oto: ");
        Scanner inp = new Scanner (System.in);
        System.out.print("\n + Ten SaLon: ");
        this.TenSaLon = inp.nextLine();
        System.out.print("\n + Ma hang: ");
        this.MaHang = inp.nextLine();
        System.out.print("\n + Ten hang: ");
        this.TenHang = inp.nextLine();
        System.out.print("\n + Don gia: ");
        this.DonGia = inp.nextFloat();
        System.out.print("\n + So luong: ");
        this.SoLuong = inp.nextInt();
        System.out.print("\n + Diem nam 3: ");
        this.Thue = inp.nextFloat();
    }
    // phuong thuc truu tuong Tinh diem
     public abstract float TinhTien();
     public String ToString(){
     String str = "\n + Ten SaLon:"+TenSaLon+
                  "\n + Ma Hang : "+MaHang+
                  "\n + Ten Hang: "+TenHang+
                  "\n + Don Gia : "+DonGia+
                  "\n + So Luong: "+SoLuong+
                  "\n + Thue    : "+Thue;
        return str; 
     }   
    }

