import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Sorgular_Sayfasý {
    
    
    public void ListeSil( String ListeTuru, String ID )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );

        try{
            if( ListeTuru.equals( "Ogrenci" )==true )
            {
                Statement st=conn.createStatement(  );
                st.executeUpdate( "Delete From ogrenciler Where Tc='" + ID + "'" );
                JOptionPane.showMessageDialog( null, "Öðrenci Silindi." );
                st.close(  );
                conn.close(  );
                
            }
            else if( ListeTuru.equals( "Personel" )==true )
            {
                Statement st=conn.createStatement(  );
                st.executeUpdate( "Delete From personel Where Tc='" + ID + "'" );
                JOptionPane.showMessageDialog( null, "Personel Silindi." );
                st.close(  );
                conn.close(  );
                
            }
            else
            {
                Statement st=conn.createStatement(  );
                st.executeUpdate( "Delete From odalar Where OdaNo=" + ID );
                JOptionPane.showMessageDialog( null, "Oda Silindi." );
                st.close(  );
                conn.close(  );
               
            }

        }catch( Exception exp ){
            System.out.println( exp.getMessage(  ) );
        }
    }
    
     public void PersonelEkle( boolean Guncelle, String Tc, String AdSoyad, String DTarihi, String DYeri, String Cinsiyet, String Adres, String Telefon, String Eposta, String Maas, String Yetki, String Sifre )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );

        try{
            Statement st=conn.createStatement(  );
            if( Guncelle==false )
            {
                st.executeUpdate( "INSERT INTO personel ( Tc, AdSoyad, DogumTarihi, DogumYeri, Cinsiyet, Adres, Tel, Eposta, Maas, Yetki, Sifre ) Values( '" + Tc + "', '" + AdSoyad + "', '" + DTarihi + "', '" + DYeri + "', '" + Cinsiyet + "', '" + Adres + "', '" + Telefon + "', '" + Eposta + "', '" + Maas + "', '" + Yetki + "', '" + Sifre + "' )" );
                JOptionPane.showMessageDialog( null, "Personel Eklendi." );
            }
            else
            {
                st.executeUpdate( "Update personel Set AdSoyad='" + AdSoyad + "', DogumTarihi='" + DTarihi + "', DogumYeri='" + DYeri + "', Cinsiyet='" + Cinsiyet + "', Adres='" + Adres + "', Tel='" + Telefon + "', Eposta='" + Eposta + "', Maas='" + Maas + "', Eposta='" + Yetki + "', Maas='" + Sifre + "' Where Tc='" + Tc + "'" );
                JOptionPane.showMessageDialog( null, "Personel Güncellendi." );
            }
            st.close(  );
            conn.close(  );
           

        }catch( Exception exp ){
            JOptionPane.showMessageDialog( null, exp.getMessage(  ) );
            System.out.println( exp.getMessage(  ) );
        }
    }
    
    
     public void Odemeler( String Tc, String Tarih, String Ucret , String AdSoyad )
    {
        Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );

        try{
            Statement st=conn.createStatement(  );
                st.executeUpdate( "INSERT INTO odemeler ( Tc, Tarih, Ucret ) Values( '" + Tc + "', '" + Tarih + "', '" + Ucret + "' )" );
                JOptionPane.showMessageDialog( null, " Sayýn " + AdSoyad + ", " + Tarih + " Tarihli " + Ucret + " TL lik Yurt Ücretiniz Ödenmiþtir." );
            st.close(  );
            conn.close(  );

        }catch( Exception exp ){
            JOptionPane.showMessageDialog( null, exp.getMessage(  ) );
            System.out.println( exp.getMessage(  ) );
        }
    }
    
    public void IzinAlOgr( String Tc, String GidisTarihi, String DonusTarihi, String GidecegiAdres, String AdSoyad )
    {
             Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );

        try{
            Statement st=conn.createStatement(  );
                st.executeUpdate( "INSERT INTO izinler ( Tc, GidisTarihi, DonusTarihi, GidecegiAdres ) Values( '" + Tc + "', '" + GidisTarihi + "', '" + DonusTarihi + "', '" + GidecegiAdres + "' )" );
                JOptionPane.showMessageDialog( null, " Sayýn " + AdSoyad + " " + GidisTarihi + " - " + DonusTarihi + " Tarihleri Arasýnda Ýzniniz Alýndý." );

            st.close(  );
            conn.close(  );

        }catch( Exception exp ){
            JOptionPane.showMessageDialog( null, exp.getMessage(  ) );
            System.out.println( exp.getMessage(  ) );
        }
    }
    
    
        public void IzinAl( String Tc, String GidisTarihi, String DonusTarihi, String GidecegiAdres )
    {
             Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );

        try{
            Statement st1=conn.createStatement(  );
            ResultSet rs1=st1.executeQuery( "SELECT * FROM ogrenciler Where Tc='" + Tc + "'" );
            if( rs1.next(  ) )
            {
            Statement st=conn.createStatement(  );
                st.executeUpdate( "INSERT INTO izinler ( Tc, GidisTarihi, DonusTarihi, GidecegiAdres ) Values( '" + Tc + "', '" + GidisTarihi + "', '" + DonusTarihi + "', '" + GidecegiAdres + "' )" );
                JOptionPane.showMessageDialog( null, "Ýzin Verildi." );

            st.close(  );
             }
            else
            {
            JOptionPane.showMessageDialog( null, Tc + " Tc li Öðrenci Bulunamadý." );
            }
            st1.close(  );
            rs1.close(  );
            conn.close(  );

        }catch( Exception exp ){
            JOptionPane.showMessageDialog( null, exp.getMessage(  ) );
            System.out.println( exp.getMessage(  ) );
        }
    }
    
    public void OgrenciEkle( boolean Guncelle, String Tc, String AdSoyad, String DTarihi, String DYeri, String Cinsiyet, String Adres, String Telefon, String Eposta, String Sifre, String OdaNo )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );

        try{
            Statement st=conn.createStatement(  );
            if( Guncelle==false )
            {
                st.executeUpdate( "INSERT INTO ogrenciler ( Tc, AdSoyad, DogumTarihi, DogumYeri, Cinsiyet, Adres, Tel, Eposta, Sifre, OdaNo ) Values( '" + Tc + "', '" + AdSoyad + "', '" + DTarihi + "', '" + DYeri + "', '" + Cinsiyet + "', '" + Adres + "', '" + Telefon + "', '" + Eposta + "', '" + Sifre + "', '" + OdaNo + "' )" );
                JOptionPane.showMessageDialog( null, "Öðrenci Eklendi." );
            }
            else
            {
                st.executeUpdate( "Update ogrenciler Set AdSoyad='" + AdSoyad + "', DogumTarihi='" + DTarihi + "', DogumYeri='" + DYeri + "', Cinsiyet='" + Cinsiyet + "', Adres='" + Adres + "', Tel='" + Telefon + "', Eposta='" + Eposta + "', Sifre='" + Sifre + "', OdaNo='" + OdaNo + "' Where Tc='" + Tc + "'" );
                JOptionPane.showMessageDialog( null, "Öðrenci Güncellendi." );
            }
            st.close(  );
            conn.close(  );
           

        }catch( Exception exp ){
            JOptionPane.showMessageDialog( null, exp.getMessage(  ) );
            System.out.println( exp.getMessage(  ) );
        }
    }
    
    public void Giris( String Tc , String Sifre )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM personel Where Tc='" + Tc + "' And Sifre='" + Sifre + "' AND Yetki=1" );
            if( rs.next(  ) )
            {
            new Yurt_Sayfa(  ).setVisible( true );
            }
            else
            {
            Statement st1=conn.createStatement(  );
            ResultSet rs1=st1.executeQuery( "SELECT * FROM ogrenciler Where Tc='" + Tc + "' And Sifre='" + Sifre + "'" );
            if( rs1.next(  ) )
            {
            Ogrenci_Page frm = new Ogrenci_Page(  );
            frm.Tc = Tc;
            frm.setVisible( true );

            }
            else
            {
                JOptionPane.showMessageDialog( null, "Kullanýcý Adý veya Parola Yanlýþ!!!" );
            }
            rs1.close(  );
            st1.close(  );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            
        }catch( Exception exp ){
            System.out.println( exp.getMessage(  ) );
        }
    }
    
}
