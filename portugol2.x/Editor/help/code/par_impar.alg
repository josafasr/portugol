/*
--------------------------------------------------------
par_impar.alg
(c) Ant�nio Manso - 2-11-2005
--------------------------------------------------------
Descri��o:
Programa que verifica se um numero � par ou impar
*/
inicio
    inteiro numero , r
    escrever " introduza um numero"
    ler numero
    // resto da divisao inteiro do n�mero por 2
    r := resto( numero , 2 )
    se r = 0 entao
        escrever "numero par"
    senao
        escrever "numero impar"
    fimse
fim

