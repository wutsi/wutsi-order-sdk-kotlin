package com.wutsi.ecommerce.order.dto

import kotlin.Long
import kotlin.String

public data class SetShippingMethodRequest(
  public val shippingId: Long = 0,
  public val country: String = "",
  public val cityId: Long? = null
)
