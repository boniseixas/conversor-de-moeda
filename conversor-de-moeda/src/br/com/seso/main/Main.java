package br.com.seso.main;

import javax.swing.JOptionPane;

import br.com.seso.conversorDeTemperatura.ConversaoDeTemperatura;
import br.com.seso.conversordemoedas.ConversaoDasMoedas;

public class Main {

   public static void main(String[] args) {
      ConversaoDasMoedas moedas = new ConversaoDasMoedas();
      ConversaoDeTemperatura temperatura = new ConversaoDeTemperatura();

      while (true) {
         String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null,
               new Object[] { "Conversor de moeda", "Conversor de Temperatura" }, "Escolha").toString();

         switch (opcao) {
            case "Coversor de moeda":
               String input = JOptionPane.showInputDialog("Insira um valor: ");
               if (checar(input)) {
                  double valorRecebido = Double.parseDouble(input);
                  moedas.converterMoeda(valorRecebido);

                  int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                  if (JOptionPane.OK_OPTION == resposta) {
                     System.out.println("Escolha opção afirmativa");
                  } else {
                     JOptionPane.showMessageDialog(null, "Programa finalizado");
                  }
               } else {
                  JOptionPane.showMessageDialog(null, "Valor inválido");
               }
               break;
            case "Conversor de tempetatura":
               input = JOptionPane.showInputDialog("Insira a temperatura para converter");
               if (checar(input)) {
                  double valorRecebido = Double.parseDouble(input);
                  temperatura.converterTemperatura(valorRecebido);

                  int resposta = 0;
                  resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                  if ((resposta == 0) && (checar(input))) {

                  } else {
                     JOptionPane.showMessageDialog(null, "Programa finalizado");
                  }
               } else {
                  JOptionPane.showMessageDialog(null, "Valor inválido");
               }
               break;
         }
      }
   }

   public static boolean checar(String input) {
      try {
         double check = Double.parseDouble(input);
         if (check >= 0 || check < 0);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }
}
