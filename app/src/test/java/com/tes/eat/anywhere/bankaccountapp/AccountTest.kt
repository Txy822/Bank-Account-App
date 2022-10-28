package com.tes.eat.anywhere.bankaccountapp

import org.junit.After
import org.junit.Before
import org.junit.Test

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

        var balanceAfterDeposit =account.deposit(depositAmount)
        assert(balanceAfterDeposit==balance+depositAmount)
    }


    @After
    fun tearDown() {
    }
}