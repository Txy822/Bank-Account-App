package com.tes.eat.anywhere.bankaccountapp

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.text.DateFormat
import java.util.*

class AccountTest {
      lateinit var account:Account
      private var depositAmount:Double = 0.0

    @Before
    fun setUp() {
        account= Account()
        depositAmount=20.4
    }
    @Test
    fun `user deposited money to the account -success`(){
        var balance =account.balance
        account.deposit(depositAmount)
        var newBalance =account.balance
        assert(balance!=newBalance)
    }


    @Test
    fun `user withdraw money-success`(){
        var withdrawAmount:Double= account.withdrawAmount
       // var  date: android.text.format.DateFormat = android.text.format.DateFormat()
        var  date:String = account.date
        var balance=account.balance
       account.withdraw(withdrawAmount,date)
        var newBalance=account.balance
        assert(newBalance==balance-withdrawAmount)
    }

    @After
    fun tearDown() {
    }
}