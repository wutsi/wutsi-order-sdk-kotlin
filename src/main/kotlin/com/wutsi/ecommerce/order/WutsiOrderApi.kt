package com.wutsi.ecommerce.order

import com.wutsi.ecommerce.order.dto.ChangeStatusRequest
import com.wutsi.ecommerce.order.dto.CreateOrderRequest
import com.wutsi.ecommerce.order.dto.CreateOrderResponse
import com.wutsi.ecommerce.order.dto.GetOrderResponse
import com.wutsi.ecommerce.order.dto.ListAddressResponse
import com.wutsi.ecommerce.order.dto.SearchOrderRequest
import com.wutsi.ecommerce.order.dto.SearchOrderResponse
import com.wutsi.ecommerce.order.dto.SetAddressRequest
import com.wutsi.ecommerce.order.dto.SetShippingMethodRequest
import com.wutsi.ecommerce.order.dto.SetShippingOrderRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.String
import kotlin.Unit

public interface WutsiOrderApi {
  @RequestLine("POST /v1/orders")
  @Headers(value=["Content-Type: application/json"])
  public fun createOrder(request: CreateOrderRequest): CreateOrderResponse

  @RequestLine("POST /v1/orders/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchOrders(request: SearchOrderRequest): SearchOrderResponse

  @RequestLine("GET /v1/orders/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getOrder(@Param("id") id: String): GetOrderResponse

  @RequestLine("POST /v1/orders/{id}/shipping-order")
  @Headers(value=["Content-Type: application/json"])
  public fun setShippingOrder(@Param("id") id: String, request: SetShippingOrderRequest): Unit

  @RequestLine("POST /v1/orders/{id}/shipping-method")
  @Headers(value=["Content-Type: application/json"])
  public fun setShippingMethod(@Param("id") id: String, request: SetShippingMethodRequest): Unit

  @RequestLine("POST /v1/orders/{id}/shipping-address")
  @Headers(value=["Content-Type: application/json"])
  public fun setShippingAddress(@Param("id") id: String, request: SetAddressRequest): Unit

  @RequestLine("POST /v1/orders/{id}/status")
  @Headers(value=["Content-Type: application/json"])
  public fun changeStatus(@Param("id") id: String, request: ChangeStatusRequest): Unit

  @RequestLine("GET /v1/addresses")
  @Headers(value=["Content-Type: application/json"])
  public fun listAddresses(): ListAddressResponse
}
