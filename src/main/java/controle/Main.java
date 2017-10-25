package controle;

import database.AtividadeDAO;
import database.PessoaDAO;
import modelo.Atividade;
import modelo.Pessoa;
import database.ConectaMysql;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

//        Pessoa pessoa = new Pessoa("pele");
//        Atividade atividade = new Atividade("futebol","14:00","15:00","Lazer");
//        Atividade atividade2 = new Atividade("mortalpratras","11:00","12:00","Lazer");
//        Atividade atividade3 = new Atividade("videogame","16:00","17:00","Lazer");
//        Atividade atividade4 = new Atividade("dale","13:00","14:00","Lazer");
//
//        pessoa.adicionaAtividadeDia(atividade);
//        pessoa.adicionaAtividadeDia(atividade2);
//        pessoa.adicionaAtividadeDia(atividade3);
//        pessoa.adicionaAtividadeDia(atividade4);
//        pessoa.removeAtividadeDia("dale");
//
//
//        Atividade a = new Atividade("natação","15:00","16:00","Lazer");
//        pessoa.editaAtividade("futebol",a);
//
//
//        System.out.println(pessoa.getAtividades().toString());


        Connection con = ConectaMysql.getConnection();
        System.out.println(ConectaMysql.statusConection());

        Pessoa pessoa = new Pessoa("Rubens");
        Atividade atividade = new Atividade("futebol","14:00","15:00","Lazer");
        PessoaDAO pessoaDAO = new PessoaDAO(con);
        AtividadeDAO atividadeDAO = new AtividadeDAO(con);

        pessoaDAO.registraPessoa(pessoa);

        atividadeDAO.criaAtividade(atividade,pessoa);
        atividadeDAO.criaAtividade(atividade,pessoa);
        atividadeDAO.criaAtividade(atividade,pessoa);
        atividadeDAO.criaAtividade(atividade,pessoa);
        atividadeDAO.criaAtividade(atividade,pessoa);
        

        ConectaMysql.fechaConexao(con);
        System.out.println(ConectaMysql.statusConection());




    }
}