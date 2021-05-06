import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Yurt_Sayfa extends javax.swing.JFrame {

    public Yurt_Sayfa(  ) {
        initComponents(  );
        KayitlariYukle(  );
    }

    private void initComponents(  ) {

        jMenuBar1 = new javax.swing.JMenuBar(  );
        jMenu1 = new javax.swing.JMenu(  );
        jMenu2 = new javax.swing.JMenu(  );
        jScrollPane1 = new javax.swing.JScrollPane(  );
        jTable1 = new javax.swing.JTable(  );
        jLabel1 = new javax.swing.JLabel(  );
        jTextField1 = new javax.swing.JTextField(  );
        jLabel2 = new javax.swing.JLabel(  );
        jTextField2 = new javax.swing.JTextField(  );
        jLabel3 = new javax.swing.JLabel(  );
        jTextField3 = new javax.swing.JTextField(  );
        jLabel4 = new javax.swing.JLabel(  );
        jTextField4 = new javax.swing.JTextField(  );
        jButton1 = new javax.swing.JButton(  );
        jMenuBar2 = new javax.swing.JMenuBar(  );
        jMenu3 = new javax.swing.JMenu(  );
        jMenu4 = new javax.swing.JMenu(  );
        jMenu5 = new javax.swing.JMenu(  );
        jMenu6 = new javax.swing.JMenu(  );
        jMenu7 = new javax.swing.JMenu(  );
        jMenu8 = new javax.swing.JMenu(  );

        jMenu1.setText( "File" );
        jMenuBar1.add( jMenu1 );

        jMenu2.setText( "Edit" );
        jMenuBar1.add( jMenu2 );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "Yurt Otomasyonu" );

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

        jLabel1.setText( "Tc:" );

        jLabel2.setText( "Gidiþ Tarihi:" );

        jLabel3.setText( "Dönüþ Tarihi:" );

        jLabel4.setText( "Gideceði Adres:" );

        jTextField4.setToolTipText( "" );

        jButton1.setText( "Ýzin Al" );
        jButton1.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton1ActionPerformed( evt );
            }
        } );

        jMenu3.setText( "Personel Ekle" );
        jMenu3.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jMenu3MouseClicked( evt );
            }
        } );
        jMenuBar2.add( jMenu3 );

        jMenu4.setLabel( "Personel Listesi" );
        jMenu4.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jMenu4MouseClicked( evt );
            }
        } );
        jMenuBar2.add( jMenu4 );

        jMenu5.setLabel( "Öðrenci Ekle" );
        jMenu5.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jMenu5MouseClicked( evt );
            }
        } );
        jMenuBar2.add( jMenu5 );

        jMenu6.setLabel( "Öðrenci Listesi" );
        jMenu6.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jMenu6MouseClicked( evt );
            }
        } );
        jMenuBar2.add( jMenu6 );

        jMenu7.setText( "Ödemeler" );
        jMenu7.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jMenu7MouseClicked( evt );
            }
        } );
        jMenuBar2.add( jMenu7 );

        jMenu8.setText( "Yenile" );
        jMenu8.addMouseListener( new java.awt.event.MouseAdapter(  ) {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                jMenu8MouseClicked( evt );
            }
        } );
        jMenuBar2.add( jMenu8 );

        setJMenuBar( jMenuBar2 );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane(  ) );
        getContentPane(  ).setLayout( layout );
        layout.setHorizontalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addComponent( jScrollPane1 )
            .addGroup( layout.createSequentialGroup(  )
                .addComponent( jLabel1 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addGap( 18, 18, 18 )
                .addComponent( jLabel2 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addGap( 18, 18, 18 )
                .addComponent( jLabel3 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addGap( 18, 18, 18 )
                .addComponent( jLabel4 )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE )
                .addComponent( jButton1 )
                .addContainerGap(  ) )
         );
        layout.setVerticalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel1 )
                    .addComponent( jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel2 )
                    .addComponent( jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel3 )
                    .addComponent( jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                    .addComponent( jLabel4 )
                    .addComponent( jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                    .addComponent( jButton1 ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE ) )
         );

        pack(  );
    }

    private void jMenu3MouseClicked( java.awt.event.MouseEvent evt ) {
        
        Personel_Ekle frm=new Personel_Ekle(  );
        frm.Guncelle=false;
        frm.setVisible( true );
    }

    private void jMenu5MouseClicked( java.awt.event.MouseEvent evt ) {
        
        Ogrenci_Ekle frm=new Ogrenci_Ekle(  );
        frm.Guncelle=false;
        frm.setVisible( true );
    }

    private void jMenu4MouseClicked( java.awt.event.MouseEvent evt ) {
        
        Listeler frm=new Listeler(  );
        frm.ListeTuru="Personel";
        frm.setTitle( "Personel Listesi" );
        frm.setVisible( true );
    }

    private void jMenu6MouseClicked( java.awt.event.MouseEvent evt ) {
       
        Listeler frm=new Listeler(  );
        frm.ListeTuru="Ogrenci";
        frm.setTitle( "Öðrenci Listesi" );
        frm.setVisible( true );
    }

    private void jMenu7MouseClicked( java.awt.event.MouseEvent evt ) {
        //
        Listeler frm=new Listeler(  );
        frm.ListeTuru="Odemeler";
        frm.setTitle( "Ödeme Listesi" );
        frm.setVisible( true );
    }

    private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
        

        Sorgular_Sayfasý sorgu=new Sorgular_Sayfasý(  );
        sorgu.IzinAl( jTextField1.getText(  ), jTextField2.getText(  ), jTextField3.getText(  ), jTextField4.getText(  ) );
        KayitlariYukle(  );
    }

    private void jMenu8MouseClicked( java.awt.event.MouseEvent evt ) {
        // TODO add your handling code here:
        KayitlariYukle(  );
    }

    private void KayitlariYukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
        Connection conn=baglanti.baglan();
        
        try{
            Statement st=conn.createStatement( );
            ResultSet rs=st.executeQuery( "SELECT * FROM izinler" );
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
 
    public static void main( String args[] ) {
 
        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels(  ) ) {
                if ( "Nimbus".equals( info.getName(  ) ) ) {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName(  ) );
                    break;
                }
            }
        } catch ( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger( Yurt_Sayfa.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Yurt_Sayfa.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Yurt_Sayfa.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Yurt_Sayfa.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        }
       

       
        java.awt.EventQueue.invokeLater( new Runnable(  ) {
            public void run(  ) {
                new Yurt_Sayfa(  ).setVisible( true );
            }
        } );
    }

   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
   
}