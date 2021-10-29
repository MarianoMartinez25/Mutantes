package com.example.mutantes.entities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ADNTest {
    private final static String[] providedDna = {
            "ATGCGA",
            "CAGTGC",
            "TTATGT",
            "AGAAGG",
            "CCCCTA",
            "TCACTG"};

    private final static String[] doubleVerticalDna = {
            "ATGCGA",
            "CGGTGC",
            "TTATGT",
            "ATAAGG",
            "CTCCTA",
            "TTACTG"};

    private final static String[] doubleHorizontalDna = {
            "ATGCGA",
            "CGGTTC",
            "TTTTGT",
            "ATAAGG",
            "CCCCTA",
            "TTACTG"};

    private final static String[] downAndLeftAndHorizontalDna = {
            "ATGCGG",
            "CGGTAC",
            "TTTAGT",
            "ATAAGG",
            "CAACTA",
            "TTTTAG"};

    private final static String[] downAndRightAndVerticalDna = {
            "ATGCGG",
            "CGGTAG",
            "TTTACG",
            "ATATGG",
            "CAATTA",
            "TTCTAT"};

    private final static String[] notMutantDna = {
            "ATGCGA",
            "CGGTGC",
            "TTATAT",
            "ATAAGG",
            "CTCCTA",
            "TTACTG"};

    private final static String[] notSquareMatrix = {
            "ATGCGG",
            "CGGT",
            "TTTACG",
            "ATAG",
            "CAATTA",
            "TTCTAT"};

    private final static String[] illegalCharactersDna = {
            "ATGCGG",
            "CGGTXG",
            "TTBACG",
            "ATATGG",
            "CAATTA",
            "TTCTAT"};

    @Test
    public void pruebaDNADado(){
        ADN md = new ADN();
        md.isMutante();
    }
}
