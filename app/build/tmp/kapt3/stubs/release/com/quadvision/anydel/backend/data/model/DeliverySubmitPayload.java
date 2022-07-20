package com.quadvision.anydel.backend.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR \u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\"\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R \u0010&\u001a\u0004\u0018\u00010\'8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR \u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\"\u00102\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R\"\u00105\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b6\u0010\u0012\"\u0004\b7\u0010\u0014R \u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\"\u0010;\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010\u0014R\"\u0010>\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b?\u0010\u0012\"\u0004\b@\u0010\u0014R \u0010A\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\"\u0010D\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010\u0014R \u0010G\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR2\u0010J\u001a\u0016\u0012\u0004\u0012\u00020L\u0018\u00010Kj\n\u0012\u0004\u0012\u00020L\u0018\u0001`M8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010R\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010X\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010\bR\"\u0010[\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\\\u0010\u0019\"\u0004\b]\u0010\u001bR \u0010^\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\b\u00a8\u0006a"}, d2 = {"Lcom/quadvision/anydel/backend/data/model/DeliverySubmitPayload;", "", "()V", "bookDate", "", "getBookDate", "()Ljava/lang/String;", "setBookDate", "(Ljava/lang/String;)V", "bookTime", "getBookTime", "setBookTime", "custComment", "getCustComment", "setCustComment", "delDistance", "", "getDelDistance", "()Ljava/lang/Integer;", "setDelDistance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "delcharges", "", "getDelcharges", "()Ljava/lang/Double;", "setDelcharges", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "deliveryDate", "getDeliveryDate", "setDeliveryDate", "deliveryTime", "getDeliveryTime", "setDeliveryTime", "discountamt", "getDiscountamt", "setDiscountamt", "dropAddr", "LDropAddr;", "getDropAddr", "()LDropAddr;", "setDropAddr", "(LDropAddr;)V", "dropContactNo", "getDropContactNo", "setDropContactNo", "mobileNo", "getMobileNo", "setMobileNo", "offerCode", "getOfferCode", "setOfferCode", "packBreadth", "getPackBreadth", "setPackBreadth", "packDescription", "getPackDescription", "setPackDescription", "packHeight", "getPackHeight", "setPackHeight", "packLength", "getPackLength", "setPackLength", "packType", "getPackType", "setPackType", "packWeight", "getPackWeight", "setPackWeight", "paymentMode", "getPaymentMode", "setPaymentMode", "picList", "Ljava/util/ArrayList;", "LPicList;", "Lkotlin/collections/ArrayList;", "getPicList", "()Ljava/util/ArrayList;", "setPicList", "(Ljava/util/ArrayList;)V", "pickAddr", "LPickAddr;", "getPickAddr", "()LPickAddr;", "setPickAddr", "(LPickAddr;)V", "pickContactNo", "getPickContactNo", "setPickContactNo", "purchaseamt", "getPurchaseamt", "setPurchaseamt", "receiverName", "getReceiverName", "setReceiverName", "app_release"})
public final class DeliverySubmitPayload {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mobileNo")
    private java.lang.String mobileNo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pickAddr")
    private PickAddr pickAddr;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dropAddr")
    private DropAddr dropAddr;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "receiverName")
    private java.lang.String receiverName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pickContactNo")
    private java.lang.String pickContactNo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dropContactNo")
    private java.lang.String dropContactNo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "BookDate")
    private java.lang.String bookDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "BookTime")
    private java.lang.String bookTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "DeliveryDate")
    private java.lang.String deliveryDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "DeliveryTime")
    private java.lang.String deliveryTime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packType")
    private java.lang.String packType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packDescription")
    private java.lang.String packDescription;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PaymentMode")
    private java.lang.String paymentMode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packWeight")
    private java.lang.Integer packWeight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packLength")
    private java.lang.Integer packLength;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packBreadth")
    private java.lang.Integer packBreadth;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packHeight")
    private java.lang.Integer packHeight;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delDistance")
    private java.lang.Integer delDistance;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delcharges")
    private java.lang.Double delcharges;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "purchaseamt")
    private java.lang.Double purchaseamt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discountamt")
    private java.lang.Integer discountamt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "offerCode")
    private java.lang.Integer offerCode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "custComment")
    private java.lang.String custComment;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PicList")
    private java.util.ArrayList<PicList> picList;
    
    public DeliverySubmitPayload() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobileNo() {
        return null;
    }
    
    public final void setMobileNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final PickAddr getPickAddr() {
        return null;
    }
    
    public final void setPickAddr(@org.jetbrains.annotations.Nullable()
    PickAddr p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final DropAddr getDropAddr() {
        return null;
    }
    
    public final void setDropAddr(@org.jetbrains.annotations.Nullable()
    DropAddr p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceiverName() {
        return null;
    }
    
    public final void setReceiverName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickContactNo() {
        return null;
    }
    
    public final void setPickContactNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDropContactNo() {
        return null;
    }
    
    public final void setDropContactNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookDate() {
        return null;
    }
    
    public final void setBookDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBookTime() {
        return null;
    }
    
    public final void setBookTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryDate() {
        return null;
    }
    
    public final void setDeliveryDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeliveryTime() {
        return null;
    }
    
    public final void setDeliveryTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackType() {
        return null;
    }
    
    public final void setPackType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackDescription() {
        return null;
    }
    
    public final void setPackDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMode() {
        return null;
    }
    
    public final void setPaymentMode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPackWeight() {
        return null;
    }
    
    public final void setPackWeight(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPackLength() {
        return null;
    }
    
    public final void setPackLength(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPackBreadth() {
        return null;
    }
    
    public final void setPackBreadth(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPackHeight() {
        return null;
    }
    
    public final void setPackHeight(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDelDistance() {
        return null;
    }
    
    public final void setDelDistance(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDelcharges() {
        return null;
    }
    
    public final void setDelcharges(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPurchaseamt() {
        return null;
    }
    
    public final void setPurchaseamt(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDiscountamt() {
        return null;
    }
    
    public final void setDiscountamt(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOfferCode() {
        return null;
    }
    
    public final void setOfferCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustComment() {
        return null;
    }
    
    public final void setCustComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<PicList> getPicList() {
        return null;
    }
    
    public final void setPicList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<PicList> p0) {
    }
}