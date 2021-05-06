import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Giris extends javax.swing.JFrame {

    public Giris(  ) {
        initComponents(  );
    }

    private void initComponents(  ) {

        jLabel1 = new javax.swing.JLabel(  );
        jLabel2 = new javax.swing.JLabel(  );
        jTextField1 = new javax.swing.JTextField(  );
        jPasswordField1 = new javax.swing.JPasswordField(  );
        jButton1 = new javax.swing.JButton(  );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "Giriþ" );

        jLabel1.setText( "Tc:" );

        jLabel2.setText( "Þifre:" );

        jButton1.setText( "Giriþ Yap" );
        jButton1.addActionListener( new java.awt.event.ActionListener(  ) {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                jButton1ActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane(  ) );
        getContentPane(  ).setLayout( layout );
        layout.setHorizontalGroup( 
            layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup(  )
                .addContainerGap(  )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                    .addComponent( jLabel2 )
                    .addComponent( jLabel1 ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                    .addComponent( jTextField1 )
                    .addComponent( jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE ) )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
            .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup(  )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                .addComponent( jButton1 )
                .addContainerGap(  ) )
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
                    .addComponent( jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( jButton1 )
                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
         );

        pack(  );
    }

    private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
       
       Sorgular_Sayfasý giris=new Sorgular_Sayfasý(  );
        giris.Giris( jTextField1.getText(  ), jPasswordField1.getText(  ) );
        
        
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
            java.util.logging.Logger.getLogger( Giris.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger( Giris.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger( Giris.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger( Giris.class.getName(  ) ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //

       
        java.awt.EventQueue.invokeLater( new Runnable(  ) {
            public void run(  ) {
                new Giris(  ).setVisible( true );
            }
        } );
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
   
}