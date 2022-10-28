package com.tes.eat.anywhere.bankaccountapp

class Account {
    val date: String=""
    val withdrawAmount: Double=0.0
    var balance: Double= 0.0

    var withdrawalList:MutableList<Withdrawal> = mutableListOf()


   fun deposit(depositAmount:Double){
       balance=+ depositAmount
   }


    fun withdraw(withdrawal:Withdrawal) {
        balance=-withdrawal.amount
        withdrawalList.add(withdrawal)
    }
}

