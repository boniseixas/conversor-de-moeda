package br.com.seso.conversordemoedas;

import javax.swing.JOptionPane;

public class ConverteMoedaParaReal {

   public void converterDolarEmReal(double valorAConverter) {
      double real = valorAConverter * 4.93;
      real = (double) Math.round(real * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Reais é R$ " + real);
   }

   public void converterEuroEmReal(double valorAConverter) {
      double real = valorAConverter * 5.34;
      real = (double) Math.round(real * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Reais é R$ " + real);
   }

   public void converterLibrasEmReal(double valorAConverter) {
      double real = valorAConverter * 6.16;
      real = (double) Math.round(real * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Reais é R$ " + real);
   }

   public void converterPesoArgentinoEmReal(double valorAConverter) {
      double real = valorAConverter * 0.021;
      real = (double) Math.round(real * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Reais é R$ " + real);
   }

   public void converterPesoChilenoEmReal(double valorAConverter) {
      double real = valorAConverter * 0.0062;
      real = (double) Math.round(real * 100d) / 100;
      JOptionPane.showMessageDialog(null, "O valor em Reais é R$ " + real);
   }
}
