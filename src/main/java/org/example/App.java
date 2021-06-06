package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */
public class App {
    public static void main(String[] args) {
        App app = new App();

        Scanner scanner = new Scanner(System.in);
        String story;

        story = app.getUserStory(scanner);
        app.printUserStory(story);
    }

    private void printUserStory(String story) {
        System.out.println(story);
    }

    private String getUserStory(Scanner scanner) {
        String story;

        System.out.println("Enter a noun:");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb:");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective:");
        String adj = scanner.nextLine();
        System.out.println("Enter an adverb:");
        String adv = scanner.nextLine();

        story = "Do you " + verb + " your " + adj + " " + noun + " " + adv + "? " + "That's hilarious!";

        return story;
    }
}
