package CadastroExibição;
// Importação de Classes.

import javax.swing.JOptionPane;
import java.util.Random;
public class CadastroDeCarteirinhas {
    String nome,nascimento,endereco,telefone,cidade,cpf;
    Random r = new Random();
    int númeroDeCadastro;
    void CadastroCarteirinha(){
        nome = JOptionPane.showInputDialog("Digite seu nome!");
        nascimento = JOptionPane.showInputDialog("Digite sua data de nascimento!");
        endereco = JOptionPane.showInputDialog("Digite seu endereço!");
        telefone = JOptionPane.showInputDialog("Digite seu número de telefone...");
        cidade =  JOptionPane.showInputDialog("Digite sua Cidade...");
        cpf = JOptionPane.showInputDialog("Digite o 'CPF' do funcionário ou aluno");

        númeroDeCadastro = r.nextInt();
    }
    void ExibaAsInformações(){
        JOptionPane.showMessageDialog(null, "Carterinha Cadastrada com sucesso\n"+
                                                                     "=================================\n"+
                                                                     "NOME: " + nome + "\n"+
                                                                     "DATA DE NASCIMENTO: " + nascimento + "\n"+
                                                                     "ENDEREÇO: " + endereco + "\n"+
                                                                     "TELEFONE: " + telefone + "\n"+
                                                                     "CIDADE: " + cidade + "\n"+
                                                                     "CPF: " + cpf + "\n"+
                                                                     "=================================\n"+
                                                                     "NÚMERO DE CADASTRO: " + númeroDeCadastro + "\n"+
                                                                     "=================================");
    }
}
