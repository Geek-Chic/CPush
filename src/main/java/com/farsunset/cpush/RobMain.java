package com.farsunset.cpush;

import java.io.PrintStream;
import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

/**
 * Created by evil on 10/1/15.
 */
public class RobMain {
    private final Set<String> paintingElements;
    private final PrintStream printStream;

    public RobMain(Set<String> paintingElements) {
        this(paintingElements, System.out);
    }

    public RobMain(Set<String> paintingElements, PrintStream printStream) {
        Builder<String> builder = new ImmutableSet.Builder<String>().addAll(paintingElements);
        if (!paintingElements.contains("happy tree")) {
            builder.add("happy tree");
        }
        this.paintingElements = builder.build();
        this.printStream = printStream;
    }

    public Set<String> getPaintingElements() {
        return this.paintingElements;
    }

    public void paintPicture() {
        for (String p : paintingElements) {
            printStream.println("Now we will paint the " + p);
        }
    }

    public static void main(String[] args) {
        Set<String> paintingElements = ImmutableSet.of("sky", "lake", "mountain", "happy tree", "little squirrel");
        RobMain bob = new RobMain(paintingElements);
        bob.paintPicture();
    }
}
