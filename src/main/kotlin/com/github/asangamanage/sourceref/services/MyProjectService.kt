package com.github.asangamanage.sourceref.services

import com.intellij.openapi.project.Project
import com.github.asangamanage.sourceref.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
