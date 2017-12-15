/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hotelbeds.hotelapimodel.auto.common.SimpleTypes.ShoppingCartStatus;
import com.hotelbeds.hotelapimodel.auto.model.Pax;
import com.hotelbeds.hotelapimodel.auto.model.Rate;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;

@XmlRootElement(name = "room", namespace = "http://www.hotelbeds.com/schemas/messages")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
public class Room {

	@XmlAttribute
	private ShoppingCartStatus status;
	@XmlAttribute
	private Integer id;
	@XmlAttribute
	private String code;
	@XmlAttribute
	private String name;
	@XmlElementWrapper(name = "paxes")
	@XmlElement(name = "pax")
	private List<Pax> paxes;
	@XmlElementWrapper(name = "rates")
	@XmlElement(name = "rate")
	@Valid
	private List<Rate> rates;
	@XmlElement
	private String filterDebug;


}