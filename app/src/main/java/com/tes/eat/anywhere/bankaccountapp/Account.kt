package com.tes.eat.anywhere.bankaccountapp

class Account {
    val date: String=""
    val withdrawAmount: Double=0.0
    var balance: Double= 0.0


   fun deposit(depositAmount:Double){
       balance=+ depositAmount
   }
}

