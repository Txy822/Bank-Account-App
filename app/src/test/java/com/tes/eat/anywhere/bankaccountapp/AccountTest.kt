package com.tes.eat.anywhere.bankaccountapp

import junit.framework.Assert.assertFalse
import org.junit.After
import org.junit.Before
import org.junit.Test

class AccountTest {
        private lateinit var account:Account
        private var balance:Double=0.0
        private var depositAmount:Double =20.4
        private lateinit var recentWithdrawal:Withdrawal
        private lateinit var date:String
        private var withdrawalAmount: Double =100.00
        lateinit var withdrawalList:MutableList<Withdrawal>


    @Before
    fun setUp() {
        account= Account()
        date ="10/04/22"
        balance=1000.00
        recentWithdrawal = Withdrawal(withdrawalAmount,date)
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
        var  date:String = account.date
        balance=account.balance
        account.withdraw(recentWithdrawal)
        var newBalance=account.balance
        assert(newBalance!=balance-withdrawalAmount)
    }

    @Test
    fun `add withdrawal in the list-success`(){

        withdrawalList.add(recentWithdrawal)
        assert(withdrawalList.contains(recentWithdrawal))
        withdrawalList.remove(recentWithdrawal)
        assert(withdrawalList.isEmpty())
    }


    @After
    fun tearDown() {
        withdrawalList.clear()
        balance=0.0
        date=""

    }
}