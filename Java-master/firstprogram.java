
import javax.swing.*;

public class firstprogram {
    static String name;
    static String Regno;
    static staff mystaff=new staff();

    public static void main(String[]args){
        getData();
        display();
        mystaff.getData();
        mystaff.display();

    }
    static void getData(){
        name= JOptionPane.showInputDialog(name);
        Regno=JOptionPane.showInputDialog(Regno);
    }
    static void display(){
        JOptionPane.showMessageDialog(null,name);
        JOptionPane.showMessageDialog(null,Regno);
    }
}
class staff{
    static String staffname;
    static String staffno;
    staff(){

    }
    
    public void getData(){
        staffname= JOptionPane.showInputDialog(staffname);
        staffno=JOptionPane.showInputDialog(staffno);
    }
    public void display(){
        JOptionPane.showMessageDialog(null,staffname);
        JOptionPane.showMessageDialog(null,staffno);
    }
}
