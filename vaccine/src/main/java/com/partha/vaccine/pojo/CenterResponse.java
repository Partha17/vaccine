package com.partha.vaccine.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "center_id", "name", "address", "state_name", "district_name", "block_name", "pincode", "from",
		"to", "lat", "long", "fee_type", "session_id", "date", "available_capacity", "fee", "min_age_limit", "vaccine",
		"slots" })
@Generated("jsonschema2pojo")
public class CenterResponse implements Serializable {

	@JsonProperty("center_id")
	private Integer centerId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("address")
	private String address;
	@JsonProperty("state_name")
	private String stateName;
	@JsonProperty("district_name")
	private String districtName;
	@JsonProperty("block_name")
	private String blockName;
	@JsonProperty("pincode")
	private Integer pincode;
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("lat")
	private Integer lat;
	@JsonProperty("long")
	private Integer _long;
	@JsonProperty("fee_type")
	private String feeType;
	@JsonProperty("session_id")
	private String sessionId;
	@JsonProperty("date")
	private String date;
	@JsonProperty("available_capacity")
	private Integer availableCapacity;
	@JsonProperty("fee")
	private String fee;
	@JsonProperty("min_age_limit")
	private Integer minAgeLimit;
	@JsonProperty("vaccine")
	private String vaccine;
	@JsonProperty("slots")
	private List<String> slots = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1374586638857036286L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public CenterResponse() {
	}

	/**
	 *
	 * @param date
	 * @param centerId
	 * @param pincode
	 * @param availableCapacity
	 * @param minAgeLimit
	 * @param address
	 * @param districtName
	 * @param blockName
	 * @param fee
	 * @param sessionId
	 * @param feeType
	 * @param vaccine
	 * @param slots
	 * @param stateName
	 * @param _long
	 * @param name
	 * @param from
	 * @param to
	 * @param lat
	 */
	public CenterResponse(Integer centerId, String name, String address, String stateName, String districtName,
			String blockName, Integer pincode, String from, String to, Integer lat, Integer _long, String feeType,
			String sessionId, String date, Integer availableCapacity, String fee, Integer minAgeLimit, String vaccine,
			List<String> slots) {
		super();
		this.centerId = centerId;
		this.name = name;
		this.address = address;
		this.stateName = stateName;
		this.districtName = districtName;
		this.blockName = blockName;
		this.pincode = pincode;
		this.from = from;
		this.to = to;
		this.lat = lat;
		this._long = _long;
		this.feeType = feeType;
		this.sessionId = sessionId;
		this.date = date;
		this.availableCapacity = availableCapacity;
		this.fee = fee;
		this.minAgeLimit = minAgeLimit;
		this.vaccine = vaccine;
		this.slots = slots;
	}

	@JsonProperty("center_id")
	public Integer getCenterId() {
		return centerId;
	}

	@JsonProperty("center_id")
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("state_name")
	public String getStateName() {
		return stateName;
	}

	@JsonProperty("state_name")
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@JsonProperty("district_name")
	public String getDistrictName() {
		return districtName;
	}

	@JsonProperty("district_name")
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	@JsonProperty("block_name")
	public String getBlockName() {
		return blockName;
	}

	@JsonProperty("block_name")
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	@JsonProperty("pincode")
	public Integer getPincode() {
		return pincode;
	}

	@JsonProperty("pincode")
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@JsonProperty("from")
	public String getFrom() {
		return from;
	}

	@JsonProperty("from")
	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("to")
	public String getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(String to) {
		this.to = to;
	}

	@JsonProperty("lat")
	public Integer getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(Integer lat) {
		this.lat = lat;
	}

	@JsonProperty("long")
	public Integer getLong() {
		return _long;
	}

	@JsonProperty("long")
	public void setLong(Integer _long) {
		this._long = _long;
	}

	@JsonProperty("fee_type")
	public String getFeeType() {
		return feeType;
	}

	@JsonProperty("fee_type")
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	@JsonProperty("session_id")
	public String getSessionId() {
		return sessionId;
	}

	@JsonProperty("session_id")
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("available_capacity")
	public Integer getAvailableCapacity() {
		return availableCapacity;
	}

	@JsonProperty("available_capacity")
	public void setAvailableCapacity(Integer availableCapacity) {
		this.availableCapacity = availableCapacity;
	}

	@JsonProperty("fee")
	public String getFee() {
		return fee;
	}

	@JsonProperty("fee")
	public void setFee(String fee) {
		this.fee = fee;
	}

	@JsonProperty("min_age_limit")
	public Integer getMinAgeLimit() {
		return minAgeLimit;
	}

	@JsonProperty("min_age_limit")
	public void setMinAgeLimit(Integer minAgeLimit) {
		this.minAgeLimit = minAgeLimit;
	}

	@JsonProperty("vaccine")
	public String getVaccine() {
		return vaccine;
	}

	@JsonProperty("vaccine")
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	@JsonProperty("slots")
	public List<String> getSlots() {
		return slots;
	}

	@JsonProperty("slots")
	public void setSlots(List<String> slots) {
		this.slots = slots;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "CenterResponse [centerId=" + centerId + ", name=" + name + ", address=" + address + ", stateName="
				+ stateName + ", districtName=" + districtName + ", blockName=" + blockName + ", pincode=" + pincode
				+ ", from=" + from + ", to=" + to + ", lat=" + lat + ", _long=" + _long + ", feeType=" + feeType
				+ ", sessionId=" + sessionId + ", date=" + date + ", availableCapacity=" + availableCapacity + ", fee="
				+ fee + ", minAgeLimit=" + minAgeLimit + ", vaccine=" + vaccine + ", slots=" + slots
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	
	
}