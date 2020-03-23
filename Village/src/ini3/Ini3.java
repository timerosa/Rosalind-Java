package ini3;

import javax.swing.*;

public class Ini3 {
    public void exec(){
        String result ="";
        String caracterList = JOptionPane.showInputDialog(null,"Entre com a String.");

        for (int i=0; i<2; i++) {
            String pI = JOptionPane.showInputDialog(null,"Entre com a valor da posição inicial.");
            int iniBloco = Integer.parseInt(pI);

            String pF = JOptionPane.showInputDialog(null,"Entre com a valor da posição Final.");
            int fimbloco = Integer.parseInt(pF);

            result += " " + sString(iniBloco, fimbloco, caracterList);
        }

        System.out.print(result);
    }

    private String sString(int pI, int pF, String caracterList){
        return caracterList.substring(pI,pF+1);
    }

}
