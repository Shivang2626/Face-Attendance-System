/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capture;
import Util.ConnectDb;
import Util.ControlPerson;
import Util.ModelPerson;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.opencv_core;
import static org.bytedeco.javacpp.opencv_core.CV_32SC1;
import org.bytedeco.javacpp.opencv_face;
import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
import org.bytedeco.javacpp.opencv_face.LBPHFaceRecognizer;
import static org.bytedeco.javacpp.opencv_imgcodecs.imencode;
import static org.bytedeco.javacpp.opencv_imgcodecs.imread;
import static org.bytedeco.javacpp.opencv_imgcodecs.imwrite;
import org.bytedeco.javacpp.opencv_imgproc;
import static org.bytedeco.javacpp.opencv_imgproc.COLOR_BGRA2GRAY;
import static org.bytedeco.javacpp.opencv_imgproc.cvtColor;
import static org.bytedeco.javacpp.opencv_imgproc.rectangle;
import org.bytedeco.javacpp.opencv_objdetect;
import org.bytedeco.javacpp.opencv_videoio;

/**
 *
 * @author Shivang Agrawal
 */
public class Capture extends javax.swing.JFrame {

   private Capture.DaemonThread myThread=null;
 
  
  
   
    opencv_videoio.VideoCapture webSource = null;//it is a class
    opencv_core.Mat cameraImage = new opencv_core.Mat();//used to store the numerical value of an image in oixel in n dimension array
    opencv_objdetect.CascadeClassifier cascade = new opencv_objdetect.CascadeClassifier("C:\\photos\\haarcascade_frontalface_alt.xml");
// it consist of some haar features , which will apply on whole image and extract the features using VOILA JONES  
    // .xml is the pre trained classifier that has been provided by the open CV, which will extract only positiove images
    // there are different types of classifiers we use Frontal classifier
    // 
    BytePointer mem = new BytePointer();//manually insert the frame on the mat object
    opencv_core.RectVector detectedFaces = new opencv_core.RectVector();  // it helps in making rectangle around the detected objects

    String root,firstNamePerson,lastNamePerson,officePerson,dobPerson,password; 
    
    int numSamples = 25, sample = 1, idPerson;

    //Utils
    ConnectDb connect = new ConnectDb();
    
    public Capture(int id,String fName,String lName,String office,String dob,String pass) {
        initComponents();
        idPerson=id;
        
        firstNamePerson=fName;
        lastNamePerson=lName;
        officePerson=office;
        dobPerson=dob;
        password=pass;
        startCamera();
    }

    private Capture() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_photo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        counterLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Security System Capture Photo");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAPTURE THE PIC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 450, 60));

