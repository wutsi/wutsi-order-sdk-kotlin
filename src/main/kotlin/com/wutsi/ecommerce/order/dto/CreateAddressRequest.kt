package com.wutsi.ecommerce.order.dto

import kotlin.Long
import kotlin.String

public data class CreateAddressRequest(
  public val type: String = "",
  public val firstName: String = "",
  public val lastName: String = "",
  public val country: String? = null,
  public val street: String? = null,
  public val cityId: Long? = null,
  public val zipCode: String? = null,
  public val email: String? = null,
)
