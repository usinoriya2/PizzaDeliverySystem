/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pds;

/**
 *
 * @author Wrath
 */
public class OrderItems {
    public int quant[][]= new int[items.length][3];
    public static Item[] items = {new Item("Margherita",true,350),
                                 new Item("Mexican Wave",true,300),
                                 new Item("Italian Treat",true,850),
                                 new Item("Chilly Slice",true,50),
                                 new Item("Choco Lava Cake",false,50),
                                 new Item("Coke 600 ml",false,40),
                                 new Item("Wine 600 ml",false,5000)
                                  };
    public static void main(String args[]) throws Exception{
        java.io.FileWriter f = new java.io.FileWriter("gobi.txt");
    }
    
    public int totalcost()
    {
        int totalc=0;
        for(int i = 0; i<OrderItems.items.length;i++)
        {
            for(int j = 0 ; j<3;j++) {
                
                //String df = ((OrderItems.items[i].sizeable)?(new String[]{"Small","Medium","Large"}[j]):("-"));
                float f =1.0f;
                if (OrderItems.items[i].sizeable) 
                    f += (j -1) * (0.3f); 
                //Object s[] = {OrderItems.items[i].name,df,list.quant[i][j],(int)(OrderItems.items[i].cost * f) * list.quant[i][j]};
                totalc += (int)(OrderItems.items[i].cost * f) * quant[i][j];
                
                //((javax.swing.table.DefaultTableModel)jTable1.getModel()).addRow(s) ;       // TODO add your handling code here:
                
            }
        }
        return totalc;
                
    }
}

            
    