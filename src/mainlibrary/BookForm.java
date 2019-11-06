/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static mainlibrary.LibrarianSuccess.ThisLogined;

/**
 *
 * @author bikash
 */
public class BookForm extends javax.swing.JFrame {
    
    /**
     * Creates new form BookForm
     */
    public BookForm() {
        initComponents();
        jPanel1.setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BookName = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        Publisher = new javax.swing.JTextField();
        Genre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Shelf = new javax.swing.JTextField();
        Row = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Raleway Medium", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        jLabel3.setFont(new java.awt.Font("Raleway Medium", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("Raleway Medium", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));

        jLabel6.setFont(new java.awt.Font("Raleway Medium", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));

        jLabel7.setFont(new java.awt.Font("Raleway Medium", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Raleway Medium", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        BookName.setText("Book Name");
        BookName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BookNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BookNameFocusLost(evt);
            }
        });
        BookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameActionPerformed(evt);
            }
        });

        Author.setText("Author");
        Author.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AuthorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AuthorFocusLost(evt);
            }
        });
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });

        Publisher.setText("Publisher");
        Publisher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PublisherFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PublisherFocusLost(evt);
            }
        });
        Publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublisherActionPerformed(evt);
            }
        });

        Genre.setText("Genre");
        Genre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GenreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GenreFocusLost(evt);
            }
        });
        Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        jButton1.setText("Add Media");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Shelf.setText("Shelf");
        Shelf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ShelfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ShelfFocusLost(evt);
            }
        });
        Shelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShelfActionPerformed(evt);
            }
        });

        Row.setText("Row");
        Row.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RowFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RowFocusLost(evt);
            }
        });
        Row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RowActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<-");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Downloads\\admin.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Raleway Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add Media");

        jTextField1.setText("quantity");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Shelf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Row, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Publisher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(Author, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(BookName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                            .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Shelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)))
                .addComponent(Row, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameActionPerformed

    private void PublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PublisherActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void RowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RowActionPerformed

    private void ShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShelfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String BookN = BookName.getText();
        String AuthorN = Author.getText();
        String PublisherN = Publisher.getText();
        String ShelfN = Shelf.getText();
        String RowN = Row.getText();
        String GenreN = Genre.getText();
        String QN=jTextField1.getText();
        
        
        if(BookDao.PublisherValidate(PublisherN))
        {
            
        }else{
                                if(BookDao.AddPublisher(PublisherN)!=0)
                                {
                                  ; // JOptionPane.showMessageDialog(BookForm.this, "Sorry, Publisher can't be added!","Publisher Error!", JOptionPane.ERROR_MESSAGE);
                                }
        }
        if(BookDao.SaveBook(BookN,GenreN,AuthorN,PublisherN,ShelfN,RowN)!=0)
            {
                JOptionPane.showMessageDialog(BookForm.this, "The Book is added!","Book Added!", JOptionPane.ERROR_MESSAGE);
                BookName.setText("");
                Author.setText("");
                Publisher.setText("");
                Shelf.setText("");
                Row.setText("");
                Genre.setText("");
               jTextField1.setText("");
                
                
            }
            else
                JOptionPane.showMessageDialog(BookForm.this, "The Book is not added!","Adding Book Error!", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreActionPerformed

    private void BookNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BookNameFocusGained
        // TODO add your handling code here:
         if(BookName.getText().equals("Book Name")){
            BookName.setText("");
        }
        BookName.setForeground(Color.black);
    }//GEN-LAST:event_BookNameFocusGained

    private void BookNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BookNameFocusLost
        // TODO add your handling code here:
        if(BookName.getText().equals("")){
            BookName.setText("Book Name");
        }
        BookName.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_BookNameFocusLost

    private void AuthorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AuthorFocusGained
   if(Author.getText().equals("Author")){
            Author.setText("");
        }
        Author.setForeground(Color.black);      // TODO add your handling code here:
    }//GEN-LAST:event_AuthorFocusGained

    private void AuthorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AuthorFocusLost
 if(Author.getText().equals("")){
            Author.setText("Author");
        }
        Author.setForeground(new Color(0,0,0));       // TODO add your handling code here:
    }//GEN-LAST:event_AuthorFocusLost

    private void PublisherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PublisherFocusGained
    if(Publisher.getText().equals("Publisher")){
            Publisher.setText("");
        }
        Publisher.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_PublisherFocusGained

    private void PublisherFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PublisherFocusLost
  if(Publisher.getText().equals("")){
            Publisher.setText("Publisher");
        }
        Publisher.setForeground(new Color(0,0,0));        // TODO add your handling code here:
    }//GEN-LAST:event_PublisherFocusLost

    private void GenreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenreFocusGained
  if(Genre.getText().equals("Genre")){
            Genre.setText("");
        }
        Genre.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_GenreFocusGained

    private void GenreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenreFocusLost
     if(Genre.getText().equals("")){
            Genre.setText("Genre");
        }
        Genre.setForeground(new Color(0,0,0));    // TODO add your handling code here:
    }//GEN-LAST:event_GenreFocusLost

    private void ShelfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ShelfFocusGained
    if(Shelf.getText().equals("Shelf")){
            Shelf.setText("");
        }
        Shelf.setForeground(Color.black);    // TODO add your handling code here:
    }//GEN-LAST:event_ShelfFocusGained

    private void ShelfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ShelfFocusLost
      if(Shelf.getText().equals("")){
            Shelf.setText("Shelf");
        }
        Shelf.setForeground(new Color(0,0,0));   // TODO add your handling code here:
    }//GEN-LAST:event_ShelfFocusLost

    private void RowFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RowFocusGained
    if(Row.getText().equals("Row")){
            Row.setText("");
        }
        Row.setForeground(Color.black);    // TODO add your handling code here:
    }//GEN-LAST:event_RowFocusGained

    private void RowFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RowFocusLost
     if(Row.getText().equals("")){
            Row.setText("Row");
        }
        Row.setForeground(new Color(0,0,0));   // TODO add your handling code here:
    }//GEN-LAST:event_RowFocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
     if(jTextField1.getText().equals("quantity")){
            jTextField1.setText("");
        }
        jTextField1.setForeground(Color.black);       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
      if(jTextField1.getText().equals("")){
            jTextField1.setText("quantity");
        }
        jTextField1.setForeground(new Color(0,0,0));    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField BookName;
    private javax.swing.JTextField Genre;
    private javax.swing.JTextField Publisher;
    private javax.swing.JTextField Row;
    private javax.swing.JTextField Shelf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}