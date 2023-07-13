import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorDivisas {

    public static void main(String[] args) {


        Object[] options = {"Convertir divisas", "Convertir temperatura", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);


        if (elige == 2) {
            JOptionPane.showConfirmDialog(null, "¿Cerrar programa?");
            System.exit(0);
        }
        if (elige == 0) {

            DecimalFormat formatearDivisas = new DecimalFormat("#.##");

            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {"Pesos a Euros", "Pesos a Dolar", "Pesos a Libras Esterlinas", "Pesos a Reales", "Pesos a Yenes"};

                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opcion: ", "Conversor de divisas",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null,  "Ingrese cantidad de Pesos Argentinos: ");


                double pesos = 0.00;


                try {
                    pesos = Double.parseDouble(input);

                } catch (NumberFormatException e) {
                    JOptionPane.showConfirmDialog(null, " Valor no valido \n ¿Desea realizar otra operacion?");
                }

                if (cambio.equals("Pesos a Euros")) {
                    double euros = pesos * 0.0037;
                    JOptionPane.showConfirmDialog(null, pesos + " Pesos Argentinos son: " + formatearDivisas.format(euros) + " Euros");
                }else if (cambio.equals("Pesos a Dolar")) {
                    double dolares = pesos * 0.0040;
                    JOptionPane.showConfirmDialog(null, pesos + " Pesos Argentinos son: " + formatearDivisas.format(dolares) + " Dolares");
                }else if (cambio.equals("Pesos a Libras Esterlinas")) {
                    double libras = pesos * 0.003136;
                    JOptionPane.showConfirmDialog(null, pesos + " Pesos Argentinos son: " + formatearDivisas.format(libras) + " Libras Esterlinas");
                }else if (cambio.equals("Pesos a Reales")) {
                    double reales = pesos *  0.0191636;
                    JOptionPane.showConfirmDialog(null, pesos + " Pesos Argentinos son: " + formatearDivisas.format(reales) + " Reales");
                } else if (cambio.equals("Pesos a Yenes")) {
                    double yenes = pesos * 0.6158;
                    JOptionPane.showConfirmDialog(null, pesos + " Pesos Argentinos son: " + formatearDivisas.format(yenes) + " Yenes");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar el programa?", "Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);

                    if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION){
                        continuarPrograma = false;
                        JOptionPane.showConfirmDialog(null, "Programa finalizado");
                    }
            }
        }
    }
}
