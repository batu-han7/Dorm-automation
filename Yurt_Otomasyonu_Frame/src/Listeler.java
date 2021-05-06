import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Listeler extends javax.swing.JFrame {

    public Listeler(  ) {
        initComponents(  );
        jButton4.setVisible( false );
    }
public String ListeTuru;
    private void initComponents(  ) {

        jScrollPane1 = new javax.swing.JScrollPane(  );
        jTable1 = new javax.swing.JTable(  );
        jLabel1 = new javax.swing.JLabel(  );
        jTextField1 = new javax.swing.JTextField(  );
        jButton1 = new javax.swing.JButton(  );
        jButton2 = new javax.swing.JButton(  );
        jButton3 = new javax.swing.JButton(  );
        jButton4 = new javax.swing.JButton(  );

        addWindowListener( new java.awt.event.WindowAdapter(  ) {
            public void windowOpened( java.awt.event.WindowEvent evt ) {
                formWindowOpened( evt );
            }
        } );

        jTable1.setModel( new javax.swing.table.DefaultTableModel( 
            new Object [][] {
                {null, null, null, null}, 
                {null, null, null, null}, 
                {null, null, null, null}, 
                {null, null, null, null}
            }, 
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
         ) );
        jTable1.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jTable1MouseClicked( evt );
            }
        } );
        jScrollPane1.setViewportView( jTable1 );

        jLabel1.setText( "jLabel1" );

        jButton1.setText( "Ara" );
        jButton1.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton1ActionPerformed( evt );
            }
        } );

        jButton2.setText( "Düzenle" );
        jButton2.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton2ActionPerformed( evt );
            }
        } );

        jButton3.setText( "Sil" );
        jButton3.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton3ActionPerformed( evt );
            }
        } );

        jButton4.setText( "Kimle Kalýyor" );
        jButton4.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton4ActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane(  ) );
        getContentPane(  ).setLayout( layout );
        layout.setHorizontalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addComponent( jLabel1 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jButton1 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jButton4 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                .addComponent( jButton3 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jButton2 )
                .addContainerGap(  ) )
            .addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE )
         );
        layout.setVerticalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel1 )
                    .addComponent( jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                    .addComponent( jButton1 )
                    .addComponent( jButton2 )
                    .addComponent( jButton3 )
                    .addComponent( jButton4 ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE ) )
         );

        pack(  );
    }

    private void jTable1MouseClicked( java.awt.event.MouseEvent evt ) {
        
        String[] seciliSatir = satýrBilgisiAl( jTable1.getSelectedRow(  ) );
        jTextField1.setText( seciliSatir[0].toString(  ) );
    }

    private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
        
        if( ListeTuru.equals( "Ogrenci" )==true )OgrencileriYukle( jTextField1.getText(  ) );
        else if( ListeTuru.equals( "Personel" )==true ) PersonelYukle( jTextField1.getText(  ) );
        else OdemeleriYukle( jTextField1.getText(  ) );
    }

    private void jButton2ActionPerformed( java.awt.event.ActionEvent evt ) {
       
        String[] seciliSatir = satýrBilgisiAl( jTable1.getSelectedRow(  ) );
        if( ListeTuru.equals( "Ogrenci" )==true )
        {
            Ogrenci_Ekle frm = new Ogrenci_Ekle(  );
            frm.Guncelle=true;
            frm.Tc=seciliSatir[0].toString(  );
            frm.AdSoyad=seciliSatir[1].toString(  );
            frm.DTarihi=seciliSatir[2].toString(  );
            frm.DYeri=seciliSatir[3].toString(  );
            frm.Cinsiyet=seciliSatir[4].toString(  );
            frm.Adres=seciliSatir[5].toString(  );
            frm.Telefon=seciliSatir[6].toString(  );
            frm.Eposta=seciliSatir[7].toString(  );
            frm.Sifre=seciliSatir[8].toString(  );
            frm.OdaNo=seciliSatir[9].toString(  );
            frm.setVisible( true );
        }
        else if( ListeTuru.equals( "Personel" )==true )
        {
            Personel_Ekle frm = new Personel_Ekle(  );
            frm.Guncelle=true;
            frm.Tc=seciliSatir[0].toString(  );
            frm.AdSoyad=seciliSatir[1].toString(  );
            frm.DTarihi=seciliSatir[2].toString(  );
            frm.DYeri=seciliSatir[3].toString(  );
            frm.Cinsiyet=seciliSatir[4].toString(  );
            frm.Adres=seciliSatir[5].toString(  );
            frm.Telefon=seciliSatir[6].toString(  );
            frm.Eposta=seciliSatir[7].toString(  );
            frm.Maas=seciliSatir[8].toString(  );
            frm.Yetki=seciliSatir[9].toString(  );
            frm.Sifre=seciliSatir[10].toString(  );
            frm.setVisible( true );
        }

    }

    private void jButton3ActionPerformed( java.awt.event.ActionEvent evt ) {
       

        Sorgular_Sayfasý sorgu = new Sorgular_Sayfasý(  );
        sorgu.ListeSil( ListeTuru, jTextField1.getText(  ) );
        
      
    }

    private void formWindowOpened( java.awt.event.WindowEvent evt ) {
       
        if( ListeTuru.equals( "Ogrenci" )==true ){OgrencileriYukle(  ); jButton4.setVisible( true );}
        else if( ListeTuru.equals( "Personel" )==true ) PersonelYukle(  );
        else
        {
        jButton2.setVisible( false );
        jButton3.setVisible( false );
        OdemeleriYukle(  );
        }
    }

    private void jButton4ActionPerformed( java.awt.event.ActionEvent evt ) {
        
        Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM ogrenciler Where Tc='" + jTextField1.getText(  ) + "'" );
            rs.next(  );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Doðum Tarihi" );
            DTM.addColumn( "Doðum Yeri" );
            DTM.addColumn( "Cinsiyet" );
            DTM.addColumn( "Adres" );
            DTM.addColumn( "Telefon" );
            DTM.addColumn( "Eposta" );
            DTM.addColumn( "Sifre" );
            DTM.addColumn( "Oda No" );

            Statement st1=conn.createStatement(  );
            ResultSet rs1=st1.executeQuery( "SELECT * FROM ogrenciler Where OdaNo='" + rs.getString( "OdaNo" ) + "'" );
            while( rs1.next(  ) ){
                DTM.addRow( new String[]{rs1.getString( "Tc" ), rs1.getString( "AdSoyad" ), rs1.getString( "DogumTarihi" ), rs1.getString( "DogumYeri" ), rs1.getString( "Cinsiyet" ), rs1.getString( "Adres" ), rs1.getString( "Tel" ), rs1.getString( "Eposta" ), rs1.getString( "Sifre" ), rs1.getString( "OdaNo" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Öðrenci Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
        
    }
    
    
     public String[] satýrBilgisiAl( int seçilensatýr ) 
    {
        int sütünsayýsý=jTable1.getColumnCount(  );
        String[] result = new String[sütünsayýsý];

        for ( int i = 0; i < sütünsayýsý; i ++  ) 
        {
            result[i] = jTable1.getModel(  ).getValueAt( seçilensatýr, i ).toString(  );
        }

        return result;
    }
    
    private void OgrencileriYukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM ogrenciler" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Doðum Tarihi" );
            DTM.addColumn( "Doðum Yeri" );
            DTM.addColumn( "Cinsiyet" );
            DTM.addColumn( "Adres" );
            DTM.addColumn( "Telefon" );
            DTM.addColumn( "Eposta" );
            DTM.addColumn( "Sifre" );
            DTM.addColumn( "Oda No" );
            


            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "AdSoyad" ), rs.getString( "DogumTarihi" ), rs.getString( "DogumYeri" ), rs.getString( "Cinsiyet" ), rs.getString( "Adres" ), rs.getString( "Tel" ), rs.getString( "Eposta" ), rs.getString( "Sifre" ), rs.getString( "OdaNo" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Öðrenci Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
     
    private void OdemeleriYukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM odemeler" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Tarih" );
            DTM.addColumn( "Ücret" );



            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "Tarih" ), rs.getString( "Ucret" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Öðrenci Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
     private void OdemeleriYukle( String Tc )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM odemeler Where Tc='" + Tc + "'" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Tarih" );
            DTM.addColumn( "Ücret" );



            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "Tarih" ), rs.getString( "Ucret" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Öðrenci Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }

    private void OgrencileriYukle( String Tc )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM ogrenciler Where Tc='" + Tc + "'" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Doðum Tarihi" );
            DTM.addColumn( "Doðum Yeri" );
            DTM.addColumn( "Cinsiyet" );
            DTM.addColumn( "Adres" );
            DTM.addColumn( "Telefon" );
            DTM.addColumn( "Eposta" );
            DTM.addColumn( "Sifre" );
            DTM.addColumn( "Oda No" );

            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "AdSoyad" ), rs.getString( "DogumTarihi" ), rs.getString( "DogumYeri" ), rs.getString( "Cinsiyet" ), rs.getString( "Adres" ), rs.getString( "Tel" ), rs.getString( "Eposta" ), rs.getString( "Sifre" ), rs.getString( "OdaNo" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Öðrenci Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
    
    
    private void PersonelYukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM personel" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Doðum Tarihi" );
            DTM.addColumn( "Doðum Yeri" );
            DTM.addColumn( "Cinsiyet" );
            DTM.addColumn( "Adres" );
            DTM.addColumn( "Telefon" );
            DTM.addColumn( "Eposta" );
            DTM.addColumn( "Maaþ" );
            DTM.addColumn( "Yetki" );
            DTM.addColumn( "Sifre" );

            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "AdSoyad" ), rs.getString( "DogumTarihi" ), rs.getString( "DogumYeri" ), rs.getString( "Cinsiyet" ), rs.getString( "Adres" ), rs.getString( "Tel" ), rs.getString( "Eposta" ), rs.getString( "Maas" ), rs.getString( "Yetki" ), rs.getString( "Sifre" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Personel Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }

    private void PersonelYukle( String Tc )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM personel Where Tc='" + Tc + "'" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Doðum Tarihi" );
            DTM.addColumn( "Doðum Yeri" );
            DTM.addColumn( "Cinsiyet" );
            DTM.addColumn( "Adres" );
            DTM.addColumn( "Telefon" );
            DTM.addColumn( "Eposta" );
            DTM.addColumn( "Maaþ" );
            DTM.addColumn( "Yetki" );
            DTM.addColumn( "Sifre" );

            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "AdSoyad" ), rs.getString( "DogumTarihi" ), rs.getString( "DogumYeri" ), rs.getString( "Cinsiyet" ), rs.getString( "Adres" ), rs.getString( "Tel" ), rs.getString( "Eposta" ), rs.getString( "Maas" ), rs.getString( "Yetki" ), rs.getString( "Sifre" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            jLabel1.setText( "Personel Tc:" );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
    
   
    public static void main( String args[] ) {
        
        
        
         
        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels(  ) ) {
                if ( "Nimbus".equals( info.getName(  ) ) ) {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName(  ) );
                    break;
                }
            }
        } catch ( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger( Listeler.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Listeler.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Listeler.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Listeler.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //

       
        java.awt.EventQueue.invokeLater( new Runnable(  ) {
            public void run(  ) {
                new Listeler(  ).setVisible( true );
            }
        } );
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
   
}