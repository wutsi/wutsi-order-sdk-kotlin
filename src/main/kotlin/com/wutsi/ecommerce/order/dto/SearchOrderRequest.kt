package com.wutsi.ecommerce.order.dto

import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class SearchOrderRequest(
  public val merchantId: Long? = null,
  public val accountId: Long? = null,
  public val status: List<String> = emptyList(),
  public val createdFrom: OffsetDateTime? = null,
  public val createdTo: OffsetDateTime? = null,
  public val limit: Int = 30,
  public val offset: Int = 0,
)
