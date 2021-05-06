import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Ogrenci_Page extends javax.swing.JFrame {


    public Ogrenci_Page(  ) {
        initComponents(  );
    }

    public String Tc, AdSoyad, GidisTarihi, DonusTarihi, GidecegiAdres, Tarih, Ucret;
    
    private void BilgileriYukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM ogrenciler WHERE Tc = '" + Tc + "'" );
            rs.next(  );
            
            jLabel1.setText( "Hoþgeldin " + rs.getString( "AdSoyad" ) );
            AdSoyad=rs.getString( "AdSoyad" );
            rs.close(  );
            st.close(  );
            conn.close(  );
            
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
  
    private void initComponents(  ) {

        jLabel1 = new javax.swing.JLabel(  );
        jPanel1 = new javax.swing.JPanel(  );
        jLabel2 = new javax.swing.JLabel(  );
        jLabel4 = new javax.swing.JLabel(  );
        jLabel5 = new javax.swing.JLabel(  );
        jLabel6 = new javax.swing.JLabel(  );
        jTextField1 = new javax.swing.JTextField(  );
        jTextField2 = new javax.swing.JTextField(  );
        jTextField3 = new javax.swing.JTextField(  );
        jButton1 = new javax.swing.JButton(  );
        jScrollPane1 = new javax.swing.JScrollPane(  );
        jTable1 = new javax.swing.JTable(  );
        jPanel2 = new javax.swing.JPanel(  );
        jLabel3 = new javax.swing.JLabel(  );
        jLabel7 = new javax.swing.JLabel(  );
        jLabel8 = new javax.swing.JLabel(  );
        jTextField4 = new javax.swing.JTextField(  );
        jTextField5 = new javax.swing.JTextField(  );
        jButton2 = new javax.swing.JButton(  );
        jScrollPane2 = new javax.swing.JScrollPane(  );
        jTable2 = new javax.swing.JTable(  );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "Öðrenci Sayfasý" );
        addWindowListener( new java.awt.event.WindowAdapter(  ) {
            public void windowOpened( java.awt.event.WindowEvent evt ) {
                formWindowOpened( evt );
            }
        } );

        jLabel1.setFont( new java.awt.Font( "Tahoma", 3, 14 ) ); 
        jLabel1.setHorizontalAlignment( javax.swing.SwingConstants.CENTER );
        jLabel1.setText( "jLabel1" );

        jPanel1.setBackground( new java.awt.Color( 204, 204, 255 ) );

        jLabel2.setFont( new java.awt.Font( "Tahoma", 3, 12 ) );
        jLabel2.setHorizontalAlignment( javax.swing.SwingConstants.CENTER );
        jLabel2.setText( "Ýzin Al" );

        jLabel4.setText( "Gidiþ Tarihi:" );

        jLabel5.setText( "Dönüþ Tarihi:" );

        jLabel6.setText( "Gideceði Adres:" );

        jButton1.setText( "Ýzin Al" );
        jButton1.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton1ActionPerformed( evt );
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
        jScrollPane1.setViewportView( jTable1 );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( jPanel1 );
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton1)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel6)
        						.addComponent(jLabel5)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField2)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        							.addComponent(jTextField3)))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );
        jPanel1.setLayout( jPanel1Layout );

        jPanel2.setBackground( new java.awt.Color( 204, 204, 255 ) );

        jLabel3.setFont( new java.awt.Font( "Tahoma", 3, 12 ) );
        jLabel3.setHorizontalAlignment( javax.swing.SwingConstants.CENTER );
        jLabel3.setText( "Ödeme Yap" );

        jLabel7.setText( "Tarih:" );

        jLabel8.setText( "Ücret:" );

        jButton2.setText( "Ödeme Yap" );
        jButton2.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton2ActionPerformed( evt );
            }
        } );

        jTable2.setModel( new javax.swing.table.DefaultTableModel( 
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
        jScrollPane2.setViewportView( jTable2 );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout( jPanel2 );
        jPanel2.setLayout( jPanel2Layout );
        jPanel2Layout.setHorizontalGroup( 
            jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addComponent( jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
            .addGroup( jPanel2Layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                    .addComponent( jButton2 )
                    .addGroup( jPanel2Layout.createSequentialGroup(  )
                        .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                            .addComponent( jLabel8 )
                            .addComponent( jLabel7 ) )
                        .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                        .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                            .addComponent( jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE )
                            .addComponent( jTextField5 ) ) ) )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
            .addComponent( jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE )
         );
        jPanel2Layout.setVerticalGroup( 
            jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( jPanel2Layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addComponent( jLabel3 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel7 )
                    .addComponent( jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel8 )
                    .addComponent( jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jButton2 )
                .addGap( 31, 31, 31 )
                .addComponent( jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE ) )
         );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane(  ) );
        getContentPane(  ).setLayout( layout );
        layout.setHorizontalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addComponent( jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addComponent( jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
         );
        layout.setVerticalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addComponent( jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                    .addComponent( jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                    .addComponent( jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                .addContainerGap(  ) )
         );

        pack(  );
    }

    private void formWindowOpened( java.awt.event.WindowEvent evt ) {
        
        BilgileriYukle(  );
        OdemeleriYukle(  );
        KayitlariYukle(  );
    }

    
    private void KayitlariYukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM izinler Where Tc='" + Tc + "'" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Telefon" );
            DTM.addColumn( "Oda No" );
            DTM.addColumn( "Gidiþ Tarihi" );
            DTM.addColumn( "Dönüþ Tarihi" );
            DTM.addColumn( "Gideceði Adres" );


            while( rs.next(  ) ){
                Statement st1=conn.createStatement(  );
            ResultSet rs1=st1.executeQuery( "SELECT * FROM ogrenciler Where Tc='" + rs.getString( "Tc" ) + "'" );
            rs1.next(  );
                
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs1.getString( "AdSoyad" ), rs1.getString( "Tel" ), rs1.getString( "OdaNo" ), rs.getString( "GidisTarihi" ), rs.getString( "DonusTarihi" ), rs.getString( "GidecegiAdres" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
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
            ResultSet rs=st.executeQuery( "SELECT * FROM odemeler Where Tc='" + Tc + "'" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable2.setModel( DTM );
            
            DTM.addColumn( "Tc" );
            DTM.addColumn( "Tarih" );
            DTM.addColumn( "Ücret" );



            while( rs.next(  ) ){
                DTM.addRow( new String[]{rs.getString( "Tc" ), rs.getString( "Tarih" ), rs.getString( "Ucret" )} );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
    
    
    
    private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
       

        GidisTarihi=jTextField1.getText(  );
        DonusTarihi=jTextField2.getText(  );
        GidecegiAdres=jTextField3.getText(  );
        Sorgular_Sayfasý sorgu = new Sorgular_Sayfasý(  );
        sorgu.IzinAlOgr( Tc, GidisTarihi, DonusTarihi, GidecegiAdres, AdSoyad );
        
        KayitlariYukle(  );
    }

    private void jButton2ActionPerformed( java.awt.event.ActionEvent evt ) {
        // TODO add your handling code here:
        Tarih=jTextField4.getText(  );
        Ucret=jTextField5.getText(  );
        Sorgular_Sayfasý sorgu = new Sorgular_Sayfasý(  );
        sorgu.Odemeler( Tc, Tarih, Ucret, AdSoyad );
        
        OdemeleriYukle(  );
        
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
            java.util.logging.Logger.getLogger( Ogrenci_Page.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Ogrenci_Page.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Ogrenci_Page.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Ogrenci_Page.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        }
       

        
        java.awt.EventQueue.invokeLater( new Runnable(  ) {
            public void run(  ) {
                new Ogrenci_Page(  ).setVisible( true );
            }
        } );
    }

   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    
}
