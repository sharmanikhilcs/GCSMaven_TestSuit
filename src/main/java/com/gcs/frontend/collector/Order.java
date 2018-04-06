package com.gcs.frontend.collector;

public class Order {
	
	private String refNo;
	private String orderChannel;
	private String customerCode;
	private String shippingAddress;
	private String productId;
	private String quantity;
	private String isSameAddress;
	private String paymentType;
	private String salesChannelDate;
	private String shippingDate;
	private String deliveryDate;
	private String remark;
	
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getOrderChannel() {
		return orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getIsSameAddress() {
		return isSameAddress;
	}
	public void setIsSameAddress(String isSameAddress) {
		this.isSameAddress = isSameAddress;
	}
	
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getSalesChannelDate() {
		return salesChannelDate;
	}
	public void setSalesChannelDate(String salesChannelDate) {
		this.salesChannelDate = salesChannelDate;
	}
	public String getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemarks(String remark) {
		this.remark = remark;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [refNo=" + refNo + ", orderChannel=" + orderChannel
				+ ", customerCode=" + customerCode + ", shippingAddress="
				+ shippingAddress + ", productId=" + productId + ", quantity="
				+ quantity + ", isSameAddress=" + isSameAddress
				+ ", paymentType=" + paymentType + ", salesChannelDate="
				+ salesChannelDate + ", shippingDate=" + shippingDate
				+ ", deliveryDate=" + deliveryDate + ", remark=" + remark
				+ "]";
	}
	
	
			
	
	
	
	
}
