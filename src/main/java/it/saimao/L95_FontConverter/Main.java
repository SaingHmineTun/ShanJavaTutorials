package it.saimao.L95_FontConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write shan text here!");
        String shanText = sc.nextLine();
        String brokenText = ShanSyllableBreaker.syllable_break(shanText);
        String translitText = ShanTranslit.taiToEng(shanText);
        String taiNueaText = TaiNueaConverter.shn2tdd(shanText);

        System.out.println("Broken text\n" + brokenText);
        System.out.println("Translit text\n" + translitText);
        System.out.println("Leik Tai Nuea\n" + taiNueaText);

    }
}
