
package test2;

import java.util.Scanner;


public class OtoTai extends NhapKhauOTO {
    //khai bao bien
    public float GiamGia,TrongTai ,pt;
    
    // constructor
    public OtoTai(){
     System.out.println("\n Oto Tai: ");
    }
    public OtoTai(String TenSaLon,String MaHang ,String TenHang, float DonGia,int SoLuong, float Thue){
        super(TenSaLon,MaHang,TenHang,DonGia,SoLuong,Thue);
        this.GiamGia = GiamGia;
        this.TrongTai = TrongTai;
    }

    OtoTai(String TenSaLon, String MaHang, String TenHang, float DonGia, int SoLuong, float Thue, float GiamGia, float TrongTai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    // nhap
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner inp = new Scanner (System.in);
        System.out.print("\n + Giam gia: ");
        this.GiamGia = inp.nextFloat();
        System.out.print("\n + trong tai ");
        this.TrongTai = inp.nextFloat();
    }
    // Tinh diem
    public void XDPT(){
        if(TrongTai > 3.6)
            pt = 150/100;
        else
            pt=2;
                
    }
    @Override
    public float TinhTien(){
        
        return (DonGia-GiamGia)*SoLuong+(DonGia*SoLuong)*pt+DonGia*SoLuong*Thue;
    }
    //to string
@Override
public String ToString(){
        String str = super.ToString()+"\n + Giam gia: "+GiamGia
                                     +"\n + Trong tai " +TrongTai
                                     +"\n + Tinh Tien"+TinhTien();
           
        return str;   
}

}
