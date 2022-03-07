package com.github.eleksbai.yshell.services

import com.intellij.openapi.project.Project
import com.github.eleksbai.yshell.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
