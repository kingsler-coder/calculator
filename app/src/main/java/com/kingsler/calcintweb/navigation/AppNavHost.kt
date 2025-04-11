package com.kingsler.calcintweb.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kingsler.calcintweb.ui.theme.screens.calc.Calc_Screen
import com.kingsler.calcintweb.ui.theme.screens.home.Home_Screen
import com.kingsler.calcintweb.ui.theme.screens.intent.Intent_Screen
import com.kingsler.calcintweb.ui.theme.screens.web.Web_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String=ROUTE_HOME) {
    NavHost(navController = navController, modifier= modifier,
       startDestination = startDestination){
        composable (ROUTE_HOME){
            Home_Screen(navController)
        }
        composable (ROUTE_CALC) {
           Calc_Screen(navController)
        }
        composable (ROUTE_WEB){
            Web_Screen(navController)
        }
        composable (ROUTE_INTENT){
            Intent_Screen(navController)
        }
    }

}