        label_photo.setText("cam");
        label_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.add(label_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 370));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        counterLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        counterLabel.setForeground(new java.awt.Color(51, 153, 0));
        counterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterLabel.setText("0 0");

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Capture");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 600, 100));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_Window_20px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Instruction - You have to click 25 pics of yours with different angles");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 600, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 590));

        setSize(new java.awt.Dimension(621, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        RegisterPerson11 reg=new RegisterPerson11();
        reg.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel counterLabel;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_photo;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
class DaemonThread implements Runnable { //LINK CLASS IN DESCRIPTION

        protected volatile boolean runnable = false;

        @Override
        public void run() {
            synchronized (this) {
                while (runnable) {
                    try {
                        if (webSource.grab())//the next frame from video file or camera and return true (non-zero) in the case of success.
                        {
                            webSource.retrieve(cameraImage);//The methods/functions decode and return the just grabbed frame
                            Graphics g = label_photo.getGraphics();   //The instance method, getGraphics(), is defined in the Component class. It returns a graphics context that can be used for drawing to a particular component.
                           // g can be used for drawing to the rectangular area of the screen that represents the component, comp.
                            opencv_core.Mat imageColor = new opencv_core.Mat();
                            imageColor = cameraImage;

                            opencv_core.Mat imageGray = new opencv_core.Mat();
                            cvtColor(imageColor, imageGray, COLOR_BGRA2GRAY);  // images loaded and converted into gray scale image

                            opencv_core.RectVector detectedFaces = new opencv_core.RectVector(); 
                            cascade.detectMultiScale(imageColor, detectedFaces, 1.1, 1, 0, new opencv_core.Size(150, 150), new opencv_core.Size(150, 150));
                             // it stores all the rectangles faces (min size,max size) which is detected by this method 

                            for (int i = 0; i < detectedFaces.size(); i++) {
                                opencv_core.Rect dadosFace = detectedFaces.get(0); //
                                rectangle(imageColor, dadosFace, new opencv_core.Scalar(255, 255, 255, 5));
                                // rectangle of color 255... is forming around the image one at a time
                                opencv_core.Mat face = new opencv_core.Mat(imageGray, dadosFace);
                                //face is the gray scale image of the slected image
                                opencv_imgproc.resize(face, face, new opencv_core.Size(160, 160));
//used to resize the image which is to be saved

                                if (saveButton.getModel().isPressed()) {

                                    if (sample <= numSamples) {
                                        String cropped = "C:\\photos\\person." + idPerson + "." + sample + ".jpg";
                                        imwrite(cropped, face);
                                        //imwrite is used to save the FACE to the location CROPPED

                                        //System.out.println("Foto " + amostra + " capturada\n");
                                        counterLabel.setText(String.valueOf(sample) + "/25");
                                        sample++;
                                    }
                                    if (sample > 25) {
                                        insertDatabase();
                                        generate();
                                        
                                        System.out.println("File Generated");
                                        stopCamera();
                                    }
                                }
                            }
//-----------------------------------------------------------------------------------------------------
                            imencode(".bmp", cameraImage, mem);
                            Image im = ImageIO.read(new ByteArrayInputStream(mem.getStringBytes()));
                            BufferedImage buff = (BufferedImage) im;

                            if (g.drawImage(buff, 0, 0, getWidth(), getHeight(), 0, 0, buff.getWidth(), buff.getHeight(), null)) {
                                if (runnable == false) {
                                    System.out.println("Salve a Foto");
                                    this.wait();
                                }
                            }
                        }

                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error" + ex);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error" + ex);
                    }
                }
            }
        }
    }


 public void generate() {
        File directory = new File("C:\\photos\\");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg") || name.endsWith(".png");
            }
        };

        File[] files = directory.listFiles(filter); //only our filter
        opencv_core.MatVector photos = new opencv_core.MatVector(files.length);
        opencv_core.Mat labels = new opencv_core.Mat(files.length, 1, CV_32SC1);
        IntBuffer labelsBuffer = labels.createBuffer();

        int counter = 0;
        for (File image : files) {
            opencv_core.Mat photo = imread(image.getAbsolutePath(), COLOR_BGRA2GRAY);
            int idP = Integer.parseInt(image.getName().split("\\.")[1]);
            opencv_imgproc.resize(photo, photo, new opencv_core.Size(160, 160));

            photos.put(counter, photo);
            labelsBuffer.put(counter, idP);
            counter++;
        }

        opencv_face.FaceRecognizer lbph = opencv_face.LBPHFaceRecognizer.create();
        lbph.train(photos, labels);
        lbph.save("C:\\photos\\classifierLBPH.yml");
    }

    public void insertDatabase() {
      ControlPerson cod = new ControlPerson();
        ModelPerson mod = new ModelPerson();
        
       // mod.setId( );
        mod.setFirst_name(firstNamePerson);
        mod.setLast_name(lastNamePerson);
        mod.setDob(dobPerson);
        mod.setOffice(officePerson);
        mod.setId(idPerson);
        mod.setPass(password);
        cod.insert(mod);
    }

    public void stopCamera() {
        myThread.runnable = false;
        webSource.release();
        dispose();
        
        RegisterPerson11 reg=new RegisterPerson11();
        reg.setVisible(true);
    }

    public void startCamera() {
        webSource = new opencv_videoio.VideoCapture(0);
        myThread = new Capture.DaemonThread();
        Thread t = new Thread(myThread);
//        t.setDaemon(true);//makes the thread  t as daemon thread..daemo hread runs in the bak
        myThread.runnable = true;
        t.start();
    }
}