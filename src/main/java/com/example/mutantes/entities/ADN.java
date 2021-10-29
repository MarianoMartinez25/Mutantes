package com.example.mutantes.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ADN")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ADN extends Base {

    @Column(name ="Es_mutante")
    private boolean mutante;

   /*
    public void analizarADN(){
        String[] dna = {"ATGCCC", "AAGTCC", "CTACGT", "AACAGG", "GGCCCA", "TCCATG"};

        //imprime matriz generada
        char[][] matrix = createMatrix(dna);
        printMatrix(dna, matrix);

        boolean mutant = isMutant(dna);
        if (mutant == true) System.out.println("\n\n:::: MUTANTE DETECTADO ::::");
        else System.out.println("\n\nEste humano no es mutante");
    }
*/
}
