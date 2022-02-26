package com.example.navigationcomponentlivedata

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.TranslateAnimation
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationcomponentlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        //setSupportActionBar(binding.toolBar)

        navController=findNavController(R.id.nav_host_fragment)
        val appBarConfiguration= AppBarConfiguration(setOf(R.id.enterNameFragment,R.id.showDataFragment))
        setupActionBarWithNavController(navController,appBarConfiguration)
        binding.bottomBar.setupWithNavController(navController)










    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()||super.onSupportNavigateUp()
    }


}