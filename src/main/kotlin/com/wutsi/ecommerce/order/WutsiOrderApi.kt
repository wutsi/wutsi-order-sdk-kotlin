package com.wutsi.ecommerce.order

import com.wutsi.ecommerce.order.dto.CreateOrderRequest
import com.wutsi.ecommerce.order.dto.CreateOrderResponse
import com.wutsi.ecommerce.order.dto.GetOrderResponse
import com.wutsi.ecommerce.order.dto.SearchOrderRequest
import com.wutsi.ecommerce.order.dto.SearchOrderResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.String
import kotlin.Unit

public interface WutsiOrderApi {
  @RequestLine("POST /v1/orders")
  @Headers(value=["Content-Type: application/json"])
  public fun createOrder(request: CreateOrderRequest): CreateOrderResponse

  @RequestLine("GET /v1/orders/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getOrder(@Param("id") id: String): GetOrderResponse

  @RequestLine("DELETE /v1/orders/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun cancelOrder(@Param("id") id: String): Unit

  @RequestLine("POST /v1/orders/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchOrders(request: SearchOrderRequest): SearchOrderResponse
}
