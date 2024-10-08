package br.com.fiap.main;


import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class Main {
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j){
        return Integer.parseInt(texto(JOptionPane.showInputDialog(j)));
    }

    //double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        //instanciar objetos
        Colaborador objColaborador = new Colaborador(
                texto("Nome"),
                texto("Cargo"),
                real("valor Hora"),
                real("quantidade de Horas")
        );


        //String logradouro, int numero, String complemento, String cep
        Endereco objEndColaborador = new Endereco(
                texto("Logradouro"),
                inteiro("numero"),
                texto("complemento"),
                texto("cep")
        );

        objColaborador.setEndereco(objEndColaborador);
        System.out.println(objColaborador);
}}