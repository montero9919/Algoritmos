
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class Menu 
{
    
    public Menu ()
    {
       menu (); 
    }
    
    public void menu ()
    {
        int menu = 0;
        int cantidad;
        
        do
        {
            menu = Integer.parseInt (JOptionPane.showInputDialog ("""
                                                                  Menu Principal
                                                                  
                                                                  1. Mostrar mapa coloreado
                                                                  2. ALGO MAS
                                                                  3. Salir
                                                                  
                                                                  """));
            switch (menu)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "El mapa se mostrara aca");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "algo mas");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Salir del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, ingrese la opcion nuevamente");
            }
        }while (menu != 3);
    }
    
    public static void main (String arg [])
    {
        Menu menu = new Menu ();
    }
    
}
