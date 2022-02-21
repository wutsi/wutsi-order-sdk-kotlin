package com.wutsi.ecommerce.order.dto

import kotlin.Long
import kotlin.collections.List

public data class CreateOrderRequest(
  public val merchantId: Long = 0,
  public val items: List<CreateOrderItem> = emptyList()
)
