package com.sda.patterns.behavioral.command;

import com.sda.patterns.behavioral.command.editor.Editor;

public class DemoCommandPattern {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
