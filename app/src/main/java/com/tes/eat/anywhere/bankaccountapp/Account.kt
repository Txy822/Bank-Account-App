package com.tes.eat.anywhere.bankaccountapp

class Account {
    var balance: Double= 0.0


   fun deposit(depositAmount:Double):Double{
      return balance + depositAmount
   }
}

