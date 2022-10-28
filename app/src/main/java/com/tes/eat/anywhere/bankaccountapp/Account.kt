package com.tes.eat.anywhere.bankaccountapp

import android.widget.Toast

class Account {
    val date: String=""
    val withdrawAmount: Double=0.0
    var balance: Double= 0.0

    var withdrawalList:MutableList<Withdrawal> = mutableListOf()


   fun deposit(depositAmount:Double){
       balance += depositAmount
   }


    fun withdraw(withdrawal:Withdrawal) {
        if(balance>=withdrawal.amount){
            balance -=withdrawal.amount
            withdrawalList.add(withdrawal)
        }
        else
            balance -= 0.0
    }
}

