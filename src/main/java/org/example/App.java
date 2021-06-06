package org.example;

import java.util.Scanner;

/**
 * Mad libs are a simple game where you create a story template with blanks for words. You, or another player,
 * then construct a list of words and place them into the story, creating an often silly or funny story as a result.
 * <p>
 * Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those
 * into a story that you create.
 * <p>
 * Example Output
 * Enter a noun: dog
 * Enter a verb: walk
 * Enter an adjective: blue
 * Enter an adverb: quickly
 * Do you walk your blue dog quickly? That's hilarious!
 * Constraints
 * Use a single output statement for this program.
 * If your language supports string interpolation or string substitution, use it to build up the output.
 * Challenges
 * Add more inputs to the program to expand the story.
 * Implement a branching story, where the answers to questions determine how the story is constructed.
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
