package com.example.enuapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.enuapp.ui.screens.*

/**
 * Sealed class representing all possible navigation routes in the app
 */
sealed class Screen(val route: String) {
    // Main screens
    object Splash : Screen("splash")
    object Home : Screen("home")
    object About : Screen("about")
    object Faculties : Screen("faculties")
    object Education : Screen("education")
    object ForApplicants : Screen("for_applicants")
    object ForStudents : Screen("for_students")
    object Contact : Screen("contact")

    // Faculty screens
    object FacultyIT : Screen("faculty_it")
    object FacultyPhysics : Screen("faculty_physics")
    object FacultyNature : Screen("faculty_nature")

    // Department screens
    object DepartmentIT1 : Screen("dept_it1")
    object DepartmentIT2 : Screen("dept_it2")
    object DepartmentIT3 : Screen("dept_it3")
    object DepartmentPhysics1 : Screen("dept_phy1")
    object DepartmentPhysics2 : Screen("dept_phy2")
    object DepartmentPhysics3 : Screen("dept_phy3")
    object DepartmentNature1 : Screen("dept_nat1")
    object DepartmentNature2 : Screen("dept_nat2")
    object DepartmentNature3 : Screen("dept_nat3")

    // Education level screens
    object Bachelor : Screen("bachelor")
    object Master : Screen("master")
    object PhD : Screen("phd")
}

/**
 * Main navigation component for the app
 */
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        // Main screens
        composable(Screen.Splash.route) { SplashScreen(navController) }
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.About.route) { AboutScreen() }
        composable(Screen.Faculties.route) { FacultiesScreen(navController) }
        composable(Screen.Education.route) { EducationScreen(navController) }
        composable(Screen.ForApplicants.route) { ForApplicantsScreen() }
        composable(Screen.ForStudents.route) { ForStudentsScreen(navController) }
        composable(Screen.Contact.route) { ContactScreen() }

        // Faculty screens
        composable(Screen.FacultyIT.route) {
            FacultyInfoScreen(
                title = "Факультет информационных технологий",
                departments = listOf(
                    "Кафедра программной инженерии" to Screen.DepartmentIT1.route,
                    "Кафедра информационной безопасности" to Screen.DepartmentIT2.route,
                    "Кафедра искусственного интеллекта" to Screen.DepartmentIT3.route
                ),
                navController = navController
            )
        }
        composable(Screen.FacultyPhysics.route) {
            FacultyInfoScreen(
                title = "Физико-технический факультет",
                departments = listOf(
                    "Кафедра физики" to Screen.DepartmentPhysics1.route,
                    "Кафедра ядерной физики" to Screen.DepartmentPhysics2.route,
                    "Кафедра технической физики" to Screen.DepartmentPhysics3.route
                ),
                navController = navController
            )
        }
        composable(Screen.FacultyNature.route) {
            FacultyInfoScreen(
                title = "Факультет естественных наук",
                departments = listOf(
                    "Кафедра биологии" to Screen.DepartmentNature1.route,
                    "Кафедра химии" to Screen.DepartmentNature2.route,
                    "Кафедра географии" to Screen.DepartmentNature3.route
                ),
                navController = navController
            )
        }

        // Department screens
        composable(Screen.DepartmentIT1.route) {
            DepartmentScreen(
                title = "Кафедра программной инженерии",
                description = "Кафедра готовит специалистов в области разработки ПО, включая мобильные и веб-приложения."
            )
        }
        composable(Screen.DepartmentIT2.route) {
            DepartmentScreen(
                title = "Кафедра информационной безопасности",
                description = "Фокус на подготовке профессионалов по кибербезопасности и защите данных."
            )
        }
        composable(Screen.DepartmentIT3.route) {
            DepartmentScreen(
                title = "Кафедра искусственного интеллекта",
                description = "Изучение машинного обучения, нейросетей и интеллектуальных систем."
            )
        }
        composable(Screen.DepartmentPhysics1.route) {
            DepartmentScreen(
                title = "Кафедра физики",
                description = "Базовая и прикладная физика, исследования в области нанотехнологий."
            )
        }
        composable(Screen.DepartmentPhysics2.route) {
            DepartmentScreen(
                title = "Кафедра ядерной физики",
                description = "Изучение атомной энергии, радиационной безопасности и физики элементарных частиц."
            )
        }
        composable(Screen.DepartmentPhysics3.route) {
            DepartmentScreen(
                title = "Кафедра технической физики",
                description = "Применение физических принципов в инженерных задачах."
            )
        }
        composable(Screen.DepartmentNature1.route) {
            DepartmentScreen(
                title = "Кафедра биологии",
                description = "Изучение живых организмов, генетики, экологии."
            )
        }
        composable(Screen.DepartmentNature2.route) {
            DepartmentScreen(
                title = "Кафедра химии",
                description = "Фундаментальные и прикладные исследования в области химии."
            )
        }
        composable(Screen.DepartmentNature3.route) {
            DepartmentScreen(
                title = "Кафедра географии",
                description = "География, картография, геоинформационные системы."
            )
        }

        composable(Screen.Bachelor.route) {
            DepartmentScreen(
                title = "Бакалавриат",
                description = "Бакалавриат — это первая ступень высшего образования, дающая фундаментальные знания по выбранной специальности. Программа длится 4 года и включает лекции, практику и научную работу."
            )
        }

        composable(Screen.Master.route) {
            DepartmentScreen(
                title = "Магистратура",
                description = "Магистратура — вторая ступень высшего образования, предназначенная для углублённого изучения специальности и проведения научных исследований. Программа длится 1–2 года."
            )
        }

        composable(Screen.PhD.route) {
            DepartmentScreen(
                title = "Докторантура",
                description = "Докторантура — это высшая ступень подготовки научных кадров. Программа рассчитана на 3 года и включает проведение самостоятельного научного исследования с защитой диссертации."
            )
        }

    }
}
