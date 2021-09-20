package com.example.http.request

import java.util.UUID

case class CreateAccountRequest(accountOwner: String, securityCode: String, initialBalance: Double)
case class CreditAccountRequest(accountNumber: UUID, amount: Double)
case class DebitAccountRequest(accountNumber: UUID, amount: Double)
