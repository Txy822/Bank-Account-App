package com.tes.eat.anywhere.bankaccountapp

import org.junit.After
import org.junit.Before
import org.junit.Test

class AccountTest {
        private lateinit var account:Account
        private var balance:Double=0.0
        private var depositAmount:Double =20.4
        private lateinit var withDrawal:Withdrawal
        private lateinit var date:String
        private var withdrawalAmount: Double =100.00
        lateinit var withdrawalList:MutableList<Withdrawal>


    @Before
    fun setUp() {
        account= Account()
        date ="10/04/22"
        balance=1000.00

        withDrawal = Withdrawal(withdrawalAmount,date)
        withdrawalList=mutableListOf()
    }
    @Test
    fun `user deposited money to the account -success`(){
        balance =account.balance
        account.deposit(depositAmount)
        var newBalance =account.balance
        assert(balance!=newBalance)
    }


    @Test
    fun `user withdraw money-success`(){
       withdrawalAmount= account.withdrawAmount
       // var  date: android.text.format.DateFormat = android.text.format.DateFormat()
        var  date:String = account.date
        var balance=account.balance
       // withDrawal=Withdrawal(withdrawAmount,date)
       account.withdraw(withDrawal)
        var newBalance=account.balance
        assert(newBalance!=balance-withdrawalAmount)
    }

    @After
    fun tearDown() {
        withdrawalList.clear()
        balance=0.0
        date=""

    }
}