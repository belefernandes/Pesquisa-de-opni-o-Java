import javax.swing.JOptionPane;
//definição classe
public class App {

    public static void main(String[] args) {
        // Contando respostas
        int excelenteCount = 0;
        int ruimCount = 0;

        // LooP pesquisa com 10 entrevistados
        for (int i = 1; i <= 10; i++) {
            // Janela de Interação
            String nome = JOptionPane.showInputDialog("Entrevistado " + i + ":\nNome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));

            String[] opcoes = {"EXCELENTE", "BOM", "RUIM"};
            int opcao = JOptionPane.showOptionDialog(null, "Opinião sobre o atendimento:", "Opinião", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
            //Contagem das Respostas
            switch (opcao) {
                case 0:
                    excelenteCount++;
                    break;
                case 2:
                    ruimCount++;
                    break;
                default:
                    break;
            }
        }

        // Janela de resultados
        JOptionPane.showMessageDialog(null, "Resultados da pesquisa:\n\nQuantidade de respostas 'EXCELENTE': " + excelenteCount + "\nQuantidade de respostas 'RUIM': " + ruimCount);

        // Testes com 10 entrevistados
        StringBuilder testResults = new StringBuilder("Testes com 10 entrevistados:\n\n");
        for (int i = 1; i <= 10; i++) 


        //

        {
            
            // Opção de Resposta de opnião
            switch (opcao) {
                case 0:
                    testResults.append("Entrevistado ").append(i).append(": Opinião: EXCELENTE\n");
                    break;
                case 1:
                    testResults.append("Entrevistado ").append(i).append(": Opinião: BOM\n");
                    break;
                case 2:
                    testResults.append("Entrevistado ").append(i).append(": Opinião: RUIM\n");
                    break;
                default:
                    testResults.append("Entrevistado ").append(i).append(": Opinião inválida\n");
                    break;
            }
        }
        //resultado test
        JOptionPane.showMessageDialog(null, testResults.toString());
    }
}
