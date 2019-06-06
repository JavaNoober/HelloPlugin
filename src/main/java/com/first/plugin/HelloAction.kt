package com.first.plugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages


class HelloAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val project = event.project
        Messages.showMessageDialog(project, "Hello world!", "First Plugin", Messages.getInformationIcon())
    }

}