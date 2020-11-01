package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Automata automata = new Automata();
        System.out.println(automata.getMenu());

        automata.on();
        System.out.println(automata);
        automata.coin(1000);
        System.out.println(automata);
        automata.choice(9);
        System.out.println(automata);


    }}
