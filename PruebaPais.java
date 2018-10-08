import javax.swing.*;

public class PruebaPais {
    public static void main(String[] args) {

        Pais p=new Pais("Burkina Faso",27360,10.30,2.80,72.80,300,0.00);

        System.out.println(p.infoCompleta());

        Pais q=new Pais("Cabo Verde",403,0.40,2.80,45.70,870,2.10);

        System.out.println(q.infoCompleta());

        JOptionPane.showMessageDialog(null,p.infoCompleta());


    }
}
