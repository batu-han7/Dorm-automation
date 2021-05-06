import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Personel_Ekle extends javax.swing.JFrame {

    public Personel_Ekle(  ) {
        initComponents(  );
    }

    public String Tc, AdSoyad, DTarihi, DYeri, Cinsiyet, Adres, Telefon, Eposta, Maas, Yetki, Sifre;
        public boolean Guncelle;
        
    private void initComponents(  ) {

        jLabel1 = new javax.swing.JLabel(  );
        jLabel8 = new javax.swing.JLabel(  );
        jTextField7 = new javax.swing.JTextField(  );
        jLabel6 = new javax.swing.JLabel(  );
        jComboBox1 = new javax.swing.JComboBox<>(  );
        jLabel7 = new javax.swing.JLabel(  );
        jLabel9 = new javax.swing.JLabel(  );
        jTextField8 = new javax.swing.JTextField(  );
        jTextField1 = new javax.swing.JTextField(  );
        jTextField5 = new javax.swing.JTextField(  );
        jTextField2 = new javax.swing.JTextField(  );
        jLabel4 = new javax.swing.JLabel(  );
        jTextField3 = new javax.swing.JTextField(  );
        jLabel2 = new javax.swing.JLabel(  );
        jButton1 = new javax.swing.JButton(  );
        jTextField4 = new javax.swing.JTextField(  );
        jTextField6 = new javax.swing.JTextField(  );
        jLabel3 = new javax.swing.JLabel(  );
        jLabel5 = new javax.swing.JLabel(  );
        jLabel10 = new javax.swing.JLabel(  );
        jTextField9 = new javax.swing.JTextField(  );
        jLabel11 = new javax.swing.JLabel(  );
        jTextField10 = new javax.swing.JTextField(  );

        setTitle( "Personel Ekle Düzenle" );
        addWindowListener( new java.awt.event.WindowAdapter(  ) {
            public void windowOpened( java.awt.event.WindowEvent evt ) {
                formWindowOpened( evt );
            }
        } );

        jLabel1.setText( "Tc:" );

        jLabel8.setText( "Cinsiyet:" );

        jLabel6.setText( "Telefon:" );

        jComboBox1.setModel( new javax.swing.DefaultComboBoxModel<>( new String[] { "Seçin", "Bay", "Bayan" } ) );

        jLabel7.setText( "Eposta:" );

        jLabel9.setText( "Maaþ:" );

        jLabel4.setText( "Doðum Yeri:" );

        jLabel2.setText( "Ad Soyad:" );

        jButton1.setText( "Tamam" );
        jButton1.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton1ActionPerformed( evt );
            }
        } );

        jLabel3.setText( "Doðum Tarihi:" );

        jLabel5.setText( "Adres:" );

        jLabel10.setText( "Yetki:" );

        jLabel11.setText( "Þifre:" );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane(  ) );
        getContentPane(  ).setLayout( layout );
        layout.setHorizontalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                    .addGroup( layout.createSequentialGroup(  )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                            .addComponent( jLabel4 )
                            .addComponent( jLabel3 )
                            .addComponent( jLabel2 )
                            .addComponent( jLabel1 )
                            .addComponent( jLabel8 ) )
                        .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                            .addComponent( jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE )
                            .addComponent( jTextField3 )
                            .addComponent( jTextField2 )
                            .addComponent( jTextField1 )
                            .addComponent( jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ) )
                    .addGroup( layout.createSequentialGroup(  )
                        .addGap( 26, 26, 26 )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                            .addComponent( jButton1, javax.swing.GroupLayout.Alignment.TRAILING )
                            .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup(  )
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                                    .addComponent( jLabel9 )
                                    .addComponent( jLabel7 )
                                    .addComponent( jLabel6 )
                                    .addComponent( jLabel5 )
                                    .addComponent( jLabel10 )
                                    .addComponent( jLabel11 ) )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                    .addComponent( jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE )
                                    .addComponent( jTextField6 )
                                    .addComponent( jTextField5 )
                                    .addComponent( jTextField8 )
                                    .addComponent( jTextField9 )
                                    .addComponent( jTextField10 ) ) ) ) ) )
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
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                    .addComponent( jLabel11 )
                    .addComponent( jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
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
        Maas=jTextField8.getText(  );
        Yetki=jTextField9.getText(  );
        Sifre=jTextField9.getText(  );
        
        Sorgular_Sayfasý sorgu = new Sorgular_Sayfasý(  );
        sorgu.PersonelEkle( Guncelle, Tc, AdSoyad, DTarihi, DYeri, Cinsiyet, Adres, Telefon, Eposta, Maas, Yetki, Sifre );
        
        Baglanti baglanti=new Baglanti();
        Connection conn=baglanti.baglan();

        try{
            Statement st=conn.createStatement();
            if( Guncelle==false )
            {
                st.executeUpdate( "INSERT INTO personel ( Tc, AdSoyad, DogumTarihi, DogumYeri, Cinsiyet, Adres, Tel, Eposta, Maas, Yetki, Sifre ) Values( '" + jTextField1.getText(  ) + "', '" + jTextField2.getText(  ) + "', '" + jTextField3.getText(  ) + "', '" + jTextField4.getText(  ) + "', '" + jComboBox1.getSelectedItem(  ).toString(  ) + "', '" + jTextField5.getText(  ) + "', '" + jTextField6.getText(  ) + "', '" + jTextField7.getText(  ) + "', '" + ( jTextField8.getText(  ) ) + "', '" + jTextField9.getText(  ) + "', '" + jTextField10.getText(  ) + "' )" );
                JOptionPane.showMessageDialog( rootPane, "Personel Eklendi." );
            }
            else
            {
                st.executeUpdate( "Update personel Set AdSoyad='" + jTextField2.getText(  ) + "', DogumTarihi='" + jTextField3.getText(  ) + "', DogumYeri='" + jTextField4.getText(  ) + "', Cinsiyet='" + jTextField4.getText(  ) + "', Adres='" + jTextField5.getText(  ) + "', Tel='" + jTextField6.getText(  ) + "', Eposta='" + jTextField7.getText(  ) + "', Maas='" + ( jTextField8.getText(  ) ) + "', Yetki='" + ( jTextField9.getText(  ) ) + "', Sifre='" + jTextField10.getText(  ) + "' Where Tc='" + jTextField1.getText(  ) + "'" );
                JOptionPane.showMessageDialog( rootPane, "Personel Güncellendi." );
            }
            st.close();
            conn.close();
            this.setVisible( false );

        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
            System.out.println( exp.getMessage(  ) );
        }
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
        jTextField8.setText( Maas );
        jTextField9.setText( Yetki );
        jTextField10.setText( Sifre );
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
            java.util.logging.Logger.getLogger( Personel_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Personel_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Personel_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Personel_Ekle.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        
        java.awt.EventQueue.invokeLater( new Runnable(  ) {
            public void run(  ) {
                new Personel_Ekle(  ).setVisible( true );
            }
        } );
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;

}


