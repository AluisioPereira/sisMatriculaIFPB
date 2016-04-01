/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.model;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;

/**
 *
 * @author José
 */
public class ValidaCPF {

    private static ValidaCPF vcpf;

    private ValidaCPF() {
    }

    public static ValidaCPF getInstancia() {
        if (vcpf == null) {
            vcpf = new ValidaCPF();
        }
        return vcpf;
    }

    public boolean validaCPF(String cpf) {

        CPFValidator vld = new CPFValidator();
        for (ValidationMessage error : vld.invalidMessagesFor(cpf)) {
            System.out.println(error.getMessage());
            if (!vld.isEligible(cpf)) {
                return false;
            }
        }
        return true;

    }

}
