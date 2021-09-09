package tarean1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//importamos paquetes swing
/**
 * @author Gonzalez
 */
public class TareaN1 extends JFrame implements ActionListener{
       JLabel et1, et2nomb, et3, et4, et5, et6, alu;//declaramos nuestros objetos, en este caso JLabel
       JLabel imag;
       JTextField tx1nomb, tx2, tx3, tx4, tx5;
       JButton b1;
       JPanel win;
       JTextArea a1;
       //private Object Exa;
       TareaN1(){
           //configurar liga donde se encuentra la imagen
           ImageIcon imagen=new javax.swing.ImageIcon("C:\\Users\\Gonzalez\\Desktop\\Practica 1\\TareaN1\\src\\tarean1\\yayuayaya.jpeg");
           imag= new JLabel();
           imag.setBounds(380, 65, 190, 190);
           imag.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(imag.getWidth(),imag.getHeight(), Image.SCALE_SMOOTH)));
           add(imag);
           
           et1=new JLabel("Práctica Nº1. Creación de Ventana");
           et1.setBounds(20, 30, 300, 20);          
           et2nomb=new JLabel("Nombre ");
           et2nomb.setBounds(40, 80, 180, 20);          
           et3=new JLabel("Edad ");
           et3.setBounds(40, 120, 80, 20);          
           et4=new JLabel("Domicilio ");
           et4.setBounds(40, 160, 180, 20);
           et5=new JLabel("Fecha de nacimiento ");
           et5.setBounds(40, 200, 150, 20);           
           et6=new JLabel("Semestre ");
           et6.setBounds(40, 240, 80, 20);
           alu=new JLabel("Saulo Gonzalez.");
           alu.setBounds(400, 300, 120, 20);
           
           //cajas de texto
           tx1nomb= new JTextField(); //nombre
           tx1nomb.setBounds(160, 80, 180, 20);
           tx2= new JTextField(); //edad
           tx2.setBounds(160, 120, 80, 20);
           tx3= new JTextField(); //domicilio
           tx3.setBounds(160, 160, 180, 20);
           tx4= new JTextField(); //Fecha nac
           tx4.setBounds(160, 200, 180, 20);
           tx5= new JTextField(); //Semestre
           tx5.setBounds(160, 240, 180, 20);
           b1= new JButton("Enviar Datos");
           b1.setBounds(100, 300, 80, 20);
           b1.addActionListener(this);
           a1=new JTextArea();
           a1.setBounds(40,340, 500, 300);
           win=new JPanel();
           win.setLayout(null);
           //win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           win.add(et1);
           win.add(et2nomb);
           win.add(et3);
           win.add(et4);
           win.add(et5);
           win.add(et6);
           win.add(tx1nomb);
           win.add(tx2);
           win.add(tx3);
           win.add(tx4);
           win.add(tx5);
           win.add(b1);
           win.add(a1);
           win.add(imag);
           win.add(alu);
           add(win);
           setTitle("Tarea N°1- Saulo Gonzalez- IC401");
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           //etLocationRelativeTo(JFrame.CENTER_ALIGNMENT);
           setSize(600, 650);
           setVisible(true);
       }
    public static void main(String[] args) {
        TareaN1 t=new TareaN1(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        capture();
    }
    }
    void capture(){
        a1.setText("Hola "+tx1nomb.getText()+" bienvenido a "+tx5.getText()+
                " semestre. \nLos Siguientes dato han sido capturados correctamente: \nEdad: "+tx2.getText()+"\nDomicilio: "+tx3.getText()+"\nFecha de nacimiento: "+tx4.getText());
        //System.out.println("Hola "+tx1nomb+", bienvenido(a)");
    }
}