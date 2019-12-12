package io.holunda.camunda.bpm.data.example.domain

import java.util.*

data class Order(
  val orderId: String,
  val created: Date,
  val positions: List<OrderPosition> = listOf()
)
