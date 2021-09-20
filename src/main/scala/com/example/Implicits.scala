package com.example

import com.example.command.CreateAccount
import com.example.http.request.CreateAccountRequest

import java.util.UUID
import scala.language.implicitConversions

object Implicits {

  implicit def requestToCommand(request: CreateAccountRequest): CreateAccount = {
    val newAccountNumber = UUID.randomUUID()
    CreateAccount(newAccountNumber, request.accountOwner, request.securityCode, request.initialBalance)
  }

}
