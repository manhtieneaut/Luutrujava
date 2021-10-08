
package test2;
import java.util.Scanner;

public class OtoDuLich extends NhapKhauOTO {
    //khai bao bien
    public float KhuyenMai;
    public int SoCho;
    // constructor
    public OtoDuLich(){
    
    }
    public OtoDuLich(String TenSaLon,String MaHang ,String TenHang,
            float DonGia,int SoLuong, float Thue,float KhuyenMai,int SoCho){
        super(TenSaLon,MaHang,TenHang,DonGia,SoLuong,Thue);
        this.KhuyenMai = KhuyenMai;
        this.SoCho = SoCho;
    }
    
    // nhap
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner inp = new Scanner (System.in);
        System.out.print("\n + Khuyen mai: ");
        this.KhuyenMai = inp.nextFloat();
        System.out.print("\n + So cho: ");
        this.SoCho = inp.nextInt();
    }
    // Tinh diem
    @Override
    public float TinhTien(){
        return DonGia+SoLuong-DonGia*SoLuong*KhuyenMai+(DonGia*SoLuong)*Thue;
    }
    //to string
   @Override
    public String ToString(){
        String str = super.ToString()+"\n + Khuyen Mai: "+KhuyenMai
                                     +"\n + So Cho: " +SoCho
                                     +"\n + Tinh Tien"+TinhTien();
           
        return str;   
}
}
            

