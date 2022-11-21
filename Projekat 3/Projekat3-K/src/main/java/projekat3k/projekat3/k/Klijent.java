
package projekat3k.projekat3.k;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class Klijent extends javax.swing.JFrame {
    static Socket klijent;
    static String hostname="localhost";
    static int port=3000;
    static DataInputStream dIn;
    static DataOutputStream dOut;
    public int i=-1;
    public String odgovor="0",tacnost=" ";
    public Klijent() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Slika = new javax.swing.JLabel();
        Odgovor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Rezultat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Slika.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Odgovor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Odgovor.setText("Odgovor");

        jButton1.setText("Start");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        Rezultat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rezultat.setText("REZULTAT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Slika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(Odgovor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Rezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Slika, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Odgovor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            odgovor=Odgovor.getText();
        try{
            dOut.writeUTF(odgovor);
            tacnost=dIn.readUTF();
        }
        catch(IOException e)
        {
            System.out.println("Greska");
        }
        if(i==-1)
       {
           ImageIcon slika=new ImageIcon("Slike\\Slika1.PNG");
           Slika.setIcon(slika);
           jButton1.setText("Posalji odgovor");
           i++;
       }
        
       else if(i==0 && "1".equals(tacnost))
       {
           ImageIcon slika=new ImageIcon("Slike\\Slika2.PNG");
           Slika.setIcon(slika);
           i++;
       }
       else if(i==1 && "1".equals(tacnost))
       {
           ImageIcon slika=new ImageIcon("Slike\\Slika3.PNG");
           Slika.setIcon(slika);
           i++;
           System.out.println(i);
       }
       else if(i==2 && "1".equals(tacnost))
       {
           ImageIcon slika=new ImageIcon("Slike\\Slika4.PNG");
           Slika.setIcon(slika);
           i++;
           System.out.println(i);
       }
       else if(i==3 && "1".equals(tacnost))
       {
           ImageIcon slika=new ImageIcon("Slike\\Slika5.PNG");
           Slika.setIcon(slika);
           i++;
           System.out.println(i);
       }
       else if(i==4 && "1".equals(tacnost))
       {
           i++;
           Rezultat.setText("VAS REZULTAT JE "+ i);
           System.out.println(i);
       }
       else
       {
           Rezultat.setText("VAS REZULTAT JE "+ i);
       }
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

   
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Klijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Klijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Klijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Klijent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Klijent().setVisible(true);
            }
        });
        
        try{
            klijent=new Socket(hostname,port);
            dIn=new DataInputStream(klijent.getInputStream());
            dOut=new DataOutputStream(klijent.getOutputStream());
        }
        catch(IOException e)
        {
            System.out.println("Doslo je do greske");
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Odgovor;
    private javax.swing.JLabel Rezultat;
    private javax.swing.JLabel Slika;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
