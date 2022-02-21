package com.wutsi.ecommerce.order.dto

import kotlin.Int
import kotlin.Long

public data class CreateOrderItem(
  public val productId: Long = 0,
  public val quantity: Int = 0
)
