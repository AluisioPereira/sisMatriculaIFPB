/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.entidades;

/**
 *
 * @author José
 */
/**
 * 
 * Enumeração que utilizada para determina o sexo dos Alunos
 */
public enum Sexo {
     MASCULINO("MASCULINO") ,FEMININO("FEMININO");
    
    public String id;
    
    Sexo(String papel){
        id = papel;
    }
}
