package com.example.waterconsumption

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.waterconsumption.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var waterConsumed: Int = 0
    private var waterGoal: Int = 0
    private lateinit var waterView: TextView
    private lateinit var addButton: Button
    private lateinit var resetButton: Button
    private lateinit var goalButton: Button
    private lateinit var reminderButton: Button
    private lateinit var dailyButton: Button
    private lateinit var weeklyButton: Button
    private lateinit var monthlyButton: Button
    private lateinit var reminderAlertDialog: AlertDialog
    private lateinit var goalAlertDialog: AlertDialog
    private lateinit var statisticsAlertDialog: AlertDialog
    private val dailyWaterRecords = mutableListOf<Int>()
    private val weeklyWaterRecords = mutableListOf<Int>()
    private val monthlyWaterRecords = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

