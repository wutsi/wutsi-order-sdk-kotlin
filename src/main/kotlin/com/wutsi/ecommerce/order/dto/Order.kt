package com.wutsi.ecommerce.order.dto

import java.time.OffsetDateTime
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class Order(
  public val id: String = "",
  public val merchantId: Long = 0,
  public val accountId: Long = 0,
  public val reservationId: Long? = null,
  public val status: String = "",
  public val subTotalPrice: Double = 0.0,
  public val savingsAmount: Double = 0.0,
  public val totalPrice: Double = 0.0,
  public val currency: String = "",
  public val items: List<OrderItem> = emptyList(),
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val cancelled: OffsetDateTime? = null,
  public val shippingId: Long? = null,
  public val deliveryFees: Double = 0.0,
  public val expectedDelivered: OffsetDateTime? = null,
  public val shippingAddress: Address = Address()
)
