package ini4;

import javax.swing.*;

public class Ini4 {
    public void exec(){
        String vI = JOptionPane.showInputDialog(null,"Entre com a valor 'A'.");
        int a = Integer.parseInt(vI);

        String vF = JOptionPane.showInputDialog(null,"Entre com a valor 'B'.");
        int b = Integer.parseInt(vF);

        System.out.print(returnSumImpar(a, b));
    }

    private int returnSumImpar(int vI, int vF){
        int i = 0;
        int resultSum = 0;

        for (i = vI; i<=vF; i++){
            //System.out.print(i);
            if (i % 2 == 1){
                resultSum += i;
            }
        }
        return resultSum;
    }
}
