package com.kodilla.lista;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("Ania", "Bartek", "Cezary");

        List<String> listName = numbers.stream()
                        .map(String::toLowerCase)
                        .collect(Collectors.toList());

        System.out.println(listName);
    }
}
