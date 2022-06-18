package com.wutsi.ecommerce.order

import kotlin.String

public enum class Environment(
  public val url: String,
) {
  SANDBOX("https://wutsi-order-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-order-server-prod.herokuapp.com"),
  ;
}
