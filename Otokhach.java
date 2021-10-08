
package test2;

import java.util.Scanner;


public class Otokhach extends OtoDuLich {
    //khai bao bien
    public float UuDai;
    
    // constructor
    public Otokhach(){
    
    }
    public Otokhach(String TenSaLon,String MaHang ,String TenHang, float DonGia,
            int SoLuong, float Thue,float KhuyenMai,int SoCho)
    {
        
    super(TenSaLon,MaHang,TenHang,DonGia,SoLuong,Thue,KhuyenMai,SoCho);
    this.UuDai=UuDai;
       
    }

    Otokhach(String TenSaLon, String MaHang, String TenHang, float DonGia, int SoLuong, float Thue, float KhuyenMai, int SoCho, float UuDai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    // nhap
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner inp = new Scanner (System.in);
        System.out.print("\n +Uu dai: ");
        this.UuDai = inp.nextFloat();
    }
    // Tinh diem
    @Override
    public float TinhTien(){
        return DonGia*SoLuong-UuDai+(DonGia*SoLuong)*Thue;
    }
    //to string
@Override
public String ToString(){
        String str = super.ToString()+"\n + Khuyen Mai: "+UuDai
                                     +"\n + Tinh Tien"+TinhTien();
           
        return str;   
}
}
