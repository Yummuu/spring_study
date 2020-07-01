package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "order_id")
	private String orderId;

	@Column(name = "order_pid")
	private String orderPid;

	@Column(name = "product_id")
	private String productId;

	@Column(name = "merchant_no")
	private String merchantNo;

	@Column(name = "trade_no")
	private String tradeNo;

	@Column(name = "price")
	private double price;

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "quantity")
	private long quantity;

	@Column(name = "coupon")
	private long coupon;

	@Column(name = "poundage")
	private long poundage;

	@Column(name = "scores")
	private long scores;

	@Column(name = "status")
	private long status;

	@Column(name = "type")
	private long type;

	@Column(name = "payment")
	private String payment;

	@Column(name = "refund")
	private String refund;

	@Column(name = "created_id")
	private String createdId;

	@Column(name = "pay_time")
	private Date payTime;

	@Column(name = "refund_time")
	private Date refundTime;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderPid() {
		return orderPid;
	}

	public void setOrderPid(String orderPid) {
		this.orderPid = orderPid;
	}


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}


	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}


	public long getCoupon() {
		return coupon;
	}

	public void setCoupon(long coupon) {
		this.coupon = coupon;
	}


	public long getPoundage() {
		return poundage;
	}

	public void setPoundage(long poundage) {
		this.poundage = poundage;
	}


	public long getScores() {
		return scores;
	}

	public void setScores(long scores) {
		this.scores = scores;
	}


	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}


	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
	}


	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}


	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}


	public String getCreatedId() {
		return createdId;
	}

	public void setCreatedId(String createdId) {
		this.createdId = createdId;
	}


	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}


	public Date getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
