import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Ogrenci_Ekle extends javax.swing.JFrame {
	public Ogrenci_Ekle(  ) {
        initComponents(  );
    }

    public String Tc, AdSoyad, DTarihi, DYeri, Cinsiyet, Adres, Telefon, Eposta, Sifre, OdaNo;
        public boolean Guncelle;
    private void initComponents(  ) {

        jLabel4 = new javax.swing.JLabel(  );
        jTextField3 = new javax.swing.JTextField(  );
        jLabel2 = new javax.swing.JLabel(  );
        jButton1 = new javax.swing.JButton(  );
        jTextField6 = new javax.swing.JTextField(  );
        jLabel5 = new javax.swing.JLabel(  );
        jLabel8 = new javax.swing.JLabel(  );
        jTextField4 = new javax.swing.JTextField(  );
        jLabel6 = new javax.swing.JLabel(  );
        jLabel3 = new javax.swing.JLabel(  );
        jComboBox1 = new javax.swing.JComboBox<>(  );
        jLabel1 = new javax.swing.JLabel(  );
        jLabel7 = new javax.swing.JLabel(  );
        jTextField7 = new javax.swing.JTextField(  );
        jTextField1 = new javax.swing.JTextField(  );
        jTextField5 = new javax.swing.JTextField(  );
        jTextField2 = new javax.swing.JTextField(  );
        jLabel9 = new javax.swing.JLabel(  );
        jTextField8 = new javax.swing.JTextField(  );
        jLabel10 = new javax.swing.JLabel(  );
        jTextField9 = new javax.swing.JTextField(  );

        setTitle( "Öðrenci Ekle" );
        addWindowListener( new java.awt.event.WindowAdapter(  ) {
            public void windowOpened( java.awt.event.WindowEvent evt ) {
                formWindowOpened( evt );
            }
        } );

        jLabel4.setText( "Doðum Yeri:" );

        jLabel2.setText( "Ad Soyad:" );

        jButton1.setText( "Tamam" );
        jButton1.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton1ActionPerformed( evt );
            }
        } );

        jLabel5.setText( "Adres:" );

        jLabel8.setText( "Cinsiyet:" );

        jLabel6.setText( "Telefon:" );

        jLabel3.setText( "Doðum Tarihi:" );

        jComboBox1.setModel( new javax.swing.DefaultComboBoxModel<>( new String[] { "Seçin", "Bay", "Bayan" } ) );

        jLabel1.setText( "Tc:" );

        jLabel7.setText( "Eposta:" );

        jLabel9.setText( "Þifre:" );

        jLabel10.setText( "Oda No:" );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane(  ) );
        getContentPane(  ).setLayout( layout );
        layout.setHorizontalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                    .addComponent( jButton1 )
                    .addGroup( layout.createSequentialGroup(  )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                            .addComponent( jLabel5 )
                            .addComponent( jLabel3 )
                            .addComponent( jLabel2 )
                            .addComponent( jLabel1 )
                            .addComponent( jLabel8 )
                            .addComponent( jLabel4 )
                            .addComponent( jLabel7 )
                            .addComponent( jLabel6 )
                            .addComponent( jLabel9 )
                            .addComponent( jLabel10 ) )
                        .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                            .addComponent( jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE )
                            .addComponent( jTextField4 )
                            .addComponent( jTextField3 )
                            .addComponent( jTextField2 )
                            .addComponent( jTextField1 )
                            .addComponent( jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                            .addComponent( jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE )
                            .addComponent( jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE )
                            .addComponent( jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE )
                            .addComponent( jTextField9 ) ) ) )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
         );
        layout.setVerticalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel1 )
                    .addComponent( jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel2 )
                    .addComponent( jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel3 )
                    .addComponent( jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel4 )
                    .addComponent( jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel8 )
                    .addComponent( jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel5 )
                    .addComponent( jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel6 )
                    .addComponent( jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel7 )
                    .addComponent( jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel9 )
                    .addComponent( jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel10 )
                    .addComponent( jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jButton1 )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
         );

        pack(  );
    }

    private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
        
        
        Tc=jTextField1.getText(  );
        AdSoyad=jTextField2.getText(  );
        DTarihi=jTextField3.getText(  );
        DYeri=jTextField4.getText(  );
        Cinsiyet=jComboBox1.getSelectedItem(  ).toString(  );
        Adres=jTextField5.getText(  );
        Telefon=jTextField6.getText(  );
        Eposta=jTextField7.getText(  );
        Sifre=jTextField8.getText(  );
        OdaNo=jTextField9.getText(  );
        
        Sorgular_Sayfasý sorgu = new Sorgular_Sayfasý(  );
        sorgu.OgrenciEkle( Guncelle, Tc, AdSoyad, DTarihi, DYeri, Cinsiyet, Adres, Telefon, Eposta, Sifre, OdaNo );
        
        
    }

    private void formWindowOpened( java.awt.event.WindowEvent evt ) {
        
        if( Guncelle )
        {
        jTextField1.setEnabled( !Guncelle );
        jTextField1.setText( Tc );
        jTextField2.setText( AdSoyad );
        jTextField3.setText( DTarihi );
        jTextField4.setText( DYeri );
        jComboBox1.setSelectedItem( Cinsiyet );
        jTextField5.setText( Adres );
        jTextField6.setText( Telefon );
        jTextField7.setText( Eposta );
        jTextField8.setText( Sifre );
        jTextField9.setText( OdaNo );
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
            java.util.logging.Logger.getLogger( Ogrenci_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Ogrenci_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Ogrenci_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Ogrenci_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        }
      

        
        java.awt.EventQueue.invokeLater( new Runnable(  ) {
            public void run(  ) {
                new Ogrenci_Ekle(  ).setVisible( true );
            }
        } );
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    
}

