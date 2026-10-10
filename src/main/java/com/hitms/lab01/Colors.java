
package com.hitms.lab01;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;
import static org.fusesource.jansi.Ansi.Color.GREEN;

/**
 * Displays a colored welcome message.
 */
public final class Colors {

    /**
     * Private constructor.
     */
    private Colors() {
    }

    /**
     * Main method of the application.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        AnsiConsole.systemInstall();
        System.out.println(ansi().fg(GREEN)
                .a("Hello, Software Construction!")
                .reset());
        AnsiConsole.systemUninstall();
    }
}

