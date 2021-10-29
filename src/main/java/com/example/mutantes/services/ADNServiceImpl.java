package com.example.mutantes.services;

import com.example.mutantes.entities.ADN;
import com.example.mutantes.repositories.ADNRepository;
import com.example.mutantes.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;


@Service
public class ADNServiceImpl extends BaseServiceImpl<ADN,Long> implements ADNService {

    @Autowired()
    ADNRepository analizadorDeADNRepository;

    public ADNServiceImpl(BaseRepository<ADN, Long> baseRepository) {

        super(baseRepository);
    }


    private int size;
    private String[] dna = new String[size];
    //private Character[] baseNitrogenada = {'A', 'T', 'G', 'C'};
    private int minimoMutante = 4;
    @Column(name = "Tabla almacenada")
    private List<char[]> charList = new ArrayList<char[]>();

    public boolean isMutant(String[] dna) {
        char[][] dnaMatriz = createMatrix(dna);
        //Analiza la matriz en busca de anomalias verticales,horizontales,diagonales y diagonales opuestas
        boolean mutante = validateMatriz(dnaMatriz);
        if (mutante) return true;

        return false;
    }

    public static char[][] createMatrix(String[] dna) {
        //crea una matriz cuadrada
        char[][] matrix = new char[dna.length][dna.length];
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[0].length(); j++) {
                //completa la matriz con el dna
                matrix[i][j] = dna[i].toCharArray()[j];
            }
        }
        return matrix;
    }

    public static boolean validateMatriz(char[][] x) {
        int contador = 0;
        //codigo para analizar filas
        for (int i = 0; i < x.length; i++) {
            //vamos hasta -3, porque ir mas alla no sirve porque no hay 4 elementos
            for (int j = 0; j < x[0].length - 3; j++) {
                if (contador < 2) {
                    if (x[i][j] == x[i][j + 1]
                            && x[i][j] == x[i][j + 2]
                            && x[i][j] == x[i][j + 3]) {
                        contador++;
                    }
                }
            }
        }

        //codigo para analizar columnas
        for (int j = 0; j < x[0].length - 3; j++) {
            //vamos hasta -3, porque ir mas alla no sirve porque no hay 4 elementos
            for (int i = 0; i < x.length; i++) {
                if (contador < 2) {
                    if ((i + 3) < x.length) {
                        if (x[i][j] == x[i + 1][j]
                                && x[i][j] == x[i + 2][j]
                                && x[i][j] == x[i + 3][j]) {
                            contador++;
                        }
                    }
                }
            }
        }

        //codigo para analizar diagonales normales
        for (int i = 0; i < x.length; i++) {
            //vamos hasta -3, porque ir mas alla no sirve porque no hay 4 elementos
            for (int j = 0; j < x[0].length - 3; j++) {
                if (contador < 2) {
                    if ((i + 3) < x.length) {
                        if (x[i][j] == x[i + 1][j + 1]
                                && x[i][j] == x[i + 2][j + 2]
                                && x[i][j] == x[i + 3][j + 3]) {
                            contador++;
                        }
                    }
                }
            }
        }

        //codigo para analizar diagonales inversas
        for (int j = 0; j < x[0].length - 3; j++) {
            //vamos hasta -3, porque ir mas alla no sirve porque no hay 4 elementos
            for (int i = 0; i < x.length; i++) {
                if (contador < 2) {
                    if ((i - 3) >= 0 && ((j + i) - 3) < x.length) {
                        if (x[i][j] == x[i - 1][(j + i) - 2]
                                && x[i][j] == x[i - 2][(j + i) - 1]
                                && x[i][j] == x[i - 3][(j + i)]) {
                            contador++;
                        }
                    }
                }
            }
        }
        if (contador >= 2) {
            return true;
        } else {
            return false;
        }
    }

    /*public static void printMatrix(String[] dna, char[][] matrix) {
        System.out.println("\n Matriz analizada: ");
        for (int i = 0; i < dna.length; i++) {
            System.out.println("");
            for (int j = 0; j < dna[0].length(); j++) {
                //imprime matriz generada
                System.out.print(matrix[i][j] + " ");
            }
        }
    }*/

}
